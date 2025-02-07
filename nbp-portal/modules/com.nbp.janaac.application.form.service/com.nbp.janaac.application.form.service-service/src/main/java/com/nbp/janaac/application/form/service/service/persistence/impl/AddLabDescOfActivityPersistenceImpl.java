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
import com.liferay.portal.kernel.util.SetUtil;

import com.nbp.janaac.application.form.service.exception.NoSuchAddLabDescOfActivityException;
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivity;
import com.nbp.janaac.application.form.service.model.AddLabDescOfActivityTable;
import com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityImpl;
import com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.AddLabDescOfActivityPersistence;
import com.nbp.janaac.application.form.service.service.persistence.AddLabDescOfActivityUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the add lab desc of activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AddLabDescOfActivityPersistence.class)
public class AddLabDescOfActivityPersistenceImpl
	extends BasePersistenceImpl<AddLabDescOfActivity>
	implements AddLabDescOfActivityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AddLabDescOfActivityUtil</code> to access the add lab desc of activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AddLabDescOfActivityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetJanaacById;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacById;
	private FinderPath _finderPathCountBygetJanaacById;

	/**
	 * Returns all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId) {

		return findBygetJanaacById(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of matching add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaacById(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return findBygetJanaacById(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findBygetJanaacById(
		long janaacApplicationId, int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaacById;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacById;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<AddLabDescOfActivity> list = null;

		if (useFinderCache) {
			list = (List<AddLabDescOfActivity>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AddLabDescOfActivity addLabDescOfActivity : list) {
					if (janaacApplicationId !=
							addLabDescOfActivity.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_ADDLABDESCOFACTIVITY_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AddLabDescOfActivityModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<AddLabDescOfActivity>)QueryUtil.list(
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
	 * Returns the first add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a matching add lab desc of activity could not be found
	 */
	@Override
	public AddLabDescOfActivity findBygetJanaacById_First(
			long janaacApplicationId,
			OrderByComparator<AddLabDescOfActivity> orderByComparator)
		throws NoSuchAddLabDescOfActivityException {

		AddLabDescOfActivity addLabDescOfActivity = fetchBygetJanaacById_First(
			janaacApplicationId, orderByComparator);

		if (addLabDescOfActivity != null) {
			return addLabDescOfActivity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabDescOfActivityException(sb.toString());
	}

	/**
	 * Returns the first add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching add lab desc of activity, or <code>null</code> if a matching add lab desc of activity could not be found
	 */
	@Override
	public AddLabDescOfActivity fetchBygetJanaacById_First(
		long janaacApplicationId,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		List<AddLabDescOfActivity> list = findBygetJanaacById(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a matching add lab desc of activity could not be found
	 */
	@Override
	public AddLabDescOfActivity findBygetJanaacById_Last(
			long janaacApplicationId,
			OrderByComparator<AddLabDescOfActivity> orderByComparator)
		throws NoSuchAddLabDescOfActivityException {

		AddLabDescOfActivity addLabDescOfActivity = fetchBygetJanaacById_Last(
			janaacApplicationId, orderByComparator);

		if (addLabDescOfActivity != null) {
			return addLabDescOfActivity;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchAddLabDescOfActivityException(sb.toString());
	}

	/**
	 * Returns the last add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching add lab desc of activity, or <code>null</code> if a matching add lab desc of activity could not be found
	 */
	@Override
	public AddLabDescOfActivity fetchBygetJanaacById_Last(
		long janaacApplicationId,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		int count = countBygetJanaacById(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<AddLabDescOfActivity> list = findBygetJanaacById(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the add lab desc of activities before and after the current add lab desc of activity in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param addLabDescOfActivityId the primary key of the current add lab desc of activity
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public AddLabDescOfActivity[] findBygetJanaacById_PrevAndNext(
			long addLabDescOfActivityId, long janaacApplicationId,
			OrderByComparator<AddLabDescOfActivity> orderByComparator)
		throws NoSuchAddLabDescOfActivityException {

		AddLabDescOfActivity addLabDescOfActivity = findByPrimaryKey(
			addLabDescOfActivityId);

		Session session = null;

		try {
			session = openSession();

			AddLabDescOfActivity[] array = new AddLabDescOfActivityImpl[3];

			array[0] = getBygetJanaacById_PrevAndNext(
				session, addLabDescOfActivity, janaacApplicationId,
				orderByComparator, true);

			array[1] = addLabDescOfActivity;

			array[2] = getBygetJanaacById_PrevAndNext(
				session, addLabDescOfActivity, janaacApplicationId,
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

	protected AddLabDescOfActivity getBygetJanaacById_PrevAndNext(
		Session session, AddLabDescOfActivity addLabDescOfActivity,
		long janaacApplicationId,
		OrderByComparator<AddLabDescOfActivity> orderByComparator,
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

		sb.append(_SQL_SELECT_ADDLABDESCOFACTIVITY_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
			sb.append(AddLabDescOfActivityModelImpl.ORDER_BY_JPQL);
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
						addLabDescOfActivity)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AddLabDescOfActivity> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the add lab desc of activities where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaacById(long janaacApplicationId) {
		for (AddLabDescOfActivity addLabDescOfActivity :
				findBygetJanaacById(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(addLabDescOfActivity);
		}
	}

	/**
	 * Returns the number of add lab desc of activities where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching add lab desc of activities
	 */
	@Override
	public int countBygetJanaacById(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaacById;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ADDLABDESCOFACTIVITY_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETJANAACBYID_JANAACAPPLICATIONID_2 =
			"addLabDescOfActivity.janaacApplicationId = ?";

	public AddLabDescOfActivityPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("number", "number_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AddLabDescOfActivity.class);

		setModelImplClass(AddLabDescOfActivityImpl.class);
		setModelPKClass(long.class);

		setTable(AddLabDescOfActivityTable.INSTANCE);
	}

	/**
	 * Caches the add lab desc of activity in the entity cache if it is enabled.
	 *
	 * @param addLabDescOfActivity the add lab desc of activity
	 */
	@Override
	public void cacheResult(AddLabDescOfActivity addLabDescOfActivity) {
		entityCache.putResult(
			AddLabDescOfActivityImpl.class,
			addLabDescOfActivity.getPrimaryKey(), addLabDescOfActivity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the add lab desc of activities in the entity cache if it is enabled.
	 *
	 * @param addLabDescOfActivities the add lab desc of activities
	 */
	@Override
	public void cacheResult(List<AddLabDescOfActivity> addLabDescOfActivities) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (addLabDescOfActivities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AddLabDescOfActivity addLabDescOfActivity :
				addLabDescOfActivities) {

			if (entityCache.getResult(
					AddLabDescOfActivityImpl.class,
					addLabDescOfActivity.getPrimaryKey()) == null) {

				cacheResult(addLabDescOfActivity);
			}
		}
	}

	/**
	 * Clears the cache for all add lab desc of activities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AddLabDescOfActivityImpl.class);

		finderCache.clearCache(AddLabDescOfActivityImpl.class);
	}

	/**
	 * Clears the cache for the add lab desc of activity.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AddLabDescOfActivity addLabDescOfActivity) {
		entityCache.removeResult(
			AddLabDescOfActivityImpl.class, addLabDescOfActivity);
	}

	@Override
	public void clearCache(List<AddLabDescOfActivity> addLabDescOfActivities) {
		for (AddLabDescOfActivity addLabDescOfActivity :
				addLabDescOfActivities) {

			entityCache.removeResult(
				AddLabDescOfActivityImpl.class, addLabDescOfActivity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AddLabDescOfActivityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AddLabDescOfActivityImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new add lab desc of activity with the primary key. Does not add the add lab desc of activity to the database.
	 *
	 * @param addLabDescOfActivityId the primary key for the new add lab desc of activity
	 * @return the new add lab desc of activity
	 */
	@Override
	public AddLabDescOfActivity create(long addLabDescOfActivityId) {
		AddLabDescOfActivity addLabDescOfActivity =
			new AddLabDescOfActivityImpl();

		addLabDescOfActivity.setNew(true);
		addLabDescOfActivity.setPrimaryKey(addLabDescOfActivityId);

		addLabDescOfActivity.setCompanyId(CompanyThreadLocal.getCompanyId());

		return addLabDescOfActivity;
	}

	/**
	 * Removes the add lab desc of activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity that was removed
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public AddLabDescOfActivity remove(long addLabDescOfActivityId)
		throws NoSuchAddLabDescOfActivityException {

		return remove((Serializable)addLabDescOfActivityId);
	}

	/**
	 * Removes the add lab desc of activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the add lab desc of activity
	 * @return the add lab desc of activity that was removed
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public AddLabDescOfActivity remove(Serializable primaryKey)
		throws NoSuchAddLabDescOfActivityException {

		Session session = null;

		try {
			session = openSession();

			AddLabDescOfActivity addLabDescOfActivity =
				(AddLabDescOfActivity)session.get(
					AddLabDescOfActivityImpl.class, primaryKey);

			if (addLabDescOfActivity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAddLabDescOfActivityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(addLabDescOfActivity);
		}
		catch (NoSuchAddLabDescOfActivityException noSuchEntityException) {
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
	protected AddLabDescOfActivity removeImpl(
		AddLabDescOfActivity addLabDescOfActivity) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(addLabDescOfActivity)) {
				addLabDescOfActivity = (AddLabDescOfActivity)session.get(
					AddLabDescOfActivityImpl.class,
					addLabDescOfActivity.getPrimaryKeyObj());
			}

			if (addLabDescOfActivity != null) {
				session.delete(addLabDescOfActivity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (addLabDescOfActivity != null) {
			clearCache(addLabDescOfActivity);
		}

		return addLabDescOfActivity;
	}

	@Override
	public AddLabDescOfActivity updateImpl(
		AddLabDescOfActivity addLabDescOfActivity) {

		boolean isNew = addLabDescOfActivity.isNew();

		if (!(addLabDescOfActivity instanceof AddLabDescOfActivityModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(addLabDescOfActivity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					addLabDescOfActivity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in addLabDescOfActivity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AddLabDescOfActivity implementation " +
					addLabDescOfActivity.getClass());
		}

		AddLabDescOfActivityModelImpl addLabDescOfActivityModelImpl =
			(AddLabDescOfActivityModelImpl)addLabDescOfActivity;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (addLabDescOfActivity.getCreateDate() == null)) {
			if (serviceContext == null) {
				addLabDescOfActivity.setCreateDate(date);
			}
			else {
				addLabDescOfActivity.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!addLabDescOfActivityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				addLabDescOfActivity.setModifiedDate(date);
			}
			else {
				addLabDescOfActivity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(addLabDescOfActivity);
			}
			else {
				addLabDescOfActivity = (AddLabDescOfActivity)session.merge(
					addLabDescOfActivity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AddLabDescOfActivityImpl.class, addLabDescOfActivityModelImpl,
			false, true);

		if (isNew) {
			addLabDescOfActivity.setNew(false);
		}

		addLabDescOfActivity.resetOriginalValues();

		return addLabDescOfActivity;
	}

	/**
	 * Returns the add lab desc of activity with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the add lab desc of activity
	 * @return the add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public AddLabDescOfActivity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAddLabDescOfActivityException {

		AddLabDescOfActivity addLabDescOfActivity = fetchByPrimaryKey(
			primaryKey);

		if (addLabDescOfActivity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAddLabDescOfActivityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return addLabDescOfActivity;
	}

	/**
	 * Returns the add lab desc of activity with the primary key or throws a <code>NoSuchAddLabDescOfActivityException</code> if it could not be found.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity
	 * @throws NoSuchAddLabDescOfActivityException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public AddLabDescOfActivity findByPrimaryKey(long addLabDescOfActivityId)
		throws NoSuchAddLabDescOfActivityException {

		return findByPrimaryKey((Serializable)addLabDescOfActivityId);
	}

	/**
	 * Returns the add lab desc of activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity, or <code>null</code> if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public AddLabDescOfActivity fetchByPrimaryKey(long addLabDescOfActivityId) {
		return fetchByPrimaryKey((Serializable)addLabDescOfActivityId);
	}

	/**
	 * Returns all the add lab desc of activities.
	 *
	 * @return the add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findAll(
		int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of add lab desc of activities
	 */
	@Override
	public List<AddLabDescOfActivity> findAll(
		int start, int end,
		OrderByComparator<AddLabDescOfActivity> orderByComparator,
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

		List<AddLabDescOfActivity> list = null;

		if (useFinderCache) {
			list = (List<AddLabDescOfActivity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ADDLABDESCOFACTIVITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ADDLABDESCOFACTIVITY;

				sql = sql.concat(AddLabDescOfActivityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AddLabDescOfActivity>)QueryUtil.list(
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
	 * Removes all the add lab desc of activities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AddLabDescOfActivity addLabDescOfActivity : findAll()) {
			remove(addLabDescOfActivity);
		}
	}

	/**
	 * Returns the number of add lab desc of activities.
	 *
	 * @return the number of add lab desc of activities
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
					_SQL_COUNT_ADDLABDESCOFACTIVITY);

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
		return "addLabDescOfActivityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ADDLABDESCOFACTIVITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AddLabDescOfActivityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the add lab desc of activity persistence.
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

		_finderPathWithPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaacById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaacById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaacById",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		AddLabDescOfActivityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AddLabDescOfActivityUtil.setPersistence(null);

		entityCache.removeCache(AddLabDescOfActivityImpl.class.getName());
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

	private static final String _SQL_SELECT_ADDLABDESCOFACTIVITY =
		"SELECT addLabDescOfActivity FROM AddLabDescOfActivity addLabDescOfActivity";

	private static final String _SQL_SELECT_ADDLABDESCOFACTIVITY_WHERE =
		"SELECT addLabDescOfActivity FROM AddLabDescOfActivity addLabDescOfActivity WHERE ";

	private static final String _SQL_COUNT_ADDLABDESCOFACTIVITY =
		"SELECT COUNT(addLabDescOfActivity) FROM AddLabDescOfActivity addLabDescOfActivity";

	private static final String _SQL_COUNT_ADDLABDESCOFACTIVITY_WHERE =
		"SELECT COUNT(addLabDescOfActivity) FROM AddLabDescOfActivity addLabDescOfActivity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"addLabDescOfActivity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AddLabDescOfActivity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AddLabDescOfActivity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AddLabDescOfActivityPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"number"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}