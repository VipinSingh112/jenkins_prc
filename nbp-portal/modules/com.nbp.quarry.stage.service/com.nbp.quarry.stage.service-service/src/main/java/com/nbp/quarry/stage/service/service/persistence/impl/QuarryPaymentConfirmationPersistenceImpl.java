/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryPaymentConfirmationException;
import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;
import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmationTable;
import com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationImpl;
import com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl;
import com.nbp.quarry.stage.service.service.persistence.QuarryPaymentConfirmationPersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryPaymentConfirmationUtil;
import com.nbp.quarry.stage.service.service.persistence.impl.constants.QUARRY_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the quarry payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryPaymentConfirmationPersistence.class)
public class QuarryPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<QuarryPaymentConfirmation>
	implements QuarryPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryPaymentConfirmationUtil</code> to access the quarry payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarryPaymentConfBy_CI;
	private FinderPath _finderPathCountBygetQuarryPaymentConfBy_CI;

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or throws a <code>NoSuchQuarryPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation findBygetQuarryPaymentConfBy_CI(
			String caseId)
		throws NoSuchQuarryPaymentConfirmationException {

		QuarryPaymentConfirmation quarryPaymentConfirmation =
			fetchBygetQuarryPaymentConfBy_CI(caseId);

		if (quarryPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryPaymentConfirmationException(sb.toString());
		}

		return quarryPaymentConfirmation;
	}

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation fetchBygetQuarryPaymentConfBy_CI(
		String caseId) {

		return fetchBygetQuarryPaymentConfBy_CI(caseId, true);
	}

	/**
	 * Returns the quarry payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation fetchBygetQuarryPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryPaymentConfBy_CI, finderArgs, this);
		}

		if (result instanceof QuarryPaymentConfirmation) {
			QuarryPaymentConfirmation quarryPaymentConfirmation =
				(QuarryPaymentConfirmation)result;

			if (!Objects.equals(
					caseId, quarryPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYPAYMENTCONFBY_CI_CASEID_2);
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

				List<QuarryPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryPaymentConfBy_CI,
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
								"QuarryPaymentConfirmationPersistenceImpl.fetchBygetQuarryPaymentConfBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryPaymentConfirmation quarryPaymentConfirmation =
						list.get(0);

					result = quarryPaymentConfirmation;

					cacheResult(quarryPaymentConfirmation);
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
			return (QuarryPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the quarry payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry payment confirmation that was removed
	 */
	@Override
	public QuarryPaymentConfirmation removeBygetQuarryPaymentConfBy_CI(
			String caseId)
		throws NoSuchQuarryPaymentConfirmationException {

		QuarryPaymentConfirmation quarryPaymentConfirmation =
			findBygetQuarryPaymentConfBy_CI(caseId);

		return remove(quarryPaymentConfirmation);
	}

	/**
	 * Returns the number of quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry payment confirmations
	 */
	@Override
	public int countBygetQuarryPaymentConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryPaymentConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYPAYMENTCONFBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETQUARRYPAYMENTCONFBY_CI_CASEID_2 =
			"quarryPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYPAYMENTCONFBY_CI_CASEID_3 =
			"(quarryPaymentConfirmation.caseId IS NULL OR quarryPaymentConfirmation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarryPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarryPayConfBy_CI;
	private FinderPath _finderPathCountBygetQuarryPayConfBy_CI;

	/**
	 * Returns all the quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId) {

		return findBygetQuarryPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of matching quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetQuarryPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return findBygetQuarryPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarryPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarryPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<QuarryPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<QuarryPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryPaymentConfirmation quarryPaymentConfirmation :
						list) {

					if (!caseId.equals(quarryPaymentConfirmation.getCaseId())) {
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

			sb.append(_SQL_SELECT_QUARRYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation findBygetQuarryPayConfBy_CI_First(
			String caseId,
			OrderByComparator<QuarryPaymentConfirmation> orderByComparator)
		throws NoSuchQuarryPaymentConfirmationException {

		QuarryPaymentConfirmation quarryPaymentConfirmation =
			fetchBygetQuarryPayConfBy_CI_First(caseId, orderByComparator);

		if (quarryPaymentConfirmation != null) {
			return quarryPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation fetchBygetQuarryPayConfBy_CI_First(
		String caseId,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		List<QuarryPaymentConfirmation> list = findBygetQuarryPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation findBygetQuarryPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<QuarryPaymentConfirmation> orderByComparator)
		throws NoSuchQuarryPaymentConfirmationException {

		QuarryPaymentConfirmation quarryPaymentConfirmation =
			fetchBygetQuarryPayConfBy_CI_Last(caseId, orderByComparator);

		if (quarryPaymentConfirmation != null) {
			return quarryPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry payment confirmation, or <code>null</code> if a matching quarry payment confirmation could not be found
	 */
	@Override
	public QuarryPaymentConfirmation fetchBygetQuarryPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		int count = countBygetQuarryPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<QuarryPaymentConfirmation> list = findBygetQuarryPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry payment confirmations before and after the current quarry payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the current quarry payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation[] findBygetQuarryPayConfBy_CI_PrevAndNext(
			long quarryPaymentConfirmationId, String caseId,
			OrderByComparator<QuarryPaymentConfirmation> orderByComparator)
		throws NoSuchQuarryPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		QuarryPaymentConfirmation quarryPaymentConfirmation = findByPrimaryKey(
			quarryPaymentConfirmationId);

		Session session = null;

		try {
			session = openSession();

			QuarryPaymentConfirmation[] array =
				new QuarryPaymentConfirmationImpl[3];

			array[0] = getBygetQuarryPayConfBy_CI_PrevAndNext(
				session, quarryPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = quarryPaymentConfirmation;

			array[2] = getBygetQuarryPayConfBy_CI_PrevAndNext(
				session, quarryPaymentConfirmation, caseId, orderByComparator,
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

	protected QuarryPaymentConfirmation getBygetQuarryPayConfBy_CI_PrevAndNext(
		Session session, QuarryPaymentConfirmation quarryPaymentConfirmation,
		String caseId,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_2);
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
			sb.append(QuarryPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						quarryPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetQuarryPayConfBy_CI(String caseId) {
		for (QuarryPaymentConfirmation quarryPaymentConfirmation :
				findBygetQuarryPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of quarry payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry payment confirmations
	 */
	@Override
	public int countBygetQuarryPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_2 =
		"quarryPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRYPAYCONFBY_CI_CASEID_3 =
		"(quarryPaymentConfirmation.caseId IS NULL OR quarryPaymentConfirmation.caseId = '')";

	public QuarryPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(QuarryPaymentConfirmation.class);

		setModelImplClass(QuarryPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the quarry payment confirmation in the entity cache if it is enabled.
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 */
	@Override
	public void cacheResult(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		entityCache.putResult(
			QuarryPaymentConfirmationImpl.class,
			quarryPaymentConfirmation.getPrimaryKey(),
			quarryPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetQuarryPaymentConfBy_CI,
			new Object[] {quarryPaymentConfirmation.getCaseId()},
			quarryPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry payment confirmations in the entity cache if it is enabled.
	 *
	 * @param quarryPaymentConfirmations the quarry payment confirmations
	 */
	@Override
	public void cacheResult(
		List<QuarryPaymentConfirmation> quarryPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryPaymentConfirmation quarryPaymentConfirmation :
				quarryPaymentConfirmations) {

			if (entityCache.getResult(
					QuarryPaymentConfirmationImpl.class,
					quarryPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(quarryPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all quarry payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryPaymentConfirmationImpl.class);

		finderCache.clearCache(QuarryPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the quarry payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		entityCache.removeResult(
			QuarryPaymentConfirmationImpl.class, quarryPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<QuarryPaymentConfirmation> quarryPaymentConfirmations) {

		for (QuarryPaymentConfirmation quarryPaymentConfirmation :
				quarryPaymentConfirmations) {

			entityCache.removeResult(
				QuarryPaymentConfirmationImpl.class, quarryPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QuarryPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryPaymentConfirmationModelImpl quarryPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			quarryPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarryPaymentConfBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryPaymentConfBy_CI, args,
			quarryPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new quarry payment confirmation with the primary key. Does not add the quarry payment confirmation to the database.
	 *
	 * @param quarryPaymentConfirmationId the primary key for the new quarry payment confirmation
	 * @return the new quarry payment confirmation
	 */
	@Override
	public QuarryPaymentConfirmation create(long quarryPaymentConfirmationId) {
		QuarryPaymentConfirmation quarryPaymentConfirmation =
			new QuarryPaymentConfirmationImpl();

		quarryPaymentConfirmation.setNew(true);
		quarryPaymentConfirmation.setPrimaryKey(quarryPaymentConfirmationId);

		quarryPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return quarryPaymentConfirmation;
	}

	/**
	 * Removes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation remove(long quarryPaymentConfirmationId)
		throws NoSuchQuarryPaymentConfirmationException {

		return remove((Serializable)quarryPaymentConfirmationId);
	}

	/**
	 * Removes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchQuarryPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			QuarryPaymentConfirmation quarryPaymentConfirmation =
				(QuarryPaymentConfirmation)session.get(
					QuarryPaymentConfirmationImpl.class, primaryKey);

			if (quarryPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryPaymentConfirmation);
		}
		catch (NoSuchQuarryPaymentConfirmationException noSuchEntityException) {
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
	protected QuarryPaymentConfirmation removeImpl(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryPaymentConfirmation)) {
				quarryPaymentConfirmation =
					(QuarryPaymentConfirmation)session.get(
						QuarryPaymentConfirmationImpl.class,
						quarryPaymentConfirmation.getPrimaryKeyObj());
			}

			if (quarryPaymentConfirmation != null) {
				session.delete(quarryPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryPaymentConfirmation != null) {
			clearCache(quarryPaymentConfirmation);
		}

		return quarryPaymentConfirmation;
	}

	@Override
	public QuarryPaymentConfirmation updateImpl(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		boolean isNew = quarryPaymentConfirmation.isNew();

		if (!(quarryPaymentConfirmation instanceof
				QuarryPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryPaymentConfirmation implementation " +
					quarryPaymentConfirmation.getClass());
		}

		QuarryPaymentConfirmationModelImpl quarryPaymentConfirmationModelImpl =
			(QuarryPaymentConfirmationModelImpl)quarryPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryPaymentConfirmation.setCreateDate(date);
			}
			else {
				quarryPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryPaymentConfirmation.setModifiedDate(date);
			}
			else {
				quarryPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryPaymentConfirmation);
			}
			else {
				quarryPaymentConfirmation =
					(QuarryPaymentConfirmation)session.merge(
						quarryPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryPaymentConfirmationImpl.class,
			quarryPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(quarryPaymentConfirmationModelImpl);

		if (isNew) {
			quarryPaymentConfirmation.setNew(false);
		}

		quarryPaymentConfirmation.resetOriginalValues();

		return quarryPaymentConfirmation;
	}

	/**
	 * Returns the quarry payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryPaymentConfirmationException {

		QuarryPaymentConfirmation quarryPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (quarryPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryPaymentConfirmation;
	}

	/**
	 * Returns the quarry payment confirmation with the primary key or throws a <code>NoSuchQuarryPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws NoSuchQuarryPaymentConfirmationException if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation findByPrimaryKey(
			long quarryPaymentConfirmationId)
		throws NoSuchQuarryPaymentConfirmationException {

		return findByPrimaryKey((Serializable)quarryPaymentConfirmationId);
	}

	/**
	 * Returns the quarry payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation, or <code>null</code> if a quarry payment confirmation with the primary key could not be found
	 */
	@Override
	public QuarryPaymentConfirmation fetchByPrimaryKey(
		long quarryPaymentConfirmationId) {

		return fetchByPrimaryKey((Serializable)quarryPaymentConfirmationId);
	}

	/**
	 * Returns all the quarry payment confirmations.
	 *
	 * @return the quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry payment confirmations
	 */
	@Override
	public List<QuarryPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<QuarryPaymentConfirmation> orderByComparator,
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

		List<QuarryPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<QuarryPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYPAYMENTCONFIRMATION;

				sql = sql.concat(
					QuarryPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the quarry payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryPaymentConfirmation quarryPaymentConfirmation : findAll()) {
			remove(quarryPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of quarry payment confirmations.
	 *
	 * @return the number of quarry payment confirmations
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
					_SQL_COUNT_QUARRYPAYMENTCONFIRMATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "quarryPaymentConfirmationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry payment confirmation persistence.
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

		_finderPathFetchBygetQuarryPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQuarryPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetQuarryPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetQuarryPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetQuarryPayConfBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarryPayConfBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetQuarryPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryPayConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		QuarryPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(QuarryPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYPAYMENTCONFIRMATION =
		"SELECT quarryPaymentConfirmation FROM QuarryPaymentConfirmation quarryPaymentConfirmation";

	private static final String _SQL_SELECT_QUARRYPAYMENTCONFIRMATION_WHERE =
		"SELECT quarryPaymentConfirmation FROM QuarryPaymentConfirmation quarryPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_QUARRYPAYMENTCONFIRMATION =
		"SELECT COUNT(quarryPaymentConfirmation) FROM QuarryPaymentConfirmation quarryPaymentConfirmation";

	private static final String _SQL_COUNT_QUARRYPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(quarryPaymentConfirmation) FROM QuarryPaymentConfirmation quarryPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"quarryPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}