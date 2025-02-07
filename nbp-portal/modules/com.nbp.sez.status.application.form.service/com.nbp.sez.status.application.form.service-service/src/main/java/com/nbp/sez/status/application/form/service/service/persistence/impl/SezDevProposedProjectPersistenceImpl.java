/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevProposedProjectException;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;
import com.nbp.sez.status.application.form.service.model.SezDevProposedProjectTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevProposedProjectModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevProposedProjectPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevProposedProjectUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev proposed project service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevProposedProjectPersistence.class)
public class SezDevProposedProjectPersistenceImpl
	extends BasePersistenceImpl<SezDevProposedProject>
	implements SezDevProposedProjectPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevProposedProjectUtil</code> to access the sez dev proposed project persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevProposedProjectImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevProposedProjectException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a matching sez dev proposed project could not be found
	 */
	@Override
	public SezDevProposedProject findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevProposedProjectException {

		SezDevProposedProject sezDevProposedProject =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDevProposedProject == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevProposedProjectException(sb.toString());
		}

		return sezDevProposedProject;
	}

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project, or <code>null</code> if a matching sez dev proposed project could not be found
	 */
	@Override
	public SezDevProposedProject fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev proposed project, or <code>null</code> if a matching sez dev proposed project could not be found
	 */
	@Override
	public SezDevProposedProject fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezDevProposedProject) {
			SezDevProposedProject sezDevProposedProject =
				(SezDevProposedProject)result;

			if (sezStatusApplicationId !=
					sezDevProposedProject.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVPROPOSEDPROJECT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevProposedProject> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezDevProposedProjectPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevProposedProject sezDevProposedProject = list.get(0);

					result = sezDevProposedProject;

					cacheResult(sezDevProposedProject);
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
			return (SezDevProposedProject)result;
		}
	}

	/**
	 * Removes the sez dev proposed project where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev proposed project that was removed
	 */
	@Override
	public SezDevProposedProject removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevProposedProjectException {

		SezDevProposedProject sezDevProposedProject = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezDevProposedProject);
	}

	/**
	 * Returns the number of sez dev proposed projects where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev proposed projects
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVPROPOSEDPROJECT_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevProposedProject.sezStatusApplicationId = ?";

	public SezDevProposedProjectPersistenceImpl() {
		setModelClass(SezDevProposedProject.class);

		setModelImplClass(SezDevProposedProjectImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevProposedProjectTable.INSTANCE);
	}

	/**
	 * Caches the sez dev proposed project in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProject the sez dev proposed project
	 */
	@Override
	public void cacheResult(SezDevProposedProject sezDevProposedProject) {
		entityCache.putResult(
			SezDevProposedProjectImpl.class,
			sezDevProposedProject.getPrimaryKey(), sezDevProposedProject);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDevProposedProject.getSezStatusApplicationId()},
			sezDevProposedProject);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev proposed projects in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjects the sez dev proposed projects
	 */
	@Override
	public void cacheResult(
		List<SezDevProposedProject> sezDevProposedProjects) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevProposedProjects.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevProposedProject sezDevProposedProject :
				sezDevProposedProjects) {

			if (entityCache.getResult(
					SezDevProposedProjectImpl.class,
					sezDevProposedProject.getPrimaryKey()) == null) {

				cacheResult(sezDevProposedProject);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev proposed projects.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevProposedProjectImpl.class);

		finderCache.clearCache(SezDevProposedProjectImpl.class);
	}

	/**
	 * Clears the cache for the sez dev proposed project.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevProposedProject sezDevProposedProject) {
		entityCache.removeResult(
			SezDevProposedProjectImpl.class, sezDevProposedProject);
	}

	@Override
	public void clearCache(List<SezDevProposedProject> sezDevProposedProjects) {
		for (SezDevProposedProject sezDevProposedProject :
				sezDevProposedProjects) {

			entityCache.removeResult(
				SezDevProposedProjectImpl.class, sezDevProposedProject);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevProposedProjectImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevProposedProjectImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevProposedProjectModelImpl sezDevProposedProjectModelImpl) {

		Object[] args = new Object[] {
			sezDevProposedProjectModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevProposedProjectModelImpl);
	}

	/**
	 * Creates a new sez dev proposed project with the primary key. Does not add the sez dev proposed project to the database.
	 *
	 * @param sezDevProposedProjectId the primary key for the new sez dev proposed project
	 * @return the new sez dev proposed project
	 */
	@Override
	public SezDevProposedProject create(long sezDevProposedProjectId) {
		SezDevProposedProject sezDevProposedProject =
			new SezDevProposedProjectImpl();

		sezDevProposedProject.setNew(true);
		sezDevProposedProject.setPrimaryKey(sezDevProposedProjectId);

		sezDevProposedProject.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDevProposedProject;
	}

	/**
	 * Removes the sez dev proposed project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project that was removed
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public SezDevProposedProject remove(long sezDevProposedProjectId)
		throws NoSuchSezDevProposedProjectException {

		return remove((Serializable)sezDevProposedProjectId);
	}

	/**
	 * Removes the sez dev proposed project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev proposed project
	 * @return the sez dev proposed project that was removed
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public SezDevProposedProject remove(Serializable primaryKey)
		throws NoSuchSezDevProposedProjectException {

		Session session = null;

		try {
			session = openSession();

			SezDevProposedProject sezDevProposedProject =
				(SezDevProposedProject)session.get(
					SezDevProposedProjectImpl.class, primaryKey);

			if (sezDevProposedProject == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevProposedProjectException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevProposedProject);
		}
		catch (NoSuchSezDevProposedProjectException noSuchEntityException) {
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
	protected SezDevProposedProject removeImpl(
		SezDevProposedProject sezDevProposedProject) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevProposedProject)) {
				sezDevProposedProject = (SezDevProposedProject)session.get(
					SezDevProposedProjectImpl.class,
					sezDevProposedProject.getPrimaryKeyObj());
			}

			if (sezDevProposedProject != null) {
				session.delete(sezDevProposedProject);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevProposedProject != null) {
			clearCache(sezDevProposedProject);
		}

		return sezDevProposedProject;
	}

	@Override
	public SezDevProposedProject updateImpl(
		SezDevProposedProject sezDevProposedProject) {

		boolean isNew = sezDevProposedProject.isNew();

		if (!(sezDevProposedProject instanceof
				SezDevProposedProjectModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevProposedProject.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevProposedProject);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevProposedProject proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevProposedProject implementation " +
					sezDevProposedProject.getClass());
		}

		SezDevProposedProjectModelImpl sezDevProposedProjectModelImpl =
			(SezDevProposedProjectModelImpl)sezDevProposedProject;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevProposedProject.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevProposedProject.setCreateDate(date);
			}
			else {
				sezDevProposedProject.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevProposedProjectModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevProposedProject.setModifiedDate(date);
			}
			else {
				sezDevProposedProject.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevProposedProject);
			}
			else {
				sezDevProposedProject = (SezDevProposedProject)session.merge(
					sezDevProposedProject);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevProposedProjectImpl.class, sezDevProposedProjectModelImpl,
			false, true);

		cacheUniqueFindersCache(sezDevProposedProjectModelImpl);

		if (isNew) {
			sezDevProposedProject.setNew(false);
		}

		sezDevProposedProject.resetOriginalValues();

		return sezDevProposedProject;
	}

	/**
	 * Returns the sez dev proposed project with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev proposed project
	 * @return the sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public SezDevProposedProject findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevProposedProjectException {

		SezDevProposedProject sezDevProposedProject = fetchByPrimaryKey(
			primaryKey);

		if (sezDevProposedProject == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevProposedProjectException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevProposedProject;
	}

	/**
	 * Returns the sez dev proposed project with the primary key or throws a <code>NoSuchSezDevProposedProjectException</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public SezDevProposedProject findByPrimaryKey(long sezDevProposedProjectId)
		throws NoSuchSezDevProposedProjectException {

		return findByPrimaryKey((Serializable)sezDevProposedProjectId);
	}

	/**
	 * Returns the sez dev proposed project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project, or <code>null</code> if a sez dev proposed project with the primary key could not be found
	 */
	@Override
	public SezDevProposedProject fetchByPrimaryKey(
		long sezDevProposedProjectId) {

		return fetchByPrimaryKey((Serializable)sezDevProposedProjectId);
	}

	/**
	 * Returns all the sez dev proposed projects.
	 *
	 * @return the sez dev proposed projects
	 */
	@Override
	public List<SezDevProposedProject> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @return the range of sez dev proposed projects
	 */
	@Override
	public List<SezDevProposedProject> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev proposed projects
	 */
	@Override
	public List<SezDevProposedProject> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProject> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev proposed projects
	 */
	@Override
	public List<SezDevProposedProject> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProject> orderByComparator,
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

		List<SezDevProposedProject> list = null;

		if (useFinderCache) {
			list = (List<SezDevProposedProject>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVPROPOSEDPROJECT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVPROPOSEDPROJECT;

				sql = sql.concat(SezDevProposedProjectModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevProposedProject>)QueryUtil.list(
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
	 * Removes all the sez dev proposed projects from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevProposedProject sezDevProposedProject : findAll()) {
			remove(sezDevProposedProject);
		}
	}

	/**
	 * Returns the number of sez dev proposed projects.
	 *
	 * @return the number of sez dev proposed projects
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
					_SQL_COUNT_SEZDEVPROPOSEDPROJECT);

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
		return "sezDevProposedProjectId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVPROPOSEDPROJECT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevProposedProjectModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev proposed project persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevProposedProjectUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevProposedProjectUtil.setPersistence(null);

		entityCache.removeCache(SezDevProposedProjectImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVPROPOSEDPROJECT =
		"SELECT sezDevProposedProject FROM SezDevProposedProject sezDevProposedProject";

	private static final String _SQL_SELECT_SEZDEVPROPOSEDPROJECT_WHERE =
		"SELECT sezDevProposedProject FROM SezDevProposedProject sezDevProposedProject WHERE ";

	private static final String _SQL_COUNT_SEZDEVPROPOSEDPROJECT =
		"SELECT COUNT(sezDevProposedProject) FROM SezDevProposedProject sezDevProposedProject";

	private static final String _SQL_COUNT_SEZDEVPROPOSEDPROJECT_WHERE =
		"SELECT COUNT(sezDevProposedProject) FROM SezDevProposedProject sezDevProposedProject WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevProposedProject.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevProposedProject exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevProposedProject exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevProposedProjectPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}