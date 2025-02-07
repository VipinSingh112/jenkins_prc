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

import com.nbp.hsra.application.service.exception.NoSuchGenEquipmentDataException;
import com.nbp.hsra.application.service.model.GenEquipmentData;
import com.nbp.hsra.application.service.model.GenEquipmentDataTable;
import com.nbp.hsra.application.service.model.impl.GenEquipmentDataImpl;
import com.nbp.hsra.application.service.model.impl.GenEquipmentDataModelImpl;
import com.nbp.hsra.application.service.service.persistence.GenEquipmentDataPersistence;
import com.nbp.hsra.application.service.service.persistence.GenEquipmentDataUtil;
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
 * The persistence implementation for the gen equipment data service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = GenEquipmentDataPersistence.class)
public class GenEquipmentDataPersistenceImpl
	extends BasePersistenceImpl<GenEquipmentData>
	implements GenEquipmentDataPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>GenEquipmentDataUtil</code> to access the gen equipment data persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		GenEquipmentDataImpl.class.getName();

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
	 * Returns all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findBygetHsraById(long hsraApplicationId) {
		return findBygetHsraById(
			hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of matching gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return findBygetHsraById(hsraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator,
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

		List<GenEquipmentData> list = null;

		if (useFinderCache) {
			list = (List<GenEquipmentData>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (GenEquipmentData genEquipmentData : list) {
					if (hsraApplicationId !=
							genEquipmentData.getHsraApplicationId()) {

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

			sb.append(_SQL_SELECT_GENEQUIPMENTDATA_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(GenEquipmentDataModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				list = (List<GenEquipmentData>)QueryUtil.list(
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
	 * Returns the first gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a matching gen equipment data could not be found
	 */
	@Override
	public GenEquipmentData findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<GenEquipmentData> orderByComparator)
		throws NoSuchGenEquipmentDataException {

		GenEquipmentData genEquipmentData = fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);

		if (genEquipmentData != null) {
			return genEquipmentData;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchGenEquipmentDataException(sb.toString());
	}

	/**
	 * Returns the first gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching gen equipment data, or <code>null</code> if a matching gen equipment data could not be found
	 */
	@Override
	public GenEquipmentData fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		List<GenEquipmentData> list = findBygetHsraById(
			hsraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a matching gen equipment data could not be found
	 */
	@Override
	public GenEquipmentData findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<GenEquipmentData> orderByComparator)
		throws NoSuchGenEquipmentDataException {

		GenEquipmentData genEquipmentData = fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);

		if (genEquipmentData != null) {
			return genEquipmentData;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("hsraApplicationId=");
		sb.append(hsraApplicationId);

		sb.append("}");

		throw new NoSuchGenEquipmentDataException(sb.toString());
	}

	/**
	 * Returns the last gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching gen equipment data, or <code>null</code> if a matching gen equipment data could not be found
	 */
	@Override
	public GenEquipmentData fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		int count = countBygetHsraById(hsraApplicationId);

		if (count == 0) {
			return null;
		}

		List<GenEquipmentData> list = findBygetHsraById(
			hsraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the gen equipment datas before and after the current gen equipment data in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param genEquipmentDataId the primary key of the current gen equipment data
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public GenEquipmentData[] findBygetHsraById_PrevAndNext(
			long genEquipmentDataId, long hsraApplicationId,
			OrderByComparator<GenEquipmentData> orderByComparator)
		throws NoSuchGenEquipmentDataException {

		GenEquipmentData genEquipmentData = findByPrimaryKey(
			genEquipmentDataId);

		Session session = null;

		try {
			session = openSession();

			GenEquipmentData[] array = new GenEquipmentDataImpl[3];

			array[0] = getBygetHsraById_PrevAndNext(
				session, genEquipmentData, hsraApplicationId, orderByComparator,
				true);

			array[1] = genEquipmentData;

			array[2] = getBygetHsraById_PrevAndNext(
				session, genEquipmentData, hsraApplicationId, orderByComparator,
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

	protected GenEquipmentData getBygetHsraById_PrevAndNext(
		Session session, GenEquipmentData genEquipmentData,
		long hsraApplicationId,
		OrderByComparator<GenEquipmentData> orderByComparator,
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

		sb.append(_SQL_SELECT_GENEQUIPMENTDATA_WHERE);

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
			sb.append(GenEquipmentDataModelImpl.ORDER_BY_JPQL);
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
						genEquipmentData)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<GenEquipmentData> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the gen equipment datas where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	@Override
	public void removeBygetHsraById(long hsraApplicationId) {
		for (GenEquipmentData genEquipmentData :
				findBygetHsraById(
					hsraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(genEquipmentData);
		}
	}

	/**
	 * Returns the number of gen equipment datas where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching gen equipment datas
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_GENEQUIPMENTDATA_WHERE);

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
		"genEquipmentData.hsraApplicationId = ?";

	public GenEquipmentDataPersistenceImpl() {
		setModelClass(GenEquipmentData.class);

		setModelImplClass(GenEquipmentDataImpl.class);
		setModelPKClass(long.class);

		setTable(GenEquipmentDataTable.INSTANCE);
	}

	/**
	 * Caches the gen equipment data in the entity cache if it is enabled.
	 *
	 * @param genEquipmentData the gen equipment data
	 */
	@Override
	public void cacheResult(GenEquipmentData genEquipmentData) {
		entityCache.putResult(
			GenEquipmentDataImpl.class, genEquipmentData.getPrimaryKey(),
			genEquipmentData);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the gen equipment datas in the entity cache if it is enabled.
	 *
	 * @param genEquipmentDatas the gen equipment datas
	 */
	@Override
	public void cacheResult(List<GenEquipmentData> genEquipmentDatas) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (genEquipmentDatas.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (GenEquipmentData genEquipmentData : genEquipmentDatas) {
			if (entityCache.getResult(
					GenEquipmentDataImpl.class,
					genEquipmentData.getPrimaryKey()) == null) {

				cacheResult(genEquipmentData);
			}
		}
	}

	/**
	 * Clears the cache for all gen equipment datas.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(GenEquipmentDataImpl.class);

		finderCache.clearCache(GenEquipmentDataImpl.class);
	}

	/**
	 * Clears the cache for the gen equipment data.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GenEquipmentData genEquipmentData) {
		entityCache.removeResult(GenEquipmentDataImpl.class, genEquipmentData);
	}

	@Override
	public void clearCache(List<GenEquipmentData> genEquipmentDatas) {
		for (GenEquipmentData genEquipmentData : genEquipmentDatas) {
			entityCache.removeResult(
				GenEquipmentDataImpl.class, genEquipmentData);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(GenEquipmentDataImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(GenEquipmentDataImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new gen equipment data with the primary key. Does not add the gen equipment data to the database.
	 *
	 * @param genEquipmentDataId the primary key for the new gen equipment data
	 * @return the new gen equipment data
	 */
	@Override
	public GenEquipmentData create(long genEquipmentDataId) {
		GenEquipmentData genEquipmentData = new GenEquipmentDataImpl();

		genEquipmentData.setNew(true);
		genEquipmentData.setPrimaryKey(genEquipmentDataId);

		genEquipmentData.setCompanyId(CompanyThreadLocal.getCompanyId());

		return genEquipmentData;
	}

	/**
	 * Removes the gen equipment data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data that was removed
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public GenEquipmentData remove(long genEquipmentDataId)
		throws NoSuchGenEquipmentDataException {

		return remove((Serializable)genEquipmentDataId);
	}

	/**
	 * Removes the gen equipment data with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the gen equipment data
	 * @return the gen equipment data that was removed
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public GenEquipmentData remove(Serializable primaryKey)
		throws NoSuchGenEquipmentDataException {

		Session session = null;

		try {
			session = openSession();

			GenEquipmentData genEquipmentData = (GenEquipmentData)session.get(
				GenEquipmentDataImpl.class, primaryKey);

			if (genEquipmentData == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchGenEquipmentDataException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(genEquipmentData);
		}
		catch (NoSuchGenEquipmentDataException noSuchEntityException) {
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
	protected GenEquipmentData removeImpl(GenEquipmentData genEquipmentData) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(genEquipmentData)) {
				genEquipmentData = (GenEquipmentData)session.get(
					GenEquipmentDataImpl.class,
					genEquipmentData.getPrimaryKeyObj());
			}

			if (genEquipmentData != null) {
				session.delete(genEquipmentData);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (genEquipmentData != null) {
			clearCache(genEquipmentData);
		}

		return genEquipmentData;
	}

	@Override
	public GenEquipmentData updateImpl(GenEquipmentData genEquipmentData) {
		boolean isNew = genEquipmentData.isNew();

		if (!(genEquipmentData instanceof GenEquipmentDataModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(genEquipmentData.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					genEquipmentData);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in genEquipmentData proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom GenEquipmentData implementation " +
					genEquipmentData.getClass());
		}

		GenEquipmentDataModelImpl genEquipmentDataModelImpl =
			(GenEquipmentDataModelImpl)genEquipmentData;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (genEquipmentData.getCreateDate() == null)) {
			if (serviceContext == null) {
				genEquipmentData.setCreateDate(date);
			}
			else {
				genEquipmentData.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!genEquipmentDataModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				genEquipmentData.setModifiedDate(date);
			}
			else {
				genEquipmentData.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(genEquipmentData);
			}
			else {
				genEquipmentData = (GenEquipmentData)session.merge(
					genEquipmentData);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			GenEquipmentDataImpl.class, genEquipmentDataModelImpl, false, true);

		if (isNew) {
			genEquipmentData.setNew(false);
		}

		genEquipmentData.resetOriginalValues();

		return genEquipmentData;
	}

	/**
	 * Returns the gen equipment data with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the gen equipment data
	 * @return the gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public GenEquipmentData findByPrimaryKey(Serializable primaryKey)
		throws NoSuchGenEquipmentDataException {

		GenEquipmentData genEquipmentData = fetchByPrimaryKey(primaryKey);

		if (genEquipmentData == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchGenEquipmentDataException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return genEquipmentData;
	}

	/**
	 * Returns the gen equipment data with the primary key or throws a <code>NoSuchGenEquipmentDataException</code> if it could not be found.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data
	 * @throws NoSuchGenEquipmentDataException if a gen equipment data with the primary key could not be found
	 */
	@Override
	public GenEquipmentData findByPrimaryKey(long genEquipmentDataId)
		throws NoSuchGenEquipmentDataException {

		return findByPrimaryKey((Serializable)genEquipmentDataId);
	}

	/**
	 * Returns the gen equipment data with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param genEquipmentDataId the primary key of the gen equipment data
	 * @return the gen equipment data, or <code>null</code> if a gen equipment data with the primary key could not be found
	 */
	@Override
	public GenEquipmentData fetchByPrimaryKey(long genEquipmentDataId) {
		return fetchByPrimaryKey((Serializable)genEquipmentDataId);
	}

	/**
	 * Returns all the gen equipment datas.
	 *
	 * @return the gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @return the range of gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findAll(
		int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the gen equipment datas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>GenEquipmentDataModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of gen equipment datas
	 * @param end the upper bound of the range of gen equipment datas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of gen equipment datas
	 */
	@Override
	public List<GenEquipmentData> findAll(
		int start, int end,
		OrderByComparator<GenEquipmentData> orderByComparator,
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

		List<GenEquipmentData> list = null;

		if (useFinderCache) {
			list = (List<GenEquipmentData>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_GENEQUIPMENTDATA);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_GENEQUIPMENTDATA;

				sql = sql.concat(GenEquipmentDataModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<GenEquipmentData>)QueryUtil.list(
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
	 * Removes all the gen equipment datas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (GenEquipmentData genEquipmentData : findAll()) {
			remove(genEquipmentData);
		}
	}

	/**
	 * Returns the number of gen equipment datas.
	 *
	 * @return the number of gen equipment datas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_GENEQUIPMENTDATA);

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
		return "genEquipmentDataId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_GENEQUIPMENTDATA;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return GenEquipmentDataModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the gen equipment data persistence.
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

		GenEquipmentDataUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		GenEquipmentDataUtil.setPersistence(null);

		entityCache.removeCache(GenEquipmentDataImpl.class.getName());
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

	private static final String _SQL_SELECT_GENEQUIPMENTDATA =
		"SELECT genEquipmentData FROM GenEquipmentData genEquipmentData";

	private static final String _SQL_SELECT_GENEQUIPMENTDATA_WHERE =
		"SELECT genEquipmentData FROM GenEquipmentData genEquipmentData WHERE ";

	private static final String _SQL_COUNT_GENEQUIPMENTDATA =
		"SELECT COUNT(genEquipmentData) FROM GenEquipmentData genEquipmentData";

	private static final String _SQL_COUNT_GENEQUIPMENTDATA_WHERE =
		"SELECT COUNT(genEquipmentData) FROM GenEquipmentData genEquipmentData WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "genEquipmentData.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No GenEquipmentData exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No GenEquipmentData exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		GenEquipmentDataPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}