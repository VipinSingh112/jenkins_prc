/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeIndividualDetailsAddressException;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddress;
import com.nbp.creative.application.form.service.model.CreativeIndividualDetailsAddressTable;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeIndividualDetailsAddressModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeIndividualDetailsAddressUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative individual details address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeIndividualDetailsAddressPersistence.class)
public class CreativeIndividualDetailsAddressPersistenceImpl
	extends BasePersistenceImpl<CreativeIndividualDetailsAddress>
	implements CreativeIndividualDetailsAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeIndividualDetailsAddressUtil</code> to access the creative individual details address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeIndividualDetailsAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCreativeById;
	private FinderPath _finderPathCountBygetCreativeById;

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeIndividualDetailsAddressException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a matching creative individual details address could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsAddressException {

		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress =
			fetchBygetCreativeById(CreativeApplicationId);

		if (creativeIndividualDetailsAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeIndividualDetailsAddressException(
				sb.toString());
		}

		return creativeIndividualDetailsAddress;
	}

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative individual details address, or <code>null</code> if a matching creative individual details address could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative individual details address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative individual details address, or <code>null</code> if a matching creative individual details address could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {CreativeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeById, finderArgs, this);
		}

		if (result instanceof CreativeIndividualDetailsAddress) {
			CreativeIndividualDetailsAddress creativeIndividualDetailsAddress =
				(CreativeIndividualDetailsAddress)result;

			if (CreativeApplicationId !=
					creativeIndividualDetailsAddress.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEINDIVIDUALDETAILSADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeIndividualDetailsAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									CreativeApplicationId
								};
							}

							_log.warn(
								"CreativeIndividualDetailsAddressPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeIndividualDetailsAddress
						creativeIndividualDetailsAddress = list.get(0);

					result = creativeIndividualDetailsAddress;

					cacheResult(creativeIndividualDetailsAddress);
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
			return (CreativeIndividualDetailsAddress)result;
		}
	}

	/**
	 * Removes the creative individual details address where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative individual details address that was removed
	 */
	@Override
	public CreativeIndividualDetailsAddress removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeIndividualDetailsAddressException {

		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress =
			findBygetCreativeById(CreativeApplicationId);

		return remove(creativeIndividualDetailsAddress);
	}

	/**
	 * Returns the number of creative individual details addresses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative individual details addresses
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEINDIVIDUALDETAILSADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2 =
			"creativeIndividualDetailsAddress.CreativeApplicationId = ?";

	public CreativeIndividualDetailsAddressPersistenceImpl() {
		setModelClass(CreativeIndividualDetailsAddress.class);

		setModelImplClass(CreativeIndividualDetailsAddressImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeIndividualDetailsAddressTable.INSTANCE);
	}

	/**
	 * Caches the creative individual details address in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailsAddress the creative individual details address
	 */
	@Override
	public void cacheResult(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		entityCache.putResult(
			CreativeIndividualDetailsAddressImpl.class,
			creativeIndividualDetailsAddress.getPrimaryKey(),
			creativeIndividualDetailsAddress);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeIndividualDetailsAddress.getCreativeApplicationId()
			},
			creativeIndividualDetailsAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative individual details addresses in the entity cache if it is enabled.
	 *
	 * @param creativeIndividualDetailsAddresses the creative individual details addresses
	 */
	@Override
	public void cacheResult(
		List<CreativeIndividualDetailsAddress>
			creativeIndividualDetailsAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeIndividualDetailsAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeIndividualDetailsAddress creativeIndividualDetailsAddress :
				creativeIndividualDetailsAddresses) {

			if (entityCache.getResult(
					CreativeIndividualDetailsAddressImpl.class,
					creativeIndividualDetailsAddress.getPrimaryKey()) == null) {

				cacheResult(creativeIndividualDetailsAddress);
			}
		}
	}

	/**
	 * Clears the cache for all creative individual details addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeIndividualDetailsAddressImpl.class);

		finderCache.clearCache(CreativeIndividualDetailsAddressImpl.class);
	}

	/**
	 * Clears the cache for the creative individual details address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		entityCache.removeResult(
			CreativeIndividualDetailsAddressImpl.class,
			creativeIndividualDetailsAddress);
	}

	@Override
	public void clearCache(
		List<CreativeIndividualDetailsAddress>
			creativeIndividualDetailsAddresses) {

		for (CreativeIndividualDetailsAddress creativeIndividualDetailsAddress :
				creativeIndividualDetailsAddresses) {

			entityCache.removeResult(
				CreativeIndividualDetailsAddressImpl.class,
				creativeIndividualDetailsAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeIndividualDetailsAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeIndividualDetailsAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeIndividualDetailsAddressModelImpl
			creativeIndividualDetailsAddressModelImpl) {

		Object[] args = new Object[] {
			creativeIndividualDetailsAddressModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeIndividualDetailsAddressModelImpl);
	}

	/**
	 * Creates a new creative individual details address with the primary key. Does not add the creative individual details address to the database.
	 *
	 * @param creativeIndiDetailsAddressId the primary key for the new creative individual details address
	 * @return the new creative individual details address
	 */
	@Override
	public CreativeIndividualDetailsAddress create(
		long creativeIndiDetailsAddressId) {

		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress =
			new CreativeIndividualDetailsAddressImpl();

		creativeIndividualDetailsAddress.setNew(true);
		creativeIndividualDetailsAddress.setPrimaryKey(
			creativeIndiDetailsAddressId);

		creativeIndividualDetailsAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeIndividualDetailsAddress;
	}

	/**
	 * Removes the creative individual details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address that was removed
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress remove(
			long creativeIndiDetailsAddressId)
		throws NoSuchCreativeIndividualDetailsAddressException {

		return remove((Serializable)creativeIndiDetailsAddressId);
	}

	/**
	 * Removes the creative individual details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative individual details address
	 * @return the creative individual details address that was removed
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress remove(Serializable primaryKey)
		throws NoSuchCreativeIndividualDetailsAddressException {

		Session session = null;

		try {
			session = openSession();

			CreativeIndividualDetailsAddress creativeIndividualDetailsAddress =
				(CreativeIndividualDetailsAddress)session.get(
					CreativeIndividualDetailsAddressImpl.class, primaryKey);

			if (creativeIndividualDetailsAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeIndividualDetailsAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeIndividualDetailsAddress);
		}
		catch (NoSuchCreativeIndividualDetailsAddressException
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
	protected CreativeIndividualDetailsAddress removeImpl(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeIndividualDetailsAddress)) {
				creativeIndividualDetailsAddress =
					(CreativeIndividualDetailsAddress)session.get(
						CreativeIndividualDetailsAddressImpl.class,
						creativeIndividualDetailsAddress.getPrimaryKeyObj());
			}

			if (creativeIndividualDetailsAddress != null) {
				session.delete(creativeIndividualDetailsAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeIndividualDetailsAddress != null) {
			clearCache(creativeIndividualDetailsAddress);
		}

		return creativeIndividualDetailsAddress;
	}

	@Override
	public CreativeIndividualDetailsAddress updateImpl(
		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress) {

		boolean isNew = creativeIndividualDetailsAddress.isNew();

		if (!(creativeIndividualDetailsAddress instanceof
				CreativeIndividualDetailsAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeIndividualDetailsAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeIndividualDetailsAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeIndividualDetailsAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeIndividualDetailsAddress implementation " +
					creativeIndividualDetailsAddress.getClass());
		}

		CreativeIndividualDetailsAddressModelImpl
			creativeIndividualDetailsAddressModelImpl =
				(CreativeIndividualDetailsAddressModelImpl)
					creativeIndividualDetailsAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeIndividualDetailsAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				creativeIndividualDetailsAddress.setCreateDate(date);
			}
			else {
				creativeIndividualDetailsAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeIndividualDetailsAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeIndividualDetailsAddress.setModifiedDate(date);
			}
			else {
				creativeIndividualDetailsAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeIndividualDetailsAddress);
			}
			else {
				creativeIndividualDetailsAddress =
					(CreativeIndividualDetailsAddress)session.merge(
						creativeIndividualDetailsAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeIndividualDetailsAddressImpl.class,
			creativeIndividualDetailsAddressModelImpl, false, true);

		cacheUniqueFindersCache(creativeIndividualDetailsAddressModelImpl);

		if (isNew) {
			creativeIndividualDetailsAddress.setNew(false);
		}

		creativeIndividualDetailsAddress.resetOriginalValues();

		return creativeIndividualDetailsAddress;
	}

	/**
	 * Returns the creative individual details address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative individual details address
	 * @return the creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeIndividualDetailsAddressException {

		CreativeIndividualDetailsAddress creativeIndividualDetailsAddress =
			fetchByPrimaryKey(primaryKey);

		if (creativeIndividualDetailsAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeIndividualDetailsAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeIndividualDetailsAddress;
	}

	/**
	 * Returns the creative individual details address with the primary key or throws a <code>NoSuchCreativeIndividualDetailsAddressException</code> if it could not be found.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address
	 * @throws NoSuchCreativeIndividualDetailsAddressException if a creative individual details address with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress findByPrimaryKey(
			long creativeIndiDetailsAddressId)
		throws NoSuchCreativeIndividualDetailsAddressException {

		return findByPrimaryKey((Serializable)creativeIndiDetailsAddressId);
	}

	/**
	 * Returns the creative individual details address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeIndiDetailsAddressId the primary key of the creative individual details address
	 * @return the creative individual details address, or <code>null</code> if a creative individual details address with the primary key could not be found
	 */
	@Override
	public CreativeIndividualDetailsAddress fetchByPrimaryKey(
		long creativeIndiDetailsAddressId) {

		return fetchByPrimaryKey((Serializable)creativeIndiDetailsAddressId);
	}

	/**
	 * Returns all the creative individual details addresses.
	 *
	 * @return the creative individual details addresses
	 */
	@Override
	public List<CreativeIndividualDetailsAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @return the range of creative individual details addresses
	 */
	@Override
	public List<CreativeIndividualDetailsAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative individual details addresses
	 */
	@Override
	public List<CreativeIndividualDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualDetailsAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative individual details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeIndividualDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative individual details addresses
	 * @param end the upper bound of the range of creative individual details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative individual details addresses
	 */
	@Override
	public List<CreativeIndividualDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeIndividualDetailsAddress> orderByComparator,
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

		List<CreativeIndividualDetailsAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeIndividualDetailsAddress>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEINDIVIDUALDETAILSADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEINDIVIDUALDETAILSADDRESS;

				sql = sql.concat(
					CreativeIndividualDetailsAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeIndividualDetailsAddress>)QueryUtil.list(
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
	 * Removes all the creative individual details addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeIndividualDetailsAddress creativeIndividualDetailsAddress :
				findAll()) {

			remove(creativeIndividualDetailsAddress);
		}
	}

	/**
	 * Returns the number of creative individual details addresses.
	 *
	 * @return the number of creative individual details addresses
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
					_SQL_COUNT_CREATIVEINDIVIDUALDETAILSADDRESS);

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
		return "creativeIndiDetailsAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEINDIVIDUALDETAILSADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeIndividualDetailsAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative individual details address persistence.
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

		_finderPathFetchBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		CreativeIndividualDetailsAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeIndividualDetailsAddressUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeIndividualDetailsAddressImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEINDIVIDUALDETAILSADDRESS =
		"SELECT creativeIndividualDetailsAddress FROM CreativeIndividualDetailsAddress creativeIndividualDetailsAddress";

	private static final String
		_SQL_SELECT_CREATIVEINDIVIDUALDETAILSADDRESS_WHERE =
			"SELECT creativeIndividualDetailsAddress FROM CreativeIndividualDetailsAddress creativeIndividualDetailsAddress WHERE ";

	private static final String _SQL_COUNT_CREATIVEINDIVIDUALDETAILSADDRESS =
		"SELECT COUNT(creativeIndividualDetailsAddress) FROM CreativeIndividualDetailsAddress creativeIndividualDetailsAddress";

	private static final String
		_SQL_COUNT_CREATIVEINDIVIDUALDETAILSADDRESS_WHERE =
			"SELECT COUNT(creativeIndividualDetailsAddress) FROM CreativeIndividualDetailsAddress creativeIndividualDetailsAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeIndividualDetailsAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeIndividualDetailsAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeIndividualDetailsAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeIndividualDetailsAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}