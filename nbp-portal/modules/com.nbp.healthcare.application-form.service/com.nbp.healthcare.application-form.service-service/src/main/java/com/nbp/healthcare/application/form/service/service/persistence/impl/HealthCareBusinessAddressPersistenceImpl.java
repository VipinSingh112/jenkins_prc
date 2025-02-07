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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareBusinessAddressException;
import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddress;
import com.nbp.healthcare.application.form.service.model.HealthCareBusinessAddressTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareBusinessAddressModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBusinessAddressPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareBusinessAddressUtil;
import com.nbp.healthcare.application.form.service.service.persistence.impl.constants.HEALTHPersistenceConstants;

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
 * The persistence implementation for the health care business address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareBusinessAddressPersistence.class)
public class HealthCareBusinessAddressPersistenceImpl
	extends BasePersistenceImpl<HealthCareBusinessAddress>
	implements HealthCareBusinessAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareBusinessAddressUtil</code> to access the health care business address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareBusinessAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHealthCareById;
	private FinderPath _finderPathCountBygetHealthCareById;

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareBusinessAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a matching health care business address could not be found
	 */
	@Override
	public HealthCareBusinessAddress findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareBusinessAddressException {

		HealthCareBusinessAddress healthCareBusinessAddress =
			fetchBygetHealthCareById(healthCareApplicationId);

		if (healthCareBusinessAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareBusinessAddressException(sb.toString());
		}

		return healthCareBusinessAddress;
	}

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care business address, or <code>null</code> if a matching health care business address could not be found
	 */
	@Override
	public HealthCareBusinessAddress fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return fetchBygetHealthCareById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care business address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care business address, or <code>null</code> if a matching health care business address could not be found
	 */
	@Override
	public HealthCareBusinessAddress fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareById, finderArgs, this);
		}

		if (result instanceof HealthCareBusinessAddress) {
			HealthCareBusinessAddress healthCareBusinessAddress =
				(HealthCareBusinessAddress)result;

			if (healthCareApplicationId !=
					healthCareBusinessAddress.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREBUSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareBusinessAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									healthCareApplicationId
								};
							}

							_log.warn(
								"HealthCareBusinessAddressPersistenceImpl.fetchBygetHealthCareById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareBusinessAddress healthCareBusinessAddress =
						list.get(0);

					result = healthCareBusinessAddress;

					cacheResult(healthCareBusinessAddress);
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
			return (HealthCareBusinessAddress)result;
		}
	}

	/**
	 * Removes the health care business address where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care business address that was removed
	 */
	@Override
	public HealthCareBusinessAddress removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareBusinessAddressException {

		HealthCareBusinessAddress healthCareBusinessAddress =
			findBygetHealthCareById(healthCareApplicationId);

		return remove(healthCareBusinessAddress);
	}

	/**
	 * Returns the number of health care business addresses where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care business addresses
	 */
	@Override
	public int countBygetHealthCareById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREBUSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2 =
			"healthCareBusinessAddress.healthCareApplicationId = ?";

	public HealthCareBusinessAddressPersistenceImpl() {
		setModelClass(HealthCareBusinessAddress.class);

		setModelImplClass(HealthCareBusinessAddressImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareBusinessAddressTable.INSTANCE);
	}

	/**
	 * Caches the health care business address in the entity cache if it is enabled.
	 *
	 * @param healthCareBusinessAddress the health care business address
	 */
	@Override
	public void cacheResult(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		entityCache.putResult(
			HealthCareBusinessAddressImpl.class,
			healthCareBusinessAddress.getPrimaryKey(),
			healthCareBusinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareById,
			new Object[] {
				healthCareBusinessAddress.getHealthCareApplicationId()
			},
			healthCareBusinessAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care business addresses in the entity cache if it is enabled.
	 *
	 * @param healthCareBusinessAddresses the health care business addresses
	 */
	@Override
	public void cacheResult(
		List<HealthCareBusinessAddress> healthCareBusinessAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareBusinessAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareBusinessAddress healthCareBusinessAddress :
				healthCareBusinessAddresses) {

			if (entityCache.getResult(
					HealthCareBusinessAddressImpl.class,
					healthCareBusinessAddress.getPrimaryKey()) == null) {

				cacheResult(healthCareBusinessAddress);
			}
		}
	}

	/**
	 * Clears the cache for all health care business addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareBusinessAddressImpl.class);

		finderCache.clearCache(HealthCareBusinessAddressImpl.class);
	}

	/**
	 * Clears the cache for the health care business address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		entityCache.removeResult(
			HealthCareBusinessAddressImpl.class, healthCareBusinessAddress);
	}

	@Override
	public void clearCache(
		List<HealthCareBusinessAddress> healthCareBusinessAddresses) {

		for (HealthCareBusinessAddress healthCareBusinessAddress :
				healthCareBusinessAddresses) {

			entityCache.removeResult(
				HealthCareBusinessAddressImpl.class, healthCareBusinessAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareBusinessAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareBusinessAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareBusinessAddressModelImpl healthCareBusinessAddressModelImpl) {

		Object[] args = new Object[] {
			healthCareBusinessAddressModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareById, args,
			healthCareBusinessAddressModelImpl);
	}

	/**
	 * Creates a new health care business address with the primary key. Does not add the health care business address to the database.
	 *
	 * @param healthCareBusinessAddressId the primary key for the new health care business address
	 * @return the new health care business address
	 */
	@Override
	public HealthCareBusinessAddress create(long healthCareBusinessAddressId) {
		HealthCareBusinessAddress healthCareBusinessAddress =
			new HealthCareBusinessAddressImpl();

		healthCareBusinessAddress.setNew(true);
		healthCareBusinessAddress.setPrimaryKey(healthCareBusinessAddressId);

		healthCareBusinessAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return healthCareBusinessAddress;
	}

	/**
	 * Removes the health care business address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address that was removed
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	@Override
	public HealthCareBusinessAddress remove(long healthCareBusinessAddressId)
		throws NoSuchHealthCareBusinessAddressException {

		return remove((Serializable)healthCareBusinessAddressId);
	}

	/**
	 * Removes the health care business address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care business address
	 * @return the health care business address that was removed
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	@Override
	public HealthCareBusinessAddress remove(Serializable primaryKey)
		throws NoSuchHealthCareBusinessAddressException {

		Session session = null;

		try {
			session = openSession();

			HealthCareBusinessAddress healthCareBusinessAddress =
				(HealthCareBusinessAddress)session.get(
					HealthCareBusinessAddressImpl.class, primaryKey);

			if (healthCareBusinessAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareBusinessAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareBusinessAddress);
		}
		catch (NoSuchHealthCareBusinessAddressException noSuchEntityException) {
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
	protected HealthCareBusinessAddress removeImpl(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareBusinessAddress)) {
				healthCareBusinessAddress =
					(HealthCareBusinessAddress)session.get(
						HealthCareBusinessAddressImpl.class,
						healthCareBusinessAddress.getPrimaryKeyObj());
			}

			if (healthCareBusinessAddress != null) {
				session.delete(healthCareBusinessAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareBusinessAddress != null) {
			clearCache(healthCareBusinessAddress);
		}

		return healthCareBusinessAddress;
	}

	@Override
	public HealthCareBusinessAddress updateImpl(
		HealthCareBusinessAddress healthCareBusinessAddress) {

		boolean isNew = healthCareBusinessAddress.isNew();

		if (!(healthCareBusinessAddress instanceof
				HealthCareBusinessAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareBusinessAddress.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareBusinessAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareBusinessAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareBusinessAddress implementation " +
					healthCareBusinessAddress.getClass());
		}

		HealthCareBusinessAddressModelImpl healthCareBusinessAddressModelImpl =
			(HealthCareBusinessAddressModelImpl)healthCareBusinessAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareBusinessAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareBusinessAddress.setCreateDate(date);
			}
			else {
				healthCareBusinessAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareBusinessAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareBusinessAddress.setModifiedDate(date);
			}
			else {
				healthCareBusinessAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareBusinessAddress);
			}
			else {
				healthCareBusinessAddress =
					(HealthCareBusinessAddress)session.merge(
						healthCareBusinessAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareBusinessAddressImpl.class,
			healthCareBusinessAddressModelImpl, false, true);

		cacheUniqueFindersCache(healthCareBusinessAddressModelImpl);

		if (isNew) {
			healthCareBusinessAddress.setNew(false);
		}

		healthCareBusinessAddress.resetOriginalValues();

		return healthCareBusinessAddress;
	}

	/**
	 * Returns the health care business address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care business address
	 * @return the health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	@Override
	public HealthCareBusinessAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareBusinessAddressException {

		HealthCareBusinessAddress healthCareBusinessAddress = fetchByPrimaryKey(
			primaryKey);

		if (healthCareBusinessAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareBusinessAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareBusinessAddress;
	}

	/**
	 * Returns the health care business address with the primary key or throws a <code>NoSuchHealthCareBusinessAddressException</code> if it could not be found.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address
	 * @throws NoSuchHealthCareBusinessAddressException if a health care business address with the primary key could not be found
	 */
	@Override
	public HealthCareBusinessAddress findByPrimaryKey(
			long healthCareBusinessAddressId)
		throws NoSuchHealthCareBusinessAddressException {

		return findByPrimaryKey((Serializable)healthCareBusinessAddressId);
	}

	/**
	 * Returns the health care business address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareBusinessAddressId the primary key of the health care business address
	 * @return the health care business address, or <code>null</code> if a health care business address with the primary key could not be found
	 */
	@Override
	public HealthCareBusinessAddress fetchByPrimaryKey(
		long healthCareBusinessAddressId) {

		return fetchByPrimaryKey((Serializable)healthCareBusinessAddressId);
	}

	/**
	 * Returns all the health care business addresses.
	 *
	 * @return the health care business addresses
	 */
	@Override
	public List<HealthCareBusinessAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @return the range of health care business addresses
	 */
	@Override
	public List<HealthCareBusinessAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care business addresses
	 */
	@Override
	public List<HealthCareBusinessAddress> findAll(
		int start, int end,
		OrderByComparator<HealthCareBusinessAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care business addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareBusinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care business addresses
	 * @param end the upper bound of the range of health care business addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care business addresses
	 */
	@Override
	public List<HealthCareBusinessAddress> findAll(
		int start, int end,
		OrderByComparator<HealthCareBusinessAddress> orderByComparator,
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

		List<HealthCareBusinessAddress> list = null;

		if (useFinderCache) {
			list = (List<HealthCareBusinessAddress>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREBUSINESSADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREBUSINESSADDRESS;

				sql = sql.concat(
					HealthCareBusinessAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareBusinessAddress>)QueryUtil.list(
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
	 * Removes all the health care business addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareBusinessAddress healthCareBusinessAddress : findAll()) {
			remove(healthCareBusinessAddress);
		}
	}

	/**
	 * Returns the number of health care business addresses.
	 *
	 * @return the number of health care business addresses
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
					_SQL_COUNT_HEALTHCAREBUSINESSADDRESS);

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
		return "healthCareBusinessAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREBUSINESSADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareBusinessAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care business address persistence.
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

		_finderPathFetchBygetHealthCareById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHealthCareById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareById", new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		HealthCareBusinessAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareBusinessAddressUtil.setPersistence(null);

		entityCache.removeCache(HealthCareBusinessAddressImpl.class.getName());
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

	private static final String _SQL_SELECT_HEALTHCAREBUSINESSADDRESS =
		"SELECT healthCareBusinessAddress FROM HealthCareBusinessAddress healthCareBusinessAddress";

	private static final String _SQL_SELECT_HEALTHCAREBUSINESSADDRESS_WHERE =
		"SELECT healthCareBusinessAddress FROM HealthCareBusinessAddress healthCareBusinessAddress WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREBUSINESSADDRESS =
		"SELECT COUNT(healthCareBusinessAddress) FROM HealthCareBusinessAddress healthCareBusinessAddress";

	private static final String _SQL_COUNT_HEALTHCAREBUSINESSADDRESS_WHERE =
		"SELECT COUNT(healthCareBusinessAddress) FROM HealthCareBusinessAddress healthCareBusinessAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareBusinessAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareBusinessAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareBusinessAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareBusinessAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}