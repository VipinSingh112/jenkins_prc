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

import com.nbp.hsra.application.service.exception.NoSuchRadiationDevicesDetailAddException;
import com.nbp.hsra.application.service.model.RadiationDevicesDetailAdd;
import com.nbp.hsra.application.service.model.RadiationDevicesDetailAddTable;
import com.nbp.hsra.application.service.model.impl.RadiationDevicesDetailAddImpl;
import com.nbp.hsra.application.service.model.impl.RadiationDevicesDetailAddModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadiationDevicesDetailAddPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationDevicesDetailAddUtil;
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
 * The persistence implementation for the radiation devices detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadiationDevicesDetailAddPersistence.class)
public class RadiationDevicesDetailAddPersistenceImpl
	extends BasePersistenceImpl<RadiationDevicesDetailAdd>
	implements RadiationDevicesDetailAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadiationDevicesDetailAddUtil</code> to access the radiation devices detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadiationDevicesDetailAddImpl.class.getName();

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
	 * Returns all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId) {

		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of matching radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator,
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

		List<RadiationDevicesDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<RadiationDevicesDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RadiationDevicesDetailAdd radiationDevicesDetailAdd :
						list) {

					if (hsraApplicationId !=
							radiationDevicesDetailAdd.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_RADIATIONDEVICESDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(RadiationDevicesDetailAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<RadiationDevicesDetailAdd>)QueryUtil.list(
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
	 * Returns the first radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a matching radiation devices detail add could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesDetailAdd> orderByComparator)
		throws NoSuchRadiationDevicesDetailAddException {

		RadiationDevicesDetailAdd radiationDevicesDetailAdd =
			fetchBygetHsraById_First(hsraApplicationId, orderByComparator);

		if (radiationDevicesDetailAdd != null) {
			return radiationDevicesDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchRadiationDevicesDetailAddException(sb.toString());
	}

	/**
	 * Returns the first radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching radiation devices detail add, or <code>null</code> if a matching radiation devices detail add could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		List<RadiationDevicesDetailAdd> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a matching radiation devices detail add could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<RadiationDevicesDetailAdd> orderByComparator)
		throws NoSuchRadiationDevicesDetailAddException {

		RadiationDevicesDetailAdd radiationDevicesDetailAdd =
			fetchBygetHsraById_Last(hsraApplicationId, orderByComparator);

		if (radiationDevicesDetailAdd != null) {
			return radiationDevicesDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchRadiationDevicesDetailAddException(sb.toString());
	}

	/**
	 * Returns the last radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching radiation devices detail add, or <code>null</code> if a matching radiation devices detail add could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<RadiationDevicesDetailAdd> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the radiation devices detail adds before and after the current radiation devices detail add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the current radiation devices detail add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd[] findBygetHsraById_PrevAndNext(
			long radiationDevicesDetailAddId, long hsraApplicationId,
			OrderByComparator<RadiationDevicesDetailAdd> orderByComparator)
		throws NoSuchRadiationDevicesDetailAddException {

		RadiationDevicesDetailAdd radiationDevicesDetailAdd = findByPrimaryKey(
			radiationDevicesDetailAddId);

		Session session = null;

		try {
			session = openSession();

			RadiationDevicesDetailAdd[] array =
				new RadiationDevicesDetailAddImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, radiationDevicesDetailAdd, hsraApplicationId,
				orderByComparator, true);

			array[1] = radiationDevicesDetailAdd;

			array[2] = getBygetHsraById_PrevAndNext(
				session, radiationDevicesDetailAdd, hsraApplicationId,
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

	protected RadiationDevicesDetailAdd getBygetHsraById_PrevAndNext(
		Session session, RadiationDevicesDetailAdd radiationDevicesDetailAdd,
		long hsraApplicationId,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_RADIATIONDEVICESDETAILADD_WHERE);

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
			sb.append(RadiationDevicesDetailAddModelImpl.ORDER_BY_JPQL);
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
						radiationDevicesDetailAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<RadiationDevicesDetailAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the radiation devices detail adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (RadiationDevicesDetailAdd radiationDevicesDetailAdd :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(radiationDevicesDetailAdd);
		}
	}

	/**
	 * Returns the number of radiation devices detail adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation devices detail adds
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIATIONDEVICESDETAILADD_WHERE);

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
		"radiationDevicesDetailAdd.hsraApplicationId = ?";

	public RadiationDevicesDetailAddPersistenceImpl() {
		setModelClass(RadiationDevicesDetailAdd.class);

		setModelImplClass(RadiationDevicesDetailAddImpl.class);
		setModelPKClass(long.class);

		setTable(RadiationDevicesDetailAddTable.INSTANCE);
	}

	/**
	 * Caches the radiation devices detail add in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesDetailAdd the radiation devices detail add
	 */
	@Override
	public void cacheResult(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		entityCache.putResult(
			RadiationDevicesDetailAddImpl.class,
			radiationDevicesDetailAdd.getPrimaryKey(),
			radiationDevicesDetailAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radiation devices detail adds in the entity cache if it is enabled.
	 *
	 * @param radiationDevicesDetailAdds the radiation devices detail adds
	 */
	@Override
	public void cacheResult(
		List<RadiationDevicesDetailAdd> radiationDevicesDetailAdds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radiationDevicesDetailAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadiationDevicesDetailAdd radiationDevicesDetailAdd :
				radiationDevicesDetailAdds) {

			if (entityCache.getResult(
					RadiationDevicesDetailAddImpl.class,
					radiationDevicesDetailAdd.getPrimaryKey()) == null) {

				cacheResult(radiationDevicesDetailAdd);
			}
		}
	}

	/**
	 * Clears the cache for all radiation devices detail adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadiationDevicesDetailAddImpl.class);

		finderCache.clearCache(RadiationDevicesDetailAddImpl.class);
	}

	/**
	 * Clears the cache for the radiation devices detail add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		entityCache.removeResult(
			RadiationDevicesDetailAddImpl.class, radiationDevicesDetailAdd);
	}

	@Override
	public void clearCache(
		List<RadiationDevicesDetailAdd> radiationDevicesDetailAdds) {

		for (RadiationDevicesDetailAdd radiationDevicesDetailAdd :
				radiationDevicesDetailAdds) {

			entityCache.removeResult(
				RadiationDevicesDetailAddImpl.class, radiationDevicesDetailAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadiationDevicesDetailAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RadiationDevicesDetailAddImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new radiation devices detail add with the primary key. Does not add the radiation devices detail add to the database.
	 *
	 * @param radiationDevicesDetailAddId the primary key for the new radiation devices detail add
	 * @return the new radiation devices detail add
	 */
	@Override
	public RadiationDevicesDetailAdd create(long radiationDevicesDetailAddId) {
		RadiationDevicesDetailAdd radiationDevicesDetailAdd =
			new RadiationDevicesDetailAddImpl();

		radiationDevicesDetailAdd.setNew(true);
		radiationDevicesDetailAdd.setPrimaryKey(radiationDevicesDetailAddId);

		radiationDevicesDetailAdd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return radiationDevicesDetailAdd;
	}

	/**
	 * Removes the radiation devices detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add that was removed
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd remove(long radiationDevicesDetailAddId)
		throws NoSuchRadiationDevicesDetailAddException {

		return remove((Serializable)radiationDevicesDetailAddId);
	}

	/**
	 * Removes the radiation devices detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radiation devices detail add
	 * @return the radiation devices detail add that was removed
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd remove(Serializable primaryKey)
		throws NoSuchRadiationDevicesDetailAddException {

		Session session = null;

		try {
			session = openSession();

			RadiationDevicesDetailAdd radiationDevicesDetailAdd =
				(RadiationDevicesDetailAdd)session.get(
					RadiationDevicesDetailAddImpl.class, primaryKey);

			if (radiationDevicesDetailAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadiationDevicesDetailAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radiationDevicesDetailAdd);
		}
		catch (NoSuchRadiationDevicesDetailAddException noSuchEntityException) {
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
	protected RadiationDevicesDetailAdd removeImpl(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radiationDevicesDetailAdd)) {
				radiationDevicesDetailAdd =
					(RadiationDevicesDetailAdd)session.get(
						RadiationDevicesDetailAddImpl.class,
						radiationDevicesDetailAdd.getPrimaryKeyObj());
			}

			if (radiationDevicesDetailAdd != null) {
				session.delete(radiationDevicesDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radiationDevicesDetailAdd != null) {
			clearCache(radiationDevicesDetailAdd);
		}

		return radiationDevicesDetailAdd;
	}

	@Override
	public RadiationDevicesDetailAdd updateImpl(
		RadiationDevicesDetailAdd radiationDevicesDetailAdd) {

		boolean isNew = radiationDevicesDetailAdd.isNew();

		if (!(radiationDevicesDetailAdd instanceof
				RadiationDevicesDetailAddModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radiationDevicesDetailAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radiationDevicesDetailAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radiationDevicesDetailAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadiationDevicesDetailAdd implementation " +
					radiationDevicesDetailAdd.getClass());
		}

		RadiationDevicesDetailAddModelImpl radiationDevicesDetailAddModelImpl =
			(RadiationDevicesDetailAddModelImpl)radiationDevicesDetailAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radiationDevicesDetailAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				radiationDevicesDetailAdd.setCreateDate(date);
			}
			else {
				radiationDevicesDetailAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radiationDevicesDetailAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radiationDevicesDetailAdd.setModifiedDate(date);
			}
			else {
				radiationDevicesDetailAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radiationDevicesDetailAdd);
			}
			else {
				radiationDevicesDetailAdd =
					(RadiationDevicesDetailAdd)session.merge(
						radiationDevicesDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadiationDevicesDetailAddImpl.class,
			radiationDevicesDetailAddModelImpl, false, true);

		if (isNew) {
			radiationDevicesDetailAdd.setNew(false);
		}

		radiationDevicesDetailAdd.resetOriginalValues();

		return radiationDevicesDetailAdd;
	}

	/**
	 * Returns the radiation devices detail add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radiation devices detail add
	 * @return the radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadiationDevicesDetailAddException {

		RadiationDevicesDetailAdd radiationDevicesDetailAdd = fetchByPrimaryKey(
			primaryKey);

		if (radiationDevicesDetailAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadiationDevicesDetailAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radiationDevicesDetailAdd;
	}

	/**
	 * Returns the radiation devices detail add with the primary key or throws a <code>NoSuchRadiationDevicesDetailAddException</code> if it could not be found.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add
	 * @throws NoSuchRadiationDevicesDetailAddException if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd findByPrimaryKey(
			long radiationDevicesDetailAddId)
		throws NoSuchRadiationDevicesDetailAddException {

		return findByPrimaryKey((Serializable)radiationDevicesDetailAddId);
	}

	/**
	 * Returns the radiation devices detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationDevicesDetailAddId the primary key of the radiation devices detail add
	 * @return the radiation devices detail add, or <code>null</code> if a radiation devices detail add with the primary key could not be found
	 */
	@Override
	public RadiationDevicesDetailAdd fetchByPrimaryKey(
		long radiationDevicesDetailAddId) {

		return fetchByPrimaryKey((Serializable)radiationDevicesDetailAddId);
	}

	/**
	 * Returns all the radiation devices detail adds.
	 *
	 * @return the radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @return the range of radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation devices detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationDevicesDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation devices detail adds
	 * @param end the upper bound of the range of radiation devices detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation devices detail adds
	 */
	@Override
	public List<RadiationDevicesDetailAdd> findAll(
		int start, int end,
		OrderByComparator<RadiationDevicesDetailAdd> orderByComparator,
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

		List<RadiationDevicesDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<RadiationDevicesDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIATIONDEVICESDETAILADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIATIONDEVICESDETAILADD;

				sql = sql.concat(
					RadiationDevicesDetailAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadiationDevicesDetailAdd>)QueryUtil.list(
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
	 * Removes all the radiation devices detail adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadiationDevicesDetailAdd radiationDevicesDetailAdd : findAll()) {
			remove(radiationDevicesDetailAdd);
		}
	}

	/**
	 * Returns the number of radiation devices detail adds.
	 *
	 * @return the number of radiation devices detail adds
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
					_SQL_COUNT_RADIATIONDEVICESDETAILADD);

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
		return "radiationDevicesDetailAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIATIONDEVICESDETAILADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadiationDevicesDetailAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radiation devices detail add persistence.
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

		RadiationDevicesDetailAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadiationDevicesDetailAddUtil.setPersistence(null);

		entityCache.removeCache(RadiationDevicesDetailAddImpl.class.getName());
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

	private static final String _SQL_SELECT_RADIATIONDEVICESDETAILADD =
		"SELECT radiationDevicesDetailAdd FROM RadiationDevicesDetailAdd radiationDevicesDetailAdd";

	private static final String _SQL_SELECT_RADIATIONDEVICESDETAILADD_WHERE =
		"SELECT radiationDevicesDetailAdd FROM RadiationDevicesDetailAdd radiationDevicesDetailAdd WHERE ";

	private static final String _SQL_COUNT_RADIATIONDEVICESDETAILADD =
		"SELECT COUNT(radiationDevicesDetailAdd) FROM RadiationDevicesDetailAdd radiationDevicesDetailAdd";

	private static final String _SQL_COUNT_RADIATIONDEVICESDETAILADD_WHERE =
		"SELECT COUNT(radiationDevicesDetailAdd) FROM RadiationDevicesDetailAdd radiationDevicesDetailAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"radiationDevicesDetailAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadiationDevicesDetailAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadiationDevicesDetailAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationDevicesDetailAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}