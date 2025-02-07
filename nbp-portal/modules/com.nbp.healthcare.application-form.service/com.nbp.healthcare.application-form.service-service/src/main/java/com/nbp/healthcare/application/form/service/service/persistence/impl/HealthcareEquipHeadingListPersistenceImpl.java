/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthcareEquipHeadingListException;
import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingList;
import com.nbp.healthcare.application.form.service.model.HealthcareEquipHeadingListTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthcareEquipHeadingListPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthcareEquipHeadingListUtil;
import com.nbp.healthcare.application.form.service.service.persistence.impl.constants.HEALTHPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the healthcare equip heading list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthcareEquipHeadingListPersistence.class)
public class HealthcareEquipHeadingListPersistenceImpl
	extends BasePersistenceImpl<HealthcareEquipHeadingList>
	implements HealthcareEquipHeadingListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthcareEquipHeadingListUtil</code> to access the healthcare equip heading list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthcareEquipHeadingListImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByget_HL_HD;
	private FinderPath _finderPathCountByget_HL_HD;

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or throws a <code>NoSuchHealthcareEquipHeadingListException</code> if it could not be found.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the matching healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a matching healthcare equip heading list could not be found
	 */
	@Override
	public HealthcareEquipHeadingList findByget_HL_HD(
			String healthcareDescription)
		throws NoSuchHealthcareEquipHeadingListException {

		HealthcareEquipHeadingList healthcareEquipHeadingList =
			fetchByget_HL_HD(healthcareDescription);

		if (healthcareEquipHeadingList == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthcareDescription=");
			sb.append(healthcareDescription);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthcareEquipHeadingListException(sb.toString());
		}

		return healthcareEquipHeadingList;
	}

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the matching healthcare equip heading list, or <code>null</code> if a matching healthcare equip heading list could not be found
	 */
	@Override
	public HealthcareEquipHeadingList fetchByget_HL_HD(
		String healthcareDescription) {

		return fetchByget_HL_HD(healthcareDescription, true);
	}

	/**
	 * Returns the healthcare equip heading list where healthcareDescription = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthcareDescription the healthcare description
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching healthcare equip heading list, or <code>null</code> if a matching healthcare equip heading list could not be found
	 */
	@Override
	public HealthcareEquipHeadingList fetchByget_HL_HD(
		String healthcareDescription, boolean useFinderCache) {

		healthcareDescription = Objects.toString(healthcareDescription, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthcareDescription};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_HL_HD, finderArgs, this);
		}

		if (result instanceof HealthcareEquipHeadingList) {
			HealthcareEquipHeadingList healthcareEquipHeadingList =
				(HealthcareEquipHeadingList)result;

			if (!Objects.equals(
					healthcareDescription,
					healthcareEquipHeadingList.getHealthcareDescription())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREEQUIPHEADINGLIST_WHERE);

			boolean bindHealthcareDescription = false;

			if (healthcareDescription.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_HL_HD_HEALTHCAREDESCRIPTION_3);
			}
			else {
				bindHealthcareDescription = true;

				sb.append(_FINDER_COLUMN_GET_HL_HD_HEALTHCAREDESCRIPTION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindHealthcareDescription) {
					queryPos.add(healthcareDescription);
				}

				List<HealthcareEquipHeadingList> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_HL_HD, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									healthcareDescription
								};
							}

							_log.warn(
								"HealthcareEquipHeadingListPersistenceImpl.fetchByget_HL_HD(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthcareEquipHeadingList healthcareEquipHeadingList =
						list.get(0);

					result = healthcareEquipHeadingList;

					cacheResult(healthcareEquipHeadingList);
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
			return (HealthcareEquipHeadingList)result;
		}
	}

	/**
	 * Removes the healthcare equip heading list where healthcareDescription = &#63; from the database.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the healthcare equip heading list that was removed
	 */
	@Override
	public HealthcareEquipHeadingList removeByget_HL_HD(
			String healthcareDescription)
		throws NoSuchHealthcareEquipHeadingListException {

		HealthcareEquipHeadingList healthcareEquipHeadingList = findByget_HL_HD(
			healthcareDescription);

		return remove(healthcareEquipHeadingList);
	}

	/**
	 * Returns the number of healthcare equip heading lists where healthcareDescription = &#63;.
	 *
	 * @param healthcareDescription the healthcare description
	 * @return the number of matching healthcare equip heading lists
	 */
	@Override
	public int countByget_HL_HD(String healthcareDescription) {
		healthcareDescription = Objects.toString(healthcareDescription, "");

		FinderPath finderPath = _finderPathCountByget_HL_HD;

		Object[] finderArgs = new Object[] {healthcareDescription};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREEQUIPHEADINGLIST_WHERE);

			boolean bindHealthcareDescription = false;

			if (healthcareDescription.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_HL_HD_HEALTHCAREDESCRIPTION_3);
			}
			else {
				bindHealthcareDescription = true;

				sb.append(_FINDER_COLUMN_GET_HL_HD_HEALTHCAREDESCRIPTION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindHealthcareDescription) {
					queryPos.add(healthcareDescription);
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
		_FINDER_COLUMN_GET_HL_HD_HEALTHCAREDESCRIPTION_2 =
			"healthcareEquipHeadingList.healthcareDescription = ?";

	private static final String
		_FINDER_COLUMN_GET_HL_HD_HEALTHCAREDESCRIPTION_3 =
			"(healthcareEquipHeadingList.healthcareDescription IS NULL OR healthcareEquipHeadingList.healthcareDescription = '')";

	public HealthcareEquipHeadingListPersistenceImpl() {
		setModelClass(HealthcareEquipHeadingList.class);

		setModelImplClass(HealthcareEquipHeadingListImpl.class);
		setModelPKClass(long.class);

		setTable(HealthcareEquipHeadingListTable.INSTANCE);
	}

	/**
	 * Caches the healthcare equip heading list in the entity cache if it is enabled.
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 */
	@Override
	public void cacheResult(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		entityCache.putResult(
			HealthcareEquipHeadingListImpl.class,
			healthcareEquipHeadingList.getPrimaryKey(),
			healthcareEquipHeadingList);

		finderCache.putResult(
			_finderPathFetchByget_HL_HD,
			new Object[] {
				healthcareEquipHeadingList.getHealthcareDescription()
			},
			healthcareEquipHeadingList);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the healthcare equip heading lists in the entity cache if it is enabled.
	 *
	 * @param healthcareEquipHeadingLists the healthcare equip heading lists
	 */
	@Override
	public void cacheResult(
		List<HealthcareEquipHeadingList> healthcareEquipHeadingLists) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthcareEquipHeadingLists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthcareEquipHeadingList healthcareEquipHeadingList :
				healthcareEquipHeadingLists) {

			if (entityCache.getResult(
					HealthcareEquipHeadingListImpl.class,
					healthcareEquipHeadingList.getPrimaryKey()) == null) {

				cacheResult(healthcareEquipHeadingList);
			}
		}
	}

	/**
	 * Clears the cache for all healthcare equip heading lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthcareEquipHeadingListImpl.class);

		finderCache.clearCache(HealthcareEquipHeadingListImpl.class);
	}

	/**
	 * Clears the cache for the healthcare equip heading list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		entityCache.removeResult(
			HealthcareEquipHeadingListImpl.class, healthcareEquipHeadingList);
	}

	@Override
	public void clearCache(
		List<HealthcareEquipHeadingList> healthcareEquipHeadingLists) {

		for (HealthcareEquipHeadingList healthcareEquipHeadingList :
				healthcareEquipHeadingLists) {

			entityCache.removeResult(
				HealthcareEquipHeadingListImpl.class,
				healthcareEquipHeadingList);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthcareEquipHeadingListImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthcareEquipHeadingListImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthcareEquipHeadingListModelImpl
			healthcareEquipHeadingListModelImpl) {

		Object[] args = new Object[] {
			healthcareEquipHeadingListModelImpl.getHealthcareDescription()
		};

		finderCache.putResult(
			_finderPathCountByget_HL_HD, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_HL_HD, args,
			healthcareEquipHeadingListModelImpl);
	}

	/**
	 * Creates a new healthcare equip heading list with the primary key. Does not add the healthcare equip heading list to the database.
	 *
	 * @param healthcareEquipHeadingListId the primary key for the new healthcare equip heading list
	 * @return the new healthcare equip heading list
	 */
	@Override
	public HealthcareEquipHeadingList create(
		long healthcareEquipHeadingListId) {

		HealthcareEquipHeadingList healthcareEquipHeadingList =
			new HealthcareEquipHeadingListImpl();

		healthcareEquipHeadingList.setNew(true);
		healthcareEquipHeadingList.setPrimaryKey(healthcareEquipHeadingListId);

		return healthcareEquipHeadingList;
	}

	/**
	 * Removes the healthcare equip heading list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public HealthcareEquipHeadingList remove(long healthcareEquipHeadingListId)
		throws NoSuchHealthcareEquipHeadingListException {

		return remove((Serializable)healthcareEquipHeadingListId);
	}

	/**
	 * Removes the healthcare equip heading list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public HealthcareEquipHeadingList remove(Serializable primaryKey)
		throws NoSuchHealthcareEquipHeadingListException {

		Session session = null;

		try {
			session = openSession();

			HealthcareEquipHeadingList healthcareEquipHeadingList =
				(HealthcareEquipHeadingList)session.get(
					HealthcareEquipHeadingListImpl.class, primaryKey);

			if (healthcareEquipHeadingList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthcareEquipHeadingListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthcareEquipHeadingList);
		}
		catch (NoSuchHealthcareEquipHeadingListException
					noSuchEntityException) {

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
	protected HealthcareEquipHeadingList removeImpl(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthcareEquipHeadingList)) {
				healthcareEquipHeadingList =
					(HealthcareEquipHeadingList)session.get(
						HealthcareEquipHeadingListImpl.class,
						healthcareEquipHeadingList.getPrimaryKeyObj());
			}

			if (healthcareEquipHeadingList != null) {
				session.delete(healthcareEquipHeadingList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthcareEquipHeadingList != null) {
			clearCache(healthcareEquipHeadingList);
		}

		return healthcareEquipHeadingList;
	}

	@Override
	public HealthcareEquipHeadingList updateImpl(
		HealthcareEquipHeadingList healthcareEquipHeadingList) {

		boolean isNew = healthcareEquipHeadingList.isNew();

		if (!(healthcareEquipHeadingList instanceof
				HealthcareEquipHeadingListModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthcareEquipHeadingList.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthcareEquipHeadingList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthcareEquipHeadingList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthcareEquipHeadingList implementation " +
					healthcareEquipHeadingList.getClass());
		}

		HealthcareEquipHeadingListModelImpl
			healthcareEquipHeadingListModelImpl =
				(HealthcareEquipHeadingListModelImpl)healthcareEquipHeadingList;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthcareEquipHeadingList);
			}
			else {
				healthcareEquipHeadingList =
					(HealthcareEquipHeadingList)session.merge(
						healthcareEquipHeadingList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthcareEquipHeadingListImpl.class,
			healthcareEquipHeadingListModelImpl, false, true);

		cacheUniqueFindersCache(healthcareEquipHeadingListModelImpl);

		if (isNew) {
			healthcareEquipHeadingList.setNew(false);
		}

		healthcareEquipHeadingList.resetOriginalValues();

		return healthcareEquipHeadingList;
	}

	/**
	 * Returns the healthcare equip heading list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public HealthcareEquipHeadingList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthcareEquipHeadingListException {

		HealthcareEquipHeadingList healthcareEquipHeadingList =
			fetchByPrimaryKey(primaryKey);

		if (healthcareEquipHeadingList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthcareEquipHeadingListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthcareEquipHeadingList;
	}

	/**
	 * Returns the healthcare equip heading list with the primary key or throws a <code>NoSuchHealthcareEquipHeadingListException</code> if it could not be found.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list
	 * @throws NoSuchHealthcareEquipHeadingListException if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public HealthcareEquipHeadingList findByPrimaryKey(
			long healthcareEquipHeadingListId)
		throws NoSuchHealthcareEquipHeadingListException {

		return findByPrimaryKey((Serializable)healthcareEquipHeadingListId);
	}

	/**
	 * Returns the healthcare equip heading list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list, or <code>null</code> if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public HealthcareEquipHeadingList fetchByPrimaryKey(
		long healthcareEquipHeadingListId) {

		return fetchByPrimaryKey((Serializable)healthcareEquipHeadingListId);
	}

	/**
	 * Returns all the healthcare equip heading lists.
	 *
	 * @return the healthcare equip heading lists
	 */
	@Override
	public List<HealthcareEquipHeadingList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @return the range of healthcare equip heading lists
	 */
	@Override
	public List<HealthcareEquipHeadingList> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of healthcare equip heading lists
	 */
	@Override
	public List<HealthcareEquipHeadingList> findAll(
		int start, int end,
		OrderByComparator<HealthcareEquipHeadingList> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of healthcare equip heading lists
	 */
	@Override
	public List<HealthcareEquipHeadingList> findAll(
		int start, int end,
		OrderByComparator<HealthcareEquipHeadingList> orderByComparator,
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

		List<HealthcareEquipHeadingList> list = null;

		if (useFinderCache) {
			list = (List<HealthcareEquipHeadingList>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREEQUIPHEADINGLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREEQUIPHEADINGLIST;

				sql = sql.concat(
					HealthcareEquipHeadingListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthcareEquipHeadingList>)QueryUtil.list(
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
	 * Removes all the healthcare equip heading lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthcareEquipHeadingList healthcareEquipHeadingList :
				findAll()) {

			remove(healthcareEquipHeadingList);
		}
	}

	/**
	 * Returns the number of healthcare equip heading lists.
	 *
	 * @return the number of healthcare equip heading lists
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
					_SQL_COUNT_HEALTHCAREEQUIPHEADINGLIST);

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
		return "healthcareEquipHeadingListId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREEQUIPHEADINGLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthcareEquipHeadingListModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the healthcare equip heading list persistence.
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

		_finderPathFetchByget_HL_HD = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_HL_HD",
			new String[] {String.class.getName()},
			new String[] {"healthcareDescription"}, true);

		_finderPathCountByget_HL_HD = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByget_HL_HD",
			new String[] {String.class.getName()},
			new String[] {"healthcareDescription"}, false);

		HealthcareEquipHeadingListUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthcareEquipHeadingListUtil.setPersistence(null);

		entityCache.removeCache(HealthcareEquipHeadingListImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCAREEQUIPHEADINGLIST =
		"SELECT healthcareEquipHeadingList FROM HealthcareEquipHeadingList healthcareEquipHeadingList";

	private static final String _SQL_SELECT_HEALTHCAREEQUIPHEADINGLIST_WHERE =
		"SELECT healthcareEquipHeadingList FROM HealthcareEquipHeadingList healthcareEquipHeadingList WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREEQUIPHEADINGLIST =
		"SELECT COUNT(healthcareEquipHeadingList) FROM HealthcareEquipHeadingList healthcareEquipHeadingList";

	private static final String _SQL_COUNT_HEALTHCAREEQUIPHEADINGLIST_WHERE =
		"SELECT COUNT(healthcareEquipHeadingList) FROM HealthcareEquipHeadingList healthcareEquipHeadingList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthcareEquipHeadingList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthcareEquipHeadingList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthcareEquipHeadingList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthcareEquipHeadingListPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}