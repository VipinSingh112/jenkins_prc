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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicantAddressException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddress;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicantAddressTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicantAddressModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantAddressPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicantAddressUtil;
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
 * The persistence implementation for the health care applicant address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareApplicantAddressPersistence.class)
public class HealthCareApplicantAddressPersistenceImpl
	extends BasePersistenceImpl<HealthCareApplicantAddress>
	implements HealthCareApplicantAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareApplicantAddressUtil</code> to access the health care applicant address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareApplicantAddressImpl.class.getName();

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
	 * Returns the health care applicant address where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicantAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant address
	 * @throws NoSuchHealthCareApplicantAddressException if a matching health care applicant address could not be found
	 */
	@Override
	public HealthCareApplicantAddress findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantAddressException {

		HealthCareApplicantAddress healthCareApplicantAddress =
			fetchBygetHealthCareById(healthCareApplicationId);

		if (healthCareApplicantAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareApplicantAddressException(sb.toString());
		}

		return healthCareApplicantAddress;
	}

	/**
	 * Returns the health care applicant address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care applicant address, or <code>null</code> if a matching health care applicant address could not be found
	 */
	@Override
	public HealthCareApplicantAddress fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return fetchBygetHealthCareById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care applicant address where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care applicant address, or <code>null</code> if a matching health care applicant address could not be found
	 */
	@Override
	public HealthCareApplicantAddress fetchBygetHealthCareById(
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

		if (result instanceof HealthCareApplicantAddress) {
			HealthCareApplicantAddress healthCareApplicantAddress =
				(HealthCareApplicantAddress)result;

			if (healthCareApplicationId !=
					healthCareApplicantAddress.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICANTADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareApplicantAddress> list = query.list();

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
								"HealthCareApplicantAddressPersistenceImpl.fetchBygetHealthCareById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareApplicantAddress healthCareApplicantAddress =
						list.get(0);

					result = healthCareApplicantAddress;

					cacheResult(healthCareApplicantAddress);
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
			return (HealthCareApplicantAddress)result;
		}
	}

	/**
	 * Removes the health care applicant address where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care applicant address that was removed
	 */
	@Override
	public HealthCareApplicantAddress removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicantAddressException {

		HealthCareApplicantAddress healthCareApplicantAddress =
			findBygetHealthCareById(healthCareApplicationId);

		return remove(healthCareApplicantAddress);
	}

	/**
	 * Returns the number of health care applicant addresses where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applicant addresses
	 */
	@Override
	public int countBygetHealthCareById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICANTADDRESS_WHERE);

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
			"healthCareApplicantAddress.healthCareApplicationId = ?";

	public HealthCareApplicantAddressPersistenceImpl() {
		setModelClass(HealthCareApplicantAddress.class);

		setModelImplClass(HealthCareApplicantAddressImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareApplicantAddressTable.INSTANCE);
	}

	/**
	 * Caches the health care applicant address in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantAddress the health care applicant address
	 */
	@Override
	public void cacheResult(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		entityCache.putResult(
			HealthCareApplicantAddressImpl.class,
			healthCareApplicantAddress.getPrimaryKey(),
			healthCareApplicantAddress);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareById,
			new Object[] {
				healthCareApplicantAddress.getHealthCareApplicationId()
			},
			healthCareApplicantAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care applicant addresses in the entity cache if it is enabled.
	 *
	 * @param healthCareApplicantAddresses the health care applicant addresses
	 */
	@Override
	public void cacheResult(
		List<HealthCareApplicantAddress> healthCareApplicantAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareApplicantAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareApplicantAddress healthCareApplicantAddress :
				healthCareApplicantAddresses) {

			if (entityCache.getResult(
					HealthCareApplicantAddressImpl.class,
					healthCareApplicantAddress.getPrimaryKey()) == null) {

				cacheResult(healthCareApplicantAddress);
			}
		}
	}

	/**
	 * Clears the cache for all health care applicant addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareApplicantAddressImpl.class);

		finderCache.clearCache(HealthCareApplicantAddressImpl.class);
	}

	/**
	 * Clears the cache for the health care applicant address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		entityCache.removeResult(
			HealthCareApplicantAddressImpl.class, healthCareApplicantAddress);
	}

	@Override
	public void clearCache(
		List<HealthCareApplicantAddress> healthCareApplicantAddresses) {

		for (HealthCareApplicantAddress healthCareApplicantAddress :
				healthCareApplicantAddresses) {

			entityCache.removeResult(
				HealthCareApplicantAddressImpl.class,
				healthCareApplicantAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareApplicantAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareApplicantAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareApplicantAddressModelImpl
			healthCareApplicantAddressModelImpl) {

		Object[] args = new Object[] {
			healthCareApplicantAddressModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareById, args,
			healthCareApplicantAddressModelImpl);
	}

	/**
	 * Creates a new health care applicant address with the primary key. Does not add the health care applicant address to the database.
	 *
	 * @param healthCareApplicantAddressId the primary key for the new health care applicant address
	 * @return the new health care applicant address
	 */
	@Override
	public HealthCareApplicantAddress create(
		long healthCareApplicantAddressId) {

		HealthCareApplicantAddress healthCareApplicantAddress =
			new HealthCareApplicantAddressImpl();

		healthCareApplicantAddress.setNew(true);
		healthCareApplicantAddress.setPrimaryKey(healthCareApplicantAddressId);

		healthCareApplicantAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return healthCareApplicantAddress;
	}

	/**
	 * Removes the health care applicant address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address that was removed
	 * @throws NoSuchHealthCareApplicantAddressException if a health care applicant address with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantAddress remove(long healthCareApplicantAddressId)
		throws NoSuchHealthCareApplicantAddressException {

		return remove((Serializable)healthCareApplicantAddressId);
	}

	/**
	 * Removes the health care applicant address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care applicant address
	 * @return the health care applicant address that was removed
	 * @throws NoSuchHealthCareApplicantAddressException if a health care applicant address with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantAddress remove(Serializable primaryKey)
		throws NoSuchHealthCareApplicantAddressException {

		Session session = null;

		try {
			session = openSession();

			HealthCareApplicantAddress healthCareApplicantAddress =
				(HealthCareApplicantAddress)session.get(
					HealthCareApplicantAddressImpl.class, primaryKey);

			if (healthCareApplicantAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareApplicantAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareApplicantAddress);
		}
		catch (NoSuchHealthCareApplicantAddressException
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
	protected HealthCareApplicantAddress removeImpl(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareApplicantAddress)) {
				healthCareApplicantAddress =
					(HealthCareApplicantAddress)session.get(
						HealthCareApplicantAddressImpl.class,
						healthCareApplicantAddress.getPrimaryKeyObj());
			}

			if (healthCareApplicantAddress != null) {
				session.delete(healthCareApplicantAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareApplicantAddress != null) {
			clearCache(healthCareApplicantAddress);
		}

		return healthCareApplicantAddress;
	}

	@Override
	public HealthCareApplicantAddress updateImpl(
		HealthCareApplicantAddress healthCareApplicantAddress) {

		boolean isNew = healthCareApplicantAddress.isNew();

		if (!(healthCareApplicantAddress instanceof
				HealthCareApplicantAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareApplicantAddress.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareApplicantAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareApplicantAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareApplicantAddress implementation " +
					healthCareApplicantAddress.getClass());
		}

		HealthCareApplicantAddressModelImpl
			healthCareApplicantAddressModelImpl =
				(HealthCareApplicantAddressModelImpl)healthCareApplicantAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareApplicantAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareApplicantAddress.setCreateDate(date);
			}
			else {
				healthCareApplicantAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareApplicantAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareApplicantAddress.setModifiedDate(date);
			}
			else {
				healthCareApplicantAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareApplicantAddress);
			}
			else {
				healthCareApplicantAddress =
					(HealthCareApplicantAddress)session.merge(
						healthCareApplicantAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareApplicantAddressImpl.class,
			healthCareApplicantAddressModelImpl, false, true);

		cacheUniqueFindersCache(healthCareApplicantAddressModelImpl);

		if (isNew) {
			healthCareApplicantAddress.setNew(false);
		}

		healthCareApplicantAddress.resetOriginalValues();

		return healthCareApplicantAddress;
	}

	/**
	 * Returns the health care applicant address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care applicant address
	 * @return the health care applicant address
	 * @throws NoSuchHealthCareApplicantAddressException if a health care applicant address with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareApplicantAddressException {

		HealthCareApplicantAddress healthCareApplicantAddress =
			fetchByPrimaryKey(primaryKey);

		if (healthCareApplicantAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareApplicantAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareApplicantAddress;
	}

	/**
	 * Returns the health care applicant address with the primary key or throws a <code>NoSuchHealthCareApplicantAddressException</code> if it could not be found.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address
	 * @throws NoSuchHealthCareApplicantAddressException if a health care applicant address with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantAddress findByPrimaryKey(
			long healthCareApplicantAddressId)
		throws NoSuchHealthCareApplicantAddressException {

		return findByPrimaryKey((Serializable)healthCareApplicantAddressId);
	}

	/**
	 * Returns the health care applicant address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicantAddressId the primary key of the health care applicant address
	 * @return the health care applicant address, or <code>null</code> if a health care applicant address with the primary key could not be found
	 */
	@Override
	public HealthCareApplicantAddress fetchByPrimaryKey(
		long healthCareApplicantAddressId) {

		return fetchByPrimaryKey((Serializable)healthCareApplicantAddressId);
	}

	/**
	 * Returns all the health care applicant addresses.
	 *
	 * @return the health care applicant addresses
	 */
	@Override
	public List<HealthCareApplicantAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @return the range of health care applicant addresses
	 */
	@Override
	public List<HealthCareApplicantAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applicant addresses
	 */
	@Override
	public List<HealthCareApplicantAddress> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicantAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care applicant addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicantAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applicant addresses
	 * @param end the upper bound of the range of health care applicant addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applicant addresses
	 */
	@Override
	public List<HealthCareApplicantAddress> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplicantAddress> orderByComparator,
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

		List<HealthCareApplicantAddress> list = null;

		if (useFinderCache) {
			list = (List<HealthCareApplicantAddress>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREAPPLICANTADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREAPPLICANTADDRESS;

				sql = sql.concat(
					HealthCareApplicantAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareApplicantAddress>)QueryUtil.list(
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
	 * Removes all the health care applicant addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareApplicantAddress healthCareApplicantAddress :
				findAll()) {

			remove(healthCareApplicantAddress);
		}
	}

	/**
	 * Returns the number of health care applicant addresses.
	 *
	 * @return the number of health care applicant addresses
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
					_SQL_COUNT_HEALTHCAREAPPLICANTADDRESS);

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
		return "healthCareApplicantAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREAPPLICANTADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareApplicantAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care applicant address persistence.
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

		HealthCareApplicantAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareApplicantAddressUtil.setPersistence(null);

		entityCache.removeCache(HealthCareApplicantAddressImpl.class.getName());
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

	private static final String _SQL_SELECT_HEALTHCAREAPPLICANTADDRESS =
		"SELECT healthCareApplicantAddress FROM HealthCareApplicantAddress healthCareApplicantAddress";

	private static final String _SQL_SELECT_HEALTHCAREAPPLICANTADDRESS_WHERE =
		"SELECT healthCareApplicantAddress FROM HealthCareApplicantAddress healthCareApplicantAddress WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICANTADDRESS =
		"SELECT COUNT(healthCareApplicantAddress) FROM HealthCareApplicantAddress healthCareApplicantAddress";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICANTADDRESS_WHERE =
		"SELECT COUNT(healthCareApplicantAddress) FROM HealthCareApplicantAddress healthCareApplicantAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareApplicantAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareApplicantAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareApplicantAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareApplicantAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}