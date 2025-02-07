/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchRadiationDevicesAddException;
import com.nbp.hsra.application.service.model.RadiationDevicesAdd;
import com.nbp.hsra.application.service.model.RadiationDevicesAddTable;
import com.nbp.hsra.application.service.model.impl.RadiationDevicesAddImpl;
import com.nbp.hsra.application.service.model.impl.RadiationDevicesAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadiationDevicesAddPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationDevicesAddUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the radiation devices add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadiationDevicesAddPersistence.class)
public class RadiationDevicesAddPersistenceImpl
	extends BasePersistenceImpl<RadiationDevicesAdd>
	implements RadiationDevicesAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadiationDevicesAddUtil</code> to access the radiation devices add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadiationDevicesAddImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetHsraById;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of matching radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraById;
				finderArgs = new Object[] {hsraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraById;
			finderArgs = new Object[] {
				hsraApplicationId, start, end, orderByComparator
			};
		}

		List<RadiationDevicesAdd> list = null;

		if (useFinderCache) {
			list = (List<RadiationDevicesAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RadiationDevicesAdd radiationDevicesAdd : list) {
					if (hsraApplicationId !=
							radiationDevicesAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_RADIATIONDEVICESADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RadiationDevicesAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<RadiationDevicesAdd>)QueryUtil.list(
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
	 * Returns the first radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a matching radiation devices add could not be found
	 */
	@Override
	public RadiationDevicesAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesAdd> orderByComparator)
		throws NoSuchRadiationDevicesAddException {

		RadiationDevicesAdd radiationDevicesAdd = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (radiationDevicesAdd != null) {
			return radiationDevicesAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchRadiationDevicesAddException(sb.toString());
	}

	/**
	 * Returns the first radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices add, or <code>null</code> if a matching radiation devices add could not be found
	 */
	@Override
	public RadiationDevicesAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		List<RadiationDevicesAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a matching radiation devices add could not be found
	 */
	@Override
	public RadiationDevicesAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesAdd> orderByComparator)
		throws NoSuchRadiationDevicesAddException {

		RadiationDevicesAdd radiationDevicesAdd = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (radiationDevicesAdd != null) {
			return radiationDevicesAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchRadiationDevicesAddException(sb.toString());
	}

	/**
	 * Returns the last radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices add, or <code>null</code> if a matching radiation devices add could not be found
	 */
	@Override
	public RadiationDevicesAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<RadiationDevicesAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the radiation devices adds before and after the current radiation devices add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radiationDevicesAddId the primary key of the current radiation devices add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesAdd[] findBygetHsraById_PrevAndNext(
			long radiationDevicesAddId, long hsraApplicationId,
			OrderByComparator<RadiationDevicesAdd> orderByComparator)
		throws NoSuchRadiationDevicesAddException {

		RadiationDevicesAdd radiationDevicesAdd = findByPrimaryKey(
			radiationDevicesAddId);

		Session session = null;

		try {
			session = openSession();

			RadiationDevicesAdd[] array = new RadiationDevicesAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, radiationDevicesAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = radiationDevicesAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, radiationDevicesAdd, hsraApplicationId,
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

	protected RadiationDevicesAdd getBygetHsraById_PrevAndNext(
		Session session, RadiationDevicesAdd radiationDevicesAdd,
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_RADIATIONDEVICESADD_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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
			sb.append(RadiationDevicesAddModelImpl.ORDER_BY_JPQL);
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
						radiationDevicesAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RadiationDevicesAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the radiation devices adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (RadiationDevicesAdd radiationDevicesAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(radiationDevicesAdd);
		}
	}

	/**
	 * Returns the number of radiation devices adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation devices adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIATIONDEVICESADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"radiationDevicesAdd.hsraApplicationId = ?";

	public RadiationDevicesAddPersistenceImpl() {
		setModelClass(RadiationDevicesAdd.class);

		setModelImplClass(RadiationDevicesAddImpl.class);
		setModelPKClass(long.class);

		setTable(RadiationDevicesAddTable.INSTANCE);
	}

	/**
	 * Caches the radiation devices add in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesAdd the radiation devices add
	 */
	@Override
	public void cacheResult(RadiationDevicesAdd radiationDevicesAdd) {
		entityCache.putResult(
			RadiationDevicesAddImpl.class, radiationDevicesAdd.getPrimaryKey(),
			radiationDevicesAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radiation devices adds in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesAdds the radiation devices adds
	 */
	@Override
	public void cacheResult(List<RadiationDevicesAdd> radiationDevicesAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radiationDevicesAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadiationDevicesAdd radiationDevicesAdd : radiationDevicesAdds) {
			if (entityCache.getResult(
					RadiationDevicesAddImpl.class,
					radiationDevicesAdd.getPrimaryKey()) == null) {

				cacheResult(radiationDevicesAdd);
			}
		}
	}

	/**
	 * Clears the cache for all radiation devices adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadiationDevicesAddImpl.class);

		finderCache.clearCache(RadiationDevicesAddImpl.class);
	}

	/**
	 * Clears the cache for the radiation devices add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RadiationDevicesAdd radiationDevicesAdd) {
		entityCache.removeResult(
			RadiationDevicesAddImpl.class, radiationDevicesAdd);
	}

	@Override
	public void clearCache(List<RadiationDevicesAdd> radiationDevicesAdds) {
		for (RadiationDevicesAdd radiationDevicesAdd : radiationDevicesAdds) {
			entityCache.removeResult(
				RadiationDevicesAddImpl.class, radiationDevicesAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadiationDevicesAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RadiationDevicesAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new radiation devices add with the primary key. Does not add the radiation devices add to the database.
	 *
	 * @param radiationDevicesAddId the primary key for the new radiation devices add
	 * @return the new radiation devices add
	 */
	@Override
	public RadiationDevicesAdd create(long radiationDevicesAddId) {
		RadiationDevicesAdd radiationDevicesAdd = new RadiationDevicesAddImpl();

		radiationDevicesAdd.setNew(true);
		radiationDevicesAdd.setPrimaryKey(radiationDevicesAddId);

		radiationDevicesAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return radiationDevicesAdd;
	}

	/**
	 * Removes the radiation devices add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add that was removed
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesAdd remove(long radiationDevicesAddId)
		throws NoSuchRadiationDevicesAddException {

		return remove((Serializable)radiationDevicesAddId);
	}

	/**
	 * Removes the radiation devices add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radiation devices add
	 * @return the radiation devices add that was removed
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesAdd remove(Serializable primaryKey)
		throws NoSuchRadiationDevicesAddException {

		Session session = null;

		try {
			session = openSession();

			RadiationDevicesAdd radiationDevicesAdd =
				(RadiationDevicesAdd)session.get(
					RadiationDevicesAddImpl.class, primaryKey);

			if (radiationDevicesAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadiationDevicesAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radiationDevicesAdd);
		}
		catch (NoSuchRadiationDevicesAddException noSuchEntityException) {
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
	protected RadiationDevicesAdd removeImpl(
		RadiationDevicesAdd radiationDevicesAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radiationDevicesAdd)) {
				radiationDevicesAdd = (RadiationDevicesAdd)session.get(
					RadiationDevicesAddImpl.class,
					radiationDevicesAdd.getPrimaryKeyObj());
			}

			if (radiationDevicesAdd != null) {
				session.delete(radiationDevicesAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radiationDevicesAdd != null) {
			clearCache(radiationDevicesAdd);
		}

		return radiationDevicesAdd;
	}

	@Override
	public RadiationDevicesAdd updateImpl(
		RadiationDevicesAdd radiationDevicesAdd) {

		boolean isNew = radiationDevicesAdd.isNew();

		if (!(radiationDevicesAdd instanceof RadiationDevicesAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radiationDevicesAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radiationDevicesAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radiationDevicesAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadiationDevicesAdd implementation " +
					radiationDevicesAdd.getClass());
		}

		RadiationDevicesAddModelImpl radiationDevicesAddModelImpl =
			(RadiationDevicesAddModelImpl)radiationDevicesAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radiationDevicesAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				radiationDevicesAdd.setCreateDate(date);
			}
			else {
				radiationDevicesAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radiationDevicesAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radiationDevicesAdd.setModifiedDate(date);
			}
			else {
				radiationDevicesAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radiationDevicesAdd);
			}
			else {
				radiationDevicesAdd = (RadiationDevicesAdd)session.merge(
					radiationDevicesAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadiationDevicesAddImpl.class, radiationDevicesAddModelImpl, false,
			true);

		if (isNew) {
			radiationDevicesAdd.setNew(false);
		}

		radiationDevicesAdd.resetOriginalValues();

		return radiationDevicesAdd;
	}

	/**
	 * Returns the radiation devices add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radiation devices add
	 * @return the radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadiationDevicesAddException {

		RadiationDevicesAdd radiationDevicesAdd = fetchByPrimaryKey(primaryKey);

		if (radiationDevicesAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadiationDevicesAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radiationDevicesAdd;
	}

	/**
	 * Returns the radiation devices add with the primary key or throws a <code>NoSuchRadiationDevicesAddException</code> if it could not be found.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add
	 * @throws NoSuchRadiationDevicesAddException if a radiation devices add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesAdd findByPrimaryKey(long radiationDevicesAddId)
		throws NoSuchRadiationDevicesAddException {

		return findByPrimaryKey((Serializable)radiationDevicesAddId);
	}

	/**
	 * Returns the radiation devices add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDevicesAddId the primary key of the radiation devices add
	 * @return the radiation devices add, or <code>null</code> if a radiation devices add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesAdd fetchByPrimaryKey(long radiationDevicesAddId) {
		return fetchByPrimaryKey((Serializable)radiationDevicesAddId);
	}

	/**
	 * Returns all the radiation devices adds.
	 *
	 * @return the radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @return the range of radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation devices adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices adds
	 * @param end the upper bound of the range of radiation devices adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation devices adds
	 */
	@Override
	public List<RadiationDevicesAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesAdd> orderByComparator,
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

		List<RadiationDevicesAdd> list = null;

		if (useFinderCache) {
			list = (List<RadiationDevicesAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIATIONDEVICESADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIATIONDEVICESADD;

				sql = sql.concat(RadiationDevicesAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadiationDevicesAdd>)QueryUtil.list(
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
	 * Removes all the radiation devices adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadiationDevicesAdd radiationDevicesAdd : findAll()) {
			remove(radiationDevicesAdd);
		}
	}

	/**
	 * Returns the number of radiation devices adds.
	 *
	 * @return the number of radiation devices adds
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
					_SQL_COUNT_RADIATIONDEVICESADD);

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
		return "radiationDevicesAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIATIONDEVICESADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadiationDevicesAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radiation devices add persistence.
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

		_finderPathWithPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"hsraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		RadiationDevicesAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadiationDevicesAddUtil.setPersistence(null);

		entityCache.removeCache(RadiationDevicesAddImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RADIATIONDEVICESADD =
		"SELECT radiationDevicesAdd FROM RadiationDevicesAdd radiationDevicesAdd";

	private static final String _SQL_SELECT_RADIATIONDEVICESADD_WHERE =
		"SELECT radiationDevicesAdd FROM RadiationDevicesAdd radiationDevicesAdd WHERE ";

	private static final String _SQL_COUNT_RADIATIONDEVICESADD =
		"SELECT COUNT(radiationDevicesAdd) FROM RadiationDevicesAdd radiationDevicesAdd";

	private static final String _SQL_COUNT_RADIATIONDEVICESADD_WHERE =
		"SELECT COUNT(radiationDevicesAdd) FROM RadiationDevicesAdd radiationDevicesAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "radiationDevicesAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadiationDevicesAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadiationDevicesAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationDevicesAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}