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

import com.nbp.hsra.application.service.exception.NoSuchRadiationSafetyLowRiskException;
import com.nbp.hsra.application.service.model.RadiationSafetyLowRisk;
import com.nbp.hsra.application.service.model.RadiationSafetyLowRiskTable;
import com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskImpl;
import com.nbp.hsra.application.service.model.impl.RadiationSafetyLowRiskModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadiationSafetyLowRiskPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationSafetyLowRiskUtil;
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
 * The persistence implementation for the radiation safety low risk service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadiationSafetyLowRiskPersistence.class)
public class RadiationSafetyLowRiskPersistenceImpl
	extends BasePersistenceImpl<RadiationSafetyLowRisk>
	implements RadiationSafetyLowRiskPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadiationSafetyLowRiskUtil</code> to access the radiation safety low risk persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadiationSafetyLowRiskImpl.class.getName();

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
	 * Returns the radiation safety low risk where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationSafetyLowRiskException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety low risk
	 * @throws NoSuchRadiationSafetyLowRiskException if a matching radiation safety low risk could not be found
	 */
	@Override
	public RadiationSafetyLowRisk findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationSafetyLowRiskException {

		RadiationSafetyLowRisk radiationSafetyLowRisk = fetchBygetHsraById(
			hsraApplicationId);

		if (radiationSafetyLowRisk == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRadiationSafetyLowRiskException(sb.toString());
		}

		return radiationSafetyLowRisk;
	}

	/**
	 * Returns the radiation safety low risk where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety low risk, or <code>null</code> if a matching radiation safety low risk could not be found
	 */
	@Override
	public RadiationSafetyLowRisk fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the radiation safety low risk where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation safety low risk, or <code>null</code> if a matching radiation safety low risk could not be found
	 */
	@Override
	public RadiationSafetyLowRisk fetchBygetHsraById(
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

		if (result instanceof RadiationSafetyLowRisk) {
			RadiationSafetyLowRisk radiationSafetyLowRisk =
				(RadiationSafetyLowRisk)result;

			if (hsraApplicationId !=
					radiationSafetyLowRisk.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_RADIATIONSAFETYLOWRISK_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<RadiationSafetyLowRisk> list = query.list();

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
								"RadiationSafetyLowRiskPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RadiationSafetyLowRisk radiationSafetyLowRisk = list.get(0);

					result = radiationSafetyLowRisk;

					cacheResult(radiationSafetyLowRisk);
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
			return (RadiationSafetyLowRisk)result;
		}
	}

	/**
	 * Removes the radiation safety low risk where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation safety low risk that was removed
	 */
	@Override
	public RadiationSafetyLowRisk removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationSafetyLowRiskException {

		RadiationSafetyLowRisk radiationSafetyLowRisk = findBygetHsraById(
			hsraApplicationId);

		return remove(radiationSafetyLowRisk);
	}

	/**
	 * Returns the number of radiation safety low risks where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation safety low risks
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIATIONSAFETYLOWRISK_WHERE);

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
		"radiationSafetyLowRisk.hsraApplicationId = ?";

	public RadiationSafetyLowRiskPersistenceImpl() {
		setModelClass(RadiationSafetyLowRisk.class);

		setModelImplClass(RadiationSafetyLowRiskImpl.class);
		setModelPKClass(long.class);

		setTable(RadiationSafetyLowRiskTable.INSTANCE);
	}

	/**
	 * Caches the radiation safety low risk in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyLowRisk the radiation safety low risk
	 */
	@Override
	public void cacheResult(RadiationSafetyLowRisk radiationSafetyLowRisk) {
		entityCache.putResult(
			RadiationSafetyLowRiskImpl.class,
			radiationSafetyLowRisk.getPrimaryKey(), radiationSafetyLowRisk);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {radiationSafetyLowRisk.getHsraApplicationId()},
			radiationSafetyLowRisk);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radiation safety low risks in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyLowRisks the radiation safety low risks
	 */
	@Override
	public void cacheResult(
		List<RadiationSafetyLowRisk> radiationSafetyLowRisks) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radiationSafetyLowRisks.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadiationSafetyLowRisk radiationSafetyLowRisk :
				radiationSafetyLowRisks) {

			if (entityCache.getResult(
					RadiationSafetyLowRiskImpl.class,
					radiationSafetyLowRisk.getPrimaryKey()) == null) {

				cacheResult(radiationSafetyLowRisk);
			}
		}
	}

	/**
	 * Clears the cache for all radiation safety low risks.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadiationSafetyLowRiskImpl.class);

		finderCache.clearCache(RadiationSafetyLowRiskImpl.class);
	}

	/**
	 * Clears the cache for the radiation safety low risk.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RadiationSafetyLowRisk radiationSafetyLowRisk) {
		entityCache.removeResult(
			RadiationSafetyLowRiskImpl.class, radiationSafetyLowRisk);
	}

	@Override
	public void clearCache(
		List<RadiationSafetyLowRisk> radiationSafetyLowRisks) {

		for (RadiationSafetyLowRisk radiationSafetyLowRisk :
				radiationSafetyLowRisks) {

			entityCache.removeResult(
				RadiationSafetyLowRiskImpl.class, radiationSafetyLowRisk);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadiationSafetyLowRiskImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RadiationSafetyLowRiskImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RadiationSafetyLowRiskModelImpl radiationSafetyLowRiskModelImpl) {

		Object[] args = new Object[] {
			radiationSafetyLowRiskModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			radiationSafetyLowRiskModelImpl);
	}

	/**
	 * Creates a new radiation safety low risk with the primary key. Does not add the radiation safety low risk to the database.
	 *
	 * @param radiationSafetyLowRiskId the primary key for the new radiation safety low risk
	 * @return the new radiation safety low risk
	 */
	@Override
	public RadiationSafetyLowRisk create(long radiationSafetyLowRiskId) {
		RadiationSafetyLowRisk radiationSafetyLowRisk =
			new RadiationSafetyLowRiskImpl();

		radiationSafetyLowRisk.setNew(true);
		radiationSafetyLowRisk.setPrimaryKey(radiationSafetyLowRiskId);

		radiationSafetyLowRisk.setCompanyId(CompanyThreadLocal.getCompanyId());

		return radiationSafetyLowRisk;
	}

	/**
	 * Removes the radiation safety low risk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 * @throws NoSuchRadiationSafetyLowRiskException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public RadiationSafetyLowRisk remove(long radiationSafetyLowRiskId)
		throws NoSuchRadiationSafetyLowRiskException {

		return remove((Serializable)radiationSafetyLowRiskId);
	}

	/**
	 * Removes the radiation safety low risk with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radiation safety low risk
	 * @return the radiation safety low risk that was removed
	 * @throws NoSuchRadiationSafetyLowRiskException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public RadiationSafetyLowRisk remove(Serializable primaryKey)
		throws NoSuchRadiationSafetyLowRiskException {

		Session session = null;

		try {
			session = openSession();

			RadiationSafetyLowRisk radiationSafetyLowRisk =
				(RadiationSafetyLowRisk)session.get(
					RadiationSafetyLowRiskImpl.class, primaryKey);

			if (radiationSafetyLowRisk == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadiationSafetyLowRiskException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radiationSafetyLowRisk);
		}
		catch (NoSuchRadiationSafetyLowRiskException noSuchEntityException) {
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
	protected RadiationSafetyLowRisk removeImpl(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radiationSafetyLowRisk)) {
				radiationSafetyLowRisk = (RadiationSafetyLowRisk)session.get(
					RadiationSafetyLowRiskImpl.class,
					radiationSafetyLowRisk.getPrimaryKeyObj());
			}

			if (radiationSafetyLowRisk != null) {
				session.delete(radiationSafetyLowRisk);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radiationSafetyLowRisk != null) {
			clearCache(radiationSafetyLowRisk);
		}

		return radiationSafetyLowRisk;
	}

	@Override
	public RadiationSafetyLowRisk updateImpl(
		RadiationSafetyLowRisk radiationSafetyLowRisk) {

		boolean isNew = radiationSafetyLowRisk.isNew();

		if (!(radiationSafetyLowRisk instanceof
				RadiationSafetyLowRiskModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radiationSafetyLowRisk.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radiationSafetyLowRisk);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radiationSafetyLowRisk proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadiationSafetyLowRisk implementation " +
					radiationSafetyLowRisk.getClass());
		}

		RadiationSafetyLowRiskModelImpl radiationSafetyLowRiskModelImpl =
			(RadiationSafetyLowRiskModelImpl)radiationSafetyLowRisk;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radiationSafetyLowRisk.getCreateDate() == null)) {
			if (serviceContext == null) {
				radiationSafetyLowRisk.setCreateDate(date);
			}
			else {
				radiationSafetyLowRisk.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radiationSafetyLowRiskModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radiationSafetyLowRisk.setModifiedDate(date);
			}
			else {
				radiationSafetyLowRisk.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radiationSafetyLowRisk);
			}
			else {
				radiationSafetyLowRisk = (RadiationSafetyLowRisk)session.merge(
					radiationSafetyLowRisk);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadiationSafetyLowRiskImpl.class, radiationSafetyLowRiskModelImpl,
			false, true);

		cacheUniqueFindersCache(radiationSafetyLowRiskModelImpl);

		if (isNew) {
			radiationSafetyLowRisk.setNew(false);
		}

		radiationSafetyLowRisk.resetOriginalValues();

		return radiationSafetyLowRisk;
	}

	/**
	 * Returns the radiation safety low risk with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radiation safety low risk
	 * @return the radiation safety low risk
	 * @throws NoSuchRadiationSafetyLowRiskException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public RadiationSafetyLowRisk findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadiationSafetyLowRiskException {

		RadiationSafetyLowRisk radiationSafetyLowRisk = fetchByPrimaryKey(
			primaryKey);

		if (radiationSafetyLowRisk == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadiationSafetyLowRiskException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radiationSafetyLowRisk;
	}

	/**
	 * Returns the radiation safety low risk with the primary key or throws a <code>NoSuchRadiationSafetyLowRiskException</code> if it could not be found.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk
	 * @throws NoSuchRadiationSafetyLowRiskException if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public RadiationSafetyLowRisk findByPrimaryKey(
			long radiationSafetyLowRiskId)
		throws NoSuchRadiationSafetyLowRiskException {

		return findByPrimaryKey((Serializable)radiationSafetyLowRiskId);
	}

	/**
	 * Returns the radiation safety low risk with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationSafetyLowRiskId the primary key of the radiation safety low risk
	 * @return the radiation safety low risk, or <code>null</code> if a radiation safety low risk with the primary key could not be found
	 */
	@Override
	public RadiationSafetyLowRisk fetchByPrimaryKey(
		long radiationSafetyLowRiskId) {

		return fetchByPrimaryKey((Serializable)radiationSafetyLowRiskId);
	}

	/**
	 * Returns all the radiation safety low risks.
	 *
	 * @return the radiation safety low risks
	 */
	@Override
	public List<RadiationSafetyLowRisk> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @return the range of radiation safety low risks
	 */
	@Override
	public List<RadiationSafetyLowRisk> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation safety low risks
	 */
	@Override
	public List<RadiationSafetyLowRisk> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyLowRisk> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation safety low risks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyLowRiskModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety low risks
	 * @param end the upper bound of the range of radiation safety low risks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation safety low risks
	 */
	@Override
	public List<RadiationSafetyLowRisk> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyLowRisk> orderByComparator,
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

		List<RadiationSafetyLowRisk> list = null;

		if (useFinderCache) {
			list = (List<RadiationSafetyLowRisk>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIATIONSAFETYLOWRISK);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIATIONSAFETYLOWRISK;

				sql = sql.concat(RadiationSafetyLowRiskModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadiationSafetyLowRisk>)QueryUtil.list(
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
	 * Removes all the radiation safety low risks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadiationSafetyLowRisk radiationSafetyLowRisk : findAll()) {
			remove(radiationSafetyLowRisk);
		}
	}

	/**
	 * Returns the number of radiation safety low risks.
	 *
	 * @return the number of radiation safety low risks
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
					_SQL_COUNT_RADIATIONSAFETYLOWRISK);

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
		return "radiationSafetyLowRiskId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIATIONSAFETYLOWRISK;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadiationSafetyLowRiskModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radiation safety low risk persistence.
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

		RadiationSafetyLowRiskUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadiationSafetyLowRiskUtil.setPersistence(null);

		entityCache.removeCache(RadiationSafetyLowRiskImpl.class.getName());
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

	private static final String _SQL_SELECT_RADIATIONSAFETYLOWRISK =
		"SELECT radiationSafetyLowRisk FROM RadiationSafetyLowRisk radiationSafetyLowRisk";

	private static final String _SQL_SELECT_RADIATIONSAFETYLOWRISK_WHERE =
		"SELECT radiationSafetyLowRisk FROM RadiationSafetyLowRisk radiationSafetyLowRisk WHERE ";

	private static final String _SQL_COUNT_RADIATIONSAFETYLOWRISK =
		"SELECT COUNT(radiationSafetyLowRisk) FROM RadiationSafetyLowRisk radiationSafetyLowRisk";

	private static final String _SQL_COUNT_RADIATIONSAFETYLOWRISK_WHERE =
		"SELECT COUNT(radiationSafetyLowRisk) FROM RadiationSafetyLowRisk radiationSafetyLowRisk WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"radiationSafetyLowRisk.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadiationSafetyLowRisk exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadiationSafetyLowRisk exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationSafetyLowRiskPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}