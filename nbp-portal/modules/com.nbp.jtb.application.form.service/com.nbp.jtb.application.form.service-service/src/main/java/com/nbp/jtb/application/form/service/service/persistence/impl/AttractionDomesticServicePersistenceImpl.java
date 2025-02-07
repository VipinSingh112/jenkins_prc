/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchAttractionDomesticServiceException;
import com.nbp.jtb.application.form.service.model.AttractionDomesticService;
import com.nbp.jtb.application.form.service.model.AttractionDomesticServiceTable;
import com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceImpl;
import com.nbp.jtb.application.form.service.model.impl.AttractionDomesticServiceModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.AttractionDomesticServicePersistence;
import com.nbp.jtb.application.form.service.service.persistence.AttractionDomesticServiceUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the attraction domestic service service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AttractionDomesticServicePersistence.class)
public class AttractionDomesticServicePersistenceImpl
	extends BasePersistenceImpl<AttractionDomesticService>
	implements AttractionDomesticServicePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AttractionDomesticServiceUtil</code> to access the attraction domestic service persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AttractionDomesticServiceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJTB_ByApplicationId;
	private FinderPath _finderPathCountBygetJTB_ByApplicationId;

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or throws a <code>NoSuchAttractionDomesticServiceException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a matching attraction domestic service could not be found
	 */
	@Override
	public AttractionDomesticService findBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticServiceException {

		AttractionDomesticService attractionDomesticService =
			fetchBygetJTB_ByApplicationId(jtbApplicationId);

		if (attractionDomesticService == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbApplicationId=");
			sb.append(jtbApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAttractionDomesticServiceException(sb.toString());
		}

		return attractionDomesticService;
	}

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the matching attraction domestic service, or <code>null</code> if a matching attraction domestic service could not be found
	 */
	@Override
	public AttractionDomesticService fetchBygetJTB_ByApplicationId(
		long jtbApplicationId) {

		return fetchBygetJTB_ByApplicationId(jtbApplicationId, true);
	}

	/**
	 * Returns the attraction domestic service where jtbApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching attraction domestic service, or <code>null</code> if a matching attraction domestic service could not be found
	 */
	@Override
	public AttractionDomesticService fetchBygetJTB_ByApplicationId(
		long jtbApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jtbApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByApplicationId, finderArgs, this);
		}

		if (result instanceof AttractionDomesticService) {
			AttractionDomesticService attractionDomesticService =
				(AttractionDomesticService)result;

			if (jtbApplicationId !=
					attractionDomesticService.getJtbApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ATTRACTIONDOMESTICSERVICE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

				List<AttractionDomesticService> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jtbApplicationId};
							}

							_log.warn(
								"AttractionDomesticServicePersistenceImpl.fetchBygetJTB_ByApplicationId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttractionDomesticService attractionDomesticService =
						list.get(0);

					result = attractionDomesticService;

					cacheResult(attractionDomesticService);
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
			return (AttractionDomesticService)result;
		}
	}

	/**
	 * Removes the attraction domestic service where jtbApplicationId = &#63; from the database.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the attraction domestic service that was removed
	 */
	@Override
	public AttractionDomesticService removeBygetJTB_ByApplicationId(
			long jtbApplicationId)
		throws NoSuchAttractionDomesticServiceException {

		AttractionDomesticService attractionDomesticService =
			findBygetJTB_ByApplicationId(jtbApplicationId);

		return remove(attractionDomesticService);
	}

	/**
	 * Returns the number of attraction domestic services where jtbApplicationId = &#63;.
	 *
	 * @param jtbApplicationId the jtb application ID
	 * @return the number of matching attraction domestic services
	 */
	@Override
	public int countBygetJTB_ByApplicationId(long jtbApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByApplicationId;

		Object[] finderArgs = new Object[] {jtbApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ATTRACTIONDOMESTICSERVICE_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jtbApplicationId);

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
		_FINDER_COLUMN_GETJTB_BYAPPLICATIONID_JTBAPPLICATIONID_2 =
			"attractionDomesticService.jtbApplicationId = ?";

	public AttractionDomesticServicePersistenceImpl() {
		setModelClass(AttractionDomesticService.class);

		setModelImplClass(AttractionDomesticServiceImpl.class);
		setModelPKClass(long.class);

		setTable(AttractionDomesticServiceTable.INSTANCE);
	}

	/**
	 * Caches the attraction domestic service in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticService the attraction domestic service
	 */
	@Override
	public void cacheResult(
		AttractionDomesticService attractionDomesticService) {

		entityCache.putResult(
			AttractionDomesticServiceImpl.class,
			attractionDomesticService.getPrimaryKey(),
			attractionDomesticService);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId,
			new Object[] {attractionDomesticService.getJtbApplicationId()},
			attractionDomesticService);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the attraction domestic services in the entity cache if it is enabled.
	 *
	 * @param attractionDomesticServices the attraction domestic services
	 */
	@Override
	public void cacheResult(
		List<AttractionDomesticService> attractionDomesticServices) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (attractionDomesticServices.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AttractionDomesticService attractionDomesticService :
				attractionDomesticServices) {

			if (entityCache.getResult(
					AttractionDomesticServiceImpl.class,
					attractionDomesticService.getPrimaryKey()) == null) {

				cacheResult(attractionDomesticService);
			}
		}
	}

	/**
	 * Clears the cache for all attraction domestic services.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttractionDomesticServiceImpl.class);

		finderCache.clearCache(AttractionDomesticServiceImpl.class);
	}

	/**
	 * Clears the cache for the attraction domestic service.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AttractionDomesticService attractionDomesticService) {

		entityCache.removeResult(
			AttractionDomesticServiceImpl.class, attractionDomesticService);
	}

	@Override
	public void clearCache(
		List<AttractionDomesticService> attractionDomesticServices) {

		for (AttractionDomesticService attractionDomesticService :
				attractionDomesticServices) {

			entityCache.removeResult(
				AttractionDomesticServiceImpl.class, attractionDomesticService);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AttractionDomesticServiceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AttractionDomesticServiceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AttractionDomesticServiceModelImpl attractionDomesticServiceModelImpl) {

		Object[] args = new Object[] {
			attractionDomesticServiceModelImpl.getJtbApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByApplicationId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByApplicationId, args,
			attractionDomesticServiceModelImpl);
	}

	/**
	 * Creates a new attraction domestic service with the primary key. Does not add the attraction domestic service to the database.
	 *
	 * @param attractionDomesticServId the primary key for the new attraction domestic service
	 * @return the new attraction domestic service
	 */
	@Override
	public AttractionDomesticService create(long attractionDomesticServId) {
		AttractionDomesticService attractionDomesticService =
			new AttractionDomesticServiceImpl();

		attractionDomesticService.setNew(true);
		attractionDomesticService.setPrimaryKey(attractionDomesticServId);

		attractionDomesticService.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return attractionDomesticService;
	}

	/**
	 * Removes the attraction domestic service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service that was removed
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public AttractionDomesticService remove(long attractionDomesticServId)
		throws NoSuchAttractionDomesticServiceException {

		return remove((Serializable)attractionDomesticServId);
	}

	/**
	 * Removes the attraction domestic service with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attraction domestic service
	 * @return the attraction domestic service that was removed
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public AttractionDomesticService remove(Serializable primaryKey)
		throws NoSuchAttractionDomesticServiceException {

		Session session = null;

		try {
			session = openSession();

			AttractionDomesticService attractionDomesticService =
				(AttractionDomesticService)session.get(
					AttractionDomesticServiceImpl.class, primaryKey);

			if (attractionDomesticService == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttractionDomesticServiceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(attractionDomesticService);
		}
		catch (NoSuchAttractionDomesticServiceException noSuchEntityException) {
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
	protected AttractionDomesticService removeImpl(
		AttractionDomesticService attractionDomesticService) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attractionDomesticService)) {
				attractionDomesticService =
					(AttractionDomesticService)session.get(
						AttractionDomesticServiceImpl.class,
						attractionDomesticService.getPrimaryKeyObj());
			}

			if (attractionDomesticService != null) {
				session.delete(attractionDomesticService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (attractionDomesticService != null) {
			clearCache(attractionDomesticService);
		}

		return attractionDomesticService;
	}

	@Override
	public AttractionDomesticService updateImpl(
		AttractionDomesticService attractionDomesticService) {

		boolean isNew = attractionDomesticService.isNew();

		if (!(attractionDomesticService instanceof
				AttractionDomesticServiceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(attractionDomesticService.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					attractionDomesticService);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in attractionDomesticService proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AttractionDomesticService implementation " +
					attractionDomesticService.getClass());
		}

		AttractionDomesticServiceModelImpl attractionDomesticServiceModelImpl =
			(AttractionDomesticServiceModelImpl)attractionDomesticService;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (attractionDomesticService.getCreateDate() == null)) {
			if (serviceContext == null) {
				attractionDomesticService.setCreateDate(date);
			}
			else {
				attractionDomesticService.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!attractionDomesticServiceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				attractionDomesticService.setModifiedDate(date);
			}
			else {
				attractionDomesticService.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(attractionDomesticService);
			}
			else {
				attractionDomesticService =
					(AttractionDomesticService)session.merge(
						attractionDomesticService);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AttractionDomesticServiceImpl.class,
			attractionDomesticServiceModelImpl, false, true);

		cacheUniqueFindersCache(attractionDomesticServiceModelImpl);

		if (isNew) {
			attractionDomesticService.setNew(false);
		}

		attractionDomesticService.resetOriginalValues();

		return attractionDomesticService;
	}

	/**
	 * Returns the attraction domestic service with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attraction domestic service
	 * @return the attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public AttractionDomesticService findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttractionDomesticServiceException {

		AttractionDomesticService attractionDomesticService = fetchByPrimaryKey(
			primaryKey);

		if (attractionDomesticService == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttractionDomesticServiceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return attractionDomesticService;
	}

	/**
	 * Returns the attraction domestic service with the primary key or throws a <code>NoSuchAttractionDomesticServiceException</code> if it could not be found.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service
	 * @throws NoSuchAttractionDomesticServiceException if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public AttractionDomesticService findByPrimaryKey(
			long attractionDomesticServId)
		throws NoSuchAttractionDomesticServiceException {

		return findByPrimaryKey((Serializable)attractionDomesticServId);
	}

	/**
	 * Returns the attraction domestic service with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param attractionDomesticServId the primary key of the attraction domestic service
	 * @return the attraction domestic service, or <code>null</code> if a attraction domestic service with the primary key could not be found
	 */
	@Override
	public AttractionDomesticService fetchByPrimaryKey(
		long attractionDomesticServId) {

		return fetchByPrimaryKey((Serializable)attractionDomesticServId);
	}

	/**
	 * Returns all the attraction domestic services.
	 *
	 * @return the attraction domestic services
	 */
	@Override
	public List<AttractionDomesticService> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @return the range of attraction domestic services
	 */
	@Override
	public List<AttractionDomesticService> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attraction domestic services
	 */
	@Override
	public List<AttractionDomesticService> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticService> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attraction domestic services.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AttractionDomesticServiceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of attraction domestic services
	 * @param end the upper bound of the range of attraction domestic services (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of attraction domestic services
	 */
	@Override
	public List<AttractionDomesticService> findAll(
		int start, int end,
		OrderByComparator<AttractionDomesticService> orderByComparator,
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

		List<AttractionDomesticService> list = null;

		if (useFinderCache) {
			list = (List<AttractionDomesticService>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ATTRACTIONDOMESTICSERVICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ATTRACTIONDOMESTICSERVICE;

				sql = sql.concat(
					AttractionDomesticServiceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AttractionDomesticService>)QueryUtil.list(
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
	 * Removes all the attraction domestic services from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttractionDomesticService attractionDomesticService : findAll()) {
			remove(attractionDomesticService);
		}
	}

	/**
	 * Returns the number of attraction domestic services.
	 *
	 * @return the number of attraction domestic services
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
					_SQL_COUNT_ATTRACTIONDOMESTICSERVICE);

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
		return "attractionDomesticServId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ATTRACTIONDOMESTICSERVICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AttractionDomesticServiceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attraction domestic service persistence.
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

		_finderPathFetchBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, true);

		_finderPathCountBygetJTB_ByApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_ByApplicationId",
			new String[] {Long.class.getName()},
			new String[] {"jtbApplicationId"}, false);

		AttractionDomesticServiceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AttractionDomesticServiceUtil.setPersistence(null);

		entityCache.removeCache(AttractionDomesticServiceImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ATTRACTIONDOMESTICSERVICE =
		"SELECT attractionDomesticService FROM AttractionDomesticService attractionDomesticService";

	private static final String _SQL_SELECT_ATTRACTIONDOMESTICSERVICE_WHERE =
		"SELECT attractionDomesticService FROM AttractionDomesticService attractionDomesticService WHERE ";

	private static final String _SQL_COUNT_ATTRACTIONDOMESTICSERVICE =
		"SELECT COUNT(attractionDomesticService) FROM AttractionDomesticService attractionDomesticService";

	private static final String _SQL_COUNT_ATTRACTIONDOMESTICSERVICE_WHERE =
		"SELECT COUNT(attractionDomesticService) FROM AttractionDomesticService attractionDomesticService WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"attractionDomesticService.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AttractionDomesticService exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AttractionDomesticService exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AttractionDomesticServicePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}