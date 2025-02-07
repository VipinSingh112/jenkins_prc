/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOSIServiceSupportingDocIndException;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocInd;
import com.nbp.osi.services.application.form.service.model.OSIServiceSupportingDocIndTable;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndImpl;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceSupportingDocIndPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceSupportingDocIndUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

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
 * The persistence implementation for the osi service supporting doc ind service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OSIServiceSupportingDocIndPersistence.class)
public class OSIServiceSupportingDocIndPersistenceImpl
	extends BasePersistenceImpl<OSIServiceSupportingDocInd>
	implements OSIServiceSupportingDocIndPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OSIServiceSupportingDocIndUtil</code> to access the osi service supporting doc ind persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OSIServiceSupportingDocIndImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOSIService_ById;
	private FinderPath _finderPathCountBygetOSIService_ById;

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceSupportingDocIndException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a matching osi service supporting doc ind could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceSupportingDocIndException {

		OSIServiceSupportingDocInd osiServiceSupportingDocInd =
			fetchBygetOSIService_ById(osiServicesApplicationId);

		if (osiServiceSupportingDocInd == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOSIServiceSupportingDocIndException(sb.toString());
		}

		return osiServiceSupportingDocInd;
	}

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service supporting doc ind, or <code>null</code> if a matching osi service supporting doc ind could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd fetchBygetOSIService_ById(
		long osiServicesApplicationId) {

		return fetchBygetOSIService_ById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi service supporting doc ind where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service supporting doc ind, or <code>null</code> if a matching osi service supporting doc ind could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd fetchBygetOSIService_ById(
		long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIService_ById, finderArgs, this);
		}

		if (result instanceof OSIServiceSupportingDocInd) {
			OSIServiceSupportingDocInd osiServiceSupportingDocInd =
				(OSIServiceSupportingDocInd)result;

			if (osiServicesApplicationId !=
					osiServiceSupportingDocInd.getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESUPPORTINGDOCIND_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OSIServiceSupportingDocInd> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIService_ById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OSIServiceSupportingDocIndPersistenceImpl.fetchBygetOSIService_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServiceSupportingDocInd osiServiceSupportingDocInd =
						list.get(0);

					result = osiServiceSupportingDocInd;

					cacheResult(osiServiceSupportingDocInd);
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
			return (OSIServiceSupportingDocInd)result;
		}
	}

	/**
	 * Removes the osi service supporting doc ind where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service supporting doc ind that was removed
	 */
	@Override
	public OSIServiceSupportingDocInd removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceSupportingDocIndException {

		OSIServiceSupportingDocInd osiServiceSupportingDocInd =
			findBygetOSIService_ById(osiServicesApplicationId);

		return remove(osiServiceSupportingDocInd);
	}

	/**
	 * Returns the number of osi service supporting doc inds where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service supporting doc inds
	 */
	@Override
	public int countBygetOSIService_ById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOSIService_ById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESUPPORTINGDOCIND_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2 =
			"osiServiceSupportingDocInd.osiServicesApplicationId = ?";

	public OSIServiceSupportingDocIndPersistenceImpl() {
		setModelClass(OSIServiceSupportingDocInd.class);

		setModelImplClass(OSIServiceSupportingDocIndImpl.class);
		setModelPKClass(long.class);

		setTable(OSIServiceSupportingDocIndTable.INSTANCE);
	}

	/**
	 * Caches the osi service supporting doc ind in the entity cache if it is enabled.
	 *
	 * @param osiServiceSupportingDocInd the osi service supporting doc ind
	 */
	@Override
	public void cacheResult(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		entityCache.putResult(
			OSIServiceSupportingDocIndImpl.class,
			osiServiceSupportingDocInd.getPrimaryKey(),
			osiServiceSupportingDocInd);

		finderCache.putResult(
			_finderPathFetchBygetOSIService_ById,
			new Object[] {
				osiServiceSupportingDocInd.getOsiServicesApplicationId()
			},
			osiServiceSupportingDocInd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi service supporting doc inds in the entity cache if it is enabled.
	 *
	 * @param osiServiceSupportingDocInds the osi service supporting doc inds
	 */
	@Override
	public void cacheResult(
		List<OSIServiceSupportingDocInd> osiServiceSupportingDocInds) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServiceSupportingDocInds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OSIServiceSupportingDocInd osiServiceSupportingDocInd :
				osiServiceSupportingDocInds) {

			if (entityCache.getResult(
					OSIServiceSupportingDocIndImpl.class,
					osiServiceSupportingDocInd.getPrimaryKey()) == null) {

				cacheResult(osiServiceSupportingDocInd);
			}
		}
	}

	/**
	 * Clears the cache for all osi service supporting doc inds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OSIServiceSupportingDocIndImpl.class);

		finderCache.clearCache(OSIServiceSupportingDocIndImpl.class);
	}

	/**
	 * Clears the cache for the osi service supporting doc ind.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		entityCache.removeResult(
			OSIServiceSupportingDocIndImpl.class, osiServiceSupportingDocInd);
	}

	@Override
	public void clearCache(
		List<OSIServiceSupportingDocInd> osiServiceSupportingDocInds) {

		for (OSIServiceSupportingDocInd osiServiceSupportingDocInd :
				osiServiceSupportingDocInds) {

			entityCache.removeResult(
				OSIServiceSupportingDocIndImpl.class,
				osiServiceSupportingDocInd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OSIServiceSupportingDocIndImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OSIServiceSupportingDocIndImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OSIServiceSupportingDocIndModelImpl
			osiServiceSupportingDocIndModelImpl) {

		Object[] args = new Object[] {
			osiServiceSupportingDocIndModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIService_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIService_ById, args,
			osiServiceSupportingDocIndModelImpl);
	}

	/**
	 * Creates a new osi service supporting doc ind with the primary key. Does not add the osi service supporting doc ind to the database.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key for the new osi service supporting doc ind
	 * @return the new osi service supporting doc ind
	 */
	@Override
	public OSIServiceSupportingDocInd create(
		long oSIServiceSupportingDocIndId) {

		OSIServiceSupportingDocInd osiServiceSupportingDocInd =
			new OSIServiceSupportingDocIndImpl();

		osiServiceSupportingDocInd.setNew(true);
		osiServiceSupportingDocInd.setPrimaryKey(oSIServiceSupportingDocIndId);

		osiServiceSupportingDocInd.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiServiceSupportingDocInd;
	}

	/**
	 * Removes the osi service supporting doc ind with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was removed
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd remove(long oSIServiceSupportingDocIndId)
		throws NoSuchOSIServiceSupportingDocIndException {

		return remove((Serializable)oSIServiceSupportingDocIndId);
	}

	/**
	 * Removes the osi service supporting doc ind with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind that was removed
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd remove(Serializable primaryKey)
		throws NoSuchOSIServiceSupportingDocIndException {

		Session session = null;

		try {
			session = openSession();

			OSIServiceSupportingDocInd osiServiceSupportingDocInd =
				(OSIServiceSupportingDocInd)session.get(
					OSIServiceSupportingDocIndImpl.class, primaryKey);

			if (osiServiceSupportingDocInd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOSIServiceSupportingDocIndException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServiceSupportingDocInd);
		}
		catch (NoSuchOSIServiceSupportingDocIndException
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
	protected OSIServiceSupportingDocInd removeImpl(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServiceSupportingDocInd)) {
				osiServiceSupportingDocInd =
					(OSIServiceSupportingDocInd)session.get(
						OSIServiceSupportingDocIndImpl.class,
						osiServiceSupportingDocInd.getPrimaryKeyObj());
			}

			if (osiServiceSupportingDocInd != null) {
				session.delete(osiServiceSupportingDocInd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServiceSupportingDocInd != null) {
			clearCache(osiServiceSupportingDocInd);
		}

		return osiServiceSupportingDocInd;
	}

	@Override
	public OSIServiceSupportingDocInd updateImpl(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		boolean isNew = osiServiceSupportingDocInd.isNew();

		if (!(osiServiceSupportingDocInd instanceof
				OSIServiceSupportingDocIndModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServiceSupportingDocInd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServiceSupportingDocInd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServiceSupportingDocInd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OSIServiceSupportingDocInd implementation " +
					osiServiceSupportingDocInd.getClass());
		}

		OSIServiceSupportingDocIndModelImpl
			osiServiceSupportingDocIndModelImpl =
				(OSIServiceSupportingDocIndModelImpl)osiServiceSupportingDocInd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServiceSupportingDocInd.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServiceSupportingDocInd.setCreateDate(date);
			}
			else {
				osiServiceSupportingDocInd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServiceSupportingDocIndModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServiceSupportingDocInd.setModifiedDate(date);
			}
			else {
				osiServiceSupportingDocInd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServiceSupportingDocInd);
			}
			else {
				osiServiceSupportingDocInd =
					(OSIServiceSupportingDocInd)session.merge(
						osiServiceSupportingDocInd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OSIServiceSupportingDocIndImpl.class,
			osiServiceSupportingDocIndModelImpl, false, true);

		cacheUniqueFindersCache(osiServiceSupportingDocIndModelImpl);

		if (isNew) {
			osiServiceSupportingDocInd.setNew(false);
		}

		osiServiceSupportingDocInd.resetOriginalValues();

		return osiServiceSupportingDocInd;
	}

	/**
	 * Returns the osi service supporting doc ind with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOSIServiceSupportingDocIndException {

		OSIServiceSupportingDocInd osiServiceSupportingDocInd =
			fetchByPrimaryKey(primaryKey);

		if (osiServiceSupportingDocInd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOSIServiceSupportingDocIndException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServiceSupportingDocInd;
	}

	/**
	 * Returns the osi service supporting doc ind with the primary key or throws a <code>NoSuchOSIServiceSupportingDocIndException</code> if it could not be found.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind
	 * @throws NoSuchOSIServiceSupportingDocIndException if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd findByPrimaryKey(
			long oSIServiceSupportingDocIndId)
		throws NoSuchOSIServiceSupportingDocIndException {

		return findByPrimaryKey((Serializable)oSIServiceSupportingDocIndId);
	}

	/**
	 * Returns the osi service supporting doc ind with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param oSIServiceSupportingDocIndId the primary key of the osi service supporting doc ind
	 * @return the osi service supporting doc ind, or <code>null</code> if a osi service supporting doc ind with the primary key could not be found
	 */
	@Override
	public OSIServiceSupportingDocInd fetchByPrimaryKey(
		long oSIServiceSupportingDocIndId) {

		return fetchByPrimaryKey((Serializable)oSIServiceSupportingDocIndId);
	}

	/**
	 * Returns all the osi service supporting doc inds.
	 *
	 * @return the osi service supporting doc inds
	 */
	@Override
	public List<OSIServiceSupportingDocInd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @return the range of osi service supporting doc inds
	 */
	@Override
	public List<OSIServiceSupportingDocInd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service supporting doc inds
	 */
	@Override
	public List<OSIServiceSupportingDocInd> findAll(
		int start, int end,
		OrderByComparator<OSIServiceSupportingDocInd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi service supporting doc inds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceSupportingDocIndModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service supporting doc inds
	 * @param end the upper bound of the range of osi service supporting doc inds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service supporting doc inds
	 */
	@Override
	public List<OSIServiceSupportingDocInd> findAll(
		int start, int end,
		OrderByComparator<OSIServiceSupportingDocInd> orderByComparator,
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

		List<OSIServiceSupportingDocInd> list = null;

		if (useFinderCache) {
			list = (List<OSIServiceSupportingDocInd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESUPPORTINGDOCIND);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESUPPORTINGDOCIND;

				sql = sql.concat(
					OSIServiceSupportingDocIndModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OSIServiceSupportingDocInd>)QueryUtil.list(
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
	 * Removes all the osi service supporting doc inds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OSIServiceSupportingDocInd osiServiceSupportingDocInd :
				findAll()) {

			remove(osiServiceSupportingDocInd);
		}
	}

	/**
	 * Returns the number of osi service supporting doc inds.
	 *
	 * @return the number of osi service supporting doc inds
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
					_SQL_COUNT_OSISERVICESUPPORTINGDOCIND);

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
		return "oSIServiceSupportingDocIndId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESUPPORTINGDOCIND;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OSIServiceSupportingDocIndModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi service supporting doc ind persistence.
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

		_finderPathFetchBygetOSIService_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIService_ById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOSIService_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIService_ById", new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		OSIServiceSupportingDocIndUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OSIServiceSupportingDocIndUtil.setPersistence(null);

		entityCache.removeCache(OSIServiceSupportingDocIndImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICESUPPORTINGDOCIND =
		"SELECT osiServiceSupportingDocInd FROM OSIServiceSupportingDocInd osiServiceSupportingDocInd";

	private static final String _SQL_SELECT_OSISERVICESUPPORTINGDOCIND_WHERE =
		"SELECT osiServiceSupportingDocInd FROM OSIServiceSupportingDocInd osiServiceSupportingDocInd WHERE ";

	private static final String _SQL_COUNT_OSISERVICESUPPORTINGDOCIND =
		"SELECT COUNT(osiServiceSupportingDocInd) FROM OSIServiceSupportingDocInd osiServiceSupportingDocInd";

	private static final String _SQL_COUNT_OSISERVICESUPPORTINGDOCIND_WHERE =
		"SELECT COUNT(osiServiceSupportingDocInd) FROM OSIServiceSupportingDocInd osiServiceSupportingDocInd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServiceSupportingDocInd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OSIServiceSupportingDocInd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OSIServiceSupportingDocInd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OSIServiceSupportingDocIndPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}