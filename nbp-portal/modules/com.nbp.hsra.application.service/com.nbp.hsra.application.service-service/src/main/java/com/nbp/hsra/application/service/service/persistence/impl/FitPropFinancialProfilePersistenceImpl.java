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

import com.nbp.hsra.application.service.exception.NoSuchFitPropFinancialProfileException;
import com.nbp.hsra.application.service.model.FitPropFinancialProfile;
import com.nbp.hsra.application.service.model.FitPropFinancialProfileTable;
import com.nbp.hsra.application.service.model.impl.FitPropFinancialProfileImpl;
import com.nbp.hsra.application.service.model.impl.FitPropFinancialProfileModelImpl;
import com.nbp.hsra.application.service.service.persistence.FitPropFinancialProfilePersistence;
import com.nbp.hsra.application.service.service.persistence.FitPropFinancialProfileUtil;
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
 * The persistence implementation for the fit prop financial profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FitPropFinancialProfilePersistence.class)
public class FitPropFinancialProfilePersistenceImpl
	extends BasePersistenceImpl<FitPropFinancialProfile>
	implements FitPropFinancialProfilePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FitPropFinancialProfileUtil</code> to access the fit prop financial profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FitPropFinancialProfileImpl.class.getName();

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
	 * Returns the fit prop financial profile where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropFinancialProfileException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop financial profile
	 * @throws NoSuchFitPropFinancialProfileException if a matching fit prop financial profile could not be found
	 */
	@Override
	public FitPropFinancialProfile findBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropFinancialProfileException {

		FitPropFinancialProfile fitPropFinancialProfile = fetchBygetHsraById(
			hsraApplicationId);

		if (fitPropFinancialProfile == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFitPropFinancialProfileException(sb.toString());
		}

		return fitPropFinancialProfile;
	}

	/**
	 * Returns the fit prop financial profile where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop financial profile, or <code>null</code> if a matching fit prop financial profile could not be found
	 */
	@Override
	public FitPropFinancialProfile fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the fit prop financial profile where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop financial profile, or <code>null</code> if a matching fit prop financial profile could not be found
	 */
	@Override
	public FitPropFinancialProfile fetchBygetHsraById(
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

		if (result instanceof FitPropFinancialProfile) {
			FitPropFinancialProfile fitPropFinancialProfile =
				(FitPropFinancialProfile)result;

			if (hsraApplicationId !=
					fitPropFinancialProfile.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FITPROPFINANCIALPROFILE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<FitPropFinancialProfile> list = query.list();

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
								"FitPropFinancialProfilePersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FitPropFinancialProfile fitPropFinancialProfile = list.get(
						0);

					result = fitPropFinancialProfile;

					cacheResult(fitPropFinancialProfile);
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
			return (FitPropFinancialProfile)result;
		}
	}

	/**
	 * Removes the fit prop financial profile where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop financial profile that was removed
	 */
	@Override
	public FitPropFinancialProfile removeBygetHsraById(long hsraApplicationId)
		throws NoSuchFitPropFinancialProfileException {

		FitPropFinancialProfile fitPropFinancialProfile = findBygetHsraById(
			hsraApplicationId);

		return remove(fitPropFinancialProfile);
	}

	/**
	 * Returns the number of fit prop financial profiles where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop financial profiles
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FITPROPFINANCIALPROFILE_WHERE);

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
		"fitPropFinancialProfile.hsraApplicationId = ?";

	public FitPropFinancialProfilePersistenceImpl() {
		setModelClass(FitPropFinancialProfile.class);

		setModelImplClass(FitPropFinancialProfileImpl.class);
		setModelPKClass(long.class);

		setTable(FitPropFinancialProfileTable.INSTANCE);
	}

	/**
	 * Caches the fit prop financial profile in the entity cache if it is enabled.
	 *
	 * @param fitPropFinancialProfile the fit prop financial profile
	 */
	@Override
	public void cacheResult(FitPropFinancialProfile fitPropFinancialProfile) {
		entityCache.putResult(
			FitPropFinancialProfileImpl.class,
			fitPropFinancialProfile.getPrimaryKey(), fitPropFinancialProfile);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {fitPropFinancialProfile.getHsraApplicationId()},
			fitPropFinancialProfile);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fit prop financial profiles in the entity cache if it is enabled.
	 *
	 * @param fitPropFinancialProfiles the fit prop financial profiles
	 */
	@Override
	public void cacheResult(
		List<FitPropFinancialProfile> fitPropFinancialProfiles) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fitPropFinancialProfiles.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FitPropFinancialProfile fitPropFinancialProfile :
				fitPropFinancialProfiles) {

			if (entityCache.getResult(
					FitPropFinancialProfileImpl.class,
					fitPropFinancialProfile.getPrimaryKey()) == null) {

				cacheResult(fitPropFinancialProfile);
			}
		}
	}

	/**
	 * Clears the cache for all fit prop financial profiles.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FitPropFinancialProfileImpl.class);

		finderCache.clearCache(FitPropFinancialProfileImpl.class);
	}

	/**
	 * Clears the cache for the fit prop financial profile.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FitPropFinancialProfile fitPropFinancialProfile) {
		entityCache.removeResult(
			FitPropFinancialProfileImpl.class, fitPropFinancialProfile);
	}

	@Override
	public void clearCache(
		List<FitPropFinancialProfile> fitPropFinancialProfiles) {

		for (FitPropFinancialProfile fitPropFinancialProfile :
				fitPropFinancialProfiles) {

			entityCache.removeResult(
				FitPropFinancialProfileImpl.class, fitPropFinancialProfile);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FitPropFinancialProfileImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FitPropFinancialProfileImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FitPropFinancialProfileModelImpl fitPropFinancialProfileModelImpl) {

		Object[] args = new Object[] {
			fitPropFinancialProfileModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			fitPropFinancialProfileModelImpl);
	}

	/**
	 * Creates a new fit prop financial profile with the primary key. Does not add the fit prop financial profile to the database.
	 *
	 * @param fitPropFinancialProfileId the primary key for the new fit prop financial profile
	 * @return the new fit prop financial profile
	 */
	@Override
	public FitPropFinancialProfile create(long fitPropFinancialProfileId) {
		FitPropFinancialProfile fitPropFinancialProfile =
			new FitPropFinancialProfileImpl();

		fitPropFinancialProfile.setNew(true);
		fitPropFinancialProfile.setPrimaryKey(fitPropFinancialProfileId);

		fitPropFinancialProfile.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fitPropFinancialProfile;
	}

	/**
	 * Removes the fit prop financial profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile that was removed
	 * @throws NoSuchFitPropFinancialProfileException if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public FitPropFinancialProfile remove(long fitPropFinancialProfileId)
		throws NoSuchFitPropFinancialProfileException {

		return remove((Serializable)fitPropFinancialProfileId);
	}

	/**
	 * Removes the fit prop financial profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fit prop financial profile
	 * @return the fit prop financial profile that was removed
	 * @throws NoSuchFitPropFinancialProfileException if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public FitPropFinancialProfile remove(Serializable primaryKey)
		throws NoSuchFitPropFinancialProfileException {

		Session session = null;

		try {
			session = openSession();

			FitPropFinancialProfile fitPropFinancialProfile =
				(FitPropFinancialProfile)session.get(
					FitPropFinancialProfileImpl.class, primaryKey);

			if (fitPropFinancialProfile == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFitPropFinancialProfileException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fitPropFinancialProfile);
		}
		catch (NoSuchFitPropFinancialProfileException noSuchEntityException) {
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
	protected FitPropFinancialProfile removeImpl(
		FitPropFinancialProfile fitPropFinancialProfile) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fitPropFinancialProfile)) {
				fitPropFinancialProfile = (FitPropFinancialProfile)session.get(
					FitPropFinancialProfileImpl.class,
					fitPropFinancialProfile.getPrimaryKeyObj());
			}

			if (fitPropFinancialProfile != null) {
				session.delete(fitPropFinancialProfile);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fitPropFinancialProfile != null) {
			clearCache(fitPropFinancialProfile);
		}

		return fitPropFinancialProfile;
	}

	@Override
	public FitPropFinancialProfile updateImpl(
		FitPropFinancialProfile fitPropFinancialProfile) {

		boolean isNew = fitPropFinancialProfile.isNew();

		if (!(fitPropFinancialProfile instanceof
				FitPropFinancialProfileModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fitPropFinancialProfile.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fitPropFinancialProfile);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fitPropFinancialProfile proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FitPropFinancialProfile implementation " +
					fitPropFinancialProfile.getClass());
		}

		FitPropFinancialProfileModelImpl fitPropFinancialProfileModelImpl =
			(FitPropFinancialProfileModelImpl)fitPropFinancialProfile;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fitPropFinancialProfile.getCreateDate() == null)) {
			if (serviceContext == null) {
				fitPropFinancialProfile.setCreateDate(date);
			}
			else {
				fitPropFinancialProfile.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fitPropFinancialProfileModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fitPropFinancialProfile.setModifiedDate(date);
			}
			else {
				fitPropFinancialProfile.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fitPropFinancialProfile);
			}
			else {
				fitPropFinancialProfile =
					(FitPropFinancialProfile)session.merge(
						fitPropFinancialProfile);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FitPropFinancialProfileImpl.class, fitPropFinancialProfileModelImpl,
			false, true);

		cacheUniqueFindersCache(fitPropFinancialProfileModelImpl);

		if (isNew) {
			fitPropFinancialProfile.setNew(false);
		}

		fitPropFinancialProfile.resetOriginalValues();

		return fitPropFinancialProfile;
	}

	/**
	 * Returns the fit prop financial profile with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fit prop financial profile
	 * @return the fit prop financial profile
	 * @throws NoSuchFitPropFinancialProfileException if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public FitPropFinancialProfile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFitPropFinancialProfileException {

		FitPropFinancialProfile fitPropFinancialProfile = fetchByPrimaryKey(
			primaryKey);

		if (fitPropFinancialProfile == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFitPropFinancialProfileException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fitPropFinancialProfile;
	}

	/**
	 * Returns the fit prop financial profile with the primary key or throws a <code>NoSuchFitPropFinancialProfileException</code> if it could not be found.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile
	 * @throws NoSuchFitPropFinancialProfileException if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public FitPropFinancialProfile findByPrimaryKey(
			long fitPropFinancialProfileId)
		throws NoSuchFitPropFinancialProfileException {

		return findByPrimaryKey((Serializable)fitPropFinancialProfileId);
	}

	/**
	 * Returns the fit prop financial profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile, or <code>null</code> if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public FitPropFinancialProfile fetchByPrimaryKey(
		long fitPropFinancialProfileId) {

		return fetchByPrimaryKey((Serializable)fitPropFinancialProfileId);
	}

	/**
	 * Returns all the fit prop financial profiles.
	 *
	 * @return the fit prop financial profiles
	 */
	@Override
	public List<FitPropFinancialProfile> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @return the range of fit prop financial profiles
	 */
	@Override
	public List<FitPropFinancialProfile> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop financial profiles
	 */
	@Override
	public List<FitPropFinancialProfile> findAll(
		int start, int end,
		OrderByComparator<FitPropFinancialProfile> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop financial profiles
	 */
	@Override
	public List<FitPropFinancialProfile> findAll(
		int start, int end,
		OrderByComparator<FitPropFinancialProfile> orderByComparator,
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

		List<FitPropFinancialProfile> list = null;

		if (useFinderCache) {
			list = (List<FitPropFinancialProfile>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FITPROPFINANCIALPROFILE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FITPROPFINANCIALPROFILE;

				sql = sql.concat(
					FitPropFinancialProfileModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FitPropFinancialProfile>)QueryUtil.list(
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
	 * Removes all the fit prop financial profiles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FitPropFinancialProfile fitPropFinancialProfile : findAll()) {
			remove(fitPropFinancialProfile);
		}
	}

	/**
	 * Returns the number of fit prop financial profiles.
	 *
	 * @return the number of fit prop financial profiles
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
					_SQL_COUNT_FITPROPFINANCIALPROFILE);

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
		return "fitPropFinancialProfileId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FITPROPFINANCIALPROFILE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FitPropFinancialProfileModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fit prop financial profile persistence.
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

		FitPropFinancialProfileUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FitPropFinancialProfileUtil.setPersistence(null);

		entityCache.removeCache(FitPropFinancialProfileImpl.class.getName());
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

	private static final String _SQL_SELECT_FITPROPFINANCIALPROFILE =
		"SELECT fitPropFinancialProfile FROM FitPropFinancialProfile fitPropFinancialProfile";

	private static final String _SQL_SELECT_FITPROPFINANCIALPROFILE_WHERE =
		"SELECT fitPropFinancialProfile FROM FitPropFinancialProfile fitPropFinancialProfile WHERE ";

	private static final String _SQL_COUNT_FITPROPFINANCIALPROFILE =
		"SELECT COUNT(fitPropFinancialProfile) FROM FitPropFinancialProfile fitPropFinancialProfile";

	private static final String _SQL_COUNT_FITPROPFINANCIALPROFILE_WHERE =
		"SELECT COUNT(fitPropFinancialProfile) FROM FitPropFinancialProfile fitPropFinancialProfile WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fitPropFinancialProfile.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FitPropFinancialProfile exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FitPropFinancialProfile exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FitPropFinancialProfilePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}