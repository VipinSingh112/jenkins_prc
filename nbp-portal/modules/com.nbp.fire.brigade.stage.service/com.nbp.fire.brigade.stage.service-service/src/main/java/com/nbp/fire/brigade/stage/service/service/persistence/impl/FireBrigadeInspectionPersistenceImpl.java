/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence.impl;

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

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeInspectionException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeInspectionTable;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionImpl;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeInspectionPersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeInspectionUtil;
import com.nbp.fire.brigade.stage.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

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
 * The persistence implementation for the fire brigade inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeInspectionPersistence.class)
public class FireBrigadeInspectionPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeInspection>
	implements FireBrigadeInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeInspectionUtil</code> to access the fire brigade inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFireBrigadeInspectionBy_CI;
	private FinderPath _finderPathCountBygetFireBrigadeInspectionBy_CI;

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFireBrigadeInspectionBy_CI(
			String caseId)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFireBrigadeInspectionBy_CI(caseId);

		if (fireBrigadeInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeInspectionException(sb.toString());
		}

		return fireBrigadeInspection;
	}

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFireBrigadeInspectionBy_CI(
		String caseId) {

		return fetchBygetFireBrigadeInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the fire brigade inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFireBrigadeInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadeInspectionBy_CI, finderArgs,
				this);
		}

		if (result instanceof FireBrigadeInspection) {
			FireBrigadeInspection fireBrigadeInspection =
				(FireBrigadeInspection)result;

			if (!Objects.equals(caseId, fireBrigadeInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEINSPECTIONBY_CI_CASEID_2);
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

				List<FireBrigadeInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeInspectionBy_CI,
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
								"FireBrigadeInspectionPersistenceImpl.fetchBygetFireBrigadeInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeInspection fireBrigadeInspection = list.get(0);

					result = fireBrigadeInspection;

					cacheResult(fireBrigadeInspection);
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
			return (FireBrigadeInspection)result;
		}
	}

	/**
	 * Removes the fire brigade inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade inspection that was removed
	 */
	@Override
	public FireBrigadeInspection removeBygetFireBrigadeInspectionBy_CI(
			String caseId)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			findBygetFireBrigadeInspectionBy_CI(caseId);

		return remove(fireBrigadeInspection);
	}

	/**
	 * Returns the number of fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetFireBrigadeInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFireBrigadeInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEINSPECTIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETFIREBRIGADEINSPECTIONBY_CI_CASEID_2 =
			"fireBrigadeInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEINSPECTIONBY_CI_CASEID_3 =
			"(fireBrigadeInspection.caseId IS NULL OR fireBrigadeInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFBI_FBAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFBI_FBAI;
	private FinderPath _finderPathCountBygetFBI_FBAI;

	/**
	 * Returns all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId) {

		return findBygetFBI_FBAI(
			fireBrigadeApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end) {

		return findBygetFBI_FBAI(fireBrigadeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return findBygetFBI_FBAI(
			fireBrigadeApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_FBAI(
		long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFBI_FBAI;
				finderArgs = new Object[] {fireBrigadeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFBI_FBAI;
			finderArgs = new Object[] {
				fireBrigadeApplicationId, start, end, orderByComparator
			};
		}

		List<FireBrigadeInspection> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeInspection fireBrigadeInspection : list) {
					if (fireBrigadeApplicationId !=
							fireBrigadeInspection.
								getFireBrigadeApplicationId()) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETFBI_FBAI_FIREBRIGADEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

				list = (List<FireBrigadeInspection>)QueryUtil.list(
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
	 * Returns the first fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_FBAI_First(
			long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection = fetchBygetFBI_FBAI_First(
			fireBrigadeApplicationId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_FBAI_First(
		long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		List<FireBrigadeInspection> list = findBygetFBI_FBAI(
			fireBrigadeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_FBAI_Last(
			long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection = fetchBygetFBI_FBAI_Last(
			fireBrigadeApplicationId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_FBAI_Last(
		long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		int count = countBygetFBI_FBAI(fireBrigadeApplicationId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeInspection> list = findBygetFBI_FBAI(
			fireBrigadeApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection[] findBygetFBI_FBAI_PrevAndNext(
			long fireBrigadeInspectionId, long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection = findByPrimaryKey(
			fireBrigadeInspectionId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeInspection[] array = new FireBrigadeInspectionImpl[3];

			array[0] = getBygetFBI_FBAI_PrevAndNext(
				session, fireBrigadeInspection, fireBrigadeApplicationId,
				orderByComparator, true);

			array[1] = fireBrigadeInspection;

			array[2] = getBygetFBI_FBAI_PrevAndNext(
				session, fireBrigadeInspection, fireBrigadeApplicationId,
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

	protected FireBrigadeInspection getBygetFBI_FBAI_PrevAndNext(
		Session session, FireBrigadeInspection fireBrigadeInspection,
		long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETFBI_FBAI_FIREBRIGADEAPPLICATIONID_2);

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
			sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(fireBrigadeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						fireBrigadeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade inspections where fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 */
	@Override
	public void removeBygetFBI_FBAI(long fireBrigadeApplicationId) {
		for (FireBrigadeInspection fireBrigadeInspection :
				findBygetFBI_FBAI(
					fireBrigadeApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeInspection);
		}
	}

	/**
	 * Returns the number of fire brigade inspections where fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetFBI_FBAI(long fireBrigadeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFBI_FBAI;

		Object[] finderArgs = new Object[] {fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETFBI_FBAI_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(fireBrigadeApplicationId);

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
		_FINDER_COLUMN_GETFBI_FBAI_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeInspection.fireBrigadeApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFBI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetFBI_CaseId;
	private FinderPath _finderPathCountBygetFBI_CaseId;

	/**
	 * Returns all the fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseId(String caseId) {
		return findBygetFBI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end) {

		return findBygetFBI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return findBygetFBI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFBI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFBI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FireBrigadeInspection> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeInspection fireBrigadeInspection : list) {
					if (!caseId.equals(fireBrigadeInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeInspection>)QueryUtil.list(
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
	 * Returns the first fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_CaseId_First(
			String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFBI_CaseId_First(caseId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_CaseId_First(
		String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		List<FireBrigadeInspection> list = findBygetFBI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_CaseId_Last(
			String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection = fetchBygetFBI_CaseId_Last(
			caseId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_CaseId_Last(
		String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		int count = countBygetFBI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeInspection> list = findBygetFBI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection[] findBygetFBI_CaseId_PrevAndNext(
			long fireBrigadeInspectionId, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		caseId = Objects.toString(caseId, "");

		FireBrigadeInspection fireBrigadeInspection = findByPrimaryKey(
			fireBrigadeInspectionId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeInspection[] array = new FireBrigadeInspectionImpl[3];

			array[0] = getBygetFBI_CaseId_PrevAndNext(
				session, fireBrigadeInspection, caseId, orderByComparator,
				true);

			array[1] = fireBrigadeInspection;

			array[2] = getBygetFBI_CaseId_PrevAndNext(
				session, fireBrigadeInspection, caseId, orderByComparator,
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

	protected FireBrigadeInspection getBygetFBI_CaseId_PrevAndNext(
		Session session, FireBrigadeInspection fireBrigadeInspection,
		String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFBI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFBI_CASEID_CASEID_2);
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
			sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFBI_CaseId(String caseId) {
		for (FireBrigadeInspection fireBrigadeInspection :
				findBygetFBI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeInspection);
		}
	}

	/**
	 * Returns the number of fire brigade inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetFBI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFBI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFBI_CASEID_CASEID_2 =
		"fireBrigadeInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETFBI_CASEID_CASEID_3 =
		"(fireBrigadeInspection.caseId IS NULL OR fireBrigadeInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFBI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetFBI_Status;
	private FinderPath _finderPathCountBygetFBI_Status;

	/**
	 * Returns all the fire brigade inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_Status(String status) {
		return findBygetFBI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end) {

		return findBygetFBI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return findBygetFBI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_Status(
		String status, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFBI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFBI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FireBrigadeInspection> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeInspection fireBrigadeInspection : list) {
					if (!status.equals(fireBrigadeInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFBI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeInspection>)QueryUtil.list(
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
	 * Returns the first fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_Status_First(
			String status,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFBI_Status_First(status, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_Status_First(
		String status,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		List<FireBrigadeInspection> list = findBygetFBI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_Status_Last(
			String status,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection = fetchBygetFBI_Status_Last(
			status, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_Status_Last(
		String status,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		int count = countBygetFBI_Status(status);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeInspection> list = findBygetFBI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection[] findBygetFBI_Status_PrevAndNext(
			long fireBrigadeInspectionId, String status,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		status = Objects.toString(status, "");

		FireBrigadeInspection fireBrigadeInspection = findByPrimaryKey(
			fireBrigadeInspectionId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeInspection[] array = new FireBrigadeInspectionImpl[3];

			array[0] = getBygetFBI_Status_PrevAndNext(
				session, fireBrigadeInspection, status, orderByComparator,
				true);

			array[1] = fireBrigadeInspection;

			array[2] = getBygetFBI_Status_PrevAndNext(
				session, fireBrigadeInspection, status, orderByComparator,
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

	protected FireBrigadeInspection getBygetFBI_Status_PrevAndNext(
		Session session, FireBrigadeInspection fireBrigadeInspection,
		String status,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFBI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETFBI_STATUS_STATUS_2);
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
			sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetFBI_Status(String status) {
		for (FireBrigadeInspection fireBrigadeInspection :
				findBygetFBI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeInspection);
		}
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetFBI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetFBI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFBI_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETFBI_STATUS_STATUS_2 =
		"fireBrigadeInspection.status = ?";

	private static final String _FINDER_COLUMN_GETFBI_STATUS_STATUS_3 =
		"(fireBrigadeInspection.status IS NULL OR fireBrigadeInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetFBI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetFBI_CaseIdStatus;
	private FinderPath _finderPathCountBygetFBI_CaseIdStatus;

	/**
	 * Returns all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId) {

		return findBygetFBI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetFBI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return findBygetFBI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFBI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFBI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<FireBrigadeInspection> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeInspection fireBrigadeInspection : list) {
					if (!status.equals(fireBrigadeInspection.getStatus()) ||
						!caseId.equals(fireBrigadeInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeInspection>)QueryUtil.list(
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
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFBI_CaseIdStatus_First(status, caseId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		List<FireBrigadeInspection> list = findBygetFBI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFBI_CaseIdStatus_Last(status, caseId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		int count = countBygetFBI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeInspection> list = findBygetFBI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection[] findBygetFBI_CaseIdStatus_PrevAndNext(
			long fireBrigadeInspectionId, String status, String caseId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FireBrigadeInspection fireBrigadeInspection = findByPrimaryKey(
			fireBrigadeInspectionId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeInspection[] array = new FireBrigadeInspectionImpl[3];

			array[0] = getBygetFBI_CaseIdStatus_PrevAndNext(
				session, fireBrigadeInspection, status, caseId,
				orderByComparator, true);

			array[1] = fireBrigadeInspection;

			array[2] = getBygetFBI_CaseIdStatus_PrevAndNext(
				session, fireBrigadeInspection, status, caseId,
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

	protected FireBrigadeInspection getBygetFBI_CaseIdStatus_PrevAndNext(
		Session session, FireBrigadeInspection fireBrigadeInspection,
		String status, String caseId,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_2);
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
			sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFBI_CaseIdStatus(String status, String caseId) {
		for (FireBrigadeInspection fireBrigadeInspection :
				findBygetFBI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(fireBrigadeInspection);
		}
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetFBI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFBI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_2 =
		"fireBrigadeInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETFBI_CASEIDSTATUS_STATUS_3 =
		"(fireBrigadeInspection.status IS NULL OR fireBrigadeInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_2 =
		"fireBrigadeInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETFBI_CASEIDSTATUS_CASEID_3 =
		"(fireBrigadeInspection.caseId IS NULL OR fireBrigadeInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetFBI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFBI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetFBI_CaseIdApplicationId;

	/**
	 * Returns all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId) {

		return findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId, int start, int end) {

		return findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId, int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFBI_CaseIdApplicationId;
				finderArgs = new Object[] {status, fireBrigadeApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFBI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, fireBrigadeApplicationId, start, end, orderByComparator
			};
		}

		List<FireBrigadeInspection> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeInspection fireBrigadeInspection : list) {
					if (!status.equals(fireBrigadeInspection.getStatus()) ||
						(fireBrigadeApplicationId !=
							fireBrigadeInspection.
								getFireBrigadeApplicationId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(fireBrigadeApplicationId);

				list = (List<FireBrigadeInspection>)QueryUtil.list(
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
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_CaseIdApplicationId_First(
			String status, long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFBI_CaseIdApplicationId_First(
				status, fireBrigadeApplicationId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the first fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_CaseIdApplicationId_First(
		String status, long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		List<FireBrigadeInspection> list = findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection findBygetFBI_CaseIdApplicationId_Last(
			String status, long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetFBI_CaseIdApplicationId_Last(
				status, fireBrigadeApplicationId, orderByComparator);

		if (fireBrigadeInspection != null) {
			return fireBrigadeInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", fireBrigadeApplicationId=");
		sb.append(fireBrigadeApplicationId);

		sb.append("}");

		throw new NoSuchFireBrigadeInspectionException(sb.toString());
	}

	/**
	 * Returns the last fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection fetchBygetFBI_CaseIdApplicationId_Last(
		String status, long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		int count = countBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeInspection> list = findBygetFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade inspections before and after the current fire brigade inspection in the ordered set where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param fireBrigadeInspectionId the primary key of the current fire brigade inspection
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection[] findBygetFBI_CaseIdApplicationId_PrevAndNext(
			long fireBrigadeInspectionId, String status,
			long fireBrigadeApplicationId,
			OrderByComparator<FireBrigadeInspection> orderByComparator)
		throws NoSuchFireBrigadeInspectionException {

		status = Objects.toString(status, "");

		FireBrigadeInspection fireBrigadeInspection = findByPrimaryKey(
			fireBrigadeInspectionId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeInspection[] array = new FireBrigadeInspectionImpl[3];

			array[0] = getBygetFBI_CaseIdApplicationId_PrevAndNext(
				session, fireBrigadeInspection, status,
				fireBrigadeApplicationId, orderByComparator, true);

			array[1] = fireBrigadeInspection;

			array[2] = getBygetFBI_CaseIdApplicationId_PrevAndNext(
				session, fireBrigadeInspection, status,
				fireBrigadeApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FireBrigadeInspection getBygetFBI_CaseIdApplicationId_PrevAndNext(
		Session session, FireBrigadeInspection fireBrigadeInspection,
		String status, long fireBrigadeApplicationId,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

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
			sb.append(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(fireBrigadeApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						fireBrigadeInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 */
	@Override
	public void removeBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId) {

		for (FireBrigadeInspection fireBrigadeInspection :
				findBygetFBI_CaseIdApplicationId(
					status, fireBrigadeApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeInspection);
		}
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetFBI_CaseIdApplicationId(
		String status, long fireBrigadeApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetFBI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, fireBrigadeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(fireBrigadeApplicationId);

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
		_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_2 =
			"fireBrigadeInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_STATUS_3 =
			"(fireBrigadeInspection.status IS NULL OR fireBrigadeInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFBI_CASEIDAPPLICATIONID_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeInspection.fireBrigadeApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);

		if (fireBrigadeInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", fireBrigadeApplicationId=");
			sb.append(fireBrigadeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeInspectionException(sb.toString());
		}

		return fireBrigadeInspection;
	}

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser,
			long fireBrigadeApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, fireBrigadeApplicationId, true);
	}

	/**
	 * Returns the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade inspection, or <code>null</code> if a matching fire brigade inspection could not be found
	 */
	@Override
	public FireBrigadeInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long fireBrigadeApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, fireBrigadeApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof FireBrigadeInspection) {
			FireBrigadeInspection fireBrigadeInspection =
				(FireBrigadeInspection)result;

			if (!Objects.equals(status, fireBrigadeInspection.getStatus()) ||
				(slotBookedByUser !=
					fireBrigadeInspection.getSlotBookedByUser()) ||
				(fireBrigadeApplicationId !=
					fireBrigadeInspection.getFireBrigadeApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

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

				queryPos.add(fireBrigadeApplicationId);

				List<FireBrigadeInspection> list = query.list();

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
									fireBrigadeApplicationId
								};
							}

							_log.warn(
								"FireBrigadeInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeInspection fireBrigadeInspection = list.get(0);

					result = fireBrigadeInspection;

					cacheResult(fireBrigadeInspection);
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
			return (FireBrigadeInspection)result;
		}
	}

	/**
	 * Removes the fire brigade inspection where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the fire brigade inspection that was removed
	 */
	@Override
	public FireBrigadeInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);

		return remove(fireBrigadeInspection);
	}

	/**
	 * Returns the number of fire brigade inspections where status = &#63; and slotBookedByUser = &#63; and fireBrigadeApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param fireBrigadeApplicationId the fire brigade application ID
	 * @return the number of matching fire brigade inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long fireBrigadeApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, fireBrigadeApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FIREBRIGADEINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FIREBRIGADEAPPLICATIONID_2);

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

				queryPos.add(fireBrigadeApplicationId);

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
			"fireBrigadeInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(fireBrigadeInspection.status IS NULL OR fireBrigadeInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"fireBrigadeInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FIREBRIGADEAPPLICATIONID_2 =
			"fireBrigadeInspection.fireBrigadeApplicationId = ?";

	public FireBrigadeInspectionPersistenceImpl() {
		setModelClass(FireBrigadeInspection.class);

		setModelImplClass(FireBrigadeInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeInspectionTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade inspection in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 */
	@Override
	public void cacheResult(FireBrigadeInspection fireBrigadeInspection) {
		entityCache.putResult(
			FireBrigadeInspectionImpl.class,
			fireBrigadeInspection.getPrimaryKey(), fireBrigadeInspection);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeInspectionBy_CI,
			new Object[] {fireBrigadeInspection.getCaseId()},
			fireBrigadeInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				fireBrigadeInspection.getStatus(),
				fireBrigadeInspection.getSlotBookedByUser(),
				fireBrigadeInspection.getFireBrigadeApplicationId()
			},
			fireBrigadeInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade inspections in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeInspections the fire brigade inspections
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeInspection> fireBrigadeInspections) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeInspection fireBrigadeInspection :
				fireBrigadeInspections) {

			if (entityCache.getResult(
					FireBrigadeInspectionImpl.class,
					fireBrigadeInspection.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeInspection);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeInspectionImpl.class);

		finderCache.clearCache(FireBrigadeInspectionImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadeInspection fireBrigadeInspection) {
		entityCache.removeResult(
			FireBrigadeInspectionImpl.class, fireBrigadeInspection);
	}

	@Override
	public void clearCache(List<FireBrigadeInspection> fireBrigadeInspections) {
		for (FireBrigadeInspection fireBrigadeInspection :
				fireBrigadeInspections) {

			entityCache.removeResult(
				FireBrigadeInspectionImpl.class, fireBrigadeInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeInspectionModelImpl fireBrigadeInspectionModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeInspectionModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeInspectionBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeInspectionBy_CI, args,
			fireBrigadeInspectionModelImpl);

		args = new Object[] {
			fireBrigadeInspectionModelImpl.getStatus(),
			fireBrigadeInspectionModelImpl.getSlotBookedByUser(),
			fireBrigadeInspectionModelImpl.getFireBrigadeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, fireBrigadeInspectionModelImpl);
	}

	/**
	 * Creates a new fire brigade inspection with the primary key. Does not add the fire brigade inspection to the database.
	 *
	 * @param fireBrigadeInspectionId the primary key for the new fire brigade inspection
	 * @return the new fire brigade inspection
	 */
	@Override
	public FireBrigadeInspection create(long fireBrigadeInspectionId) {
		FireBrigadeInspection fireBrigadeInspection =
			new FireBrigadeInspectionImpl();

		fireBrigadeInspection.setNew(true);
		fireBrigadeInspection.setPrimaryKey(fireBrigadeInspectionId);

		fireBrigadeInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fireBrigadeInspection;
	}

	/**
	 * Removes the fire brigade inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection remove(long fireBrigadeInspectionId)
		throws NoSuchFireBrigadeInspectionException {

		return remove((Serializable)fireBrigadeInspectionId);
	}

	/**
	 * Removes the fire brigade inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection remove(Serializable primaryKey)
		throws NoSuchFireBrigadeInspectionException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeInspection fireBrigadeInspection =
				(FireBrigadeInspection)session.get(
					FireBrigadeInspectionImpl.class, primaryKey);

			if (fireBrigadeInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeInspection);
		}
		catch (NoSuchFireBrigadeInspectionException noSuchEntityException) {
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
	protected FireBrigadeInspection removeImpl(
		FireBrigadeInspection fireBrigadeInspection) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeInspection)) {
				fireBrigadeInspection = (FireBrigadeInspection)session.get(
					FireBrigadeInspectionImpl.class,
					fireBrigadeInspection.getPrimaryKeyObj());
			}

			if (fireBrigadeInspection != null) {
				session.delete(fireBrigadeInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeInspection != null) {
			clearCache(fireBrigadeInspection);
		}

		return fireBrigadeInspection;
	}

	@Override
	public FireBrigadeInspection updateImpl(
		FireBrigadeInspection fireBrigadeInspection) {

		boolean isNew = fireBrigadeInspection.isNew();

		if (!(fireBrigadeInspection instanceof
				FireBrigadeInspectionModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeInspection implementation " +
					fireBrigadeInspection.getClass());
		}

		FireBrigadeInspectionModelImpl fireBrigadeInspectionModelImpl =
			(FireBrigadeInspectionModelImpl)fireBrigadeInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeInspection.setCreateDate(date);
			}
			else {
				fireBrigadeInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeInspection.setModifiedDate(date);
			}
			else {
				fireBrigadeInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeInspection);
			}
			else {
				fireBrigadeInspection = (FireBrigadeInspection)session.merge(
					fireBrigadeInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeInspectionImpl.class, fireBrigadeInspectionModelImpl,
			false, true);

		cacheUniqueFindersCache(fireBrigadeInspectionModelImpl);

		if (isNew) {
			fireBrigadeInspection.setNew(false);
		}

		fireBrigadeInspection.resetOriginalValues();

		return fireBrigadeInspection;
	}

	/**
	 * Returns the fire brigade inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade inspection
	 * @return the fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeInspectionException {

		FireBrigadeInspection fireBrigadeInspection = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeInspection;
	}

	/**
	 * Returns the fire brigade inspection with the primary key or throws a <code>NoSuchFireBrigadeInspectionException</code> if it could not be found.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection
	 * @throws NoSuchFireBrigadeInspectionException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection findByPrimaryKey(long fireBrigadeInspectionId)
		throws NoSuchFireBrigadeInspectionException {

		return findByPrimaryKey((Serializable)fireBrigadeInspectionId);
	}

	/**
	 * Returns the fire brigade inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection, or <code>null</code> if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public FireBrigadeInspection fetchByPrimaryKey(
		long fireBrigadeInspectionId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeInspectionId);
	}

	/**
	 * Returns all the fire brigade inspections.
	 *
	 * @return the fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade inspections
	 */
	@Override
	public List<FireBrigadeInspection> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeInspection> orderByComparator,
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

		List<FireBrigadeInspection> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEINSPECTION;

				sql = sql.concat(FireBrigadeInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeInspection>)QueryUtil.list(
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
	 * Removes all the fire brigade inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeInspection fireBrigadeInspection : findAll()) {
			remove(fireBrigadeInspection);
		}
	}

	/**
	 * Returns the number of fire brigade inspections.
	 *
	 * @return the number of fire brigade inspections
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
					_SQL_COUNT_FIREBRIGADEINSPECTION);

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
		return "fireBrigadeInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade inspection persistence.
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

		_finderPathFetchBygetFireBrigadeInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadeInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFireBrigadeInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFBI_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFBI_FBAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"fireBrigadeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFBI_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFBI_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, true);

		_finderPathCountBygetFBI_FBAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFBI_FBAI",
			new String[] {Long.class.getName()},
			new String[] {"fireBrigadeApplicationId"}, false);

		_finderPathWithPaginationFindBygetFBI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFBI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFBI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFBI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFBI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFBI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFBI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFBI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetFBI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFBI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetFBI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFBI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetFBI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFBI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetFBI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetFBI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetFBI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFBI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetFBI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFBI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "fireBrigadeApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFBI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFBI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "fireBrigadeApplicationId"}, true);

		_finderPathCountBygetFBI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFBI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "fireBrigadeApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "fireBrigadeApplicationId"
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
					"status", "slotBookedByUser", "fireBrigadeApplicationId"
				},
				false);

		FireBrigadeInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeInspectionUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADEINSPECTION =
		"SELECT fireBrigadeInspection FROM FireBrigadeInspection fireBrigadeInspection";

	private static final String _SQL_SELECT_FIREBRIGADEINSPECTION_WHERE =
		"SELECT fireBrigadeInspection FROM FireBrigadeInspection fireBrigadeInspection WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEINSPECTION =
		"SELECT COUNT(fireBrigadeInspection) FROM FireBrigadeInspection fireBrigadeInspection";

	private static final String _SQL_COUNT_FIREBRIGADEINSPECTION_WHERE =
		"SELECT COUNT(fireBrigadeInspection) FROM FireBrigadeInspection fireBrigadeInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}