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

import com.nbp.hsra.application.service.exception.NoSuchRadiationSafetyProgramException;
import com.nbp.hsra.application.service.model.RadiationSafetyProgram;
import com.nbp.hsra.application.service.model.RadiationSafetyProgramTable;
import com.nbp.hsra.application.service.model.impl.RadiationSafetyProgramImpl;
import com.nbp.hsra.application.service.model.impl.RadiationSafetyProgramModelImpl;
import com.nbp.hsra.application.service.service.persistence.RadiationSafetyProgramPersistence;
import com.nbp.hsra.application.service.service.persistence.RadiationSafetyProgramUtil;
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
 * The persistence implementation for the radiation safety program service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RadiationSafetyProgramPersistence.class)
public class RadiationSafetyProgramPersistenceImpl
	extends BasePersistenceImpl<RadiationSafetyProgram>
	implements RadiationSafetyProgramPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RadiationSafetyProgramUtil</code> to access the radiation safety program persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RadiationSafetyProgramImpl.class.getName();

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
	 * Returns the radiation safety program where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationSafetyProgramException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a matching radiation safety program could not be found
	 */
	@Override
	public RadiationSafetyProgram findBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationSafetyProgramException {

		RadiationSafetyProgram radiationSafetyProgram = fetchBygetHsraById(
			hsraApplicationId);

		if (radiationSafetyProgram == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchRadiationSafetyProgramException(sb.toString());
		}

		return radiationSafetyProgram;
	}

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety program, or <code>null</code> if a matching radiation safety program could not be found
	 */
	@Override
	public RadiationSafetyProgram fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation safety program, or <code>null</code> if a matching radiation safety program could not be found
	 */
	@Override
	public RadiationSafetyProgram fetchBygetHsraById(
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

		if (result instanceof RadiationSafetyProgram) {
			RadiationSafetyProgram radiationSafetyProgram =
				(RadiationSafetyProgram)result;

			if (hsraApplicationId !=
					radiationSafetyProgram.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_RADIATIONSAFETYPROGRAM_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<RadiationSafetyProgram> list = query.list();

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
								"RadiationSafetyProgramPersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					RadiationSafetyProgram radiationSafetyProgram = list.get(0);

					result = radiationSafetyProgram;

					cacheResult(radiationSafetyProgram);
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
			return (RadiationSafetyProgram)result;
		}
	}

	/**
	 * Removes the radiation safety program where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation safety program that was removed
	 */
	@Override
	public RadiationSafetyProgram removeBygetHsraById(long hsraApplicationId)
		throws NoSuchRadiationSafetyProgramException {

		RadiationSafetyProgram radiationSafetyProgram = findBygetHsraById(
			hsraApplicationId);

		return remove(radiationSafetyProgram);
	}

	/**
	 * Returns the number of radiation safety programs where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation safety programs
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_RADIATIONSAFETYPROGRAM_WHERE);

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
		"radiationSafetyProgram.hsraApplicationId = ?";

	public RadiationSafetyProgramPersistenceImpl() {
		setModelClass(RadiationSafetyProgram.class);

		setModelImplClass(RadiationSafetyProgramImpl.class);
		setModelPKClass(long.class);

		setTable(RadiationSafetyProgramTable.INSTANCE);
	}

	/**
	 * Caches the radiation safety program in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyProgram the radiation safety program
	 */
	@Override
	public void cacheResult(RadiationSafetyProgram radiationSafetyProgram) {
		entityCache.putResult(
			RadiationSafetyProgramImpl.class,
			radiationSafetyProgram.getPrimaryKey(), radiationSafetyProgram);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {radiationSafetyProgram.getHsraApplicationId()},
			radiationSafetyProgram);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the radiation safety programs in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyPrograms the radiation safety programs
	 */
	@Override
	public void cacheResult(
		List<RadiationSafetyProgram> radiationSafetyPrograms) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (radiationSafetyPrograms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (RadiationSafetyProgram radiationSafetyProgram :
				radiationSafetyPrograms) {

			if (entityCache.getResult(
					RadiationSafetyProgramImpl.class,
					radiationSafetyProgram.getPrimaryKey()) == null) {

				cacheResult(radiationSafetyProgram);
			}
		}
	}

	/**
	 * Clears the cache for all radiation safety programs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RadiationSafetyProgramImpl.class);

		finderCache.clearCache(RadiationSafetyProgramImpl.class);
	}

	/**
	 * Clears the cache for the radiation safety program.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RadiationSafetyProgram radiationSafetyProgram) {
		entityCache.removeResult(
			RadiationSafetyProgramImpl.class, radiationSafetyProgram);
	}

	@Override
	public void clearCache(
		List<RadiationSafetyProgram> radiationSafetyPrograms) {

		for (RadiationSafetyProgram radiationSafetyProgram :
				radiationSafetyPrograms) {

			entityCache.removeResult(
				RadiationSafetyProgramImpl.class, radiationSafetyProgram);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RadiationSafetyProgramImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RadiationSafetyProgramImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		RadiationSafetyProgramModelImpl radiationSafetyProgramModelImpl) {

		Object[] args = new Object[] {
			radiationSafetyProgramModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			radiationSafetyProgramModelImpl);
	}

	/**
	 * Creates a new radiation safety program with the primary key. Does not add the radiation safety program to the database.
	 *
	 * @param radiationSafetyProgramId the primary key for the new radiation safety program
	 * @return the new radiation safety program
	 */
	@Override
	public RadiationSafetyProgram create(long radiationSafetyProgramId) {
		RadiationSafetyProgram radiationSafetyProgram =
			new RadiationSafetyProgramImpl();

		radiationSafetyProgram.setNew(true);
		radiationSafetyProgram.setPrimaryKey(radiationSafetyProgramId);

		radiationSafetyProgram.setCompanyId(CompanyThreadLocal.getCompanyId());

		return radiationSafetyProgram;
	}

	/**
	 * Removes the radiation safety program with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program that was removed
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	@Override
	public RadiationSafetyProgram remove(long radiationSafetyProgramId)
		throws NoSuchRadiationSafetyProgramException {

		return remove((Serializable)radiationSafetyProgramId);
	}

	/**
	 * Removes the radiation safety program with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the radiation safety program
	 * @return the radiation safety program that was removed
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	@Override
	public RadiationSafetyProgram remove(Serializable primaryKey)
		throws NoSuchRadiationSafetyProgramException {

		Session session = null;

		try {
			session = openSession();

			RadiationSafetyProgram radiationSafetyProgram =
				(RadiationSafetyProgram)session.get(
					RadiationSafetyProgramImpl.class, primaryKey);

			if (radiationSafetyProgram == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRadiationSafetyProgramException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(radiationSafetyProgram);
		}
		catch (NoSuchRadiationSafetyProgramException noSuchEntityException) {
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
	protected RadiationSafetyProgram removeImpl(
		RadiationSafetyProgram radiationSafetyProgram) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(radiationSafetyProgram)) {
				radiationSafetyProgram = (RadiationSafetyProgram)session.get(
					RadiationSafetyProgramImpl.class,
					radiationSafetyProgram.getPrimaryKeyObj());
			}

			if (radiationSafetyProgram != null) {
				session.delete(radiationSafetyProgram);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (radiationSafetyProgram != null) {
			clearCache(radiationSafetyProgram);
		}

		return radiationSafetyProgram;
	}

	@Override
	public RadiationSafetyProgram updateImpl(
		RadiationSafetyProgram radiationSafetyProgram) {

		boolean isNew = radiationSafetyProgram.isNew();

		if (!(radiationSafetyProgram instanceof
				RadiationSafetyProgramModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(radiationSafetyProgram.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					radiationSafetyProgram);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in radiationSafetyProgram proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom RadiationSafetyProgram implementation " +
					radiationSafetyProgram.getClass());
		}

		RadiationSafetyProgramModelImpl radiationSafetyProgramModelImpl =
			(RadiationSafetyProgramModelImpl)radiationSafetyProgram;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (radiationSafetyProgram.getCreateDate() == null)) {
			if (serviceContext == null) {
				radiationSafetyProgram.setCreateDate(date);
			}
			else {
				radiationSafetyProgram.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!radiationSafetyProgramModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				radiationSafetyProgram.setModifiedDate(date);
			}
			else {
				radiationSafetyProgram.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(radiationSafetyProgram);
			}
			else {
				radiationSafetyProgram = (RadiationSafetyProgram)session.merge(
					radiationSafetyProgram);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RadiationSafetyProgramImpl.class, radiationSafetyProgramModelImpl,
			false, true);

		cacheUniqueFindersCache(radiationSafetyProgramModelImpl);

		if (isNew) {
			radiationSafetyProgram.setNew(false);
		}

		radiationSafetyProgram.resetOriginalValues();

		return radiationSafetyProgram;
	}

	/**
	 * Returns the radiation safety program with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the radiation safety program
	 * @return the radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	@Override
	public RadiationSafetyProgram findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRadiationSafetyProgramException {

		RadiationSafetyProgram radiationSafetyProgram = fetchByPrimaryKey(
			primaryKey);

		if (radiationSafetyProgram == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRadiationSafetyProgramException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return radiationSafetyProgram;
	}

	/**
	 * Returns the radiation safety program with the primary key or throws a <code>NoSuchRadiationSafetyProgramException</code> if it could not be found.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	@Override
	public RadiationSafetyProgram findByPrimaryKey(
			long radiationSafetyProgramId)
		throws NoSuchRadiationSafetyProgramException {

		return findByPrimaryKey((Serializable)radiationSafetyProgramId);
	}

	/**
	 * Returns the radiation safety program with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program, or <code>null</code> if a radiation safety program with the primary key could not be found
	 */
	@Override
	public RadiationSafetyProgram fetchByPrimaryKey(
		long radiationSafetyProgramId) {

		return fetchByPrimaryKey((Serializable)radiationSafetyProgramId);
	}

	/**
	 * Returns all the radiation safety programs.
	 *
	 * @return the radiation safety programs
	 */
	@Override
	public List<RadiationSafetyProgram> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @return the range of radiation safety programs
	 */
	@Override
	public List<RadiationSafetyProgram> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation safety programs
	 */
	@Override
	public List<RadiationSafetyProgram> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyProgram> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation safety programs
	 */
	@Override
	public List<RadiationSafetyProgram> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyProgram> orderByComparator,
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

		List<RadiationSafetyProgram> list = null;

		if (useFinderCache) {
			list = (List<RadiationSafetyProgram>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RADIATIONSAFETYPROGRAM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RADIATIONSAFETYPROGRAM;

				sql = sql.concat(RadiationSafetyProgramModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RadiationSafetyProgram>)QueryUtil.list(
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
	 * Removes all the radiation safety programs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RadiationSafetyProgram radiationSafetyProgram : findAll()) {
			remove(radiationSafetyProgram);
		}
	}

	/**
	 * Returns the number of radiation safety programs.
	 *
	 * @return the number of radiation safety programs
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
					_SQL_COUNT_RADIATIONSAFETYPROGRAM);

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
		return "radiationSafetyProgramId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RADIATIONSAFETYPROGRAM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RadiationSafetyProgramModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the radiation safety program persistence.
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

		RadiationSafetyProgramUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		RadiationSafetyProgramUtil.setPersistence(null);

		entityCache.removeCache(RadiationSafetyProgramImpl.class.getName());
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

	private static final String _SQL_SELECT_RADIATIONSAFETYPROGRAM =
		"SELECT radiationSafetyProgram FROM RadiationSafetyProgram radiationSafetyProgram";

	private static final String _SQL_SELECT_RADIATIONSAFETYPROGRAM_WHERE =
		"SELECT radiationSafetyProgram FROM RadiationSafetyProgram radiationSafetyProgram WHERE ";

	private static final String _SQL_COUNT_RADIATIONSAFETYPROGRAM =
		"SELECT COUNT(radiationSafetyProgram) FROM RadiationSafetyProgram radiationSafetyProgram";

	private static final String _SQL_COUNT_RADIATIONSAFETYPROGRAM_WHERE =
		"SELECT COUNT(radiationSafetyProgram) FROM RadiationSafetyProgram radiationSafetyProgram WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"radiationSafetyProgram.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RadiationSafetyProgram exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No RadiationSafetyProgram exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		RadiationSafetyProgramPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}