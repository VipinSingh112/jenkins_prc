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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.hsra.application.service.exception.NoSuchSpecificReqPropLicActivityException;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivity;
import com.nbp.hsra.application.service.model.SpecificReqPropLicActivityTable;
import com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityImpl;
import com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl;
import com.nbp.hsra.application.service.service.persistence.SpecificReqPropLicActivityPersistence;
import com.nbp.hsra.application.service.service.persistence.SpecificReqPropLicActivityUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the specific req prop lic activity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SpecificReqPropLicActivityPersistence.class)
public class SpecificReqPropLicActivityPersistenceImpl
	extends BasePersistenceImpl<SpecificReqPropLicActivity>
	implements SpecificReqPropLicActivityPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SpecificReqPropLicActivityUtil</code> to access the specific req prop lic activity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SpecificReqPropLicActivityImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or throws a <code>NoSuchSpecificReqPropLicActivityException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a matching specific req prop lic activity could not be found
	 */
	@Override
	public SpecificReqPropLicActivity findBygetHsraById(long hsraApplicationId)
		throws NoSuchSpecificReqPropLicActivityException {

		SpecificReqPropLicActivity specificReqPropLicActivity =
			fetchBygetHsraById(hsraApplicationId);

		if (specificReqPropLicActivity == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSpecificReqPropLicActivityException(sb.toString());
		}

		return specificReqPropLicActivity;
	}

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching specific req prop lic activity, or <code>null</code> if a matching specific req prop lic activity could not be found
	 */
	@Override
	public SpecificReqPropLicActivity fetchBygetHsraById(
		long hsraApplicationId) {

		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the specific req prop lic activity where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching specific req prop lic activity, or <code>null</code> if a matching specific req prop lic activity could not be found
	 */
	@Override
	public SpecificReqPropLicActivity fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof SpecificReqPropLicActivity) {
			SpecificReqPropLicActivity specificReqPropLicActivity =
				(SpecificReqPropLicActivity)result;

			if (hsraApplicationId !=
					specificReqPropLicActivity.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SPECIFICREQPROPLICACTIVITY_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<SpecificReqPropLicActivity> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"SpecificReqPropLicActivityPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SpecificReqPropLicActivity specificReqPropLicActivity =
						list.get(0);

					result = specificReqPropLicActivity;

					cacheResult(specificReqPropLicActivity);
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
			return (SpecificReqPropLicActivity)result;
		}
	}

	/**
	 * Removes the specific req prop lic activity where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the specific req prop lic activity that was removed
	 */
	@Override
	public SpecificReqPropLicActivity removeBygetHsraById(
			long hsraApplicationId)
		throws NoSuchSpecificReqPropLicActivityException {

		SpecificReqPropLicActivity specificReqPropLicActivity =
			findBygetHsraById(hsraApplicationId);

		return remove(specificReqPropLicActivity);
	}

	/**
	 * Returns the number of specific req prop lic activities where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching specific req prop lic activities
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SPECIFICREQPROPLICACTIVITY_WHERE);

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
		"specificReqPropLicActivity.hsraApplicationId = ?";

	public SpecificReqPropLicActivityPersistenceImpl() {
		setModelClass(SpecificReqPropLicActivity.class);

		setModelImplClass(SpecificReqPropLicActivityImpl.class);
		setModelPKClass(long.class);

		setTable(SpecificReqPropLicActivityTable.INSTANCE);
	}

	/**
	 * Caches the specific req prop lic activity in the entity cache if it is enabled.
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 */
	@Override
	public void cacheResult(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		entityCache.putResult(
			SpecificReqPropLicActivityImpl.class,
			specificReqPropLicActivity.getPrimaryKey(),
			specificReqPropLicActivity);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {specificReqPropLicActivity.getHsraApplicationId()},
			specificReqPropLicActivity);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the specific req prop lic activities in the entity cache if it is enabled.
	 *
	 * @param specificReqPropLicActivities the specific req prop lic activities
	 */
	@Override
	public void cacheResult(
		List<SpecificReqPropLicActivity> specificReqPropLicActivities) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (specificReqPropLicActivities.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SpecificReqPropLicActivity specificReqPropLicActivity :
				specificReqPropLicActivities) {

			if (entityCache.getResult(
					SpecificReqPropLicActivityImpl.class,
					specificReqPropLicActivity.getPrimaryKey()) == null) {

				cacheResult(specificReqPropLicActivity);
			}
		}
	}

	/**
	 * Clears the cache for all specific req prop lic activities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SpecificReqPropLicActivityImpl.class);

		finderCache.clearCache(SpecificReqPropLicActivityImpl.class);
	}

	/**
	 * Clears the cache for the specific req prop lic activity.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		entityCache.removeResult(
			SpecificReqPropLicActivityImpl.class, specificReqPropLicActivity);
	}

	@Override
	public void clearCache(
		List<SpecificReqPropLicActivity> specificReqPropLicActivities) {

		for (SpecificReqPropLicActivity specificReqPropLicActivity :
				specificReqPropLicActivities) {

			entityCache.removeResult(
				SpecificReqPropLicActivityImpl.class,
				specificReqPropLicActivity);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SpecificReqPropLicActivityImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SpecificReqPropLicActivityImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SpecificReqPropLicActivityModelImpl
			specificReqPropLicActivityModelImpl) {

		Object[] args = new Object[] {
			specificReqPropLicActivityModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			specificReqPropLicActivityModelImpl);
	}

	/**
	 * Creates a new specific req prop lic activity with the primary key. Does not add the specific req prop lic activity to the database.
	 *
	 * @param specificReqPropLicActivityId the primary key for the new specific req prop lic activity
	 * @return the new specific req prop lic activity
	 */
	@Override
	public SpecificReqPropLicActivity create(
		long specificReqPropLicActivityId) {

		SpecificReqPropLicActivity specificReqPropLicActivity =
			new SpecificReqPropLicActivityImpl();

		specificReqPropLicActivity.setNew(true);
		specificReqPropLicActivity.setPrimaryKey(specificReqPropLicActivityId);

		specificReqPropLicActivity.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return specificReqPropLicActivity;
	}

	/**
	 * Removes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public SpecificReqPropLicActivity remove(long specificReqPropLicActivityId)
		throws NoSuchSpecificReqPropLicActivityException {

		return remove((Serializable)specificReqPropLicActivityId);
	}

	/**
	 * Removes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public SpecificReqPropLicActivity remove(Serializable primaryKey)
		throws NoSuchSpecificReqPropLicActivityException {

		Session session = null;

		try {
			session = openSession();

			SpecificReqPropLicActivity specificReqPropLicActivity =
				(SpecificReqPropLicActivity)session.get(
					SpecificReqPropLicActivityImpl.class, primaryKey);

			if (specificReqPropLicActivity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSpecificReqPropLicActivityException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(specificReqPropLicActivity);
		}
		catch (NoSuchSpecificReqPropLicActivityException
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
	protected SpecificReqPropLicActivity removeImpl(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(specificReqPropLicActivity)) {
				specificReqPropLicActivity =
					(SpecificReqPropLicActivity)session.get(
						SpecificReqPropLicActivityImpl.class,
						specificReqPropLicActivity.getPrimaryKeyObj());
			}

			if (specificReqPropLicActivity != null) {
				session.delete(specificReqPropLicActivity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (specificReqPropLicActivity != null) {
			clearCache(specificReqPropLicActivity);
		}

		return specificReqPropLicActivity;
	}

	@Override
	public SpecificReqPropLicActivity updateImpl(
		SpecificReqPropLicActivity specificReqPropLicActivity) {

		boolean isNew = specificReqPropLicActivity.isNew();

		if (!(specificReqPropLicActivity instanceof
				SpecificReqPropLicActivityModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(specificReqPropLicActivity.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					specificReqPropLicActivity);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in specificReqPropLicActivity proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SpecificReqPropLicActivity implementation " +
					specificReqPropLicActivity.getClass());
		}

		SpecificReqPropLicActivityModelImpl
			specificReqPropLicActivityModelImpl =
				(SpecificReqPropLicActivityModelImpl)specificReqPropLicActivity;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (specificReqPropLicActivity.getCreateDate() == null)) {
			if (serviceContext == null) {
				specificReqPropLicActivity.setCreateDate(date);
			}
			else {
				specificReqPropLicActivity.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!specificReqPropLicActivityModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				specificReqPropLicActivity.setModifiedDate(date);
			}
			else {
				specificReqPropLicActivity.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(specificReqPropLicActivity);
			}
			else {
				specificReqPropLicActivity =
					(SpecificReqPropLicActivity)session.merge(
						specificReqPropLicActivity);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SpecificReqPropLicActivityImpl.class,
			specificReqPropLicActivityModelImpl, false, true);

		cacheUniqueFindersCache(specificReqPropLicActivityModelImpl);

		if (isNew) {
			specificReqPropLicActivity.setNew(false);
		}

		specificReqPropLicActivity.resetOriginalValues();

		return specificReqPropLicActivity;
	}

	/**
	 * Returns the specific req prop lic activity with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public SpecificReqPropLicActivity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSpecificReqPropLicActivityException {

		SpecificReqPropLicActivity specificReqPropLicActivity =
			fetchByPrimaryKey(primaryKey);

		if (specificReqPropLicActivity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSpecificReqPropLicActivityException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return specificReqPropLicActivity;
	}

	/**
	 * Returns the specific req prop lic activity with the primary key or throws a <code>NoSuchSpecificReqPropLicActivityException</code> if it could not be found.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws NoSuchSpecificReqPropLicActivityException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public SpecificReqPropLicActivity findByPrimaryKey(
			long specificReqPropLicActivityId)
		throws NoSuchSpecificReqPropLicActivityException {

		return findByPrimaryKey((Serializable)specificReqPropLicActivityId);
	}

	/**
	 * Returns the specific req prop lic activity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity, or <code>null</code> if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public SpecificReqPropLicActivity fetchByPrimaryKey(
		long specificReqPropLicActivityId) {

		return fetchByPrimaryKey((Serializable)specificReqPropLicActivityId);
	}

	/**
	 * Returns all the specific req prop lic activities.
	 *
	 * @return the specific req prop lic activities
	 */
	@Override
	public List<SpecificReqPropLicActivity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @return the range of specific req prop lic activities
	 */
	@Override
	public List<SpecificReqPropLicActivity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of specific req prop lic activities
	 */
	@Override
	public List<SpecificReqPropLicActivity> findAll(
		int start, int end,
		OrderByComparator<SpecificReqPropLicActivity> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of specific req prop lic activities
	 */
	@Override
	public List<SpecificReqPropLicActivity> findAll(
		int start, int end,
		OrderByComparator<SpecificReqPropLicActivity> orderByComparator,
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

		List<SpecificReqPropLicActivity> list = null;

		if (useFinderCache) {
			list = (List<SpecificReqPropLicActivity>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SPECIFICREQPROPLICACTIVITY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SPECIFICREQPROPLICACTIVITY;

				sql = sql.concat(
					SpecificReqPropLicActivityModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SpecificReqPropLicActivity>)QueryUtil.list(
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
	 * Removes all the specific req prop lic activities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SpecificReqPropLicActivity specificReqPropLicActivity :
				findAll()) {

			remove(specificReqPropLicActivity);
		}
	}

	/**
	 * Returns the number of specific req prop lic activities.
	 *
	 * @return the number of specific req prop lic activities
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
					_SQL_COUNT_SPECIFICREQPROPLICACTIVITY);

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
		return "specificReqPropLicActivityId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SPECIFICREQPROPLICACTIVITY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SpecificReqPropLicActivityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the specific req prop lic activity persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		SpecificReqPropLicActivityUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SpecificReqPropLicActivityUtil.setPersistence(null);

		entityCache.removeCache(SpecificReqPropLicActivityImpl.class.getName());
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

	private static final String _SQL_SELECT_SPECIFICREQPROPLICACTIVITY =
		"SELECT specificReqPropLicActivity FROM SpecificReqPropLicActivity specificReqPropLicActivity";

	private static final String _SQL_SELECT_SPECIFICREQPROPLICACTIVITY_WHERE =
		"SELECT specificReqPropLicActivity FROM SpecificReqPropLicActivity specificReqPropLicActivity WHERE ";

	private static final String _SQL_COUNT_SPECIFICREQPROPLICACTIVITY =
		"SELECT COUNT(specificReqPropLicActivity) FROM SpecificReqPropLicActivity specificReqPropLicActivity";

	private static final String _SQL_COUNT_SPECIFICREQPROPLICACTIVITY_WHERE =
		"SELECT COUNT(specificReqPropLicActivity) FROM SpecificReqPropLicActivity specificReqPropLicActivity WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"specificReqPropLicActivity.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SpecificReqPropLicActivity exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SpecificReqPropLicActivity exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SpecificReqPropLicActivityPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}