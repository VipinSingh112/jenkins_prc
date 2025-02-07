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

import com.nbp.hsra.stage.services.exception.NoSuchHsraInspectionException;
import com.nbp.hsra.stage.services.model.HsraInspection;
import com.nbp.hsra.stage.services.model.HsraInspectionTable;
import com.nbp.hsra.stage.services.model.impl.HsraInspectionImpl;
import com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl;
import com.nbp.hsra.stage.services.service.persistence.HsraInspectionPersistence;
import com.nbp.hsra.stage.services.service.persistence.HsraInspectionUtil;
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
 * The persistence implementation for the hsra inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HsraInspectionPersistence.class)
public class HsraInspectionPersistenceImpl
	extends BasePersistenceImpl<HsraInspection>
	implements HsraInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HsraInspectionUtil</code> to access the hsra inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HsraInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraInspectionBy_CI;
	private FinderPath _finderPathCountBygetHsraInspectionBy_CI;

	/**
	 * Returns the hsra inspection where caseId = &#63; or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsraInspectionBy_CI(String caseId)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsraInspectionBy_CI(caseId);

		if (hsraInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraInspectionException(sb.toString());
		}

		return hsraInspection;
	}

	/**
	 * Returns the hsra inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsraInspectionBy_CI(String caseId) {
		return fetchBygetHsraInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the hsra inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsraInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof HsraInspection) {
			HsraInspection hsraInspection = (HsraInspection)result;

			if (!Objects.equals(caseId, hsraInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRAINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRAINSPECTIONBY_CI_CASEID_2);
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

				List<HsraInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraInspectionBy_CI,
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
								"HsraInspectionPersistenceImpl.fetchBygetHsraInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraInspection hsraInspection = list.get(0);

					result = hsraInspection;

					cacheResult(hsraInspection);
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
			return (HsraInspection)result;
		}
	}

	/**
	 * Removes the hsra inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra inspection that was removed
	 */
	@Override
	public HsraInspection removeBygetHsraInspectionBy_CI(String caseId)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = findBygetHsraInspectionBy_CI(caseId);

		return remove(hsraInspection);
	}

	/**
	 * Returns the number of hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetHsraInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsraInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRAINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRAINSPECTIONBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRAINSPECTIONBY_CI_CASEID_2 =
		"hsraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRAINSPECTIONBY_CI_CASEID_3 =
		"(hsraInspection.caseId IS NULL OR hsraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsra_FBAI;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_FBAI;
	private FinderPath _finderPathCountBygetHsra_FBAI;

	/**
	 * Returns all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_FBAI(long hsraApplicationId) {
		return findBygetHsra_FBAI(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end) {

		return findBygetHsra_FBAI(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return findBygetHsra_FBAI(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_FBAI(
		long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsra_FBAI;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsra_FBAI;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<HsraInspection> list = null;

		if (useFinderCache) {
			list = (List<HsraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraInspection hsraInspection : list) {
					if (hsraApplicationId !=
							hsraInspection.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRA_FBAI_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<HsraInspection>)QueryUtil.list(
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
	 * Returns the first hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_FBAI_First(
			long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_FBAI_First(
			hsraApplicationId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the first hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_FBAI_First(
		long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		List<HsraInspection> list = findBygetHsra_FBAI(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_FBAI_Last(
			long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_FBAI_Last(
			hsraApplicationId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the last hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_FBAI_Last(
		long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		int count = countBygetHsra_FBAI(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<HsraInspection> list = findBygetHsra_FBAI(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection[] findBygetHsra_FBAI_PrevAndNext(
			long hsraInspectionId, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = findByPrimaryKey(hsraInspectionId);

		Session session = null;

		try {
			session = openSession();

			HsraInspection[] array = new HsraInspectionImpl[3];

			array[0] = getBygetHsra_FBAI_PrevAndNext(
				session, hsraInspection, hsraApplicationId, orderByComparator,
				true);

			array[1] = hsraInspection;

			array[2] = getBygetHsra_FBAI_PrevAndNext(
				session, hsraInspection, hsraApplicationId, orderByComparator,
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

	protected HsraInspection getBygetHsra_FBAI_PrevAndNext(
		Session session, HsraInspection hsraInspection, long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRA_FBAI_HSRAAPPLICATIONID_2);

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
			sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra inspections where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsra_FBAI(long hsraApplicationId) {
		for (HsraInspection hsraInspection :
				findBygetHsra_FBAI(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraInspection);
		}
	}

	/**
	 * Returns the number of hsra inspections where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetHsra_FBAI(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsra_FBAI;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRA_FBAI_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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
		_FINDER_COLUMN_GETHSRA_FBAI_HSRAAPPLICATIONID_2 =
			"hsraInspection.hsraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetHsra_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_CaseId;
	private FinderPath _finderPathCountBygetHsra_CaseId;

	/**
	 * Returns all the hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseId(String caseId) {
		return findBygetHsra_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end) {

		return findBygetHsra_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return findBygetHsra_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsra_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsra_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<HsraInspection> list = null;

		if (useFinderCache) {
			list = (List<HsraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraInspection hsraInspection : list) {
					if (!caseId.equals(hsraInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraInspection>)QueryUtil.list(
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
	 * Returns the first hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_CaseId_First(
			String caseId, OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_CaseId_First(
			caseId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the first hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_CaseId_First(
		String caseId, OrderByComparator<HsraInspection> orderByComparator) {

		List<HsraInspection> list = findBygetHsra_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_CaseId_Last(
			String caseId, OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_CaseId_Last(
			caseId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the last hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_CaseId_Last(
		String caseId, OrderByComparator<HsraInspection> orderByComparator) {

		int count = countBygetHsra_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<HsraInspection> list = findBygetHsra_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where caseId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection[] findBygetHsra_CaseId_PrevAndNext(
			long hsraInspectionId, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		caseId = Objects.toString(caseId, "");

		HsraInspection hsraInspection = findByPrimaryKey(hsraInspectionId);

		Session session = null;

		try {
			session = openSession();

			HsraInspection[] array = new HsraInspectionImpl[3];

			array[0] = getBygetHsra_CaseId_PrevAndNext(
				session, hsraInspection, caseId, orderByComparator, true);

			array[1] = hsraInspection;

			array[2] = getBygetHsra_CaseId_PrevAndNext(
				session, hsraInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HsraInspection getBygetHsra_CaseId_PrevAndNext(
		Session session, HsraInspection hsraInspection, String caseId,
		OrderByComparator<HsraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETHSRA_CASEID_CASEID_2);
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
			sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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
						hsraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetHsra_CaseId(String caseId) {
		for (HsraInspection hsraInspection :
				findBygetHsra_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraInspection);
		}
	}

	/**
	 * Returns the number of hsra inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetHsra_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsra_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRA_CASEID_CASEID_2 =
		"hsraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRA_CASEID_CASEID_3 =
		"(hsraInspection.caseId IS NULL OR hsraInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsra_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_Status;
	private FinderPath _finderPathCountBygetHsra_Status;

	/**
	 * Returns all the hsra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_Status(String status) {
		return findBygetHsra_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end) {

		return findBygetHsra_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return findBygetHsra_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_Status(
		String status, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
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

		List<HsraInspection> list = null;

		if (useFinderCache) {
			list = (List<HsraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraInspection hsraInspection : list) {
					if (!status.equals(hsraInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

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
				sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraInspection>)QueryUtil.list(
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
	 * Returns the first hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_Status_First(
			String status, OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_Status_First(
			status, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_Status_First(
		String status, OrderByComparator<HsraInspection> orderByComparator) {

		List<HsraInspection> list = findBygetHsra_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_Status_Last(
			String status, OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_Status_Last(
			status, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_Status_Last(
		String status, OrderByComparator<HsraInspection> orderByComparator) {

		int count = countBygetHsra_Status(status);

		if (count == 0) {
			return null;
		}

		List<HsraInspection> list = findBygetHsra_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection[] findBygetHsra_Status_PrevAndNext(
			long hsraInspectionId, String status,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		status = Objects.toString(status, "");

		HsraInspection hsraInspection = findByPrimaryKey(hsraInspectionId);

		Session session = null;

		try {
			session = openSession();

			HsraInspection[] array = new HsraInspectionImpl[3];

			array[0] = getBygetHsra_Status_PrevAndNext(
				session, hsraInspection, status, orderByComparator, true);

			array[1] = hsraInspection;

			array[2] = getBygetHsra_Status_PrevAndNext(
				session, hsraInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HsraInspection getBygetHsra_Status_PrevAndNext(
		Session session, HsraInspection hsraInspection, String status,
		OrderByComparator<HsraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

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
			sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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
						hsraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetHsra_Status(String status) {
		for (HsraInspection hsraInspection :
				findBygetHsra_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraInspection);
		}
	}

	/**
	 * Returns the number of hsra inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetHsra_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetHsra_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

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
		"hsraInspection.status = ?";

	private static final String _FINDER_COLUMN_GETHSRA_STATUS_STATUS_3 =
		"(hsraInspection.status IS NULL OR hsraInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsra_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_CaseIdStatus;
	private FinderPath _finderPathCountBygetHsra_CaseIdStatus;

	/**
	 * Returns all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId) {

		return findBygetHsra_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetHsra_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return findBygetHsra_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsra_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsra_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<HsraInspection> list = null;

		if (useFinderCache) {
			list = (List<HsraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraInspection hsraInspection : list) {
					if (!status.equals(hsraInspection.getStatus()) ||
						!caseId.equals(hsraInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraInspection>)QueryUtil.list(
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
	 * Returns the first hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<HsraInspection> orderByComparator) {

		List<HsraInspection> list = findBygetHsra_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<HsraInspection> orderByComparator) {

		int count = countBygetHsra_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<HsraInspection> list = findBygetHsra_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection[] findBygetHsra_CaseIdStatus_PrevAndNext(
			long hsraInspectionId, String status, String caseId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		HsraInspection hsraInspection = findByPrimaryKey(hsraInspectionId);

		Session session = null;

		try {
			session = openSession();

			HsraInspection[] array = new HsraInspectionImpl[3];

			array[0] = getBygetHsra_CaseIdStatus_PrevAndNext(
				session, hsraInspection, status, caseId, orderByComparator,
				true);

			array[1] = hsraInspection;

			array[2] = getBygetHsra_CaseIdStatus_PrevAndNext(
				session, hsraInspection, status, caseId, orderByComparator,
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

	protected HsraInspection getBygetHsra_CaseIdStatus_PrevAndNext(
		Session session, HsraInspection hsraInspection, String status,
		String caseId, OrderByComparator<HsraInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_2);
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
			sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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
						hsraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetHsra_CaseIdStatus(String status, String caseId) {
		for (HsraInspection hsraInspection :
				findBygetHsra_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraInspection);
		}
	}

	/**
	 * Returns the number of hsra inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetHsra_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsra_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_2 =
		"hsraInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETHSRA_CASEIDSTATUS_STATUS_3 =
		"(hsraInspection.status IS NULL OR hsraInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_2 =
		"hsraInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRA_CASEIDSTATUS_CASEID_3 =
		"(hsraInspection.caseId IS NULL OR hsraInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetHsra_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetHsra_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetHsra_CaseIdApplicationId;

	/**
	 * Returns all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		return findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end) {

		return findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra inspections
	 */
	@Override
	public List<HsraInspection> findBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId, int start, int end,
		OrderByComparator<HsraInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsra_CaseIdApplicationId;
				finderArgs = new Object[] {status, hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetHsra_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, hsraApplicationId, start, end, orderByComparator
			};
		}

		List<HsraInspection> list = null;

		if (useFinderCache) {
			list = (List<HsraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraInspection hsraInspection : list) {
					if (!status.equals(hsraInspection.getStatus()) ||
						(hsraApplicationId !=
							hsraInspection.getHsraApplicationId())) {

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

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(hsraApplicationId);

				list = (List<HsraInspection>)QueryUtil.list(
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
	 * Returns the first hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_CaseIdApplicationId_First(
			String status, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection =
			fetchBygetHsra_CaseIdApplicationId_First(
				status, hsraApplicationId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the first hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_CaseIdApplicationId_First(
		String status, long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		List<HsraInspection> list = findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetHsra_CaseIdApplicationId_Last(
			String status, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchBygetHsra_CaseIdApplicationId_Last(
			status, hsraApplicationId, orderByComparator);

		if (hsraInspection != null) {
			return hsraInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchHsraInspectionException(sb.toString());
	}

	/**
	 * Returns the last hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection fetchBygetHsra_CaseIdApplicationId_Last(
		String status, long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator) {

		int count = countBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<HsraInspection> list = findBygetHsra_CaseIdApplicationId(
			status, hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra inspections before and after the current hsra inspection in the ordered set where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param hsraInspectionId the primary key of the current hsra inspection
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection[] findBygetHsra_CaseIdApplicationId_PrevAndNext(
			long hsraInspectionId, String status, long hsraApplicationId,
			OrderByComparator<HsraInspection> orderByComparator)
		throws NoSuchHsraInspectionException {

		status = Objects.toString(status, "");

		HsraInspection hsraInspection = findByPrimaryKey(hsraInspectionId);

		Session session = null;

		try {
			session = openSession();

			HsraInspection[] array = new HsraInspectionImpl[3];

			array[0] = getBygetHsra_CaseIdApplicationId_PrevAndNext(
				session, hsraInspection, status, hsraApplicationId,
				orderByComparator, true);

			array[1] = hsraInspection;

			array[2] = getBygetHsra_CaseIdApplicationId_PrevAndNext(
				session, hsraInspection, status, hsraApplicationId,
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

	protected HsraInspection getBygetHsra_CaseIdApplicationId_PrevAndNext(
		Session session, HsraInspection hsraInspection, String status,
		long hsraApplicationId,
		OrderByComparator<HsraInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_HSRAAPPLICATIONID_2);

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
			sb.append(HsraInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(hsraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra inspections where status = &#63; and hsraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		for (HsraInspection hsraInspection :
				findBygetHsra_CaseIdApplicationId(
					status, hsraApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(hsraInspection);
		}
	}

	/**
	 * Returns the number of hsra inspections where status = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetHsra_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(hsraApplicationId);

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
		_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_2 =
			"hsraInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_STATUS_3 =
			"(hsraInspection.status IS NULL OR hsraInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_CASEIDAPPLICATIONID_HSRAAPPLICATIONID_2 =
			"hsraInspection.hsraApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspection
	 * @throws NoSuchHsraInspectionException if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);

		if (hsraInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraInspectionException(sb.toString());
		}

		return hsraInspection;
	}

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, hsraApplicationId, true);
	}

	/**
	 * Returns the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra inspection, or <code>null</code> if a matching hsra inspection could not be found
	 */
	@Override
	public HsraInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long hsraApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, hsraApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof HsraInspection) {
			HsraInspection hsraInspection = (HsraInspection)result;

			if (!Objects.equals(status, hsraInspection.getStatus()) ||
				(slotBookedByUser != hsraInspection.getSlotBookedByUser()) ||
				(hsraApplicationId != hsraInspection.getHsraApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_HSRAINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_HSRAAPPLICATIONID_2);

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

				queryPos.add(hsraApplicationId);

				List<HsraInspection> list = query.list();

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
									status, slotBookedByUser, hsraApplicationId
								};
							}

							_log.warn(
								"HsraInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraInspection hsraInspection = list.get(0);

					result = hsraInspection;

					cacheResult(hsraInspection);
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
			return (HsraInspection)result;
		}
	}

	/**
	 * Removes the hsra inspection where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra inspection that was removed
	 */
	@Override
	public HsraInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long hsraApplicationId)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, hsraApplicationId);

		return remove(hsraInspection);
	}

	/**
	 * Returns the number of hsra inspections where status = &#63; and slotBookedByUser = &#63; and hsraApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long hsraApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, hsraApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_HSRAINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_HSRAAPPLICATIONID_2);

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

				queryPos.add(hsraApplicationId);

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
			"hsraInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(hsraInspection.status IS NULL OR hsraInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"hsraInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_HSRAAPPLICATIONID_2 =
			"hsraInspection.hsraApplicationId = ?";

	public HsraInspectionPersistenceImpl() {
		setModelClass(HsraInspection.class);

		setModelImplClass(HsraInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(HsraInspectionTable.INSTANCE);
	}

	/**
	 * Caches the hsra inspection in the entity cache if it is enabled.
	 *
	 * @param hsraInspection the hsra inspection
	 */
	@Override
	public void cacheResult(HsraInspection hsraInspection) {
		entityCache.putResult(
			HsraInspectionImpl.class, hsraInspection.getPrimaryKey(),
			hsraInspection);

		finderCache.putResult(
			_finderPathFetchBygetHsraInspectionBy_CI,
			new Object[] {hsraInspection.getCaseId()}, hsraInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				hsraInspection.getStatus(),
				hsraInspection.getSlotBookedByUser(),
				hsraInspection.getHsraApplicationId()
			},
			hsraInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra inspections in the entity cache if it is enabled.
	 *
	 * @param hsraInspections the hsra inspections
	 */
	@Override
	public void cacheResult(List<HsraInspection> hsraInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HsraInspection hsraInspection : hsraInspections) {
			if (entityCache.getResult(
					HsraInspectionImpl.class, hsraInspection.getPrimaryKey()) ==
						null) {

				cacheResult(hsraInspection);
			}
		}
	}

	/**
	 * Clears the cache for all hsra inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HsraInspectionImpl.class);

		finderCache.clearCache(HsraInspectionImpl.class);
	}

	/**
	 * Clears the cache for the hsra inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HsraInspection hsraInspection) {
		entityCache.removeResult(HsraInspectionImpl.class, hsraInspection);
	}

	@Override
	public void clearCache(List<HsraInspection> hsraInspections) {
		for (HsraInspection hsraInspection : hsraInspections) {
			entityCache.removeResult(HsraInspectionImpl.class, hsraInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HsraInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(HsraInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HsraInspectionModelImpl hsraInspectionModelImpl) {

		Object[] args = new Object[] {hsraInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetHsraInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraInspectionBy_CI, args,
			hsraInspectionModelImpl);

		args = new Object[] {
			hsraInspectionModelImpl.getStatus(),
			hsraInspectionModelImpl.getSlotBookedByUser(),
			hsraInspectionModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, hsraInspectionModelImpl);
	}

	/**
	 * Creates a new hsra inspection with the primary key. Does not add the hsra inspection to the database.
	 *
	 * @param hsraInspectionId the primary key for the new hsra inspection
	 * @return the new hsra inspection
	 */
	@Override
	public HsraInspection create(long hsraInspectionId) {
		HsraInspection hsraInspection = new HsraInspectionImpl();

		hsraInspection.setNew(true);
		hsraInspection.setPrimaryKey(hsraInspectionId);

		hsraInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return hsraInspection;
	}

	/**
	 * Removes the hsra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection that was removed
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection remove(long hsraInspectionId)
		throws NoSuchHsraInspectionException {

		return remove((Serializable)hsraInspectionId);
	}

	/**
	 * Removes the hsra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra inspection
	 * @return the hsra inspection that was removed
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection remove(Serializable primaryKey)
		throws NoSuchHsraInspectionException {

		Session session = null;

		try {
			session = openSession();

			HsraInspection hsraInspection = (HsraInspection)session.get(
				HsraInspectionImpl.class, primaryKey);

			if (hsraInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHsraInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraInspection);
		}
		catch (NoSuchHsraInspectionException noSuchEntityException) {
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
	protected HsraInspection removeImpl(HsraInspection hsraInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraInspection)) {
				hsraInspection = (HsraInspection)session.get(
					HsraInspectionImpl.class,
					hsraInspection.getPrimaryKeyObj());
			}

			if (hsraInspection != null) {
				session.delete(hsraInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraInspection != null) {
			clearCache(hsraInspection);
		}

		return hsraInspection;
	}

	@Override
	public HsraInspection updateImpl(HsraInspection hsraInspection) {
		boolean isNew = hsraInspection.isNew();

		if (!(hsraInspection instanceof HsraInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(hsraInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HsraInspection implementation " +
					hsraInspection.getClass());
		}

		HsraInspectionModelImpl hsraInspectionModelImpl =
			(HsraInspectionModelImpl)hsraInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraInspection.setCreateDate(date);
			}
			else {
				hsraInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraInspection.setModifiedDate(date);
			}
			else {
				hsraInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraInspection);
			}
			else {
				hsraInspection = (HsraInspection)session.merge(hsraInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HsraInspectionImpl.class, hsraInspectionModelImpl, false, true);

		cacheUniqueFindersCache(hsraInspectionModelImpl);

		if (isNew) {
			hsraInspection.setNew(false);
		}

		hsraInspection.resetOriginalValues();

		return hsraInspection;
	}

	/**
	 * Returns the hsra inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra inspection
	 * @return the hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHsraInspectionException {

		HsraInspection hsraInspection = fetchByPrimaryKey(primaryKey);

		if (hsraInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHsraInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraInspection;
	}

	/**
	 * Returns the hsra inspection with the primary key or throws a <code>NoSuchHsraInspectionException</code> if it could not be found.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection
	 * @throws NoSuchHsraInspectionException if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection findByPrimaryKey(long hsraInspectionId)
		throws NoSuchHsraInspectionException {

		return findByPrimaryKey((Serializable)hsraInspectionId);
	}

	/**
	 * Returns the hsra inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection, or <code>null</code> if a hsra inspection with the primary key could not be found
	 */
	@Override
	public HsraInspection fetchByPrimaryKey(long hsraInspectionId) {
		return fetchByPrimaryKey((Serializable)hsraInspectionId);
	}

	/**
	 * Returns all the hsra inspections.
	 *
	 * @return the hsra inspections
	 */
	@Override
	public List<HsraInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of hsra inspections
	 */
	@Override
	public List<HsraInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra inspections
	 */
	@Override
	public List<HsraInspection> findAll(
		int start, int end,
		OrderByComparator<HsraInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra inspections
	 */
	@Override
	public List<HsraInspection> findAll(
		int start, int end, OrderByComparator<HsraInspection> orderByComparator,
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

		List<HsraInspection> list = null;

		if (useFinderCache) {
			list = (List<HsraInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAINSPECTION;

				sql = sql.concat(HsraInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HsraInspection>)QueryUtil.list(
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
	 * Removes all the hsra inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HsraInspection hsraInspection : findAll()) {
			remove(hsraInspection);
		}
	}

	/**
	 * Returns the number of hsra inspections.
	 *
	 * @return the number of hsra inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_HSRAINSPECTION);

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
		return "hsraInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HsraInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra inspection persistence.
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

		_finderPathFetchBygetHsraInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHsraInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsraInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetHsra_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsra_FBAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsra_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsra_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsra_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsra_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		_finderPathWithPaginationFindBygetHsra_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsra_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetHsra_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsra_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHsra_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsra_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

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

		_finderPathWithPaginationFindBygetHsra_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetHsra_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetHsra_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHsra_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetHsra_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetHsra_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetHsra_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsra_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetHsra_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "hsraApplicationId"}, true);

		_finderPathCountBygetHsra_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "hsraApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "hsraApplicationId"
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
					"status", "slotBookedByUser", "hsraApplicationId"
				},
				false);

		HsraInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HsraInspectionUtil.setPersistence(null);

		entityCache.removeCache(HsraInspectionImpl.class.getName());
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

	private static final String _SQL_SELECT_HSRAINSPECTION =
		"SELECT hsraInspection FROM HsraInspection hsraInspection";

	private static final String _SQL_SELECT_HSRAINSPECTION_WHERE =
		"SELECT hsraInspection FROM HsraInspection hsraInspection WHERE ";

	private static final String _SQL_COUNT_HSRAINSPECTION =
		"SELECT COUNT(hsraInspection) FROM HsraInspection hsraInspection";

	private static final String _SQL_COUNT_HSRAINSPECTION_WHERE =
		"SELECT COUNT(hsraInspection) FROM HsraInspection hsraInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "hsraInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HsraInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HsraInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HsraInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}