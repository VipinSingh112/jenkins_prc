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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.wra.stage.service.exception.NoSuchWraInspectionException;
import com.nbp.wra.stage.service.model.WraInspection;
import com.nbp.wra.stage.service.model.WraInspectionTable;
import com.nbp.wra.stage.service.model.impl.WraInspectionImpl;
import com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl;
import com.nbp.wra.stage.service.service.persistence.WraInspectionPersistence;
import com.nbp.wra.stage.service.service.persistence.WraInspectionUtil;
import com.nbp.wra.stage.service.service.persistence.impl.constants.WRA_STAGESPersistenceConstants;

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
 * The persistence implementation for the wra inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WraInspectionPersistence.class)
public class WraInspectionPersistenceImpl
	extends BasePersistenceImpl<WraInspection>
	implements WraInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WraInspectionUtil</code> to access the wra inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WraInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWraInspectionBy_CI;
	private FinderPath _finderPathCountBygetWraInspectionBy_CI;

	/**
	 * Returns the wra inspection where caseId = &#63; or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWraInspectionBy_CI(String caseId)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWraInspectionBy_CI(caseId);

		if (wraInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWraInspectionException(sb.toString());
		}

		return wraInspection;
	}

	/**
	 * Returns the wra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWraInspectionBy_CI(String caseId) {
		return fetchBygetWraInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the wra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWraInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWraInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof WraInspection) {
			WraInspection wraInspection = (WraInspection)result;

			if (!Objects.equals(caseId, wraInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAINSPECTIONBY_CI_CASEID_2);
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

				List<WraInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWraInspectionBy_CI, finderArgs,
							list);
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
								"WraInspectionPersistenceImpl.fetchBygetWraInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraInspection wraInspection = list.get(0);

					result = wraInspection;

					cacheResult(wraInspection);
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
			return (WraInspection)result;
		}
	}

	/**
	 * Removes the wra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra inspection that was removed
	 */
	@Override
	public WraInspection removeBygetWraInspectionBy_CI(String caseId)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = findBygetWraInspectionBy_CI(caseId);

		return remove(wraInspection);
	}

	/**
	 * Returns the number of wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetWraInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWraInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAINSPECTIONBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRAINSPECTIONBY_CI_CASEID_2 =
		"wraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRAINSPECTIONBY_CI_CASEID_3 =
		"(wraInspection.caseId IS NULL OR wraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetWraById;
	private FinderPath _finderPathWithoutPaginationFindBygetWraById;
	private FinderPath _finderPathCountBygetWraById;

	/**
	 * Returns all the wra inspections where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWraById(long wraApplicationId) {
		return findBygetWraById(
			wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end) {

		return findBygetWraById(wraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return findBygetWraById(
			wraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra inspections where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWraById(
		long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWraById;
				finderArgs = new Object[] {wraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWraById;
			finderArgs = new Object[] {
				wraApplicationId, start, end, orderByComparator
			};
		}

		List<WraInspection> list = null;

		if (useFinderCache) {
			list = (List<WraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraInspection wraInspection : list) {
					if (wraApplicationId !=
							wraInspection.getWraApplicationId()) {

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

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRABYID_WRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				list = (List<WraInspection>)QueryUtil.list(
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
	 * Returns the first wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWraById_First(
			long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWraById_First(
			wraApplicationId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the first wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWraById_First(
		long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		List<WraInspection> list = findBygetWraById(
			wraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWraById_Last(
			long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWraById_Last(
			wraApplicationId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the last wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWraById_Last(
		long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		int count = countBygetWraById(wraApplicationId);

		if (count == 0) {
			return null;
		}

		List<WraInspection> list = findBygetWraById(
			wraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection[] findBygetWraById_PrevAndNext(
			long wraInspectionId, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = findByPrimaryKey(wraInspectionId);

		Session session = null;

		try {
			session = openSession();

			WraInspection[] array = new WraInspectionImpl[3];

			array[0] = getBygetWraById_PrevAndNext(
				session, wraInspection, wraApplicationId, orderByComparator,
				true);

			array[1] = wraInspection;

			array[2] = getBygetWraById_PrevAndNext(
				session, wraInspection, wraApplicationId, orderByComparator,
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

	protected WraInspection getBygetWraById_PrevAndNext(
		Session session, WraInspection wraInspection, long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETWRABYID_WRAAPPLICATIONID_2);

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
			sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(wraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra inspections where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	@Override
	public void removeBygetWraById(long wraApplicationId) {
		for (WraInspection wraInspection :
				findBygetWraById(
					wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraInspection);
		}
	}

	/**
	 * Returns the number of wra inspections where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetWraById(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWraById;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRABYID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRABYID_WRAAPPLICATIONID_2 =
		"wraInspection.wraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetWra_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetWra_CaseId;
	private FinderPath _finderPathCountBygetWra_CaseId;

	/**
	 * Returns all the wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CaseId(String caseId) {
		return findBygetWra_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end) {

		return findBygetWra_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return findBygetWra_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWra_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWra_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<WraInspection> list = null;

		if (useFinderCache) {
			list = (List<WraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraInspection wraInspection : list) {
					if (!caseId.equals(wraInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraInspection>)QueryUtil.list(
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
	 * Returns the first wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_CaseId_First(
			String caseId, OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_CaseId_First(
			caseId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the first wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_CaseId_First(
		String caseId, OrderByComparator<WraInspection> orderByComparator) {

		List<WraInspection> list = findBygetWra_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_CaseId_Last(
			String caseId, OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_CaseId_Last(
			caseId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the last wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_CaseId_Last(
		String caseId, OrderByComparator<WraInspection> orderByComparator) {

		int count = countBygetWra_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<WraInspection> list = findBygetWra_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection[] findBygetWra_CaseId_PrevAndNext(
			long wraInspectionId, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		caseId = Objects.toString(caseId, "");

		WraInspection wraInspection = findByPrimaryKey(wraInspectionId);

		Session session = null;

		try {
			session = openSession();

			WraInspection[] array = new WraInspectionImpl[3];

			array[0] = getBygetWra_CaseId_PrevAndNext(
				session, wraInspection, caseId, orderByComparator, true);

			array[1] = wraInspection;

			array[2] = getBygetWra_CaseId_PrevAndNext(
				session, wraInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WraInspection getBygetWra_CaseId_PrevAndNext(
		Session session, WraInspection wraInspection, String caseId,
		OrderByComparator<WraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETWRA_CASEID_CASEID_2);
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
			sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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
						wraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetWra_CaseId(String caseId) {
		for (WraInspection wraInspection :
				findBygetWra_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraInspection);
		}
	}

	/**
	 * Returns the number of wra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetWra_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWra_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRA_CASEID_CASEID_2 =
		"wraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRA_CASEID_CASEID_3 =
		"(wraInspection.caseId IS NULL OR wraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetWra_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetWra_Status;
	private FinderPath _finderPathCountBygetWra_Status;

	/**
	 * Returns all the wra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_Status(String status) {
		return findBygetWra_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_Status(
		String status, int start, int end) {

		return findBygetWra_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_Status(
		String status, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return findBygetWra_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_Status(
		String status, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWra_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWra_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<WraInspection> list = null;

		if (useFinderCache) {
			list = (List<WraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraInspection wraInspection : list) {
					if (!status.equals(wraInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETWRA_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraInspection>)QueryUtil.list(
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
	 * Returns the first wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_Status_First(
			String status, OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_Status_First(
			status, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_Status_First(
		String status, OrderByComparator<WraInspection> orderByComparator) {

		List<WraInspection> list = findBygetWra_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_Status_Last(
			String status, OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_Status_Last(
			status, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_Status_Last(
		String status, OrderByComparator<WraInspection> orderByComparator) {

		int count = countBygetWra_Status(status);

		if (count == 0) {
			return null;
		}

		List<WraInspection> list = findBygetWra_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection[] findBygetWra_Status_PrevAndNext(
			long wraInspectionId, String status,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		status = Objects.toString(status, "");

		WraInspection wraInspection = findByPrimaryKey(wraInspectionId);

		Session session = null;

		try {
			session = openSession();

			WraInspection[] array = new WraInspectionImpl[3];

			array[0] = getBygetWra_Status_PrevAndNext(
				session, wraInspection, status, orderByComparator, true);

			array[1] = wraInspection;

			array[2] = getBygetWra_Status_PrevAndNext(
				session, wraInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WraInspection getBygetWra_Status_PrevAndNext(
		Session session, WraInspection wraInspection, String status,
		OrderByComparator<WraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETWRA_STATUS_STATUS_2);
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
			sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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
						wraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetWra_Status(String status) {
		for (WraInspection wraInspection :
				findBygetWra_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraInspection);
		}
	}

	/**
	 * Returns the number of wra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetWra_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetWra_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETWRA_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETWRA_STATUS_STATUS_2 =
		"wraInspection.status = ?";

	private static final String _FINDER_COLUMN_GETWRA_STATUS_STATUS_3 =
		"(wraInspection.status IS NULL OR wraInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetWra_CI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetWra_CI_Status;
	private FinderPath _finderPathCountBygetWra_CI_Status;

	/**
	 * Returns all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId) {

		return findBygetWra_CI_Status(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end) {

		return findBygetWra_CI_Status(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return findBygetWra_CI_Status(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_Status(
		String status, String caseId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWra_CI_Status;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWra_CI_Status;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<WraInspection> list = null;

		if (useFinderCache) {
			list = (List<WraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraInspection wraInspection : list) {
					if (!status.equals(wraInspection.getStatus()) ||
						!caseId.equals(wraInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<WraInspection>)QueryUtil.list(
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
	 * Returns the first wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_CI_Status_First(
			String status, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_CI_Status_First(
			status, caseId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_CI_Status_First(
		String status, String caseId,
		OrderByComparator<WraInspection> orderByComparator) {

		List<WraInspection> list = findBygetWra_CI_Status(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_CI_Status_Last(
			String status, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_CI_Status_Last(
			status, caseId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_CI_Status_Last(
		String status, String caseId,
		OrderByComparator<WraInspection> orderByComparator) {

		int count = countBygetWra_CI_Status(status, caseId);

		if (count == 0) {
			return null;
		}

		List<WraInspection> list = findBygetWra_CI_Status(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection[] findBygetWra_CI_Status_PrevAndNext(
			long wraInspectionId, String status, String caseId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		WraInspection wraInspection = findByPrimaryKey(wraInspectionId);

		Session session = null;

		try {
			session = openSession();

			WraInspection[] array = new WraInspectionImpl[3];

			array[0] = getBygetWra_CI_Status_PrevAndNext(
				session, wraInspection, status, caseId, orderByComparator,
				true);

			array[1] = wraInspection;

			array[2] = getBygetWra_CI_Status_PrevAndNext(
				session, wraInspection, status, caseId, orderByComparator,
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

	protected WraInspection getBygetWra_CI_Status_PrevAndNext(
		Session session, WraInspection wraInspection, String status,
		String caseId, OrderByComparator<WraInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_2);
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
			sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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
						wraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetWra_CI_Status(String status, String caseId) {
		for (WraInspection wraInspection :
				findBygetWra_CI_Status(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraInspection);
		}
	}

	/**
	 * Returns the number of wra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetWra_CI_Status(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWra_CI_Status;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_2 =
		"wraInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETWRA_CI_STATUS_STATUS_3 =
		"(wraInspection.status IS NULL OR wraInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_2 =
		"wraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRA_CI_STATUS_CASEID_3 =
		"(wraInspection.caseId IS NULL OR wraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetWra_CI_AppId;
	private FinderPath _finderPathWithoutPaginationFindBygetWra_CI_AppId;
	private FinderPath _finderPathCountBygetWra_CI_AppId;

	/**
	 * Returns all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId) {

		return findBygetWra_CI_AppId(
			status, wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end) {

		return findBygetWra_CI_AppId(
			status, wraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return findBygetWra_CI_AppId(
			status, wraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra inspections
	 */
	@Override
	public List<WraInspection> findBygetWra_CI_AppId(
		String status, long wraApplicationId, int start, int end,
		OrderByComparator<WraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWra_CI_AppId;
				finderArgs = new Object[] {status, wraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWra_CI_AppId;
			finderArgs = new Object[] {
				status, wraApplicationId, start, end, orderByComparator
			};
		}

		List<WraInspection> list = null;

		if (useFinderCache) {
			list = (List<WraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WraInspection wraInspection : list) {
					if (!status.equals(wraInspection.getStatus()) ||
						(wraApplicationId !=
							wraInspection.getWraApplicationId())) {

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

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_STATUS_2);
			}

			sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_WRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(wraApplicationId);

				list = (List<WraInspection>)QueryUtil.list(
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
	 * Returns the first wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_CI_AppId_First(
			String status, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_CI_AppId_First(
			status, wraApplicationId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the first wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_CI_AppId_First(
		String status, long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		List<WraInspection> list = findBygetWra_CI_AppId(
			status, wraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetWra_CI_AppId_Last(
			String status, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetWra_CI_AppId_Last(
			status, wraApplicationId, orderByComparator);

		if (wraInspection != null) {
			return wraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWraInspectionException(sb.toString());
	}

	/**
	 * Returns the last wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetWra_CI_AppId_Last(
		String status, long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator) {

		int count = countBygetWra_CI_AppId(status, wraApplicationId);

		if (count == 0) {
			return null;
		}

		List<WraInspection> list = findBygetWra_CI_AppId(
			status, wraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra inspections before and after the current wra inspection in the ordered set where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param wraInspectionId the primary key of the current wra inspection
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection[] findBygetWra_CI_AppId_PrevAndNext(
			long wraInspectionId, String status, long wraApplicationId,
			OrderByComparator<WraInspection> orderByComparator)
		throws NoSuchWraInspectionException {

		status = Objects.toString(status, "");

		WraInspection wraInspection = findByPrimaryKey(wraInspectionId);

		Session session = null;

		try {
			session = openSession();

			WraInspection[] array = new WraInspectionImpl[3];

			array[0] = getBygetWra_CI_AppId_PrevAndNext(
				session, wraInspection, status, wraApplicationId,
				orderByComparator, true);

			array[1] = wraInspection;

			array[2] = getBygetWra_CI_AppId_PrevAndNext(
				session, wraInspection, status, wraApplicationId,
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

	protected WraInspection getBygetWra_CI_AppId_PrevAndNext(
		Session session, WraInspection wraInspection, String status,
		long wraApplicationId,
		OrderByComparator<WraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_STATUS_2);
		}

		sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_WRAAPPLICATIONID_2);

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
			sb.append(WraInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(wraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra inspections where status = &#63; and wraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 */
	@Override
	public void removeBygetWra_CI_AppId(String status, long wraApplicationId) {
		for (WraInspection wraInspection :
				findBygetWra_CI_AppId(
					status, wraApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(wraInspection);
		}
	}

	/**
	 * Returns the number of wra inspections where status = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetWra_CI_AppId(String status, long wraApplicationId) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetWra_CI_AppId;

		Object[] finderArgs = new Object[] {status, wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_STATUS_2);
			}

			sb.append(_FINDER_COLUMN_GETWRA_CI_APPID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_CI_APPID_STATUS_2 =
		"wraInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETWRA_CI_APPID_STATUS_3 =
		"(wraInspection.status IS NULL OR wraInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_CI_APPID_WRAAPPLICATIONID_2 =
			"wraInspection.wraApplicationId = ?";

	private FinderPath _finderPathFetchBygetInspecByST_Slot_AppId;
	private FinderPath _finderPathCountBygetInspecByST_Slot_AppId;

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspection
	 * @throws NoSuchWraInspectionException if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection findBygetInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);

		if (wraInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWraInspectionException(sb.toString());
		}

		return wraInspection;
	}

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId) {

		return fetchBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId, true);
	}

	/**
	 * Returns the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra inspection, or <code>null</code> if a matching wra inspection could not be found
	 */
	@Override
	public WraInspection fetchBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, wraApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspecByST_Slot_AppId, finderArgs, this);
		}

		if (result instanceof WraInspection) {
			WraInspection wraInspection = (WraInspection)result;

			if (!Objects.equals(status, wraInspection.getStatus()) ||
				(slotBookedByUser != wraInspection.getSlotBookedByUser()) ||
				(wraApplicationId != wraInspection.getWraApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_WRAAPPLICATIONID_2);

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

				queryPos.add(wraApplicationId);

				List<WraInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspecByST_Slot_AppId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser, wraApplicationId
								};
							}

							_log.warn(
								"WraInspectionPersistenceImpl.fetchBygetInspecByST_Slot_AppId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WraInspection wraInspection = list.get(0);

					result = wraInspection;

					cacheResult(wraInspection);
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
			return (WraInspection)result;
		}
	}

	/**
	 * Removes the wra inspection where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the wra inspection that was removed
	 */
	@Override
	public WraInspection removeBygetInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = findBygetInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);

		return remove(wraInspection);
	}

	/**
	 * Returns the number of wra inspections where status = &#63; and slotBookedByUser = &#63; and wraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra inspections
	 */
	@Override
	public int countBygetInspecByST_Slot_AppId(
		String status, long slotBookedByUser, long wraApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetInspecByST_Slot_AppId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, wraApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_WRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_WRAAPPLICATIONID_2);

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

				queryPos.add(wraApplicationId);

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
		_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_STATUS_2 =
			"wraInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_STATUS_3 =
			"(wraInspection.status IS NULL OR wraInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_SLOTBOOKEDBYUSER_2 =
			"wraInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECBYST_SLOT_APPID_WRAAPPLICATIONID_2 =
			"wraInspection.wraApplicationId = ?";

	public WraInspectionPersistenceImpl() {
		setModelClass(WraInspection.class);

		setModelImplClass(WraInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(WraInspectionTable.INSTANCE);
	}

	/**
	 * Caches the wra inspection in the entity cache if it is enabled.
	 *
	 * @param wraInspection the wra inspection
	 */
	@Override
	public void cacheResult(WraInspection wraInspection) {
		entityCache.putResult(
			WraInspectionImpl.class, wraInspection.getPrimaryKey(),
			wraInspection);

		finderCache.putResult(
			_finderPathFetchBygetWraInspectionBy_CI,
			new Object[] {wraInspection.getCaseId()}, wraInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspecByST_Slot_AppId,
			new Object[] {
				wraInspection.getStatus(), wraInspection.getSlotBookedByUser(),
				wraInspection.getWraApplicationId()
			},
			wraInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra inspections in the entity cache if it is enabled.
	 *
	 * @param wraInspections the wra inspections
	 */
	@Override
	public void cacheResult(List<WraInspection> wraInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WraInspection wraInspection : wraInspections) {
			if (entityCache.getResult(
					WraInspectionImpl.class, wraInspection.getPrimaryKey()) ==
						null) {

				cacheResult(wraInspection);
			}
		}
	}

	/**
	 * Clears the cache for all wra inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WraInspectionImpl.class);

		finderCache.clearCache(WraInspectionImpl.class);
	}

	/**
	 * Clears the cache for the wra inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WraInspection wraInspection) {
		entityCache.removeResult(WraInspectionImpl.class, wraInspection);
	}

	@Override
	public void clearCache(List<WraInspection> wraInspections) {
		for (WraInspection wraInspection : wraInspections) {
			entityCache.removeResult(WraInspectionImpl.class, wraInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WraInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WraInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WraInspectionModelImpl wraInspectionModelImpl) {

		Object[] args = new Object[] {wraInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetWraInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWraInspectionBy_CI, args,
			wraInspectionModelImpl);

		args = new Object[] {
			wraInspectionModelImpl.getStatus(),
			wraInspectionModelImpl.getSlotBookedByUser(),
			wraInspectionModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspecByST_Slot_AppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspecByST_Slot_AppId, args,
			wraInspectionModelImpl);
	}

	/**
	 * Creates a new wra inspection with the primary key. Does not add the wra inspection to the database.
	 *
	 * @param wraInspectionId the primary key for the new wra inspection
	 * @return the new wra inspection
	 */
	@Override
	public WraInspection create(long wraInspectionId) {
		WraInspection wraInspection = new WraInspectionImpl();

		wraInspection.setNew(true);
		wraInspection.setPrimaryKey(wraInspectionId);

		wraInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraInspection;
	}

	/**
	 * Removes the wra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection that was removed
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection remove(long wraInspectionId)
		throws NoSuchWraInspectionException {

		return remove((Serializable)wraInspectionId);
	}

	/**
	 * Removes the wra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra inspection
	 * @return the wra inspection that was removed
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection remove(Serializable primaryKey)
		throws NoSuchWraInspectionException {

		Session session = null;

		try {
			session = openSession();

			WraInspection wraInspection = (WraInspection)session.get(
				WraInspectionImpl.class, primaryKey);

			if (wraInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWraInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraInspection);
		}
		catch (NoSuchWraInspectionException noSuchEntityException) {
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
	protected WraInspection removeImpl(WraInspection wraInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraInspection)) {
				wraInspection = (WraInspection)session.get(
					WraInspectionImpl.class, wraInspection.getPrimaryKeyObj());
			}

			if (wraInspection != null) {
				session.delete(wraInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraInspection != null) {
			clearCache(wraInspection);
		}

		return wraInspection;
	}

	@Override
	public WraInspection updateImpl(WraInspection wraInspection) {
		boolean isNew = wraInspection.isNew();

		if (!(wraInspection instanceof WraInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WraInspection implementation " +
					wraInspection.getClass());
		}

		WraInspectionModelImpl wraInspectionModelImpl =
			(WraInspectionModelImpl)wraInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraInspection.setCreateDate(date);
			}
			else {
				wraInspection.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!wraInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraInspection.setModifiedDate(date);
			}
			else {
				wraInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraInspection);
			}
			else {
				wraInspection = (WraInspection)session.merge(wraInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WraInspectionImpl.class, wraInspectionModelImpl, false, true);

		cacheUniqueFindersCache(wraInspectionModelImpl);

		if (isNew) {
			wraInspection.setNew(false);
		}

		wraInspection.resetOriginalValues();

		return wraInspection;
	}

	/**
	 * Returns the wra inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra inspection
	 * @return the wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWraInspectionException {

		WraInspection wraInspection = fetchByPrimaryKey(primaryKey);

		if (wraInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWraInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraInspection;
	}

	/**
	 * Returns the wra inspection with the primary key or throws a <code>NoSuchWraInspectionException</code> if it could not be found.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection
	 * @throws NoSuchWraInspectionException if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection findByPrimaryKey(long wraInspectionId)
		throws NoSuchWraInspectionException {

		return findByPrimaryKey((Serializable)wraInspectionId);
	}

	/**
	 * Returns the wra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection, or <code>null</code> if a wra inspection with the primary key could not be found
	 */
	@Override
	public WraInspection fetchByPrimaryKey(long wraInspectionId) {
		return fetchByPrimaryKey((Serializable)wraInspectionId);
	}

	/**
	 * Returns all the wra inspections.
	 *
	 * @return the wra inspections
	 */
	@Override
	public List<WraInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of wra inspections
	 */
	@Override
	public List<WraInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra inspections
	 */
	@Override
	public List<WraInspection> findAll(
		int start, int end,
		OrderByComparator<WraInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra inspections
	 */
	@Override
	public List<WraInspection> findAll(
		int start, int end, OrderByComparator<WraInspection> orderByComparator,
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

		List<WraInspection> list = null;

		if (useFinderCache) {
			list = (List<WraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAINSPECTION;

				sql = sql.concat(WraInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WraInspection>)QueryUtil.list(
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
	 * Removes all the wra inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WraInspection wraInspection : findAll()) {
			remove(wraInspection);
		}
	}

	/**
	 * Returns the number of wra inspections.
	 *
	 * @return the number of wra inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_WRAINSPECTION);

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
		return "wraInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WraInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra inspection persistence.
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

		_finderPathFetchBygetWraInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWraInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWraInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWraInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetWraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"wraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetWraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWraById",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWraById",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		_finderPathWithPaginationFindBygetWra_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWra_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetWra_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWra_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWra_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWra_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetWra_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWra_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetWra_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWra_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetWra_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWra_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetWra_CI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWra_CI_Status",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetWra_CI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWra_CI_Status",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetWra_CI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWra_CI_Status",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetWra_CI_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWra_CI_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "wraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetWra_CI_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWra_CI_AppId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "wraApplicationId"}, true);

		_finderPathCountBygetWra_CI_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWra_CI_AppId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "wraApplicationId"}, false);

		_finderPathFetchBygetInspecByST_Slot_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetInspecByST_Slot_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			new String[] {"status", "slotBookedByUser", "wraApplicationId"},
			true);

		_finderPathCountBygetInspecByST_Slot_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetInspecByST_Slot_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			new String[] {"status", "slotBookedByUser", "wraApplicationId"},
			false);

		WraInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WraInspectionUtil.setPersistence(null);

		entityCache.removeCache(WraInspectionImpl.class.getName());
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

	private static final String _SQL_SELECT_WRAINSPECTION =
		"SELECT wraInspection FROM WraInspection wraInspection";

	private static final String _SQL_SELECT_WRAINSPECTION_WHERE =
		"SELECT wraInspection FROM WraInspection wraInspection WHERE ";

	private static final String _SQL_COUNT_WRAINSPECTION =
		"SELECT COUNT(wraInspection) FROM WraInspection wraInspection";

	private static final String _SQL_COUNT_WRAINSPECTION_WHERE =
		"SELECT COUNT(wraInspection) FROM WraInspection wraInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wraInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WraInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WraInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WraInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}