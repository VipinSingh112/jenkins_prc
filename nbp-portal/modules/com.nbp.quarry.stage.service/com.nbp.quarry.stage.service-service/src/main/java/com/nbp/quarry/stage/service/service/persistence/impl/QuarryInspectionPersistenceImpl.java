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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.quarry.stage.service.exception.NoSuchQuarryInspectionException;
import com.nbp.quarry.stage.service.model.QuarryInspection;
import com.nbp.quarry.stage.service.model.QuarryInspectionTable;
import com.nbp.quarry.stage.service.model.impl.QuarryInspectionImpl;
import com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl;
import com.nbp.quarry.stage.service.service.persistence.QuarryInspectionPersistence;
import com.nbp.quarry.stage.service.service.persistence.QuarryInspectionUtil;
import com.nbp.quarry.stage.service.service.persistence.impl.constants.QUARRY_STAGEPersistenceConstants;

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
 * The persistence implementation for the quarry inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryInspectionPersistence.class)
public class QuarryInspectionPersistenceImpl
	extends BasePersistenceImpl<QuarryInspection>
	implements QuarryInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryInspectionUtil</code> to access the quarry inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQuarryInspectionBy_CI;
	private FinderPath _finderPathCountBygetQuarryInspectionBy_CI;

	/**
	 * Returns the quarry inspection where caseId = &#63; or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarryInspectionBy_CI(String caseId)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarryInspectionBy_CI(
			caseId);

		if (quarryInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryInspectionException(sb.toString());
		}

		return quarryInspection;
	}

	/**
	 * Returns the quarry inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarryInspectionBy_CI(String caseId) {
		return fetchBygetQuarryInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the quarry inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarryInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof QuarryInspection) {
			QuarryInspection quarryInspection = (QuarryInspection)result;

			if (!Objects.equals(caseId, quarryInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYINSPECTIONBY_CI_CASEID_2);
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

				List<QuarryInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryInspectionBy_CI,
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
								"QuarryInspectionPersistenceImpl.fetchBygetQuarryInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryInspection quarryInspection = list.get(0);

					result = quarryInspection;

					cacheResult(quarryInspection);
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
			return (QuarryInspection)result;
		}
	}

	/**
	 * Removes the quarry inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry inspection that was removed
	 */
	@Override
	public QuarryInspection removeBygetQuarryInspectionBy_CI(String caseId)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = findBygetQuarryInspectionBy_CI(
			caseId);

		return remove(quarryInspection);
	}

	/**
	 * Returns the number of quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetQuarryInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYINSPECTIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETQUARRYINSPECTIONBY_CI_CASEID_2 =
			"quarryInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYINSPECTIONBY_CI_CASEID_3 =
			"(quarryInspection.caseId IS NULL OR quarryInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_FBAI;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_FBAI;
	private FinderPath _finderPathCountBygetQuarry_FBAI;

	/**
	 * Returns all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId) {

		return findBygetQuarry_FBAI(
			quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end) {

		return findBygetQuarry_FBAI(quarryApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return findBygetQuarry_FBAI(
			quarryApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_FBAI(
		long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarry_FBAI;
				finderArgs = new Object[] {quarryApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_FBAI;
			finderArgs = new Object[] {
				quarryApplicationId, start, end, orderByComparator
			};
		}

		List<QuarryInspection> list = null;

		if (useFinderCache) {
			list = (List<QuarryInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryInspection quarryInspection : list) {
					if (quarryApplicationId !=
							quarryInspection.getQuarryApplicationId()) {

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

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_FBAI_QUARRYAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				list = (List<QuarryInspection>)QueryUtil.list(
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
	 * Returns the first quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_FBAI_First(
			long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_FBAI_First(
			quarryApplicationId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the first quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_FBAI_First(
		long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		List<QuarryInspection> list = findBygetQuarry_FBAI(
			quarryApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_FBAI_Last(
			long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_FBAI_Last(
			quarryApplicationId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the last quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_FBAI_Last(
		long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		int count = countBygetQuarry_FBAI(quarryApplicationId);

		if (count == 0) {
			return null;
		}

		List<QuarryInspection> list = findBygetQuarry_FBAI(
			quarryApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where quarryApplicationId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection[] findBygetQuarry_FBAI_PrevAndNext(
			long quarryInspectionId, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = findByPrimaryKey(
			quarryInspectionId);

		Session session = null;

		try {
			session = openSession();

			QuarryInspection[] array = new QuarryInspectionImpl[3];

			array[0] = getBygetQuarry_FBAI_PrevAndNext(
				session, quarryInspection, quarryApplicationId,
				orderByComparator, true);

			array[1] = quarryInspection;

			array[2] = getBygetQuarry_FBAI_PrevAndNext(
				session, quarryInspection, quarryApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryInspection getBygetQuarry_FBAI_PrevAndNext(
		Session session, QuarryInspection quarryInspection,
		long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRY_FBAI_QUARRYAPPLICATIONID_2);

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
			sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(quarryApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry inspections where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 */
	@Override
	public void removeBygetQuarry_FBAI(long quarryApplicationId) {
		for (QuarryInspection quarryInspection :
				findBygetQuarry_FBAI(
					quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryInspection);
		}
	}

	/**
	 * Returns the number of quarry inspections where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetQuarry_FBAI(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarry_FBAI;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRY_FBAI_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_FBAI_QUARRYAPPLICATIONID_2 =
			"quarryInspection.quarryApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_CaseId;
	private FinderPath _finderPathCountBygetQuarry_CaseId;

	/**
	 * Returns all the quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseId(String caseId) {
		return findBygetQuarry_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end) {

		return findBygetQuarry_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return findBygetQuarry_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseId(
		String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarry_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<QuarryInspection> list = null;

		if (useFinderCache) {
			list = (List<QuarryInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryInspection quarryInspection : list) {
					if (!caseId.equals(quarryInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryInspection>)QueryUtil.list(
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
	 * Returns the first quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_CaseId_First(
			String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_CaseId_First(
			caseId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the first quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_CaseId_First(
		String caseId, OrderByComparator<QuarryInspection> orderByComparator) {

		List<QuarryInspection> list = findBygetQuarry_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_CaseId_Last(
			String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_CaseId_Last(
			caseId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the last quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_CaseId_Last(
		String caseId, OrderByComparator<QuarryInspection> orderByComparator) {

		int count = countBygetQuarry_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<QuarryInspection> list = findBygetQuarry_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where caseId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection[] findBygetQuarry_CaseId_PrevAndNext(
			long quarryInspectionId, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		caseId = Objects.toString(caseId, "");

		QuarryInspection quarryInspection = findByPrimaryKey(
			quarryInspectionId);

		Session session = null;

		try {
			session = openSession();

			QuarryInspection[] array = new QuarryInspectionImpl[3];

			array[0] = getBygetQuarry_CaseId_PrevAndNext(
				session, quarryInspection, caseId, orderByComparator, true);

			array[1] = quarryInspection;

			array[2] = getBygetQuarry_CaseId_PrevAndNext(
				session, quarryInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryInspection getBygetQuarry_CaseId_PrevAndNext(
		Session session, QuarryInspection quarryInspection, String caseId,
		OrderByComparator<QuarryInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2);
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
			sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
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
						quarryInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetQuarry_CaseId(String caseId) {
		for (QuarryInspection quarryInspection :
				findBygetQuarry_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryInspection);
		}
	}

	/**
	 * Returns the number of quarry inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetQuarry_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETQUARRY_CASEID_CASEID_2 =
		"quarryInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRY_CASEID_CASEID_3 =
		"(quarryInspection.caseId IS NULL OR quarryInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_Status;
	private FinderPath _finderPathCountBygetQuarry_Status;

	/**
	 * Returns all the quarry inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_Status(String status) {
		return findBygetQuarry_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end) {

		return findBygetQuarry_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return findBygetQuarry_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_Status(
		String status, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarry_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<QuarryInspection> list = null;

		if (useFinderCache) {
			list = (List<QuarryInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryInspection quarryInspection : list) {
					if (!status.equals(quarryInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<QuarryInspection>)QueryUtil.list(
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
	 * Returns the first quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_Status_First(
			String status,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_Status_First(
			status, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_Status_First(
		String status, OrderByComparator<QuarryInspection> orderByComparator) {

		List<QuarryInspection> list = findBygetQuarry_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_Status_Last(
			String status,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_Status_Last(
			status, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_Status_Last(
		String status, OrderByComparator<QuarryInspection> orderByComparator) {

		int count = countBygetQuarry_Status(status);

		if (count == 0) {
			return null;
		}

		List<QuarryInspection> list = findBygetQuarry_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection[] findBygetQuarry_Status_PrevAndNext(
			long quarryInspectionId, String status,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		status = Objects.toString(status, "");

		QuarryInspection quarryInspection = findByPrimaryKey(
			quarryInspectionId);

		Session session = null;

		try {
			session = openSession();

			QuarryInspection[] array = new QuarryInspectionImpl[3];

			array[0] = getBygetQuarry_Status_PrevAndNext(
				session, quarryInspection, status, orderByComparator, true);

			array[1] = quarryInspection;

			array[2] = getBygetQuarry_Status_PrevAndNext(
				session, quarryInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryInspection getBygetQuarry_Status_PrevAndNext(
		Session session, QuarryInspection quarryInspection, String status,
		OrderByComparator<QuarryInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_STATUS_STATUS_2);
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
			sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetQuarry_Status(String status) {
		for (QuarryInspection quarryInspection :
				findBygetQuarry_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryInspection);
		}
	}

	/**
	 * Returns the number of quarry inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetQuarry_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
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

	private static final String _FINDER_COLUMN_GETQUARRY_STATUS_STATUS_2 =
		"quarryInspection.status = ?";

	private static final String _FINDER_COLUMN_GETQUARRY_STATUS_STATUS_3 =
		"(quarryInspection.status IS NULL OR quarryInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_CaseIdStatus;
	private FinderPath _finderPathCountBygetQuarry_CaseIdStatus;

	/**
	 * Returns all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId) {

		return findBygetQuarry_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetQuarry_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return findBygetQuarry_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarry_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<QuarryInspection> list = null;

		if (useFinderCache) {
			list = (List<QuarryInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryInspection quarryInspection : list) {
					if (!status.equals(quarryInspection.getStatus()) ||
						!caseId.equals(quarryInspection.getCaseId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<QuarryInspection>)QueryUtil.list(
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
	 * Returns the first quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		List<QuarryInspection> list = findBygetQuarry_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchBygetQuarry_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		int count = countBygetQuarry_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<QuarryInspection> list = findBygetQuarry_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection[] findBygetQuarry_CaseIdStatus_PrevAndNext(
			long quarryInspectionId, String status, String caseId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		QuarryInspection quarryInspection = findByPrimaryKey(
			quarryInspectionId);

		Session session = null;

		try {
			session = openSession();

			QuarryInspection[] array = new QuarryInspectionImpl[3];

			array[0] = getBygetQuarry_CaseIdStatus_PrevAndNext(
				session, quarryInspection, status, caseId, orderByComparator,
				true);

			array[1] = quarryInspection;

			array[2] = getBygetQuarry_CaseIdStatus_PrevAndNext(
				session, quarryInspection, status, caseId, orderByComparator,
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

	protected QuarryInspection getBygetQuarry_CaseIdStatus_PrevAndNext(
		Session session, QuarryInspection quarryInspection, String status,
		String caseId, OrderByComparator<QuarryInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_2);
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
			sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetQuarry_CaseIdStatus(String status, String caseId) {
		for (QuarryInspection quarryInspection :
				findBygetQuarry_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryInspection);
		}
	}

	/**
	 * Returns the number of quarry inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetQuarry_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

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

	private static final String _FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_2 =
		"quarryInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_STATUS_3 =
		"(quarryInspection.status IS NULL OR quarryInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_2 =
		"quarryInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRY_CASEIDSTATUS_CASEID_3 =
		"(quarryInspection.caseId IS NULL OR quarryInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetQuarry_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetQuarry_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetQuarry_CaseIdApplicationId;

	/**
	 * Returns all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		return findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end) {

		return findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry inspections
	 */
	@Override
	public List<QuarryInspection> findBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId, int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarry_CaseIdApplicationId;
				finderArgs = new Object[] {status, quarryApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetQuarry_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, quarryApplicationId, start, end, orderByComparator
			};
		}

		List<QuarryInspection> list = null;

		if (useFinderCache) {
			list = (List<QuarryInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryInspection quarryInspection : list) {
					if (!status.equals(quarryInspection.getStatus()) ||
						(quarryApplicationId !=
							quarryInspection.getQuarryApplicationId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_QUARRYAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(quarryApplicationId);

				list = (List<QuarryInspection>)QueryUtil.list(
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
	 * Returns the first quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_CaseIdApplicationId_First(
			String status, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection =
			fetchBygetQuarry_CaseIdApplicationId_First(
				status, quarryApplicationId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the first quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_CaseIdApplicationId_First(
		String status, long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		List<QuarryInspection> list = findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection findBygetQuarry_CaseIdApplicationId_Last(
			String status, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection =
			fetchBygetQuarry_CaseIdApplicationId_Last(
				status, quarryApplicationId, orderByComparator);

		if (quarryInspection != null) {
			return quarryInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", quarryApplicationId=");
		sb.append(quarryApplicationId);

		sb.append("}");

		throw new NoSuchQuarryInspectionException(sb.toString());
	}

	/**
	 * Returns the last quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection fetchBygetQuarry_CaseIdApplicationId_Last(
		String status, long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator) {

		int count = countBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId);

		if (count == 0) {
			return null;
		}

		List<QuarryInspection> list = findBygetQuarry_CaseIdApplicationId(
			status, quarryApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry inspections before and after the current quarry inspection in the ordered set where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param quarryInspectionId the primary key of the current quarry inspection
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection[] findBygetQuarry_CaseIdApplicationId_PrevAndNext(
			long quarryInspectionId, String status, long quarryApplicationId,
			OrderByComparator<QuarryInspection> orderByComparator)
		throws NoSuchQuarryInspectionException {

		status = Objects.toString(status, "");

		QuarryInspection quarryInspection = findByPrimaryKey(
			quarryInspectionId);

		Session session = null;

		try {
			session = openSession();

			QuarryInspection[] array = new QuarryInspectionImpl[3];

			array[0] = getBygetQuarry_CaseIdApplicationId_PrevAndNext(
				session, quarryInspection, status, quarryApplicationId,
				orderByComparator, true);

			array[1] = quarryInspection;

			array[2] = getBygetQuarry_CaseIdApplicationId_PrevAndNext(
				session, quarryInspection, status, quarryApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryInspection getBygetQuarry_CaseIdApplicationId_PrevAndNext(
		Session session, QuarryInspection quarryInspection, String status,
		long quarryApplicationId,
		OrderByComparator<QuarryInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_QUARRYAPPLICATIONID_2);

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
			sb.append(QuarryInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(quarryApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry inspections where status = &#63; and quarryApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 */
	@Override
	public void removeBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		for (QuarryInspection quarryInspection :
				findBygetQuarry_CaseIdApplicationId(
					status, quarryApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(quarryInspection);
		}
	}

	/**
	 * Returns the number of quarry inspections where status = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_2 =
			"quarryInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_STATUS_3 =
			"(quarryInspection.status IS NULL OR quarryInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRY_CASEIDAPPLICATIONID_QUARRYAPPLICATIONID_2 =
			"quarryInspection.quarryApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspection
	 * @throws NoSuchQuarryInspectionException if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);

		if (quarryInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryInspectionException(sb.toString());
		}

		return quarryInspection;
	}

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long quarryApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, quarryApplicationId, true);
	}

	/**
	 * Returns the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry inspection, or <code>null</code> if a matching quarry inspection could not be found
	 */
	@Override
	public QuarryInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long quarryApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, quarryApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof QuarryInspection) {
			QuarryInspection quarryInspection = (QuarryInspection)result;

			if (!Objects.equals(status, quarryInspection.getStatus()) ||
				(slotBookedByUser != quarryInspection.getSlotBookedByUser()) ||
				(quarryApplicationId !=
					quarryInspection.getQuarryApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(quarryApplicationId);

				List<QuarryInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser,
									quarryApplicationId
								};
							}

							_log.warn(
								"QuarryInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryInspection quarryInspection = list.get(0);

					result = quarryInspection;

					cacheResult(quarryInspection);
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
			return (QuarryInspection)result;
		}
	}

	/**
	 * Removes the quarry inspection where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry inspection that was removed
	 */
	@Override
	public QuarryInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, quarryApplicationId);

		return remove(quarryInspection);
	}

	/**
	 * Returns the number of quarry inspections where status = &#63; and slotBookedByUser = &#63; and quarryApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long quarryApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, quarryApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_QUARRYINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2 =
			"quarryInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(quarryInspection.status IS NULL OR quarryInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"quarryInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_QUARRYAPPLICATIONID_2 =
			"quarryInspection.quarryApplicationId = ?";

	public QuarryInspectionPersistenceImpl() {
		setModelClass(QuarryInspection.class);

		setModelImplClass(QuarryInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryInspectionTable.INSTANCE);
	}

	/**
	 * Caches the quarry inspection in the entity cache if it is enabled.
	 *
	 * @param quarryInspection the quarry inspection
	 */
	@Override
	public void cacheResult(QuarryInspection quarryInspection) {
		entityCache.putResult(
			QuarryInspectionImpl.class, quarryInspection.getPrimaryKey(),
			quarryInspection);

		finderCache.putResult(
			_finderPathFetchBygetQuarryInspectionBy_CI,
			new Object[] {quarryInspection.getCaseId()}, quarryInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				quarryInspection.getStatus(),
				quarryInspection.getSlotBookedByUser(),
				quarryInspection.getQuarryApplicationId()
			},
			quarryInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry inspections in the entity cache if it is enabled.
	 *
	 * @param quarryInspections the quarry inspections
	 */
	@Override
	public void cacheResult(List<QuarryInspection> quarryInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryInspection quarryInspection : quarryInspections) {
			if (entityCache.getResult(
					QuarryInspectionImpl.class,
					quarryInspection.getPrimaryKey()) == null) {

				cacheResult(quarryInspection);
			}
		}
	}

	/**
	 * Clears the cache for all quarry inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryInspectionImpl.class);

		finderCache.clearCache(QuarryInspectionImpl.class);
	}

	/**
	 * Clears the cache for the quarry inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryInspection quarryInspection) {
		entityCache.removeResult(QuarryInspectionImpl.class, quarryInspection);
	}

	@Override
	public void clearCache(List<QuarryInspection> quarryInspections) {
		for (QuarryInspection quarryInspection : quarryInspections) {
			entityCache.removeResult(
				QuarryInspectionImpl.class, quarryInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(QuarryInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryInspectionModelImpl quarryInspectionModelImpl) {

		Object[] args = new Object[] {quarryInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetQuarryInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryInspectionBy_CI, args,
			quarryInspectionModelImpl);

		args = new Object[] {
			quarryInspectionModelImpl.getStatus(),
			quarryInspectionModelImpl.getSlotBookedByUser(),
			quarryInspectionModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, quarryInspectionModelImpl);
	}

	/**
	 * Creates a new quarry inspection with the primary key. Does not add the quarry inspection to the database.
	 *
	 * @param quarryInspectionId the primary key for the new quarry inspection
	 * @return the new quarry inspection
	 */
	@Override
	public QuarryInspection create(long quarryInspectionId) {
		QuarryInspection quarryInspection = new QuarryInspectionImpl();

		quarryInspection.setNew(true);
		quarryInspection.setPrimaryKey(quarryInspectionId);

		quarryInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return quarryInspection;
	}

	/**
	 * Removes the quarry inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection that was removed
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection remove(long quarryInspectionId)
		throws NoSuchQuarryInspectionException {

		return remove((Serializable)quarryInspectionId);
	}

	/**
	 * Removes the quarry inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry inspection
	 * @return the quarry inspection that was removed
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection remove(Serializable primaryKey)
		throws NoSuchQuarryInspectionException {

		Session session = null;

		try {
			session = openSession();

			QuarryInspection quarryInspection = (QuarryInspection)session.get(
				QuarryInspectionImpl.class, primaryKey);

			if (quarryInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryInspection);
		}
		catch (NoSuchQuarryInspectionException noSuchEntityException) {
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
	protected QuarryInspection removeImpl(QuarryInspection quarryInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryInspection)) {
				quarryInspection = (QuarryInspection)session.get(
					QuarryInspectionImpl.class,
					quarryInspection.getPrimaryKeyObj());
			}

			if (quarryInspection != null) {
				session.delete(quarryInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryInspection != null) {
			clearCache(quarryInspection);
		}

		return quarryInspection;
	}

	@Override
	public QuarryInspection updateImpl(QuarryInspection quarryInspection) {
		boolean isNew = quarryInspection.isNew();

		if (!(quarryInspection instanceof QuarryInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryInspection implementation " +
					quarryInspection.getClass());
		}

		QuarryInspectionModelImpl quarryInspectionModelImpl =
			(QuarryInspectionModelImpl)quarryInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryInspection.setCreateDate(date);
			}
			else {
				quarryInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryInspection.setModifiedDate(date);
			}
			else {
				quarryInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryInspection);
			}
			else {
				quarryInspection = (QuarryInspection)session.merge(
					quarryInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryInspectionImpl.class, quarryInspectionModelImpl, false, true);

		cacheUniqueFindersCache(quarryInspectionModelImpl);

		if (isNew) {
			quarryInspection.setNew(false);
		}

		quarryInspection.resetOriginalValues();

		return quarryInspection;
	}

	/**
	 * Returns the quarry inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry inspection
	 * @return the quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryInspectionException {

		QuarryInspection quarryInspection = fetchByPrimaryKey(primaryKey);

		if (quarryInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryInspection;
	}

	/**
	 * Returns the quarry inspection with the primary key or throws a <code>NoSuchQuarryInspectionException</code> if it could not be found.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection
	 * @throws NoSuchQuarryInspectionException if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection findByPrimaryKey(long quarryInspectionId)
		throws NoSuchQuarryInspectionException {

		return findByPrimaryKey((Serializable)quarryInspectionId);
	}

	/**
	 * Returns the quarry inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection, or <code>null</code> if a quarry inspection with the primary key could not be found
	 */
	@Override
	public QuarryInspection fetchByPrimaryKey(long quarryInspectionId) {
		return fetchByPrimaryKey((Serializable)quarryInspectionId);
	}

	/**
	 * Returns all the quarry inspections.
	 *
	 * @return the quarry inspections
	 */
	@Override
	public List<QuarryInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of quarry inspections
	 */
	@Override
	public List<QuarryInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry inspections
	 */
	@Override
	public List<QuarryInspection> findAll(
		int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry inspections
	 */
	@Override
	public List<QuarryInspection> findAll(
		int start, int end,
		OrderByComparator<QuarryInspection> orderByComparator,
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

		List<QuarryInspection> list = null;

		if (useFinderCache) {
			list = (List<QuarryInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYINSPECTION;

				sql = sql.concat(QuarryInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryInspection>)QueryUtil.list(
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
	 * Removes all the quarry inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryInspection quarryInspection : findAll()) {
			remove(quarryInspection);
		}
	}

	/**
	 * Returns the number of quarry inspections.
	 *
	 * @return the number of quarry inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_QUARRYINSPECTION);

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
		return "quarryInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry inspection persistence.
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

		_finderPathFetchBygetQuarryInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQuarryInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetQuarry_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_FBAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"quarryApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarry_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarry_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathWithPaginationFindBygetQuarry_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarry_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQuarry_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetQuarry_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarry_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarry_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetQuarry_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_Status", new String[] {String.class.getName()},
			new String[] {"status"}, false);

		_finderPathWithPaginationFindBygetQuarry_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetQuarry_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_CaseIdStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarry_CaseIdStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"status", "caseId"}, true);

		_finderPathCountBygetQuarry_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetQuarry_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetQuarry_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "quarryApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarry_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "quarryApplicationId"}, true);

		_finderPathCountBygetQuarry_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "quarryApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "quarryApplicationId"
				},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "quarryApplicationId"
				},
				false);

		QuarryInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryInspectionUtil.setPersistence(null);

		entityCache.removeCache(QuarryInspectionImpl.class.getName());
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

	private static final String _SQL_SELECT_QUARRYINSPECTION =
		"SELECT quarryInspection FROM QuarryInspection quarryInspection";

	private static final String _SQL_SELECT_QUARRYINSPECTION_WHERE =
		"SELECT quarryInspection FROM QuarryInspection quarryInspection WHERE ";

	private static final String _SQL_COUNT_QUARRYINSPECTION =
		"SELECT COUNT(quarryInspection) FROM QuarryInspection quarryInspection";

	private static final String _SQL_COUNT_QUARRYINSPECTION_WHERE =
		"SELECT COUNT(quarryInspection) FROM QuarryInspection quarryInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "quarryInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}