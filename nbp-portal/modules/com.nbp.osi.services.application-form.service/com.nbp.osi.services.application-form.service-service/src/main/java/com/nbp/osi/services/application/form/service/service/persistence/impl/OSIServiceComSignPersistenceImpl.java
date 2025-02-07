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

import com.nbp.osi.services.application.form.service.exception.NoSuchOSIServiceComSignException;
import com.nbp.osi.services.application.form.service.model.OSIServiceComSign;
import com.nbp.osi.services.application.form.service.model.OSIServiceComSignTable;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignImpl;
import com.nbp.osi.services.application.form.service.model.impl.OSIServiceComSignModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceComSignPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OSIServiceComSignUtil;
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
 * The persistence implementation for the osi service com sign service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OSIServiceComSignPersistence.class)
public class OSIServiceComSignPersistenceImpl
	extends BasePersistenceImpl<OSIServiceComSign>
	implements OSIServiceComSignPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OSIServiceComSignUtil</code> to access the osi service com sign persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OSIServiceComSignImpl.class.getName();

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
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or throws a <code>NoSuchOSIServiceComSignException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a matching osi service com sign could not be found
	 */
	@Override
	public OSIServiceComSign findBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceComSignException {

		OSIServiceComSign osiServiceComSign = fetchBygetOSIService_ById(
			osiServicesApplicationId);

		if (osiServiceComSign == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOSIServiceComSignException(sb.toString());
		}

		return osiServiceComSign;
	}

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi service com sign, or <code>null</code> if a matching osi service com sign could not be found
	 */
	@Override
	public OSIServiceComSign fetchBygetOSIService_ById(
		long osiServicesApplicationId) {

		return fetchBygetOSIService_ById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi service com sign where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi service com sign, or <code>null</code> if a matching osi service com sign could not be found
	 */
	@Override
	public OSIServiceComSign fetchBygetOSIService_ById(
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

		if (result instanceof OSIServiceComSign) {
			OSIServiceComSign osiServiceComSign = (OSIServiceComSign)result;

			if (osiServicesApplicationId !=
					osiServiceComSign.getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICECOMSIGN_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICE_BYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OSIServiceComSign> list = query.list();

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
								"OSIServiceComSignPersistenceImpl.fetchBygetOSIService_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServiceComSign osiServiceComSign = list.get(0);

					result = osiServiceComSign;

					cacheResult(osiServiceComSign);
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
			return (OSIServiceComSign)result;
		}
	}

	/**
	 * Removes the osi service com sign where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi service com sign that was removed
	 */
	@Override
	public OSIServiceComSign removeBygetOSIService_ById(
			long osiServicesApplicationId)
		throws NoSuchOSIServiceComSignException {

		OSIServiceComSign osiServiceComSign = findBygetOSIService_ById(
			osiServicesApplicationId);

		return remove(osiServiceComSign);
	}

	/**
	 * Returns the number of osi service com signs where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi service com signs
	 */
	@Override
	public int countBygetOSIService_ById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOSIService_ById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICECOMSIGN_WHERE);

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
			"osiServiceComSign.osiServicesApplicationId = ?";

	public OSIServiceComSignPersistenceImpl() {
		setModelClass(OSIServiceComSign.class);

		setModelImplClass(OSIServiceComSignImpl.class);
		setModelPKClass(long.class);

		setTable(OSIServiceComSignTable.INSTANCE);
	}

	/**
	 * Caches the osi service com sign in the entity cache if it is enabled.
	 *
	 * @param osiServiceComSign the osi service com sign
	 */
	@Override
	public void cacheResult(OSIServiceComSign osiServiceComSign) {
		entityCache.putResult(
			OSIServiceComSignImpl.class, osiServiceComSign.getPrimaryKey(),
			osiServiceComSign);

		finderCache.putResult(
			_finderPathFetchBygetOSIService_ById,
			new Object[] {osiServiceComSign.getOsiServicesApplicationId()},
			osiServiceComSign);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi service com signs in the entity cache if it is enabled.
	 *
	 * @param osiServiceComSigns the osi service com signs
	 */
	@Override
	public void cacheResult(List<OSIServiceComSign> osiServiceComSigns) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServiceComSigns.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OSIServiceComSign osiServiceComSign : osiServiceComSigns) {
			if (entityCache.getResult(
					OSIServiceComSignImpl.class,
					osiServiceComSign.getPrimaryKey()) == null) {

				cacheResult(osiServiceComSign);
			}
		}
	}

	/**
	 * Clears the cache for all osi service com signs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OSIServiceComSignImpl.class);

		finderCache.clearCache(OSIServiceComSignImpl.class);
	}

	/**
	 * Clears the cache for the osi service com sign.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OSIServiceComSign osiServiceComSign) {
		entityCache.removeResult(
			OSIServiceComSignImpl.class, osiServiceComSign);
	}

	@Override
	public void clearCache(List<OSIServiceComSign> osiServiceComSigns) {
		for (OSIServiceComSign osiServiceComSign : osiServiceComSigns) {
			entityCache.removeResult(
				OSIServiceComSignImpl.class, osiServiceComSign);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OSIServiceComSignImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OSIServiceComSignImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OSIServiceComSignModelImpl osiServiceComSignModelImpl) {

		Object[] args = new Object[] {
			osiServiceComSignModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIService_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIService_ById, args,
			osiServiceComSignModelImpl);
	}

	/**
	 * Creates a new osi service com sign with the primary key. Does not add the osi service com sign to the database.
	 *
	 * @param osiComSignId the primary key for the new osi service com sign
	 * @return the new osi service com sign
	 */
	@Override
	public OSIServiceComSign create(long osiComSignId) {
		OSIServiceComSign osiServiceComSign = new OSIServiceComSignImpl();

		osiServiceComSign.setNew(true);
		osiServiceComSign.setPrimaryKey(osiComSignId);

		osiServiceComSign.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiServiceComSign;
	}

	/**
	 * Removes the osi service com sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign that was removed
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	@Override
	public OSIServiceComSign remove(long osiComSignId)
		throws NoSuchOSIServiceComSignException {

		return remove((Serializable)osiComSignId);
	}

	/**
	 * Removes the osi service com sign with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi service com sign
	 * @return the osi service com sign that was removed
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	@Override
	public OSIServiceComSign remove(Serializable primaryKey)
		throws NoSuchOSIServiceComSignException {

		Session session = null;

		try {
			session = openSession();

			OSIServiceComSign osiServiceComSign =
				(OSIServiceComSign)session.get(
					OSIServiceComSignImpl.class, primaryKey);

			if (osiServiceComSign == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOSIServiceComSignException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServiceComSign);
		}
		catch (NoSuchOSIServiceComSignException noSuchEntityException) {
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
	protected OSIServiceComSign removeImpl(
		OSIServiceComSign osiServiceComSign) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServiceComSign)) {
				osiServiceComSign = (OSIServiceComSign)session.get(
					OSIServiceComSignImpl.class,
					osiServiceComSign.getPrimaryKeyObj());
			}

			if (osiServiceComSign != null) {
				session.delete(osiServiceComSign);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServiceComSign != null) {
			clearCache(osiServiceComSign);
		}

		return osiServiceComSign;
	}

	@Override
	public OSIServiceComSign updateImpl(OSIServiceComSign osiServiceComSign) {
		boolean isNew = osiServiceComSign.isNew();

		if (!(osiServiceComSign instanceof OSIServiceComSignModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServiceComSign.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServiceComSign);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServiceComSign proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OSIServiceComSign implementation " +
					osiServiceComSign.getClass());
		}

		OSIServiceComSignModelImpl osiServiceComSignModelImpl =
			(OSIServiceComSignModelImpl)osiServiceComSign;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServiceComSign.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServiceComSign.setCreateDate(date);
			}
			else {
				osiServiceComSign.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServiceComSignModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServiceComSign.setModifiedDate(date);
			}
			else {
				osiServiceComSign.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServiceComSign);
			}
			else {
				osiServiceComSign = (OSIServiceComSign)session.merge(
					osiServiceComSign);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OSIServiceComSignImpl.class, osiServiceComSignModelImpl, false,
			true);

		cacheUniqueFindersCache(osiServiceComSignModelImpl);

		if (isNew) {
			osiServiceComSign.setNew(false);
		}

		osiServiceComSign.resetOriginalValues();

		return osiServiceComSign;
	}

	/**
	 * Returns the osi service com sign with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi service com sign
	 * @return the osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	@Override
	public OSIServiceComSign findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOSIServiceComSignException {

		OSIServiceComSign osiServiceComSign = fetchByPrimaryKey(primaryKey);

		if (osiServiceComSign == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOSIServiceComSignException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServiceComSign;
	}

	/**
	 * Returns the osi service com sign with the primary key or throws a <code>NoSuchOSIServiceComSignException</code> if it could not be found.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign
	 * @throws NoSuchOSIServiceComSignException if a osi service com sign with the primary key could not be found
	 */
	@Override
	public OSIServiceComSign findByPrimaryKey(long osiComSignId)
		throws NoSuchOSIServiceComSignException {

		return findByPrimaryKey((Serializable)osiComSignId);
	}

	/**
	 * Returns the osi service com sign with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiComSignId the primary key of the osi service com sign
	 * @return the osi service com sign, or <code>null</code> if a osi service com sign with the primary key could not be found
	 */
	@Override
	public OSIServiceComSign fetchByPrimaryKey(long osiComSignId) {
		return fetchByPrimaryKey((Serializable)osiComSignId);
	}

	/**
	 * Returns all the osi service com signs.
	 *
	 * @return the osi service com signs
	 */
	@Override
	public List<OSIServiceComSign> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @return the range of osi service com signs
	 */
	@Override
	public List<OSIServiceComSign> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi service com signs
	 */
	@Override
	public List<OSIServiceComSign> findAll(
		int start, int end,
		OrderByComparator<OSIServiceComSign> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi service com signs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServiceComSignModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi service com signs
	 * @param end the upper bound of the range of osi service com signs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi service com signs
	 */
	@Override
	public List<OSIServiceComSign> findAll(
		int start, int end,
		OrderByComparator<OSIServiceComSign> orderByComparator,
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

		List<OSIServiceComSign> list = null;

		if (useFinderCache) {
			list = (List<OSIServiceComSign>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICECOMSIGN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICECOMSIGN;

				sql = sql.concat(OSIServiceComSignModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OSIServiceComSign>)QueryUtil.list(
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
	 * Removes all the osi service com signs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OSIServiceComSign osiServiceComSign : findAll()) {
			remove(osiServiceComSign);
		}
	}

	/**
	 * Returns the number of osi service com signs.
	 *
	 * @return the number of osi service com signs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OSISERVICECOMSIGN);

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
		return "osiComSignId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICECOMSIGN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OSIServiceComSignModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi service com sign persistence.
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

		OSIServiceComSignUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OSIServiceComSignUtil.setPersistence(null);

		entityCache.removeCache(OSIServiceComSignImpl.class.getName());
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

	private static final String _SQL_SELECT_OSISERVICECOMSIGN =
		"SELECT osiServiceComSign FROM OSIServiceComSign osiServiceComSign";

	private static final String _SQL_SELECT_OSISERVICECOMSIGN_WHERE =
		"SELECT osiServiceComSign FROM OSIServiceComSign osiServiceComSign WHERE ";

	private static final String _SQL_COUNT_OSISERVICECOMSIGN =
		"SELECT COUNT(osiServiceComSign) FROM OSIServiceComSign osiServiceComSign";

	private static final String _SQL_COUNT_OSISERVICECOMSIGN_WHERE =
		"SELECT COUNT(osiServiceComSign) FROM OSIServiceComSign osiServiceComSign WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiServiceComSign.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OSIServiceComSign exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OSIServiceComSign exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OSIServiceComSignPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}