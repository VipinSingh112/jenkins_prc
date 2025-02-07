/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.hsra.stage.services.exception.NoSuchHSRAPaymentConfirmationException;
import com.nbp.hsra.stage.services.model.HSRAPaymentConfirmation;
import com.nbp.hsra.stage.services.model.HSRAPaymentConfirmationTable;
import com.nbp.hsra.stage.services.model.impl.HSRAPaymentConfirmationImpl;
import com.nbp.hsra.stage.services.model.impl.HSRAPaymentConfirmationModelImpl;
import com.nbp.hsra.stage.services.service.persistence.HSRAPaymentConfirmationPersistence;
import com.nbp.hsra.stage.services.service.persistence.HSRAPaymentConfirmationUtil;
import com.nbp.hsra.stage.services.service.persistence.impl.constants.HSRA_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the hsra payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HSRAPaymentConfirmationPersistence.class)
public class HSRAPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<HSRAPaymentConfirmation>
	implements HSRAPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HSRAPaymentConfirmationUtil</code> to access the hsra payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HSRAPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetPaymentConfirmationBy_CI;

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or throws a <code>NoSuchHSRAPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation findBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchHSRAPaymentConfirmationException {

		HSRAPaymentConfirmation hsraPaymentConfirmation =
			fetchBygetPaymentConfirmationBy_CI(caseId);

		if (hsraPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHSRAPaymentConfirmationException(sb.toString());
		}

		return hsraPaymentConfirmation;
	}

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId) {

		return fetchBygetPaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the hsra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmationBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPaymentConfirmationBy_CI, finderArgs,
				this);
		}

		if (result instanceof HSRAPaymentConfirmation) {
			HSRAPaymentConfirmation hsraPaymentConfirmation =
				(HSRAPaymentConfirmation)result;

			if (!Objects.equals(caseId, hsraPaymentConfirmation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<HSRAPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPaymentConfirmationBy_CI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"HSRAPaymentConfirmationPersistenceImpl.fetchBygetPaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HSRAPaymentConfirmation hsraPaymentConfirmation = list.get(
						0);

					result = hsraPaymentConfirmation;

					cacheResult(hsraPaymentConfirmation);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (HSRAPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the hsra payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra payment confirmation that was removed
	 */
	@Override
	public HSRAPaymentConfirmation removeBygetPaymentConfirmationBy_CI(
			String caseId)
		throws NoSuchHSRAPaymentConfirmationException {

		HSRAPaymentConfirmation hsraPaymentConfirmation =
			findBygetPaymentConfirmationBy_CI(caseId);

		return remove(hsraPaymentConfirmation);
	}

	/**
	 * Returns the number of hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra payment confirmations
	 */
	@Override
	public int countBygetPaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"hsraPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(hsraPaymentConfirmation.caseId IS NULL OR hsraPaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI;
	private FinderPath _finderPathCountBygetPaymentConfirmation_By_CI;

	/**
	 * Returns all the hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId) {

		return findBygetPaymentConfirmation_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of matching hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId, int start, int end) {

		return findBygetPaymentConfirmation_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId, int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return findBygetPaymentConfirmation_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findBygetPaymentConfirmation_By_CI(
		String caseId, int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<HSRAPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<HSRAPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HSRAPaymentConfirmation hsraPaymentConfirmation : list) {
					if (!caseId.equals(hsraPaymentConfirmation.getCaseId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_HSRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HSRAPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<HSRAPaymentConfirmation>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation findBygetPaymentConfirmation_By_CI_First(
			String caseId,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator)
		throws NoSuchHSRAPaymentConfirmationException {

		HSRAPaymentConfirmation hsraPaymentConfirmation =
			fetchBygetPaymentConfirmation_By_CI_First(
				caseId, orderByComparator);

		if (hsraPaymentConfirmation != null) {
			return hsraPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHSRAPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_First(
		String caseId,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		List<HSRAPaymentConfirmation> list = findBygetPaymentConfirmation_By_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation findBygetPaymentConfirmation_By_CI_Last(
			String caseId,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator)
		throws NoSuchHSRAPaymentConfirmationException {

		HSRAPaymentConfirmation hsraPaymentConfirmation =
			fetchBygetPaymentConfirmation_By_CI_Last(caseId, orderByComparator);

		if (hsraPaymentConfirmation != null) {
			return hsraPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHSRAPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra payment confirmation, or <code>null</code> if a matching hsra payment confirmation could not be found
	 */
	@Override
	public HSRAPaymentConfirmation fetchBygetPaymentConfirmation_By_CI_Last(
		String caseId,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		int count = countBygetPaymentConfirmation_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<HSRAPaymentConfirmation> list = findBygetPaymentConfirmation_By_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra payment confirmations before and after the current hsra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param hsraPaymentId the primary key of the current hsra payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public HSRAPaymentConfirmation[]
			findBygetPaymentConfirmation_By_CI_PrevAndNext(
				long hsraPaymentId, String caseId,
				OrderByComparator<HSRAPaymentConfirmation> orderByComparator)
		throws NoSuchHSRAPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		HSRAPaymentConfirmation hsraPaymentConfirmation = findByPrimaryKey(
			hsraPaymentId);

		Session session = null;

		try {
			session = openSession();

			HSRAPaymentConfirmation[] array =
				new HSRAPaymentConfirmationImpl[3];

			array[0] = getBygetPaymentConfirmation_By_CI_PrevAndNext(
				session, hsraPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = hsraPaymentConfirmation;

			array[2] = getBygetPaymentConfirmation_By_CI_PrevAndNext(
				session, hsraPaymentConfirmation, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HSRAPaymentConfirmation
		getBygetPaymentConfirmation_By_CI_PrevAndNext(
			Session session, HSRAPaymentConfirmation hsraPaymentConfirmation,
			String caseId,
			OrderByComparator<HSRAPaymentConfirmation> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_HSRAPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(HSRAPaymentConfirmationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HSRAPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPaymentConfirmation_By_CI(String caseId) {
		for (HSRAPaymentConfirmation hsraPaymentConfirmation :
				findBygetPaymentConfirmation_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of hsra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra payment confirmations
	 */
	@Override
	public int countBygetPaymentConfirmation_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPaymentConfirmation_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_2 =
			"hsraPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPAYMENTCONFIRMATION_BY_CI_CASEID_3 =
			"(hsraPaymentConfirmation.caseId IS NULL OR hsraPaymentConfirmation.caseId = '')";

	public HSRAPaymentConfirmationPersistenceImpl() {
		setModelClass(HSRAPaymentConfirmation.class);

		setModelImplClass(HSRAPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(HSRAPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the hsra payment confirmation in the entity cache if it is enabled.
	 *
	 * @param hsraPaymentConfirmation the hsra payment confirmation
	 */
	@Override
	public void cacheResult(HSRAPaymentConfirmation hsraPaymentConfirmation) {
		entityCache.putResult(
			HSRAPaymentConfirmationImpl.class,
			hsraPaymentConfirmation.getPrimaryKey(), hsraPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetPaymentConfirmationBy_CI,
			new Object[] {hsraPaymentConfirmation.getCaseId()},
			hsraPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra payment confirmations in the entity cache if it is enabled.
	 *
	 * @param hsraPaymentConfirmations the hsra payment confirmations
	 */
	@Override
	public void cacheResult(
		List<HSRAPaymentConfirmation> hsraPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HSRAPaymentConfirmation hsraPaymentConfirmation :
				hsraPaymentConfirmations) {

			if (entityCache.getResult(
					HSRAPaymentConfirmationImpl.class,
					hsraPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(hsraPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all hsra payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HSRAPaymentConfirmationImpl.class);

		finderCache.clearCache(HSRAPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the hsra payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HSRAPaymentConfirmation hsraPaymentConfirmation) {
		entityCache.removeResult(
			HSRAPaymentConfirmationImpl.class, hsraPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<HSRAPaymentConfirmation> hsraPaymentConfirmations) {

		for (HSRAPaymentConfirmation hsraPaymentConfirmation :
				hsraPaymentConfirmations) {

			entityCache.removeResult(
				HSRAPaymentConfirmationImpl.class, hsraPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HSRAPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HSRAPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HSRAPaymentConfirmationModelImpl hsraPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			hsraPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPaymentConfirmationBy_CI, args,
			hsraPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new hsra payment confirmation with the primary key. Does not add the hsra payment confirmation to the database.
	 *
	 * @param hsraPaymentId the primary key for the new hsra payment confirmation
	 * @return the new hsra payment confirmation
	 */
	@Override
	public HSRAPaymentConfirmation create(long hsraPaymentId) {
		HSRAPaymentConfirmation hsraPaymentConfirmation =
			new HSRAPaymentConfirmationImpl();

		hsraPaymentConfirmation.setNew(true);
		hsraPaymentConfirmation.setPrimaryKey(hsraPaymentId);

		hsraPaymentConfirmation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return hsraPaymentConfirmation;
	}

	/**
	 * Removes the hsra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation that was removed
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public HSRAPaymentConfirmation remove(long hsraPaymentId)
		throws NoSuchHSRAPaymentConfirmationException {

		return remove((Serializable)hsraPaymentId);
	}

	/**
	 * Removes the hsra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation that was removed
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public HSRAPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchHSRAPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			HSRAPaymentConfirmation hsraPaymentConfirmation =
				(HSRAPaymentConfirmation)session.get(
					HSRAPaymentConfirmationImpl.class, primaryKey);

			if (hsraPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHSRAPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraPaymentConfirmation);
		}
		catch (NoSuchHSRAPaymentConfirmationException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected HSRAPaymentConfirmation removeImpl(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraPaymentConfirmation)) {
				hsraPaymentConfirmation = (HSRAPaymentConfirmation)session.get(
					HSRAPaymentConfirmationImpl.class,
					hsraPaymentConfirmation.getPrimaryKeyObj());
			}

			if (hsraPaymentConfirmation != null) {
				session.delete(hsraPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraPaymentConfirmation != null) {
			clearCache(hsraPaymentConfirmation);
		}

		return hsraPaymentConfirmation;
	}

	@Override
	public HSRAPaymentConfirmation updateImpl(
		HSRAPaymentConfirmation hsraPaymentConfirmation) {

		boolean isNew = hsraPaymentConfirmation.isNew();

		if (!(hsraPaymentConfirmation instanceof
				HSRAPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(hsraPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HSRAPaymentConfirmation implementation " +
					hsraPaymentConfirmation.getClass());
		}

		HSRAPaymentConfirmationModelImpl hsraPaymentConfirmationModelImpl =
			(HSRAPaymentConfirmationModelImpl)hsraPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraPaymentConfirmation.setCreateDate(date);
			}
			else {
				hsraPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraPaymentConfirmation.setModifiedDate(date);
			}
			else {
				hsraPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraPaymentConfirmation);
			}
			else {
				hsraPaymentConfirmation =
					(HSRAPaymentConfirmation)session.merge(
						hsraPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HSRAPaymentConfirmationImpl.class, hsraPaymentConfirmationModelImpl,
			false, true);

		cacheUniqueFindersCache(hsraPaymentConfirmationModelImpl);

		if (isNew) {
			hsraPaymentConfirmation.setNew(false);
		}

		hsraPaymentConfirmation.resetOriginalValues();

		return hsraPaymentConfirmation;
	}

	/**
	 * Returns the hsra payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public HSRAPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHSRAPaymentConfirmationException {

		HSRAPaymentConfirmation hsraPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (hsraPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHSRAPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraPaymentConfirmation;
	}

	/**
	 * Returns the hsra payment confirmation with the primary key or throws a <code>NoSuchHSRAPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation
	 * @throws NoSuchHSRAPaymentConfirmationException if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public HSRAPaymentConfirmation findByPrimaryKey(long hsraPaymentId)
		throws NoSuchHSRAPaymentConfirmationException {

		return findByPrimaryKey((Serializable)hsraPaymentId);
	}

	/**
	 * Returns the hsra payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraPaymentId the primary key of the hsra payment confirmation
	 * @return the hsra payment confirmation, or <code>null</code> if a hsra payment confirmation with the primary key could not be found
	 */
	@Override
	public HSRAPaymentConfirmation fetchByPrimaryKey(long hsraPaymentId) {
		return fetchByPrimaryKey((Serializable)hsraPaymentId);
	}

	/**
	 * Returns all the hsra payment confirmations.
	 *
	 * @return the hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @return the range of hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra payment confirmations
	 * @param end the upper bound of the range of hsra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra payment confirmations
	 */
	@Override
	public List<HSRAPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<HSRAPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<HSRAPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<HSRAPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAPAYMENTCONFIRMATION;

				sql = sql.concat(
					HSRAPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HSRAPaymentConfirmation>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the hsra payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HSRAPaymentConfirmation hsraPaymentConfirmation : findAll()) {
			remove(hsraPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of hsra payment confirmations.
	 *
	 * @return the number of hsra payment confirmations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_HSRAPAYMENTCONFIRMATION);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "hsraPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HSRAPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra payment confirmation persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetPaymentConfirmation_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetPaymentConfirmation_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetPaymentConfirmation_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPaymentConfirmation_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetPaymentConfirmation_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPaymentConfirmation_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		HSRAPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HSRAPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(HSRAPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAPAYMENTCONFIRMATION =
		"SELECT hsraPaymentConfirmation FROM HSRAPaymentConfirmation hsraPaymentConfirmation";

	private static final String _SQL_SELECT_HSRAPAYMENTCONFIRMATION_WHERE =
		"SELECT hsraPaymentConfirmation FROM HSRAPaymentConfirmation hsraPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_HSRAPAYMENTCONFIRMATION =
		"SELECT COUNT(hsraPaymentConfirmation) FROM HSRAPaymentConfirmation hsraPaymentConfirmation";

	private static final String _SQL_COUNT_HSRAPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(hsraPaymentConfirmation) FROM HSRAPaymentConfirmation hsraPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HSRAPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HSRAPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HSRAPaymentConfirmationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}