/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence.impl;

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

import com.nbp.ncra.stages.services.exception.NoSuchNcraInspectionException;
import com.nbp.ncra.stages.services.model.NcraInspection;
import com.nbp.ncra.stages.services.model.NcraInspectionTable;
import com.nbp.ncra.stages.services.model.impl.NcraInspectionImpl;
import com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl;
import com.nbp.ncra.stages.services.service.persistence.NcraInspectionPersistence;
import com.nbp.ncra.stages.services.service.persistence.NcraInspectionUtil;
import com.nbp.ncra.stages.services.service.persistence.impl.constants.NCRA_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the ncra inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraInspectionPersistence.class)
public class NcraInspectionPersistenceImpl
	extends BasePersistenceImpl<NcraInspection>
	implements NcraInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraInspectionUtil</code> to access the ncra inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcraInspectionBy_CI;
	private FinderPath _finderPathCountBygetNcraInspectionBy_CI;

	/**
	 * Returns the ncra inspection where caseId = &#63; or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcraInspectionBy_CI(String caseId)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcraInspectionBy_CI(caseId);

		if (ncraInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraInspectionException(sb.toString());
		}

		return ncraInspection;
	}

	/**
	 * Returns the ncra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcraInspectionBy_CI(String caseId) {
		return fetchBygetNcraInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the ncra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcraInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof NcraInspection) {
			NcraInspection ncraInspection = (NcraInspection)result;

			if (!Objects.equals(caseId, ncraInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRAINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRAINSPECTIONBY_CI_CASEID_2);
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

				List<NcraInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraInspectionBy_CI,
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
								"NcraInspectionPersistenceImpl.fetchBygetNcraInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraInspection ncraInspection = list.get(0);

					result = ncraInspection;

					cacheResult(ncraInspection);
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
			return (NcraInspection)result;
		}
	}

	/**
	 * Removes the ncra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra inspection that was removed
	 */
	@Override
	public NcraInspection removeBygetNcraInspectionBy_CI(String caseId)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = findBygetNcraInspectionBy_CI(caseId);

		return remove(ncraInspection);
	}

	/**
	 * Returns the number of ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetNcraInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcraInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRAINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRAINSPECTIONBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCRAINSPECTIONBY_CI_CASEID_2 =
		"ncraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCRAINSPECTIONBY_CI_CASEID_3 =
		"(ncraInspection.caseId IS NULL OR ncraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcra_AI;
	private FinderPath _finderPathWithoutPaginationFindBygetNcra_AI;
	private FinderPath _finderPathCountBygetNcra_AI;

	/**
	 * Returns all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_AI(long ncraApplicationId) {
		return findBygetNcra_AI(
			ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end) {

		return findBygetNcra_AI(ncraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return findBygetNcra_AI(
			ncraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_AI(
		long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcra_AI;
				finderArgs = new Object[] {ncraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcra_AI;
			finderArgs = new Object[] {
				ncraApplicationId, start, end, orderByComparator
			};
		}

		List<NcraInspection> list = null;

		if (useFinderCache) {
			list = (List<NcraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraInspection ncraInspection : list) {
					if (ncraApplicationId !=
							ncraInspection.getNcraApplicationId()) {

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

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRA_AI_NCRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				list = (List<NcraInspection>)QueryUtil.list(
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
	 * Returns the first ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_AI_First(
			long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_AI_First(
			ncraApplicationId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_AI_First(
		long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		List<NcraInspection> list = findBygetNcra_AI(
			ncraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_AI_Last(
			long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_AI_Last(
			ncraApplicationId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_AI_Last(
		long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		int count = countBygetNcra_AI(ncraApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcraInspection> list = findBygetNcra_AI(
			ncraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where ncraApplicationId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection[] findBygetNcra_AI_PrevAndNext(
			long ncraInspectionId, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = findByPrimaryKey(ncraInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcraInspection[] array = new NcraInspectionImpl[3];

			array[0] = getBygetNcra_AI_PrevAndNext(
				session, ncraInspection, ncraApplicationId, orderByComparator,
				true);

			array[1] = ncraInspection;

			array[2] = getBygetNcra_AI_PrevAndNext(
				session, ncraInspection, ncraApplicationId, orderByComparator,
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

	protected NcraInspection getBygetNcra_AI_PrevAndNext(
		Session session, NcraInspection ncraInspection, long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETNCRA_AI_NCRAAPPLICATIONID_2);

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
			sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(ncraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra inspections where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 */
	@Override
	public void removeBygetNcra_AI(long ncraApplicationId) {
		for (NcraInspection ncraInspection :
				findBygetNcra_AI(
					ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraInspection);
		}
	}

	/**
	 * Returns the number of ncra inspections where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetNcra_AI(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcra_AI;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRA_AI_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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

	private static final String _FINDER_COLUMN_GETNCRA_AI_NCRAAPPLICATIONID_2 =
		"ncraInspection.ncraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNcra_by_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetNcra_by_CaseId;
	private FinderPath _finderPathCountBygetNcra_by_CaseId;

	/**
	 * Returns all the ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_by_CaseId(String caseId) {
		return findBygetNcra_by_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end) {

		return findBygetNcra_by_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return findBygetNcra_by_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcra_by_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcra_by_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<NcraInspection> list = null;

		if (useFinderCache) {
			list = (List<NcraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraInspection ncraInspection : list) {
					if (!caseId.equals(ncraInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraInspection>)QueryUtil.list(
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
	 * Returns the first ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_by_CaseId_First(
			String caseId, OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_by_CaseId_First(
			caseId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_by_CaseId_First(
		String caseId, OrderByComparator<NcraInspection> orderByComparator) {

		List<NcraInspection> list = findBygetNcra_by_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_by_CaseId_Last(
			String caseId, OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_by_CaseId_Last(
			caseId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_by_CaseId_Last(
		String caseId, OrderByComparator<NcraInspection> orderByComparator) {

		int count = countBygetNcra_by_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<NcraInspection> list = findBygetNcra_by_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection[] findBygetNcra_by_CaseId_PrevAndNext(
			long ncraInspectionId, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		caseId = Objects.toString(caseId, "");

		NcraInspection ncraInspection = findByPrimaryKey(ncraInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcraInspection[] array = new NcraInspectionImpl[3];

			array[0] = getBygetNcra_by_CaseId_PrevAndNext(
				session, ncraInspection, caseId, orderByComparator, true);

			array[1] = ncraInspection;

			array[2] = getBygetNcra_by_CaseId_PrevAndNext(
				session, ncraInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcraInspection getBygetNcra_by_CaseId_PrevAndNext(
		Session session, NcraInspection ncraInspection, String caseId,
		OrderByComparator<NcraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2);
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
			sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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
						ncraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcra_by_CaseId(String caseId) {
		for (NcraInspection ncraInspection :
				findBygetNcra_by_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraInspection);
		}
	}

	/**
	 * Returns the number of ncra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetNcra_by_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcra_by_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_2 =
		"ncraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCRA_BY_CASEID_CASEID_3 =
		"(ncraInspection.caseId IS NULL OR ncraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsra_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_Status;
	private FinderPath _finderPathCountBygetHsra_Status;

	/**
	 * Returns all the ncra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetHsra_Status(String status) {
		return findBygetHsra_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end) {

		return findBygetHsra_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return findBygetHsra_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsra_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsra_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<NcraInspection> list = null;

		if (useFinderCache) {
			list = (List<NcraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraInspection ncraInspection : list) {
					if (!status.equals(ncraInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETHSRA_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraInspection>)QueryUtil.list(
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
	 * Returns the first ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetHsra_Status_First(
			String status, OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetHsra_Status_First(
			status, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetHsra_Status_First(
		String status, OrderByComparator<NcraInspection> orderByComparator) {

		List<NcraInspection> list = findBygetHsra_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetHsra_Status_Last(
			String status, OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetHsra_Status_Last(
			status, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetHsra_Status_Last(
		String status, OrderByComparator<NcraInspection> orderByComparator) {

		int count = countBygetHsra_Status(status);

		if (count == 0) {
			return null;
		}

		List<NcraInspection> list = findBygetHsra_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection[] findBygetHsra_Status_PrevAndNext(
			long ncraInspectionId, String status,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		status = Objects.toString(status, "");

		NcraInspection ncraInspection = findByPrimaryKey(ncraInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcraInspection[] array = new NcraInspectionImpl[3];

			array[0] = getBygetHsra_Status_PrevAndNext(
				session, ncraInspection, status, orderByComparator, true);

			array[1] = ncraInspection;

			array[2] = getBygetHsra_Status_PrevAndNext(
				session, ncraInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcraInspection getBygetHsra_Status_PrevAndNext(
		Session session, NcraInspection ncraInspection, String status,
		OrderByComparator<NcraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETHSRA_STATUS_STATUS_2);
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
			sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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
						ncraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetHsra_Status(String status) {
		for (NcraInspection ncraInspection :
				findBygetHsra_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraInspection);
		}
	}

	/**
	 * Returns the number of ncra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetHsra_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetHsra_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETHSRA_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETHSRA_STATUS_STATUS_2 =
		"ncraInspection.status = ?";

	private static final String _FINDER_COLUMN_GETHSRA_STATUS_STATUS_3 =
		"(ncraInspection.status IS NULL OR ncraInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcra_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetNcra_CaseIdStatus;
	private FinderPath _finderPathCountBygetNcra_CaseIdStatus;

	/**
	 * Returns all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId) {

		return findBygetNcra_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetNcra_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return findBygetNcra_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcra_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcra_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<NcraInspection> list = null;

		if (useFinderCache) {
			list = (List<NcraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraInspection ncraInspection : list) {
					if (!status.equals(ncraInspection.getStatus()) ||
						!caseId.equals(ncraInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraInspection>)QueryUtil.list(
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
	 * Returns the first ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<NcraInspection> orderByComparator) {

		List<NcraInspection> list = findBygetNcra_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<NcraInspection> orderByComparator) {

		int count = countBygetNcra_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<NcraInspection> list = findBygetNcra_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection[] findBygetNcra_CaseIdStatus_PrevAndNext(
			long ncraInspectionId, String status, String caseId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		NcraInspection ncraInspection = findByPrimaryKey(ncraInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcraInspection[] array = new NcraInspectionImpl[3];

			array[0] = getBygetNcra_CaseIdStatus_PrevAndNext(
				session, ncraInspection, status, caseId, orderByComparator,
				true);

			array[1] = ncraInspection;

			array[2] = getBygetNcra_CaseIdStatus_PrevAndNext(
				session, ncraInspection, status, caseId, orderByComparator,
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

	protected NcraInspection getBygetNcra_CaseIdStatus_PrevAndNext(
		Session session, NcraInspection ncraInspection, String status,
		String caseId, OrderByComparator<NcraInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_2);
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
			sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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
						ncraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcra_CaseIdStatus(String status, String caseId) {
		for (NcraInspection ncraInspection :
				findBygetNcra_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraInspection);
		}
	}

	/**
	 * Returns the number of ncra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetNcra_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcra_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_2 =
		"ncraInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETNCRA_CASEIDSTATUS_STATUS_3 =
		"(ncraInspection.status IS NULL OR ncraInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_2 =
		"ncraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCRA_CASEIDSTATUS_CASEID_3 =
		"(ncraInspection.caseId IS NULL OR ncraInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetNcra_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetNcra_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetNcra_CaseIdApplicationId;

	/**
	 * Returns all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		return findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end) {

		return findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra inspections
	 */
	@Override
	public List<NcraInspection> findBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId, int start, int end,
		OrderByComparator<NcraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcra_CaseIdApplicationId;
				finderArgs = new Object[] {status, ncraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetNcra_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, ncraApplicationId, start, end, orderByComparator
			};
		}

		List<NcraInspection> list = null;

		if (useFinderCache) {
			list = (List<NcraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraInspection ncraInspection : list) {
					if (!status.equals(ncraInspection.getStatus()) ||
						(ncraApplicationId !=
							ncraInspection.getNcraApplicationId())) {

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

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_NCRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(ncraApplicationId);

				list = (List<NcraInspection>)QueryUtil.list(
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
	 * Returns the first ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_CaseIdApplicationId_First(
			String status, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection =
			fetchBygetNcra_CaseIdApplicationId_First(
				status, ncraApplicationId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the first ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_CaseIdApplicationId_First(
		String status, long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		List<NcraInspection> list = findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetNcra_CaseIdApplicationId_Last(
			String status, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchBygetNcra_CaseIdApplicationId_Last(
			status, ncraApplicationId, orderByComparator);

		if (ncraInspection != null) {
			return ncraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", ncraApplicationId=");
		sb.append(ncraApplicationId);

		sb.append("}");

		throw new NoSuchNcraInspectionException(sb.toString());
	}

	/**
	 * Returns the last ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection fetchBygetNcra_CaseIdApplicationId_Last(
		String status, long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator) {

		int count = countBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcraInspection> list = findBygetNcra_CaseIdApplicationId(
			status, ncraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra inspections before and after the current ncra inspection in the ordered set where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param ncraInspectionId the primary key of the current ncra inspection
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection[] findBygetNcra_CaseIdApplicationId_PrevAndNext(
			long ncraInspectionId, String status, long ncraApplicationId,
			OrderByComparator<NcraInspection> orderByComparator)
		throws NoSuchNcraInspectionException {

		status = Objects.toString(status, "");

		NcraInspection ncraInspection = findByPrimaryKey(ncraInspectionId);

		Session session = null;

		try {
			session = openSession();

			NcraInspection[] array = new NcraInspectionImpl[3];

			array[0] = getBygetNcra_CaseIdApplicationId_PrevAndNext(
				session, ncraInspection, status, ncraApplicationId,
				orderByComparator, true);

			array[1] = ncraInspection;

			array[2] = getBygetNcra_CaseIdApplicationId_PrevAndNext(
				session, ncraInspection, status, ncraApplicationId,
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

	protected NcraInspection getBygetNcra_CaseIdApplicationId_PrevAndNext(
		Session session, NcraInspection ncraInspection, String status,
		long ncraApplicationId,
		OrderByComparator<NcraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_NCRAAPPLICATIONID_2);

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
			sb.append(NcraInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(ncraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra inspections where status = &#63; and ncraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 */
	@Override
	public void removeBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		for (NcraInspection ncraInspection :
				findBygetNcra_CaseIdApplicationId(
					status, ncraApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(ncraInspection);
		}
	}

	/**
	 * Returns the number of ncra inspections where status = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetNcra_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_2 =
			"ncraInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_STATUS_3 =
			"(ncraInspection.status IS NULL OR ncraInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCRA_CASEIDAPPLICATIONID_NCRAAPPLICATIONID_2 =
			"ncraInspection.ncraApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspection
	 * @throws NoSuchNcraInspectionException if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);

		if (ncraInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", ncraApplicationId=");
			sb.append(ncraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraInspectionException(sb.toString());
		}

		return ncraInspection;
	}

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, ncraApplicationId, true);
	}

	/**
	 * Returns the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra inspection, or <code>null</code> if a matching ncra inspection could not be found
	 */
	@Override
	public NcraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long ncraApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, ncraApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof NcraInspection) {
			NcraInspection ncraInspection = (NcraInspection)result;

			if (!Objects.equals(status, ncraInspection.getStatus()) ||
				(slotBookedByUser != ncraInspection.getSlotBookedByUser()) ||
				(ncraApplicationId != ncraInspection.getNcraApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_NCRAINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_NCRAAPPLICATIONID_2);

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

				queryPos.add(ncraApplicationId);

				List<NcraInspection> list = query.list();

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
									status, slotBookedByUser, ncraApplicationId
								};
							}

							_log.warn(
								"NcraInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraInspection ncraInspection = list.get(0);

					result = ncraInspection;

					cacheResult(ncraInspection);
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
			return (NcraInspection)result;
		}
	}

	/**
	 * Removes the ncra inspection where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra inspection that was removed
	 */
	@Override
	public NcraInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, ncraApplicationId);

		return remove(ncraInspection);
	}

	/**
	 * Returns the number of ncra inspections where status = &#63; and slotBookedByUser = &#63; and ncraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long ncraApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, ncraApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_NCRAINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_NCRAAPPLICATIONID_2);

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

				queryPos.add(ncraApplicationId);

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
			"ncraInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(ncraInspection.status IS NULL OR ncraInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"ncraInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_NCRAAPPLICATIONID_2 =
			"ncraInspection.ncraApplicationId = ?";

	public NcraInspectionPersistenceImpl() {
		setModelClass(NcraInspection.class);

		setModelImplClass(NcraInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(NcraInspectionTable.INSTANCE);
	}

	/**
	 * Caches the ncra inspection in the entity cache if it is enabled.
	 *
	 * @param ncraInspection the ncra inspection
	 */
	@Override
	public void cacheResult(NcraInspection ncraInspection) {
		entityCache.putResult(
			NcraInspectionImpl.class, ncraInspection.getPrimaryKey(),
			ncraInspection);

		finderCache.putResult(
			_finderPathFetchBygetNcraInspectionBy_CI,
			new Object[] {ncraInspection.getCaseId()}, ncraInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				ncraInspection.getStatus(),
				ncraInspection.getSlotBookedByUser(),
				ncraInspection.getNcraApplicationId()
			},
			ncraInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra inspections in the entity cache if it is enabled.
	 *
	 * @param ncraInspections the ncra inspections
	 */
	@Override
	public void cacheResult(List<NcraInspection> ncraInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraInspection ncraInspection : ncraInspections) {
			if (entityCache.getResult(
					NcraInspectionImpl.class, ncraInspection.getPrimaryKey()) ==
						null) {

				cacheResult(ncraInspection);
			}
		}
	}

	/**
	 * Clears the cache for all ncra inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraInspectionImpl.class);

		finderCache.clearCache(NcraInspectionImpl.class);
	}

	/**
	 * Clears the cache for the ncra inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraInspection ncraInspection) {
		entityCache.removeResult(NcraInspectionImpl.class, ncraInspection);
	}

	@Override
	public void clearCache(List<NcraInspection> ncraInspections) {
		for (NcraInspection ncraInspection : ncraInspections) {
			entityCache.removeResult(NcraInspectionImpl.class, ncraInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcraInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraInspectionModelImpl ncraInspectionModelImpl) {

		Object[] args = new Object[] {ncraInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetNcraInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraInspectionBy_CI, args,
			ncraInspectionModelImpl);

		args = new Object[] {
			ncraInspectionModelImpl.getStatus(),
			ncraInspectionModelImpl.getSlotBookedByUser(),
			ncraInspectionModelImpl.getNcraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, ncraInspectionModelImpl);
	}

	/**
	 * Creates a new ncra inspection with the primary key. Does not add the ncra inspection to the database.
	 *
	 * @param ncraInspectionId the primary key for the new ncra inspection
	 * @return the new ncra inspection
	 */
	@Override
	public NcraInspection create(long ncraInspectionId) {
		NcraInspection ncraInspection = new NcraInspectionImpl();

		ncraInspection.setNew(true);
		ncraInspection.setPrimaryKey(ncraInspectionId);

		ncraInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraInspection;
	}

	/**
	 * Removes the ncra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection that was removed
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection remove(long ncraInspectionId)
		throws NoSuchNcraInspectionException {

		return remove((Serializable)ncraInspectionId);
	}

	/**
	 * Removes the ncra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra inspection
	 * @return the ncra inspection that was removed
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection remove(Serializable primaryKey)
		throws NoSuchNcraInspectionException {

		Session session = null;

		try {
			session = openSession();

			NcraInspection ncraInspection = (NcraInspection)session.get(
				NcraInspectionImpl.class, primaryKey);

			if (ncraInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraInspection);
		}
		catch (NoSuchNcraInspectionException noSuchEntityException) {
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
	protected NcraInspection removeImpl(NcraInspection ncraInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraInspection)) {
				ncraInspection = (NcraInspection)session.get(
					NcraInspectionImpl.class,
					ncraInspection.getPrimaryKeyObj());
			}

			if (ncraInspection != null) {
				session.delete(ncraInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraInspection != null) {
			clearCache(ncraInspection);
		}

		return ncraInspection;
	}

	@Override
	public NcraInspection updateImpl(NcraInspection ncraInspection) {
		boolean isNew = ncraInspection.isNew();

		if (!(ncraInspection instanceof NcraInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraInspection implementation " +
					ncraInspection.getClass());
		}

		NcraInspectionModelImpl ncraInspectionModelImpl =
			(NcraInspectionModelImpl)ncraInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraInspection.setCreateDate(date);
			}
			else {
				ncraInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraInspection.setModifiedDate(date);
			}
			else {
				ncraInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraInspection);
			}
			else {
				ncraInspection = (NcraInspection)session.merge(ncraInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraInspectionImpl.class, ncraInspectionModelImpl, false, true);

		cacheUniqueFindersCache(ncraInspectionModelImpl);

		if (isNew) {
			ncraInspection.setNew(false);
		}

		ncraInspection.resetOriginalValues();

		return ncraInspection;
	}

	/**
	 * Returns the ncra inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra inspection
	 * @return the ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraInspectionException {

		NcraInspection ncraInspection = fetchByPrimaryKey(primaryKey);

		if (ncraInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraInspection;
	}

	/**
	 * Returns the ncra inspection with the primary key or throws a <code>NoSuchNcraInspectionException</code> if it could not be found.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection
	 * @throws NoSuchNcraInspectionException if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection findByPrimaryKey(long ncraInspectionId)
		throws NoSuchNcraInspectionException {

		return findByPrimaryKey((Serializable)ncraInspectionId);
	}

	/**
	 * Returns the ncra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection, or <code>null</code> if a ncra inspection with the primary key could not be found
	 */
	@Override
	public NcraInspection fetchByPrimaryKey(long ncraInspectionId) {
		return fetchByPrimaryKey((Serializable)ncraInspectionId);
	}

	/**
	 * Returns all the ncra inspections.
	 *
	 * @return the ncra inspections
	 */
	@Override
	public List<NcraInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of ncra inspections
	 */
	@Override
	public List<NcraInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra inspections
	 */
	@Override
	public List<NcraInspection> findAll(
		int start, int end,
		OrderByComparator<NcraInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra inspections
	 */
	@Override
	public List<NcraInspection> findAll(
		int start, int end, OrderByComparator<NcraInspection> orderByComparator,
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

		List<NcraInspection> list = null;

		if (useFinderCache) {
			list = (List<NcraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAINSPECTION;

				sql = sql.concat(NcraInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraInspection>)QueryUtil.list(
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
	 * Removes all the ncra inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraInspection ncraInspection : findAll()) {
			remove(ncraInspection);
		}
	}

	/**
	 * Returns the number of ncra inspections.
	 *
	 * @return the number of ncra inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCRAINSPECTION);

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
		return "ncraInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra inspection persistence.
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

		_finderPathFetchBygetNcraInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcraInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcra_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcra_AI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNcra_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcra_AI",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcra_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcra_AI",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		_finderPathWithPaginationFindBygetNcra_by_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcra_by_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcra_by_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcra_by_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetNcra_by_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcra_by_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetHsra_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsra_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetHsra_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsra_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetHsra_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsra_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetNcra_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetNcra_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcra_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcra_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetNcra_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcra_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetNcra_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetNcra_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "ncraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNcra_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetNcra_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "ncraApplicationId"}, true);

		_finderPathCountBygetNcra_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcra_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "ncraApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "ncraApplicationId"
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
					"status", "slotBookedByUser", "ncraApplicationId"
				},
				false);

		NcraInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraInspectionUtil.setPersistence(null);

		entityCache.removeCache(NcraInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAINSPECTION =
		"SELECT ncraInspection FROM NcraInspection ncraInspection";

	private static final String _SQL_SELECT_NCRAINSPECTION_WHERE =
		"SELECT ncraInspection FROM NcraInspection ncraInspection WHERE ";

	private static final String _SQL_COUNT_NCRAINSPECTION =
		"SELECT COUNT(ncraInspection) FROM NcraInspection ncraInspection";

	private static final String _SQL_COUNT_NCRAINSPECTION_WHERE =
		"SELECT COUNT(ncraInspection) FROM NcraInspection ncraInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncraInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}