/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

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

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjInspectionException;
import com.nbp.ncbj.stages.services.model.NcbjInspection;
import com.nbp.ncbj.stages.services.model.NcbjInspectionTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjInspectionImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjInspectionModelImpl;
import com.nbp.ncbj.stages.services.service.persistence.NcbjInspectionPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjInspectionUtil;
import com.nbp.ncbj.stages.services.service.persistence.impl.constants.NCBJ_STAGESPersistenceConstants;

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
 * The persistence implementation for the ncbj inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjInspectionPersistence.class)
public class NcbjInspectionPersistenceImpl
	extends BasePersistenceImpl<NcbjInspection>
	implements NcbjInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjInspectionUtil</code> to access the ncbj inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcbjInspectionBy_CI;
	private FinderPath _finderPathCountBygetNcbjInspectionBy_CI;

	/**
	 * Returns the ncbj inspection where caseId = &#63; or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbjInspectionBy_CI(String caseId)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbjInspectionBy_CI(caseId);

		if (ncbjInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjInspectionException(sb.toString());
		}

		return ncbjInspection;
	}

	/**
	 * Returns the ncbj inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbjInspectionBy_CI(String caseId) {
		return fetchBygetNcbjInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the ncbj inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbjInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbjInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof NcbjInspection) {
			NcbjInspection ncbjInspection = (NcbjInspection)result;

			if (!Objects.equals(caseId, ncbjInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJINSPECTIONBY_CI_CASEID_2);
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

				List<NcbjInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbjInspectionBy_CI,
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
								"NcbjInspectionPersistenceImpl.fetchBygetNcbjInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjInspection ncbjInspection = list.get(0);

					result = ncbjInspection;

					cacheResult(ncbjInspection);
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
			return (NcbjInspection)result;
		}
	}

	/**
	 * Removes the ncbj inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj inspection that was removed
	 */
	@Override
	public NcbjInspection removeBygetNcbjInspectionBy_CI(String caseId)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = findBygetNcbjInspectionBy_CI(caseId);

		return remove(ncbjInspection);
	}

	/**
	 * Returns the number of ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetNcbjInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbjInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJINSPECTIONBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJINSPECTIONBY_CI_CASEID_2 =
		"ncbjInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJINSPECTIONBY_CI_CASEID_3 =
		"(ncbjInspection.caseId IS NULL OR ncbjInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_FBAI;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_FBAI;
	private FinderPath _finderPathCountBygetNcbj_FBAI;

	/**
	 * Returns all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_FBAI(long ncbjApplicationId) {
		return findBygetNcbj_FBAI(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end) {

		return findBygetNcbj_FBAI(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return findBygetNcbj_FBAI(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_FBAI(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcbj_FBAI;
				finderArgs = new Object[] {ncbjApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_FBAI;
			finderArgs = new Object[] {
				ncbjApplicationId, start, end, orderByComparator
			};
		}

		List<NcbjInspection> list = null;

		if (useFinderCache) {
			list = (List<NcbjInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjInspection ncbjInspection : list) {
					if (ncbjApplicationId !=
							ncbjInspection.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_FBAI_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjInspection>)QueryUtil.list(
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
	 * Returns the first ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_FBAI_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_FBAI_First(
			ncbjApplicationId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_FBAI_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		List<NcbjInspection> list = findBygetNcbj_FBAI(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_FBAI_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_FBAI_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_FBAI_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		int count = countBygetNcbj_FBAI(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjInspection> list = findBygetNcbj_FBAI(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection[] findBygetNcbj_FBAI_PrevAndNext(
			long ncbjInspectionId, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = findByPrimaryKey(ncbjInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcbjInspection[] array = new NcbjInspectionImpl[3];

			array[0] = getBygetNcbj_FBAI_PrevAndNext(
				session, ncbjInspection, ncbjApplicationId, orderByComparator,
				true);

			array[1] = ncbjInspection;

			array[2] = getBygetNcbj_FBAI_PrevAndNext(
				session, ncbjInspection, ncbjApplicationId, orderByComparator,
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

	protected NcbjInspection getBygetNcbj_FBAI_PrevAndNext(
		Session session, NcbjInspection ncbjInspection, long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETNCBJ_FBAI_NCBJAPPLICATIONID_2);

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
			sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(ncbjApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncbjInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj inspections where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNcbj_FBAI(long ncbjApplicationId) {
		for (NcbjInspection ncbjInspection :
				findBygetNcbj_FBAI(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjInspection);
		}
	}

	/**
	 * Returns the number of ncbj inspections where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetNcbj_FBAI(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcbj_FBAI;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_FBAI_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJ_FBAI_NCBJAPPLICATIONID_2 =
			"ncbjInspection.ncbjApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_CaseId;
	private FinderPath _finderPathCountBygetNcbj_CaseId;

	/**
	 * Returns all the ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseId(String caseId) {
		return findBygetNcbj_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end) {

		return findBygetNcbj_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return findBygetNcbj_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcbj_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<NcbjInspection> list = null;

		if (useFinderCache) {
			list = (List<NcbjInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjInspection ncbjInspection : list) {
					if (!caseId.equals(ncbjInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjInspection>)QueryUtil.list(
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
	 * Returns the first ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_CaseId_First(
			String caseId, OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_CaseId_First(
			caseId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_CaseId_First(
		String caseId, OrderByComparator<NcbjInspection> orderByComparator) {

		List<NcbjInspection> list = findBygetNcbj_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_CaseId_Last(
			String caseId, OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_CaseId_Last(
			caseId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_CaseId_Last(
		String caseId, OrderByComparator<NcbjInspection> orderByComparator) {

		int count = countBygetNcbj_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<NcbjInspection> list = findBygetNcbj_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection[] findBygetNcbj_CaseId_PrevAndNext(
			long ncbjInspectionId, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		caseId = Objects.toString(caseId, "");

		NcbjInspection ncbjInspection = findByPrimaryKey(ncbjInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcbjInspection[] array = new NcbjInspectionImpl[3];

			array[0] = getBygetNcbj_CaseId_PrevAndNext(
				session, ncbjInspection, caseId, orderByComparator, true);

			array[1] = ncbjInspection;

			array[2] = getBygetNcbj_CaseId_PrevAndNext(
				session, ncbjInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjInspection getBygetNcbj_CaseId_PrevAndNext(
		Session session, NcbjInspection ncbjInspection, String caseId,
		OrderByComparator<NcbjInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_CASEID_CASEID_2);
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
			sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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
						ncbjInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcbj_CaseId(String caseId) {
		for (NcbjInspection ncbjInspection :
				findBygetNcbj_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjInspection);
		}
	}

	/**
	 * Returns the number of ncbj inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetNcbj_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJ_CASEID_CASEID_2 =
		"ncbjInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJ_CASEID_CASEID_3 =
		"(ncbjInspection.caseId IS NULL OR ncbjInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_Status;
	private FinderPath _finderPathCountBygetNcbj_Status;

	/**
	 * Returns all the ncbj inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_Status(String status) {
		return findBygetNcbj_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end) {

		return findBygetNcbj_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return findBygetNcbj_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_Status(
		String status, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcbj_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<NcbjInspection> list = null;

		if (useFinderCache) {
			list = (List<NcbjInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjInspection ncbjInspection : list) {
					if (!status.equals(ncbjInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjInspection>)QueryUtil.list(
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
	 * Returns the first ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_Status_First(
			String status, OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_Status_First(
			status, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_Status_First(
		String status, OrderByComparator<NcbjInspection> orderByComparator) {

		List<NcbjInspection> list = findBygetNcbj_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_Status_Last(
			String status, OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_Status_Last(
			status, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_Status_Last(
		String status, OrderByComparator<NcbjInspection> orderByComparator) {

		int count = countBygetNcbj_Status(status);

		if (count == 0) {
			return null;
		}

		List<NcbjInspection> list = findBygetNcbj_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection[] findBygetNcbj_Status_PrevAndNext(
			long ncbjInspectionId, String status,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		status = Objects.toString(status, "");

		NcbjInspection ncbjInspection = findByPrimaryKey(ncbjInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcbjInspection[] array = new NcbjInspectionImpl[3];

			array[0] = getBygetNcbj_Status_PrevAndNext(
				session, ncbjInspection, status, orderByComparator, true);

			array[1] = ncbjInspection;

			array[2] = getBygetNcbj_Status_PrevAndNext(
				session, ncbjInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjInspection getBygetNcbj_Status_PrevAndNext(
		Session session, NcbjInspection ncbjInspection, String status,
		OrderByComparator<NcbjInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_STATUS_STATUS_2);
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
			sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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
						ncbjInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetNcbj_Status(String status) {
		for (NcbjInspection ncbjInspection :
				findBygetNcbj_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjInspection);
		}
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetNcbj_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETNCBJ_STATUS_STATUS_2 =
		"ncbjInspection.status = ?";

	private static final String _FINDER_COLUMN_GETNCBJ_STATUS_STATUS_3 =
		"(ncbjInspection.status IS NULL OR ncbjInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_CaseIdStatus;
	private FinderPath _finderPathCountBygetNcbj_CaseIdStatus;

	/**
	 * Returns all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId) {

		return findBygetNcbj_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetNcbj_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return findBygetNcbj_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcbj_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<NcbjInspection> list = null;

		if (useFinderCache) {
			list = (List<NcbjInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjInspection ncbjInspection : list) {
					if (!status.equals(ncbjInspection.getStatus()) ||
						!caseId.equals(ncbjInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjInspection>)QueryUtil.list(
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
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		List<NcbjInspection> list = findBygetNcbj_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		int count = countBygetNcbj_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<NcbjInspection> list = findBygetNcbj_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection[] findBygetNcbj_CaseIdStatus_PrevAndNext(
			long ncbjInspectionId, String status, String caseId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		NcbjInspection ncbjInspection = findByPrimaryKey(ncbjInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcbjInspection[] array = new NcbjInspectionImpl[3];

			array[0] = getBygetNcbj_CaseIdStatus_PrevAndNext(
				session, ncbjInspection, status, caseId, orderByComparator,
				true);

			array[1] = ncbjInspection;

			array[2] = getBygetNcbj_CaseIdStatus_PrevAndNext(
				session, ncbjInspection, status, caseId, orderByComparator,
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

	protected NcbjInspection getBygetNcbj_CaseIdStatus_PrevAndNext(
		Session session, NcbjInspection ncbjInspection, String status,
		String caseId, OrderByComparator<NcbjInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_2);
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
			sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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
						ncbjInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcbj_CaseIdStatus(String status, String caseId) {
		for (NcbjInspection ncbjInspection :
				findBygetNcbj_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjInspection);
		}
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetNcbj_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_2 =
		"ncbjInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_STATUS_3 =
		"(ncbjInspection.status IS NULL OR ncbjInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_2 =
		"ncbjInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJ_CASEIDSTATUS_CASEID_3 =
		"(ncbjInspection.caseId IS NULL OR ncbjInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_CaseIdAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_CaseIdAppId;
	private FinderPath _finderPathCountBygetNcbj_CaseIdAppId;

	/**
	 * Returns all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId) {

		return findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end) {

		return findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcbj_CaseIdAppId;
				finderArgs = new Object[] {status, ncbjApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_CaseIdAppId;
			finderArgs = new Object[] {
				status, ncbjApplicationId, start, end, orderByComparator
			};
		}

		List<NcbjInspection> list = null;

		if (useFinderCache) {
			list = (List<NcbjInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjInspection ncbjInspection : list) {
					if (!status.equals(ncbjInspection.getStatus()) ||
						(ncbjApplicationId !=
							ncbjInspection.getNcbjApplicationId())) {

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

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_2);
			}

			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjInspection>)QueryUtil.list(
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
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_CaseIdAppId_First(
			String status, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_CaseIdAppId_First(
			status, ncbjApplicationId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_CaseIdAppId_First(
		String status, long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		List<NcbjInspection> list = findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetNcbj_CaseIdAppId_Last(
			String status, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetNcbj_CaseIdAppId_Last(
			status, ncbjApplicationId, orderByComparator);

		if (ncbjInspection != null) {
			return ncbjInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetNcbj_CaseIdAppId_Last(
		String status, long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator) {

		int count = countBygetNcbj_CaseIdAppId(status, ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjInspection> list = findBygetNcbj_CaseIdAppId(
			status, ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj inspections before and after the current ncbj inspection in the ordered set where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param ncbjInspectionId the primary key of the current ncbj inspection
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection[] findBygetNcbj_CaseIdAppId_PrevAndNext(
			long ncbjInspectionId, String status, long ncbjApplicationId,
			OrderByComparator<NcbjInspection> orderByComparator)
		throws NoSuchNcbjInspectionException {

		status = Objects.toString(status, "");

		NcbjInspection ncbjInspection = findByPrimaryKey(ncbjInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcbjInspection[] array = new NcbjInspectionImpl[3];

			array[0] = getBygetNcbj_CaseIdAppId_PrevAndNext(
				session, ncbjInspection, status, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjInspection;

			array[2] = getBygetNcbj_CaseIdAppId_PrevAndNext(
				session, ncbjInspection, status, ncbjApplicationId,
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

	protected NcbjInspection getBygetNcbj_CaseIdAppId_PrevAndNext(
		Session session, NcbjInspection ncbjInspection, String status,
		long ncbjApplicationId,
		OrderByComparator<NcbjInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_2);
		}

		sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_NCBJAPPLICATIONID_2);

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
			sb.append(NcbjInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(ncbjApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncbjInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj inspections where status = &#63; and ncbjApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId) {

		for (NcbjInspection ncbjInspection :
				findBygetNcbj_CaseIdAppId(
					status, ncbjApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(ncbjInspection);
		}
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetNcbj_CaseIdAppId(
		String status, long ncbjApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_CaseIdAppId;

		Object[] finderArgs = new Object[] {status, ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_2);
			}

			sb.append(_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(ncbjApplicationId);

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

	private static final String _FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_2 =
		"ncbjInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETNCBJ_CASEIDAPPID_STATUS_3 =
		"(ncbjInspection.status IS NULL OR ncbjInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_CASEIDAPPID_NCBJAPPLICATIONID_2 =
			"ncbjInspection.ncbjApplicationId = ?";

	private FinderPath _finderPathFetchBygetInspecByStatus_SlotBook_AppId;
	private FinderPath _finderPathCountBygetInspecByStatus_SlotBook_AppId;

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection findBygetInspecByStatus_SlotBook_AppId(
			String status, long slotBookedByUser, long ncbjApplicationId)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);

		if (ncbjInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjInspectionException(sb.toString());
		}

		return ncbjInspection;
	}

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId) {

		return fetchBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj inspection, or <code>null</code> if a matching ncbj inspection could not be found
	 */
	@Override
	public NcbjInspection fetchBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, ncbjApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspecByStatus_SlotBook_AppId, finderArgs,
				this);
		}

		if (result instanceof NcbjInspection) {
			NcbjInspection ncbjInspection = (NcbjInspection)result;

			if (!Objects.equals(status, ncbjInspection.getStatus()) ||
				(slotBookedByUser != ncbjInspection.getSlotBookedByUser()) ||
				(ncbjApplicationId != ncbjInspection.getNcbjApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_NCBJAPPLICATIONID_2);

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

				queryPos.add(ncbjApplicationId);

				List<NcbjInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspecByStatus_SlotBook_AppId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser, ncbjApplicationId
								};
							}

							_log.warn(
								"NcbjInspectionPersistenceImpl.fetchBygetInspecByStatus_SlotBook_AppId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjInspection ncbjInspection = list.get(0);

					result = ncbjInspection;

					cacheResult(ncbjInspection);
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
			return (NcbjInspection)result;
		}
	}

	/**
	 * Removes the ncbj inspection where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj inspection that was removed
	 */
	@Override
	public NcbjInspection removeBygetInspecByStatus_SlotBook_AppId(
			String status, long slotBookedByUser, long ncbjApplicationId)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = findBygetInspecByStatus_SlotBook_AppId(
			status, slotBookedByUser, ncbjApplicationId);

		return remove(ncbjInspection);
	}

	/**
	 * Returns the number of ncbj inspections where status = &#63; and slotBookedByUser = &#63; and ncbjApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj inspections
	 */
	@Override
	public int countBygetInspecByStatus_SlotBook_AppId(
		String status, long slotBookedByUser, long ncbjApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspecByStatus_SlotBook_AppId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, ncbjApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_NCBJINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_NCBJAPPLICATIONID_2);

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

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_STATUS_2 =
			"ncbjInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_STATUS_3 =
			"(ncbjInspection.status IS NULL OR ncbjInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_SLOTBOOKEDBYUSER_2 =
			"ncbjInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECBYSTATUS_SLOTBOOK_APPID_NCBJAPPLICATIONID_2 =
			"ncbjInspection.ncbjApplicationId = ?";

	public NcbjInspectionPersistenceImpl() {
		setModelClass(NcbjInspection.class);

		setModelImplClass(NcbjInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjInspectionTable.INSTANCE);
	}

	/**
	 * Caches the ncbj inspection in the entity cache if it is enabled.
	 *
	 * @param ncbjInspection the ncbj inspection
	 */
	@Override
	public void cacheResult(NcbjInspection ncbjInspection) {
		entityCache.putResult(
			NcbjInspectionImpl.class, ncbjInspection.getPrimaryKey(),
			ncbjInspection);

		finderCache.putResult(
			_finderPathFetchBygetNcbjInspectionBy_CI,
			new Object[] {ncbjInspection.getCaseId()}, ncbjInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspecByStatus_SlotBook_AppId,
			new Object[] {
				ncbjInspection.getStatus(),
				ncbjInspection.getSlotBookedByUser(),
				ncbjInspection.getNcbjApplicationId()
			},
			ncbjInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj inspections in the entity cache if it is enabled.
	 *
	 * @param ncbjInspections the ncbj inspections
	 */
	@Override
	public void cacheResult(List<NcbjInspection> ncbjInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjInspection ncbjInspection : ncbjInspections) {
			if (entityCache.getResult(
					NcbjInspectionImpl.class, ncbjInspection.getPrimaryKey()) ==
						null) {

				cacheResult(ncbjInspection);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjInspectionImpl.class);

		finderCache.clearCache(NcbjInspectionImpl.class);
	}

	/**
	 * Clears the cache for the ncbj inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjInspection ncbjInspection) {
		entityCache.removeResult(NcbjInspectionImpl.class, ncbjInspection);
	}

	@Override
	public void clearCache(List<NcbjInspection> ncbjInspections) {
		for (NcbjInspection ncbjInspection : ncbjInspections) {
			entityCache.removeResult(NcbjInspectionImpl.class, ncbjInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjInspectionModelImpl ncbjInspectionModelImpl) {

		Object[] args = new Object[] {ncbjInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetNcbjInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbjInspectionBy_CI, args,
			ncbjInspectionModelImpl);

		args = new Object[] {
			ncbjInspectionModelImpl.getStatus(),
			ncbjInspectionModelImpl.getSlotBookedByUser(),
			ncbjInspectionModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspecByStatus_SlotBook_AppId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspecByStatus_SlotBook_AppId, args,
			ncbjInspectionModelImpl);
	}

	/**
	 * Creates a new ncbj inspection with the primary key. Does not add the ncbj inspection to the database.
	 *
	 * @param ncbjInspectionId the primary key for the new ncbj inspection
	 * @return the new ncbj inspection
	 */
	@Override
	public NcbjInspection create(long ncbjInspectionId) {
		NcbjInspection ncbjInspection = new NcbjInspectionImpl();

		ncbjInspection.setNew(true);
		ncbjInspection.setPrimaryKey(ncbjInspectionId);

		ncbjInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjInspection;
	}

	/**
	 * Removes the ncbj inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection that was removed
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection remove(long ncbjInspectionId)
		throws NoSuchNcbjInspectionException {

		return remove((Serializable)ncbjInspectionId);
	}

	/**
	 * Removes the ncbj inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj inspection
	 * @return the ncbj inspection that was removed
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection remove(Serializable primaryKey)
		throws NoSuchNcbjInspectionException {

		Session session = null;

		try {
			session = openSession();

			NcbjInspection ncbjInspection = (NcbjInspection)session.get(
				NcbjInspectionImpl.class, primaryKey);

			if (ncbjInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjInspection);
		}
		catch (NoSuchNcbjInspectionException noSuchEntityException) {
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
	protected NcbjInspection removeImpl(NcbjInspection ncbjInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjInspection)) {
				ncbjInspection = (NcbjInspection)session.get(
					NcbjInspectionImpl.class,
					ncbjInspection.getPrimaryKeyObj());
			}

			if (ncbjInspection != null) {
				session.delete(ncbjInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjInspection != null) {
			clearCache(ncbjInspection);
		}

		return ncbjInspection;
	}

	@Override
	public NcbjInspection updateImpl(NcbjInspection ncbjInspection) {
		boolean isNew = ncbjInspection.isNew();

		if (!(ncbjInspection instanceof NcbjInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjInspection implementation " +
					ncbjInspection.getClass());
		}

		NcbjInspectionModelImpl ncbjInspectionModelImpl =
			(NcbjInspectionModelImpl)ncbjInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjInspection.setCreateDate(date);
			}
			else {
				ncbjInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjInspection.setModifiedDate(date);
			}
			else {
				ncbjInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjInspection);
			}
			else {
				ncbjInspection = (NcbjInspection)session.merge(ncbjInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjInspectionImpl.class, ncbjInspectionModelImpl, false, true);

		cacheUniqueFindersCache(ncbjInspectionModelImpl);

		if (isNew) {
			ncbjInspection.setNew(false);
		}

		ncbjInspection.resetOriginalValues();

		return ncbjInspection;
	}

	/**
	 * Returns the ncbj inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj inspection
	 * @return the ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjInspectionException {

		NcbjInspection ncbjInspection = fetchByPrimaryKey(primaryKey);

		if (ncbjInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjInspection;
	}

	/**
	 * Returns the ncbj inspection with the primary key or throws a <code>NoSuchNcbjInspectionException</code> if it could not be found.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection
	 * @throws NoSuchNcbjInspectionException if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection findByPrimaryKey(long ncbjInspectionId)
		throws NoSuchNcbjInspectionException {

		return findByPrimaryKey((Serializable)ncbjInspectionId);
	}

	/**
	 * Returns the ncbj inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjInspectionId the primary key of the ncbj inspection
	 * @return the ncbj inspection, or <code>null</code> if a ncbj inspection with the primary key could not be found
	 */
	@Override
	public NcbjInspection fetchByPrimaryKey(long ncbjInspectionId) {
		return fetchByPrimaryKey((Serializable)ncbjInspectionId);
	}

	/**
	 * Returns all the ncbj inspections.
	 *
	 * @return the ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @return the range of ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findAll(
		int start, int end,
		OrderByComparator<NcbjInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj inspections
	 * @param end the upper bound of the range of ncbj inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj inspections
	 */
	@Override
	public List<NcbjInspection> findAll(
		int start, int end, OrderByComparator<NcbjInspection> orderByComparator,
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

		List<NcbjInspection> list = null;

		if (useFinderCache) {
			list = (List<NcbjInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJINSPECTION;

				sql = sql.concat(NcbjInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjInspection>)QueryUtil.list(
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
	 * Removes all the ncbj inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjInspection ncbjInspection : findAll()) {
			remove(ncbjInspection);
		}
	}

	/**
	 * Returns the number of ncbj inspections.
	 *
	 * @return the number of ncbj inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJINSPECTION);

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
		return "ncbjInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj inspection persistence.
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

		_finderPathFetchBygetNcbjInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbjInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcbjInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbjInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcbj_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbj_FBAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcbj_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNcbj_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbj_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		_finderPathWithPaginationFindBygetNcbj_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbj_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcbj_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcbj_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbj_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcbj_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbj_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcbj_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetNcbj_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbj_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetNcbj_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetNcbj_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcbj_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetNcbj_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetNcbj_CaseIdAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbj_CaseIdAppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "ncbjApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_CaseIdAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcbj_CaseIdAppId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "ncbjApplicationId"}, true);

		_finderPathCountBygetNcbj_CaseIdAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_CaseIdAppId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "ncbjApplicationId"}, false);

		_finderPathFetchBygetInspecByStatus_SlotBook_AppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetInspecByStatus_SlotBook_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			new String[] {"status", "slotBookedByUser", "ncbjApplicationId"},
			true);

		_finderPathCountBygetInspecByStatus_SlotBook_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetInspecByStatus_SlotBook_AppId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			new String[] {"status", "slotBookedByUser", "ncbjApplicationId"},
			false);

		NcbjInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjInspectionUtil.setPersistence(null);

		entityCache.removeCache(NcbjInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJINSPECTION =
		"SELECT ncbjInspection FROM NcbjInspection ncbjInspection";

	private static final String _SQL_SELECT_NCBJINSPECTION_WHERE =
		"SELECT ncbjInspection FROM NcbjInspection ncbjInspection WHERE ";

	private static final String _SQL_COUNT_NCBJINSPECTION =
		"SELECT COUNT(ncbjInspection) FROM NcbjInspection ncbjInspection";

	private static final String _SQL_COUNT_NCBJINSPECTION_WHERE =
		"SELECT COUNT(ncbjInspection) FROM NcbjInspection ncbjInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}