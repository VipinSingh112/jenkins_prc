/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmInspectionException;
import com.nbp.farm.application.stages.service.model.FarmInspection;
import com.nbp.farm.application.stages.service.model.FarmInspectionTable;
import com.nbp.farm.application.stages.service.model.impl.FarmInspectionImpl;
import com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl;
import com.nbp.farm.application.stages.service.service.persistence.FarmInspectionPersistence;
import com.nbp.farm.application.stages.service.service.persistence.FarmInspectionUtil;
import com.nbp.farm.application.stages.service.service.persistence.impl.constants.FARM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the farm inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FarmInspectionPersistence.class, BasePersistence.class})
public class FarmInspectionPersistenceImpl
	extends BasePersistenceImpl<FarmInspection>
	implements FarmInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmInspectionUtil</code> to access the farm inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetFI_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFI_FAI;
	private FinderPath _finderPathCountBygetFI_FAI;

	/**
	 * Returns all the farm inspections where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_FAI(long farmApplicationId) {
		return findBygetFI_FAI(
			farmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end) {

		return findBygetFI_FAI(farmApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return findBygetFI_FAI(
			farmApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm inspections where farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_FAI(
		long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFI_FAI;
				finderArgs = new Object[] {farmApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFI_FAI;
			finderArgs = new Object[] {
				farmApplicationId, start, end, orderByComparator
			};
		}

		List<FarmInspection> list = null;

		if (useFinderCache) {
			list = (List<FarmInspection>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmInspection farmInspection : list) {
					if (farmApplicationId !=
							farmInspection.getFarmApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETFI_FAI_FARMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmApplicationId);

				list = (List<FarmInspection>)QueryUtil.list(
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
	 * Returns the first farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_FAI_First(
			long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_FAI_First(
			farmApplicationId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmApplicationId=");
		sb.append(farmApplicationId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the first farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_FAI_First(
		long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		List<FarmInspection> list = findBygetFI_FAI(
			farmApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_FAI_Last(
			long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_FAI_Last(
			farmApplicationId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmApplicationId=");
		sb.append(farmApplicationId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the last farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_FAI_Last(
		long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		int count = countBygetFI_FAI(farmApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmInspection> list = findBygetFI_FAI(
			farmApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where farmApplicationId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection[] findBygetFI_FAI_PrevAndNext(
			long farmInspectionId, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = findByPrimaryKey(farmInspectionId);

		Session session = null;

		try {
			session = openSession();

			FarmInspection[] array = new FarmInspectionImpl[3];

			array[0] = getBygetFI_FAI_PrevAndNext(
				session, farmInspection, farmApplicationId, orderByComparator,
				true);

			array[1] = farmInspection;

			array[2] = getBygetFI_FAI_PrevAndNext(
				session, farmInspection, farmApplicationId, orderByComparator,
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

	protected FarmInspection getBygetFI_FAI_PrevAndNext(
		Session session, FarmInspection farmInspection, long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETFI_FAI_FARMAPPLICATIONID_2);

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
			sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(farmApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm inspections where farmApplicationId = &#63; from the database.
	 *
	 * @param farmApplicationId the farm application ID
	 */
	@Override
	public void removeBygetFI_FAI(long farmApplicationId) {
		for (FarmInspection farmInspection :
				findBygetFI_FAI(
					farmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmInspection);
		}
	}

	/**
	 * Returns the number of farm inspections where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	@Override
	public int countBygetFI_FAI(long farmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFI_FAI;

		Object[] finderArgs = new Object[] {farmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETFI_FAI_FARMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmApplicationId);

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

	private static final String _FINDER_COLUMN_GETFI_FAI_FARMAPPLICATIONID_2 =
		"farmInspection.farmApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetFI_CaseId;
	private FinderPath _finderPathCountBygetFI_CaseId;

	/**
	 * Returns all the farm inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseId(String caseId) {
		return findBygetFI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end) {

		return findBygetFI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return findBygetFI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FarmInspection> list = null;

		if (useFinderCache) {
			list = (List<FarmInspection>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmInspection farmInspection : list) {
					if (!caseId.equals(farmInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FarmInspection>)QueryUtil.list(
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
	 * Returns the first farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_CaseId_First(
			String caseId, OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_CaseId_First(
			caseId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the first farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_CaseId_First(
		String caseId, OrderByComparator<FarmInspection> orderByComparator) {

		List<FarmInspection> list = findBygetFI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_CaseId_Last(
			String caseId, OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_CaseId_Last(
			caseId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the last farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_CaseId_Last(
		String caseId, OrderByComparator<FarmInspection> orderByComparator) {

		int count = countBygetFI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FarmInspection> list = findBygetFI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where caseId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection[] findBygetFI_CaseId_PrevAndNext(
			long farmInspectionId, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		caseId = Objects.toString(caseId, "");

		FarmInspection farmInspection = findByPrimaryKey(farmInspectionId);

		Session session = null;

		try {
			session = openSession();

			FarmInspection[] array = new FarmInspectionImpl[3];

			array[0] = getBygetFI_CaseId_PrevAndNext(
				session, farmInspection, caseId, orderByComparator, true);

			array[1] = farmInspection;

			array[2] = getBygetFI_CaseId_PrevAndNext(
				session, farmInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmInspection getBygetFI_CaseId_PrevAndNext(
		Session session, FarmInspection farmInspection, String caseId,
		OrderByComparator<FarmInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFI_CASEID_CASEID_2);
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
			sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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
						farmInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFI_CaseId(String caseId) {
		for (FarmInspection farmInspection :
				findBygetFI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmInspection);
		}
	}

	/**
	 * Returns the number of farm inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm inspections
	 */
	@Override
	public int countBygetFI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFI_CASEID_CASEID_2 =
		"farmInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETFI_CASEID_CASEID_3 =
		"(farmInspection.caseId IS NULL OR farmInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetFI_Status;
	private FinderPath _finderPathCountBygetFI_Status;

	/**
	 * Returns all the farm inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_Status(String status) {
		return findBygetFI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_Status(
		String status, int start, int end) {

		return findBygetFI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_Status(
		String status, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return findBygetFI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_Status(
		String status, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FarmInspection> list = null;

		if (useFinderCache) {
			list = (List<FarmInspection>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmInspection farmInspection : list) {
					if (!status.equals(farmInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FarmInspection>)QueryUtil.list(
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
	 * Returns the first farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_Status_First(
			String status, OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_Status_First(
			status, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_Status_First(
		String status, OrderByComparator<FarmInspection> orderByComparator) {

		List<FarmInspection> list = findBygetFI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_Status_Last(
			String status, OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_Status_Last(
			status, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_Status_Last(
		String status, OrderByComparator<FarmInspection> orderByComparator) {

		int count = countBygetFI_Status(status);

		if (count == 0) {
			return null;
		}

		List<FarmInspection> list = findBygetFI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection[] findBygetFI_Status_PrevAndNext(
			long farmInspectionId, String status,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		status = Objects.toString(status, "");

		FarmInspection farmInspection = findByPrimaryKey(farmInspectionId);

		Session session = null;

		try {
			session = openSession();

			FarmInspection[] array = new FarmInspectionImpl[3];

			array[0] = getBygetFI_Status_PrevAndNext(
				session, farmInspection, status, orderByComparator, true);

			array[1] = farmInspection;

			array[2] = getBygetFI_Status_PrevAndNext(
				session, farmInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmInspection getBygetFI_Status_PrevAndNext(
		Session session, FarmInspection farmInspection, String status,
		OrderByComparator<FarmInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETFI_STATUS_STATUS_2);
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
			sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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
						farmInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetFI_Status(String status) {
		for (FarmInspection farmInspection :
				findBygetFI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmInspection);
		}
	}

	/**
	 * Returns the number of farm inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching farm inspections
	 */
	@Override
	public int countBygetFI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetFI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFI_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETFI_STATUS_STATUS_2 =
		"farmInspection.status = ?";

	private static final String _FINDER_COLUMN_GETFI_STATUS_STATUS_3 =
		"(farmInspection.status IS NULL OR farmInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetFI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetFI_CaseIdStatus;
	private FinderPath _finderPathCountBygetFI_CaseIdStatus;

	/**
	 * Returns all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId) {

		return findBygetFI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetFI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return findBygetFI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<FarmInspection> list = null;

		if (useFinderCache) {
			list = (List<FarmInspection>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmInspection farmInspection : list) {
					if (!status.equals(farmInspection.getStatus()) ||
						!caseId.equals(farmInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<FarmInspection>)QueryUtil.list(
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
	 * Returns the first farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<FarmInspection> orderByComparator) {

		List<FarmInspection> list = findBygetFI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<FarmInspection> orderByComparator) {

		int count = countBygetFI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<FarmInspection> list = findBygetFI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection[] findBygetFI_CaseIdStatus_PrevAndNext(
			long farmInspectionId, String status, String caseId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FarmInspection farmInspection = findByPrimaryKey(farmInspectionId);

		Session session = null;

		try {
			session = openSession();

			FarmInspection[] array = new FarmInspectionImpl[3];

			array[0] = getBygetFI_CaseIdStatus_PrevAndNext(
				session, farmInspection, status, caseId, orderByComparator,
				true);

			array[1] = farmInspection;

			array[2] = getBygetFI_CaseIdStatus_PrevAndNext(
				session, farmInspection, status, caseId, orderByComparator,
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

	protected FarmInspection getBygetFI_CaseIdStatus_PrevAndNext(
		Session session, FarmInspection farmInspection, String status,
		String caseId, OrderByComparator<FarmInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_2);
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
			sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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
						farmInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFI_CaseIdStatus(String status, String caseId) {
		for (FarmInspection farmInspection :
				findBygetFI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmInspection);
		}
	}

	/**
	 * Returns the number of farm inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching farm inspections
	 */
	@Override
	public int countBygetFI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_2 =
		"farmInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETFI_CASEIDSTATUS_STATUS_3 =
		"(farmInspection.status IS NULL OR farmInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_2 =
		"farmInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETFI_CASEIDSTATUS_CASEID_3 =
		"(farmInspection.caseId IS NULL OR farmInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetFI_CaseIdApplicationId;

	/**
	 * Returns all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId) {

		return findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end) {

		return findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm inspections
	 */
	@Override
	public List<FarmInspection> findBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId, int start, int end,
		OrderByComparator<FarmInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFI_CaseIdApplicationId;
				finderArgs = new Object[] {status, farmApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, farmApplicationId, start, end, orderByComparator
			};
		}

		List<FarmInspection> list = null;

		if (useFinderCache) {
			list = (List<FarmInspection>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmInspection farmInspection : list) {
					if (!status.equals(farmInspection.getStatus()) ||
						(farmApplicationId !=
							farmInspection.getFarmApplicationId())) {

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

			sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_FARMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(farmApplicationId);

				list = (List<FarmInspection>)QueryUtil.list(
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
	 * Returns the first farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_CaseIdApplicationId_First(
			String status, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_CaseIdApplicationId_First(
			status, farmApplicationId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", farmApplicationId=");
		sb.append(farmApplicationId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the first farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_CaseIdApplicationId_First(
		String status, long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		List<FarmInspection> list = findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetFI_CaseIdApplicationId_Last(
			String status, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchBygetFI_CaseIdApplicationId_Last(
			status, farmApplicationId, orderByComparator);

		if (farmInspection != null) {
			return farmInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", farmApplicationId=");
		sb.append(farmApplicationId);

		sb.append("}");

		throw new NoSuchFarmInspectionException(sb.toString());
	}

	/**
	 * Returns the last farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection fetchBygetFI_CaseIdApplicationId_Last(
		String status, long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator) {

		int count = countBygetFI_CaseIdApplicationId(status, farmApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmInspection> list = findBygetFI_CaseIdApplicationId(
			status, farmApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm inspections before and after the current farm inspection in the ordered set where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param farmInspectionId the primary key of the current farm inspection
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection[] findBygetFI_CaseIdApplicationId_PrevAndNext(
			long farmInspectionId, String status, long farmApplicationId,
			OrderByComparator<FarmInspection> orderByComparator)
		throws NoSuchFarmInspectionException {

		status = Objects.toString(status, "");

		FarmInspection farmInspection = findByPrimaryKey(farmInspectionId);

		Session session = null;

		try {
			session = openSession();

			FarmInspection[] array = new FarmInspectionImpl[3];

			array[0] = getBygetFI_CaseIdApplicationId_PrevAndNext(
				session, farmInspection, status, farmApplicationId,
				orderByComparator, true);

			array[1] = farmInspection;

			array[2] = getBygetFI_CaseIdApplicationId_PrevAndNext(
				session, farmInspection, status, farmApplicationId,
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

	protected FarmInspection getBygetFI_CaseIdApplicationId_PrevAndNext(
		Session session, FarmInspection farmInspection, String status,
		long farmApplicationId,
		OrderByComparator<FarmInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_FARMAPPLICATIONID_2);

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
			sb.append(FarmInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(farmApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm inspections where status = &#63; and farmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 */
	@Override
	public void removeBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId) {

		for (FarmInspection farmInspection :
				findBygetFI_CaseIdApplicationId(
					status, farmApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(farmInspection);
		}
	}

	/**
	 * Returns the number of farm inspections where status = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	@Override
	public int countBygetFI_CaseIdApplicationId(
		String status, long farmApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetFI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, farmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_FARMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(farmApplicationId);

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
		_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_2 =
			"farmInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_STATUS_3 =
			"(farmInspection.status IS NULL OR farmInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFI_CASEIDAPPLICATIONID_FARMAPPLICATIONID_2 =
			"farmInspection.farmApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or throws a <code>NoSuchFarmInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspection
	 * @throws NoSuchFarmInspectionException if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId);

		if (farmInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", farmApplicationId=");
			sb.append(farmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmInspectionException(sb.toString());
		}

		return farmInspection;
	}

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, farmApplicationId, true);
	}

	/**
	 * Returns the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm inspection, or <code>null</code> if a matching farm inspection could not be found
	 */
	@Override
	public FarmInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long farmApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, farmApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs,this);
		}

		if (result instanceof FarmInspection) {
			FarmInspection farmInspection = (FarmInspection)result;

			if (!Objects.equals(status, farmInspection.getStatus()) ||
				(slotBookedByUser != farmInspection.getSlotBookedByUser()) ||
				(farmApplicationId != farmInspection.getFarmApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FARMINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FARMAPPLICATIONID_2);

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

				queryPos.add(farmApplicationId);

				List<FarmInspection> list = query.list();

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
									status, slotBookedByUser, farmApplicationId
								};
							}

							_log.warn(
								"FarmInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmInspection farmInspection = list.get(0);

					result = farmInspection;

					cacheResult(farmInspection);
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
			return (FarmInspection)result;
		}
	}

	/**
	 * Removes the farm inspection where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the farm inspection that was removed
	 */
	@Override
	public FarmInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long farmApplicationId)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, farmApplicationId);

		return remove(farmInspection);
	}

	/**
	 * Returns the number of farm inspections where status = &#63; and slotBookedByUser = &#63; and farmApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long farmApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, farmApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FARMINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FARMAPPLICATIONID_2);

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

				queryPos.add(farmApplicationId);

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
			"farmInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(farmInspection.status IS NULL OR farmInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"farmInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_FARMAPPLICATIONID_2 =
			"farmInspection.farmApplicationId = ?";

	public FarmInspectionPersistenceImpl() {
		setModelClass(FarmInspection.class);

		setModelImplClass(FarmInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(FarmInspectionTable.INSTANCE);
	}

	/**
	 * Caches the farm inspection in the entity cache if it is enabled.
	 *
	 * @param farmInspection the farm inspection
	 */
	@Override
	public void cacheResult(FarmInspection farmInspection) {
		entityCache.putResult(
			FarmInspectionImpl.class, farmInspection.getPrimaryKey(),
			farmInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				farmInspection.getStatus(),
				farmInspection.getSlotBookedByUser(),
				farmInspection.getFarmApplicationId()
			},
			farmInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farm inspections in the entity cache if it is enabled.
	 *
	 * @param farmInspections the farm inspections
	 */
	@Override
	public void cacheResult(List<FarmInspection> farmInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmInspection farmInspection : farmInspections) {
			if (entityCache.getResult(
					FarmInspectionImpl.class, farmInspection.getPrimaryKey()) ==
						null) {

				cacheResult(farmInspection);
			}
		}
	}

	/**
	 * Clears the cache for all farm inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmInspectionImpl.class);

		finderCache.clearCache(FarmInspectionImpl.class);
	}

	/**
	 * Clears the cache for the farm inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmInspection farmInspection) {
		entityCache.removeResult(FarmInspectionImpl.class, farmInspection);
	}

	@Override
	public void clearCache(List<FarmInspection> farmInspections) {
		for (FarmInspection farmInspection : farmInspections) {
			entityCache.removeResult(FarmInspectionImpl.class, farmInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmInspectionModelImpl farmInspectionModelImpl) {

		Object[] args = new Object[] {
			farmInspectionModelImpl.getStatus(),
			farmInspectionModelImpl.getSlotBookedByUser(),
			farmInspectionModelImpl.getFarmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, farmInspectionModelImpl);
	}

	/**
	 * Creates a new farm inspection with the primary key. Does not add the farm inspection to the database.
	 *
	 * @param farmInspectionId the primary key for the new farm inspection
	 * @return the new farm inspection
	 */
	@Override
	public FarmInspection create(long farmInspectionId) {
		FarmInspection farmInspection = new FarmInspectionImpl();

		farmInspection.setNew(true);
		farmInspection.setPrimaryKey(farmInspectionId);

		farmInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmInspection;
	}

	/**
	 * Removes the farm inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection that was removed
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection remove(long farmInspectionId)
		throws NoSuchFarmInspectionException {

		return remove((Serializable)farmInspectionId);
	}

	/**
	 * Removes the farm inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farm inspection
	 * @return the farm inspection that was removed
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection remove(Serializable primaryKey)
		throws NoSuchFarmInspectionException {

		Session session = null;

		try {
			session = openSession();

			FarmInspection farmInspection = (FarmInspection)session.get(
				FarmInspectionImpl.class, primaryKey);

			if (farmInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmInspection);
		}
		catch (NoSuchFarmInspectionException noSuchEntityException) {
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
	protected FarmInspection removeImpl(FarmInspection farmInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmInspection)) {
				farmInspection = (FarmInspection)session.get(
					FarmInspectionImpl.class,
					farmInspection.getPrimaryKeyObj());
			}

			if (farmInspection != null) {
				session.delete(farmInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmInspection != null) {
			clearCache(farmInspection);
		}

		return farmInspection;
	}

	@Override
	public FarmInspection updateImpl(FarmInspection farmInspection) {
		boolean isNew = farmInspection.isNew();

		if (!(farmInspection instanceof FarmInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmInspection implementation " +
					farmInspection.getClass());
		}

		FarmInspectionModelImpl farmInspectionModelImpl =
			(FarmInspectionModelImpl)farmInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmInspection.setCreateDate(date);
			}
			else {
				farmInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmInspection.setModifiedDate(date);
			}
			else {
				farmInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmInspection);
			}
			else {
				farmInspection = (FarmInspection)session.merge(farmInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmInspectionImpl.class, farmInspectionModelImpl, false, true);

		cacheUniqueFindersCache(farmInspectionModelImpl);

		if (isNew) {
			farmInspection.setNew(false);
		}

		farmInspection.resetOriginalValues();

		return farmInspection;
	}

	/**
	 * Returns the farm inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farm inspection
	 * @return the farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmInspectionException {

		FarmInspection farmInspection = fetchByPrimaryKey(primaryKey);

		if (farmInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmInspection;
	}

	/**
	 * Returns the farm inspection with the primary key or throws a <code>NoSuchFarmInspectionException</code> if it could not be found.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection
	 * @throws NoSuchFarmInspectionException if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection findByPrimaryKey(long farmInspectionId)
		throws NoSuchFarmInspectionException {

		return findByPrimaryKey((Serializable)farmInspectionId);
	}

	/**
	 * Returns the farm inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection, or <code>null</code> if a farm inspection with the primary key could not be found
	 */
	@Override
	public FarmInspection fetchByPrimaryKey(long farmInspectionId) {
		return fetchByPrimaryKey((Serializable)farmInspectionId);
	}

	/**
	 * Returns all the farm inspections.
	 *
	 * @return the farm inspections
	 */
	@Override
	public List<FarmInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of farm inspections
	 */
	@Override
	public List<FarmInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm inspections
	 */
	@Override
	public List<FarmInspection> findAll(
		int start, int end,
		OrderByComparator<FarmInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm inspections
	 */
	@Override
	public List<FarmInspection> findAll(
		int start, int end, OrderByComparator<FarmInspection> orderByComparator,
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

		List<FarmInspection> list = null;

		if (useFinderCache) {
			list = (List<FarmInspection>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMINSPECTION;

				sql = sql.concat(FarmInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmInspection>)QueryUtil.list(
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
	 * Removes all the farm inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmInspection farmInspection : findAll()) {
			remove(farmInspection);
		}
	}

	/**
	 * Returns the number of farm inspections.
	 *
	 * @return the number of farm inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMINSPECTION);

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
		return "farmInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farm inspection persistence.
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

		_finderPathWithPaginationFindBygetFI_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFI_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFI_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFI_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmApplicationId"}, true);

		_finderPathCountBygetFI_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFI_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmApplicationId"}, false);

		_finderPathWithPaginationFindBygetFI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetFI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetFI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetFI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetFI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetFI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetFI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetFI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "farmApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "farmApplicationId"}, true);

		_finderPathCountBygetFI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "farmApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "farmApplicationId"
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
					"status", "slotBookedByUser", "farmApplicationId"
				},
				false);

		_setFarmInspectionUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmInspectionUtilPersistence(null);

		entityCache.removeCache(FarmInspectionImpl.class.getName());
	}

	private void _setFarmInspectionUtilPersistence(
		FarmInspectionPersistence farmInspectionPersistence) {

		try {
			Field field = FarmInspectionUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmInspectionPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMINSPECTION =
		"SELECT farmInspection FROM FarmInspection farmInspection";

	private static final String _SQL_SELECT_FARMINSPECTION_WHERE =
		"SELECT farmInspection FROM FarmInspection farmInspection WHERE ";

	private static final String _SQL_COUNT_FARMINSPECTION =
		"SELECT COUNT(farmInspection) FROM FarmInspection farmInspection";

	private static final String _SQL_COUNT_FARMINSPECTION_WHERE =
		"SELECT COUNT(farmInspection) FROM FarmInspection farmInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmInspectionModelArgumentsResolver
		_farmInspectionModelArgumentsResolver;

}