/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchAddOutsourcedActivitiesException;
import com.nbp.janaac.application.form.service.model.AddOutsourcedActivities;
import com.nbp.janaac.application.form.service.model.AddOutsourcedActivitiesTable;
import com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesImpl;
import com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddOutsourcedActivitiesPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddOutsourcedActivitiesUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add outsourced activities service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddOutsourcedActivitiesPersistence.class)
public class AddOutsourcedActivitiesPersistenceImpl
	extends BasePersistenceImpl<AddOutsourcedActivities>
	implements AddOutsourcedActivitiesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddOutsourcedActivitiesUtil</code> to access the add outsourced activities persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddOutsourcedActivitiesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaac_OutSrc_Id;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaac_OutSrc_Id;
	private FinderPath _finderPathCountBygetJanaac_OutSrc_Id;

	/**
	 * Returns all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId) {

		return findBygetJanaac_OutSrc_Id(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of matching add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaac_OutSrc_Id(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return findBygetJanaac_OutSrc_Id(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findBygetJanaac_OutSrc_Id(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJanaac_OutSrc_Id;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaac_OutSrc_Id;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddOutsourcedActivities> list = null;

		if (useFinderCache) {
			list = (List<AddOutsourcedActivities>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddOutsourcedActivities addOutsourcedActivities : list) {
					if (janaacApplicationId !=
							addOutsourcedActivities.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDOUTSOURCEDACTIVITIES_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_OUTSRC_ID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddOutsourcedActivitiesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddOutsourcedActivities>)QueryUtil.list(
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
	 * Returns the first add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a matching add outsourced activities could not be found
	 */
	@Override
	public AddOutsourcedActivities findBygetJanaac_OutSrc_Id_First(
			long janaacApplicationId,
			OrderByComparator<AddOutsourcedActivities> orderByComparator)
		throws NoSuchAddOutsourcedActivitiesException {

		AddOutsourcedActivities addOutsourcedActivities =
			fetchBygetJanaac_OutSrc_Id_First(
				janaacApplicationId, orderByComparator);

		if (addOutsourcedActivities != null) {
			return addOutsourcedActivities;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddOutsourcedActivitiesException(sb.toString());
	}

	/**
	 * Returns the first add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add outsourced activities, or <code>null</code> if a matching add outsourced activities could not be found
	 */
	@Override
	public AddOutsourcedActivities fetchBygetJanaac_OutSrc_Id_First(
		long janaacApplicationId,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		List<AddOutsourcedActivities> list = findBygetJanaac_OutSrc_Id(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a matching add outsourced activities could not be found
	 */
	@Override
	public AddOutsourcedActivities findBygetJanaac_OutSrc_Id_Last(
			long janaacApplicationId,
			OrderByComparator<AddOutsourcedActivities> orderByComparator)
		throws NoSuchAddOutsourcedActivitiesException {

		AddOutsourcedActivities addOutsourcedActivities =
			fetchBygetJanaac_OutSrc_Id_Last(
				janaacApplicationId, orderByComparator);

		if (addOutsourcedActivities != null) {
			return addOutsourcedActivities;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddOutsourcedActivitiesException(sb.toString());
	}

	/**
	 * Returns the last add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add outsourced activities, or <code>null</code> if a matching add outsourced activities could not be found
	 */
	@Override
	public AddOutsourcedActivities fetchBygetJanaac_OutSrc_Id_Last(
		long janaacApplicationId,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		int count = countBygetJanaac_OutSrc_Id(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddOutsourcedActivities> list = findBygetJanaac_OutSrc_Id(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add outsourced activitieses before and after the current add outsourced activities in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the current add outsourced activities
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public AddOutsourcedActivities[] findBygetJanaac_OutSrc_Id_PrevAndNext(
			long addOutsourcedActivitiesId, long janaacApplicationId,
			OrderByComparator<AddOutsourcedActivities> orderByComparator)
		throws NoSuchAddOutsourcedActivitiesException {

		AddOutsourcedActivities addOutsourcedActivities = findByPrimaryKey(
			addOutsourcedActivitiesId);

		Session session = null;

		try {
			session = openSession();

			AddOutsourcedActivities[] array =
				new AddOutsourcedActivitiesImpl[3];

			array[0] = getBygetJanaac_OutSrc_Id_PrevAndNext(
				session, addOutsourcedActivities, janaacApplicationId,
				orderByComparator, true);

			array[1] = addOutsourcedActivities;

			array[2] = getBygetJanaac_OutSrc_Id_PrevAndNext(
				session, addOutsourcedActivities, janaacApplicationId,
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

	protected AddOutsourcedActivities getBygetJanaac_OutSrc_Id_PrevAndNext(
		Session session, AddOutsourcedActivities addOutsourcedActivities,
		long janaacApplicationId,
		OrderByComparator<AddOutsourcedActivities> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDOUTSOURCEDACTIVITIES_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAAC_OUTSRC_ID_JANAACAPPLICATIONID_2);

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
			sb.append(AddOutsourcedActivitiesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						addOutsourcedActivities)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddOutsourcedActivities> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add outsourced activitieses where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaac_OutSrc_Id(long janaacApplicationId) {
		for (AddOutsourcedActivities addOutsourcedActivities :
				findBygetJanaac_OutSrc_Id(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addOutsourcedActivities);
		}
	}

	/**
	 * Returns the number of add outsourced activitieses where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add outsourced activitieses
	 */
	@Override
	public int countBygetJanaac_OutSrc_Id(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaac_OutSrc_Id;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDOUTSOURCEDACTIVITIES_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_OUTSRC_ID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_OUTSRC_ID_JANAACAPPLICATIONID_2 =
			"addOutsourcedActivities.janaacApplicationId = ?";

	public AddOutsourcedActivitiesPersistenceImpl() {
		setModelClass(AddOutsourcedActivities.class);

		setModelImplClass(AddOutsourcedActivitiesImpl.class);
		setModelPKClass(long.class);

		setTable(AddOutsourcedActivitiesTable.INSTANCE);
	}

	/**
	 * Caches the add outsourced activities in the entity cache if it is enabled.
	 *
	 * @param addOutsourcedActivities the add outsourced activities
	 */
	@Override
	public void cacheResult(AddOutsourcedActivities addOutsourcedActivities) {
		entityCache.putResult(
			AddOutsourcedActivitiesImpl.class,
			addOutsourcedActivities.getPrimaryKey(), addOutsourcedActivities);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add outsourced activitieses in the entity cache if it is enabled.
	 *
	 * @param addOutsourcedActivitieses the add outsourced activitieses
	 */
	@Override
	public void cacheResult(
		List<AddOutsourcedActivities> addOutsourcedActivitieses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addOutsourcedActivitieses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddOutsourcedActivities addOutsourcedActivities :
				addOutsourcedActivitieses) {

			if (entityCache.getResult(
					AddOutsourcedActivitiesImpl.class,
					addOutsourcedActivities.getPrimaryKey()) == null) {

				cacheResult(addOutsourcedActivities);
			}
		}
	}

	/**
	 * Clears the cache for all add outsourced activitieses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddOutsourcedActivitiesImpl.class);

		finderCache.clearCache(AddOutsourcedActivitiesImpl.class);
	}

	/**
	 * Clears the cache for the add outsourced activities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddOutsourcedActivities addOutsourcedActivities) {
		entityCache.removeResult(
			AddOutsourcedActivitiesImpl.class, addOutsourcedActivities);
	}

	@Override
	public void clearCache(
		List<AddOutsourcedActivities> addOutsourcedActivitieses) {

		for (AddOutsourcedActivities addOutsourcedActivities :
				addOutsourcedActivitieses) {

			entityCache.removeResult(
				AddOutsourcedActivitiesImpl.class, addOutsourcedActivities);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddOutsourcedActivitiesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddOutsourcedActivitiesImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add outsourced activities with the primary key. Does not add the add outsourced activities to the database.
	 *
	 * @param addOutsourcedActivitiesId the primary key for the new add outsourced activities
	 * @return the new add outsourced activities
	 */
	@Override
	public AddOutsourcedActivities create(long addOutsourcedActivitiesId) {
		AddOutsourcedActivities addOutsourcedActivities =
			new AddOutsourcedActivitiesImpl();

		addOutsourcedActivities.setNew(true);
		addOutsourcedActivities.setPrimaryKey(addOutsourcedActivitiesId);

		addOutsourcedActivities.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addOutsourcedActivities;
	}

	/**
	 * Removes the add outsourced activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities that was removed
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public AddOutsourcedActivities remove(long addOutsourcedActivitiesId)
		throws NoSuchAddOutsourcedActivitiesException {

		return remove((Serializable)addOutsourcedActivitiesId);
	}

	/**
	 * Removes the add outsourced activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add outsourced activities
	 * @return the add outsourced activities that was removed
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public AddOutsourcedActivities remove(Serializable primaryKey)
		throws NoSuchAddOutsourcedActivitiesException {

		Session session = null;

		try {
			session = openSession();

			AddOutsourcedActivities addOutsourcedActivities =
				(AddOutsourcedActivities)session.get(
					AddOutsourcedActivitiesImpl.class, primaryKey);

			if (addOutsourcedActivities == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddOutsourcedActivitiesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addOutsourcedActivities);
		}
		catch (NoSuchAddOutsourcedActivitiesException noSuchEntityException) {
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
	protected AddOutsourcedActivities removeImpl(
		AddOutsourcedActivities addOutsourcedActivities) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addOutsourcedActivities)) {
				addOutsourcedActivities = (AddOutsourcedActivities)session.get(
					AddOutsourcedActivitiesImpl.class,
					addOutsourcedActivities.getPrimaryKeyObj());
			}

			if (addOutsourcedActivities != null) {
				session.delete(addOutsourcedActivities);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addOutsourcedActivities != null) {
			clearCache(addOutsourcedActivities);
		}

		return addOutsourcedActivities;
	}

	@Override
	public AddOutsourcedActivities updateImpl(
		AddOutsourcedActivities addOutsourcedActivities) {

		boolean isNew = addOutsourcedActivities.isNew();

		if (!(addOutsourcedActivities instanceof
				AddOutsourcedActivitiesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addOutsourcedActivities.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addOutsourcedActivities);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addOutsourcedActivities proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddOutsourcedActivities implementation " +
					addOutsourcedActivities.getClass());
		}

		AddOutsourcedActivitiesModelImpl addOutsourcedActivitiesModelImpl =
			(AddOutsourcedActivitiesModelImpl)addOutsourcedActivities;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addOutsourcedActivities.getCreateDate() == null)) {
			if (serviceContext == null) {
				addOutsourcedActivities.setCreateDate(date);
			}
			else {
				addOutsourcedActivities.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addOutsourcedActivitiesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addOutsourcedActivities.setModifiedDate(date);
			}
			else {
				addOutsourcedActivities.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addOutsourcedActivities);
			}
			else {
				addOutsourcedActivities =
					(AddOutsourcedActivities)session.merge(
						addOutsourcedActivities);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddOutsourcedActivitiesImpl.class, addOutsourcedActivitiesModelImpl,
			false, true);

		if (isNew) {
			addOutsourcedActivities.setNew(false);
		}

		addOutsourcedActivities.resetOriginalValues();

		return addOutsourcedActivities;
	}

	/**
	 * Returns the add outsourced activities with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add outsourced activities
	 * @return the add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public AddOutsourcedActivities findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddOutsourcedActivitiesException {

		AddOutsourcedActivities addOutsourcedActivities = fetchByPrimaryKey(
			primaryKey);

		if (addOutsourcedActivities == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddOutsourcedActivitiesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addOutsourcedActivities;
	}

	/**
	 * Returns the add outsourced activities with the primary key or throws a <code>NoSuchAddOutsourcedActivitiesException</code> if it could not be found.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities
	 * @throws NoSuchAddOutsourcedActivitiesException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public AddOutsourcedActivities findByPrimaryKey(
			long addOutsourcedActivitiesId)
		throws NoSuchAddOutsourcedActivitiesException {

		return findByPrimaryKey((Serializable)addOutsourcedActivitiesId);
	}

	/**
	 * Returns the add outsourced activities with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities, or <code>null</code> if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public AddOutsourcedActivities fetchByPrimaryKey(
		long addOutsourcedActivitiesId) {

		return fetchByPrimaryKey((Serializable)addOutsourcedActivitiesId);
	}

	/**
	 * Returns all the add outsourced activitieses.
	 *
	 * @return the add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findAll(
		int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add outsourced activitieses
	 */
	@Override
	public List<AddOutsourcedActivities> findAll(
		int start, int end,
		OrderByComparator<AddOutsourcedActivities> orderByComparator,
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

		List<AddOutsourcedActivities> list = null;

		if (useFinderCache) {
			list = (List<AddOutsourcedActivities>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDOUTSOURCEDACTIVITIES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDOUTSOURCEDACTIVITIES;

				sql = sql.concat(
					AddOutsourcedActivitiesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddOutsourcedActivities>)QueryUtil.list(
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
	 * Removes all the add outsourced activitieses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddOutsourcedActivities addOutsourcedActivities : findAll()) {
			remove(addOutsourcedActivities);
		}
	}

	/**
	 * Returns the number of add outsourced activitieses.
	 *
	 * @return the number of add outsourced activitieses
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
					_SQL_COUNT_ADDOUTSOURCEDACTIVITIES);

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
		return "addOutsourcedActivitiesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDOUTSOURCEDACTIVITIES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddOutsourcedActivitiesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add outsourced activities persistence.
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

		_finderPathWithPaginationFindBygetJanaac_OutSrc_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaac_OutSrc_Id",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_OutSrc_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJanaac_OutSrc_Id", new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaac_OutSrc_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_OutSrc_Id", new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddOutsourcedActivitiesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddOutsourcedActivitiesUtil.setPersistence(null);

		entityCache.removeCache(AddOutsourcedActivitiesImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ADDOUTSOURCEDACTIVITIES =
		"SELECT addOutsourcedActivities FROM AddOutsourcedActivities addOutsourcedActivities";

	private static final String _SQL_SELECT_ADDOUTSOURCEDACTIVITIES_WHERE =
		"SELECT addOutsourcedActivities FROM AddOutsourcedActivities addOutsourcedActivities WHERE ";

	private static final String _SQL_COUNT_ADDOUTSOURCEDACTIVITIES =
		"SELECT COUNT(addOutsourcedActivities) FROM AddOutsourcedActivities addOutsourcedActivities";

	private static final String _SQL_COUNT_ADDOUTSOURCEDACTIVITIES_WHERE =
		"SELECT COUNT(addOutsourcedActivities) FROM AddOutsourcedActivities addOutsourcedActivities WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addOutsourcedActivities.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddOutsourcedActivities exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddOutsourcedActivities exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddOutsourcedActivitiesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}