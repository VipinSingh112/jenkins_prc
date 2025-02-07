/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence.impl;

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

import com.nbp.wra.stage.service.exception.NoSuchWraPaymentConfirmationException;
import com.nbp.wra.stage.service.model.WraPaymentConfirmation;
import com.nbp.wra.stage.service.model.WraPaymentConfirmationTable;
import com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationImpl;
import com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl;
import com.nbp.wra.stage.service.service.persistence.WraPaymentConfirmationPersistence;
import com.nbp.wra.stage.service.service.persistence.WraPaymentConfirmationUtil;
import com.nbp.wra.stage.service.service.persistence.impl.constants.WRA_STAGESPersistenceConstants;

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
 * The persistence implementation for the wra payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WraPaymentConfirmationPersistence.class)
public class WraPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<WraPaymentConfirmation>
	implements WraPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WraPaymentConfirmationUtil</code> to access the wra payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WraPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWraPaymentConfBy_CI;
	private FinderPath _finderPathCountBygetWraPaymentConfBy_CI;

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or throws a <code>NoSuchWraPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation findBygetWraPaymentConfBy_CI(String caseId)
		throws NoSuchWraPaymentConfirmationException {

		WraPaymentConfirmation wraPaymentConfirmation =
			fetchBygetWraPaymentConfBy_CI(caseId);

		if (wraPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWraPaymentConfirmationException(sb.toString());
		}

		return wraPaymentConfirmation;
	}

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation fetchBygetWraPaymentConfBy_CI(String caseId) {
		return fetchBygetWraPaymentConfBy_CI(caseId, true);
	}

	/**
	 * Returns the wra payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation fetchBygetWraPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWraPaymentConfBy_CI, finderArgs, this);
		}

		if (result instanceof WraPaymentConfirmation) {
			WraPaymentConfirmation wraPaymentConfirmation =
				(WraPaymentConfirmation)result;

			if (!Objects.equals(caseId, wraPaymentConfirmation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAPAYMENTCONFBY_CI_CASEID_2);
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

				List<WraPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWraPaymentConfBy_CI,
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
								"WraPaymentConfirmationPersistenceImpl.fetchBygetWraPaymentConfBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraPaymentConfirmation wraPaymentConfirmation = list.get(0);

					result = wraPaymentConfirmation;

					cacheResult(wraPaymentConfirmation);
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
			return (WraPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the wra payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra payment confirmation that was removed
	 */
	@Override
	public WraPaymentConfirmation removeBygetWraPaymentConfBy_CI(String caseId)
		throws NoSuchWraPaymentConfirmationException {

		WraPaymentConfirmation wraPaymentConfirmation =
			findBygetWraPaymentConfBy_CI(caseId);

		return remove(wraPaymentConfirmation);
	}

	/**
	 * Returns the number of wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra payment confirmations
	 */
	@Override
	public int countBygetWraPaymentConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWraPaymentConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAPAYMENTCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRAPAYMENTCONFBY_CI_CASEID_2 =
		"wraPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRAPAYMENTCONFBY_CI_CASEID_3 =
		"(wraPaymentConfirmation.caseId IS NULL OR wraPaymentConfirmation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetWraPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetWraPayConfBy_CI;
	private FinderPath _finderPathCountBygetWraPayConfBy_CI;

	/**
	 * Returns all the wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId) {

		return findBygetWraPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of matching wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetWraPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return findBygetWraPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findBygetWraPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetWraPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWraPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<WraPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<WraPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraPaymentConfirmation wraPaymentConfirmation : list) {
					if (!caseId.equals(wraPaymentConfirmation.getCaseId())) {
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

			sb.append(_SQL_SELECT_WRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation findBygetWraPayConfBy_CI_First(
			String caseId,
			OrderByComparator<WraPaymentConfirmation> orderByComparator)
		throws NoSuchWraPaymentConfirmationException {

		WraPaymentConfirmation wraPaymentConfirmation =
			fetchBygetWraPayConfBy_CI_First(caseId, orderByComparator);

		if (wraPaymentConfirmation != null) {
			return wraPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation fetchBygetWraPayConfBy_CI_First(
		String caseId,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		List<WraPaymentConfirmation> list = findBygetWraPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation findBygetWraPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<WraPaymentConfirmation> orderByComparator)
		throws NoSuchWraPaymentConfirmationException {

		WraPaymentConfirmation wraPaymentConfirmation =
			fetchBygetWraPayConfBy_CI_Last(caseId, orderByComparator);

		if (wraPaymentConfirmation != null) {
			return wraPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra payment confirmation, or <code>null</code> if a matching wra payment confirmation could not be found
	 */
	@Override
	public WraPaymentConfirmation fetchBygetWraPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		int count = countBygetWraPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<WraPaymentConfirmation> list = findBygetWraPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra payment confirmations before and after the current wra payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param wraPaymentConfirmationId the primary key of the current wra payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public WraPaymentConfirmation[] findBygetWraPayConfBy_CI_PrevAndNext(
			long wraPaymentConfirmationId, String caseId,
			OrderByComparator<WraPaymentConfirmation> orderByComparator)
		throws NoSuchWraPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		WraPaymentConfirmation wraPaymentConfirmation = findByPrimaryKey(
			wraPaymentConfirmationId);

		Session session = null;

		try {
			session = openSession();

			WraPaymentConfirmation[] array = new WraPaymentConfirmationImpl[3];

			array[0] = getBygetWraPayConfBy_CI_PrevAndNext(
				session, wraPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = wraPaymentConfirmation;

			array[2] = getBygetWraPayConfBy_CI_PrevAndNext(
				session, wraPaymentConfirmation, caseId, orderByComparator,
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

	protected WraPaymentConfirmation getBygetWraPayConfBy_CI_PrevAndNext(
		Session session, WraPaymentConfirmation wraPaymentConfirmation,
		String caseId,
		OrderByComparator<WraPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_2);
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
			sb.append(WraPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						wraPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetWraPayConfBy_CI(String caseId) {
		for (WraPaymentConfirmation wraPaymentConfirmation :
				findBygetWraPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of wra payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra payment confirmations
	 */
	@Override
	public int countBygetWraPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWraPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_2 =
		"wraPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRAPAYCONFBY_CI_CASEID_3 =
		"(wraPaymentConfirmation.caseId IS NULL OR wraPaymentConfirmation.caseId = '')";

	public WraPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(WraPaymentConfirmation.class);

		setModelImplClass(WraPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(WraPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the wra payment confirmation in the entity cache if it is enabled.
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 */
	@Override
	public void cacheResult(WraPaymentConfirmation wraPaymentConfirmation) {
		entityCache.putResult(
			WraPaymentConfirmationImpl.class,
			wraPaymentConfirmation.getPrimaryKey(), wraPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetWraPaymentConfBy_CI,
			new Object[] {wraPaymentConfirmation.getCaseId()},
			wraPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra payment confirmations in the entity cache if it is enabled.
	 *
	 * @param wraPaymentConfirmations the wra payment confirmations
	 */
	@Override
	public void cacheResult(
		List<WraPaymentConfirmation> wraPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WraPaymentConfirmation wraPaymentConfirmation :
				wraPaymentConfirmations) {

			if (entityCache.getResult(
					WraPaymentConfirmationImpl.class,
					wraPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(wraPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all wra payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WraPaymentConfirmationImpl.class);

		finderCache.clearCache(WraPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the wra payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WraPaymentConfirmation wraPaymentConfirmation) {
		entityCache.removeResult(
			WraPaymentConfirmationImpl.class, wraPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<WraPaymentConfirmation> wraPaymentConfirmations) {

		for (WraPaymentConfirmation wraPaymentConfirmation :
				wraPaymentConfirmations) {

			entityCache.removeResult(
				WraPaymentConfirmationImpl.class, wraPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WraPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				WraPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WraPaymentConfirmationModelImpl wraPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			wraPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetWraPaymentConfBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWraPaymentConfBy_CI, args,
			wraPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new wra payment confirmation with the primary key. Does not add the wra payment confirmation to the database.
	 *
	 * @param wraPaymentConfirmationId the primary key for the new wra payment confirmation
	 * @return the new wra payment confirmation
	 */
	@Override
	public WraPaymentConfirmation create(long wraPaymentConfirmationId) {
		WraPaymentConfirmation wraPaymentConfirmation =
			new WraPaymentConfirmationImpl();

		wraPaymentConfirmation.setNew(true);
		wraPaymentConfirmation.setPrimaryKey(wraPaymentConfirmationId);

		wraPaymentConfirmation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraPaymentConfirmation;
	}

	/**
	 * Removes the wra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public WraPaymentConfirmation remove(long wraPaymentConfirmationId)
		throws NoSuchWraPaymentConfirmationException {

		return remove((Serializable)wraPaymentConfirmationId);
	}

	/**
	 * Removes the wra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public WraPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchWraPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			WraPaymentConfirmation wraPaymentConfirmation =
				(WraPaymentConfirmation)session.get(
					WraPaymentConfirmationImpl.class, primaryKey);

			if (wraPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWraPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraPaymentConfirmation);
		}
		catch (NoSuchWraPaymentConfirmationException noSuchEntityException) {
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
	protected WraPaymentConfirmation removeImpl(
		WraPaymentConfirmation wraPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraPaymentConfirmation)) {
				wraPaymentConfirmation = (WraPaymentConfirmation)session.get(
					WraPaymentConfirmationImpl.class,
					wraPaymentConfirmation.getPrimaryKeyObj());
			}

			if (wraPaymentConfirmation != null) {
				session.delete(wraPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraPaymentConfirmation != null) {
			clearCache(wraPaymentConfirmation);
		}

		return wraPaymentConfirmation;
	}

	@Override
	public WraPaymentConfirmation updateImpl(
		WraPaymentConfirmation wraPaymentConfirmation) {

		boolean isNew = wraPaymentConfirmation.isNew();

		if (!(wraPaymentConfirmation instanceof
				WraPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WraPaymentConfirmation implementation " +
					wraPaymentConfirmation.getClass());
		}

		WraPaymentConfirmationModelImpl wraPaymentConfirmationModelImpl =
			(WraPaymentConfirmationModelImpl)wraPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraPaymentConfirmation.setCreateDate(date);
			}
			else {
				wraPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraPaymentConfirmation.setModifiedDate(date);
			}
			else {
				wraPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraPaymentConfirmation);
			}
			else {
				wraPaymentConfirmation = (WraPaymentConfirmation)session.merge(
					wraPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WraPaymentConfirmationImpl.class, wraPaymentConfirmationModelImpl,
			false, true);

		cacheUniqueFindersCache(wraPaymentConfirmationModelImpl);

		if (isNew) {
			wraPaymentConfirmation.setNew(false);
		}

		wraPaymentConfirmation.resetOriginalValues();

		return wraPaymentConfirmation;
	}

	/**
	 * Returns the wra payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra payment confirmation
	 * @return the wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public WraPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWraPaymentConfirmationException {

		WraPaymentConfirmation wraPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (wraPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWraPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraPaymentConfirmation;
	}

	/**
	 * Returns the wra payment confirmation with the primary key or throws a <code>NoSuchWraPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation
	 * @throws NoSuchWraPaymentConfirmationException if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public WraPaymentConfirmation findByPrimaryKey(
			long wraPaymentConfirmationId)
		throws NoSuchWraPaymentConfirmationException {

		return findByPrimaryKey((Serializable)wraPaymentConfirmationId);
	}

	/**
	 * Returns the wra payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation, or <code>null</code> if a wra payment confirmation with the primary key could not be found
	 */
	@Override
	public WraPaymentConfirmation fetchByPrimaryKey(
		long wraPaymentConfirmationId) {

		return fetchByPrimaryKey((Serializable)wraPaymentConfirmationId);
	}

	/**
	 * Returns all the wra payment confirmations.
	 *
	 * @return the wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra payment confirmations
	 */
	@Override
	public List<WraPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<WraPaymentConfirmation> orderByComparator,
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

		List<WraPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<WraPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAPAYMENTCONFIRMATION;

				sql = sql.concat(WraPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WraPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the wra payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WraPaymentConfirmation wraPaymentConfirmation : findAll()) {
			remove(wraPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of wra payment confirmations.
	 *
	 * @return the number of wra payment confirmations
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
					_SQL_COUNT_WRAPAYMENTCONFIRMATION);

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
		return "wraPaymentConfirmationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WraPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra payment confirmation persistence.
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

		_finderPathFetchBygetWraPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWraPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWraPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWraPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetWraPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWraPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetWraPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetWraPayConfBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetWraPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWraPayConfBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		WraPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WraPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(WraPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAPAYMENTCONFIRMATION =
		"SELECT wraPaymentConfirmation FROM WraPaymentConfirmation wraPaymentConfirmation";

	private static final String _SQL_SELECT_WRAPAYMENTCONFIRMATION_WHERE =
		"SELECT wraPaymentConfirmation FROM WraPaymentConfirmation wraPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_WRAPAYMENTCONFIRMATION =
		"SELECT COUNT(wraPaymentConfirmation) FROM WraPaymentConfirmation wraPaymentConfirmation";

	private static final String _SQL_COUNT_WRAPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(wraPaymentConfirmation) FROM WraPaymentConfirmation wraPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"wraPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WraPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WraPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WraPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}