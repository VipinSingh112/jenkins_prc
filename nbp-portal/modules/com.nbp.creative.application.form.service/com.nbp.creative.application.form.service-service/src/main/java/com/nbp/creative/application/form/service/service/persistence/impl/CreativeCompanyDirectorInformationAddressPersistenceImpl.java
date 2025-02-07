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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDirectorInformationAddressException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddress;
import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformationAddressTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationAddressModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDirectorInformationAddressUtil;
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
 * The persistence implementation for the creative company director information address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeCompanyDirectorInformationAddressPersistence.class)
public class CreativeCompanyDirectorInformationAddressPersistenceImpl
	extends BasePersistenceImpl<CreativeCompanyDirectorInformationAddress>
	implements CreativeCompanyDirectorInformationAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeCompanyDirectorInformationAddressUtil</code> to access the creative company director information address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeCompanyDirectorInformationAddressImpl.class.getName();

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
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeCompanyDirectorInformationAddressException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a matching creative company director information address could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress findBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException {

		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress = fetchBygetCreativeById(
				CreativeApplicationId);

		if (creativeCompanyDirectorInformationAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeCompanyDirectorInformationAddressException(
				sb.toString());
		}

		return creativeCompanyDirectorInformationAddress;
	}

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative company director information address, or <code>null</code> if a matching creative company director information address could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative company director information address where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company director information address, or <code>null</code> if a matching creative company director information address could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress fetchBygetCreativeById(
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

		if (result instanceof CreativeCompanyDirectorInformationAddress) {
			CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress =
					(CreativeCompanyDirectorInformationAddress)result;

			if (CreativeApplicationId !=
					creativeCompanyDirectorInformationAddress.
						getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(
				_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeCompanyDirectorInformationAddress> list =
					query.list();

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
								"CreativeCompanyDirectorInformationAddressPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeCompanyDirectorInformationAddress
						creativeCompanyDirectorInformationAddress = list.get(0);

					result = creativeCompanyDirectorInformationAddress;

					cacheResult(creativeCompanyDirectorInformationAddress);
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
			return (CreativeCompanyDirectorInformationAddress)result;
		}
	}

	/**
	 * Removes the creative company director information address where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative company director information address that was removed
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException {

		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress = findBygetCreativeById(
				CreativeApplicationId);

		return remove(creativeCompanyDirectorInformationAddress);
	}

	/**
	 * Returns the number of creative company director information addresses where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative company director information addresses
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(
				_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS_WHERE);

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
			"creativeCompanyDirectorInformationAddress.CreativeApplicationId = ?";

	public CreativeCompanyDirectorInformationAddressPersistenceImpl() {
		setModelClass(CreativeCompanyDirectorInformationAddress.class);

		setModelImplClass(CreativeCompanyDirectorInformationAddressImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeCompanyDirectorInformationAddressTable.INSTANCE);
	}

	/**
	 * Caches the creative company director information address in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformationAddress the creative company director information address
	 */
	@Override
	public void cacheResult(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		entityCache.putResult(
			CreativeCompanyDirectorInformationAddressImpl.class,
			creativeCompanyDirectorInformationAddress.getPrimaryKey(),
			creativeCompanyDirectorInformationAddress);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {
				creativeCompanyDirectorInformationAddress.
					getCreativeApplicationId()
			},
			creativeCompanyDirectorInformationAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative company director information addresses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDirectorInformationAddresses the creative company director information addresses
	 */
	@Override
	public void cacheResult(
		List<CreativeCompanyDirectorInformationAddress>
			creativeCompanyDirectorInformationAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeCompanyDirectorInformationAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress :
					creativeCompanyDirectorInformationAddresses) {

			if (entityCache.getResult(
					CreativeCompanyDirectorInformationAddressImpl.class,
					creativeCompanyDirectorInformationAddress.
						getPrimaryKey()) == null) {

				cacheResult(creativeCompanyDirectorInformationAddress);
			}
		}
	}

	/**
	 * Clears the cache for all creative company director information addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			CreativeCompanyDirectorInformationAddressImpl.class);

		finderCache.clearCache(
			CreativeCompanyDirectorInformationAddressImpl.class);
	}

	/**
	 * Clears the cache for the creative company director information address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		entityCache.removeResult(
			CreativeCompanyDirectorInformationAddressImpl.class,
			creativeCompanyDirectorInformationAddress);
	}

	@Override
	public void clearCache(
		List<CreativeCompanyDirectorInformationAddress>
			creativeCompanyDirectorInformationAddresses) {

		for (CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress :
					creativeCompanyDirectorInformationAddresses) {

			entityCache.removeResult(
				CreativeCompanyDirectorInformationAddressImpl.class,
				creativeCompanyDirectorInformationAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			CreativeCompanyDirectorInformationAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeCompanyDirectorInformationAddressImpl.class,
				primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeCompanyDirectorInformationAddressModelImpl
			creativeCompanyDirectorInformationAddressModelImpl) {

		Object[] args = new Object[] {
			creativeCompanyDirectorInformationAddressModelImpl.
				getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeCompanyDirectorInformationAddressModelImpl);
	}

	/**
	 * Creates a new creative company director information address with the primary key. Does not add the creative company director information address to the database.
	 *
	 * @param creativeComDirectorAddressId the primary key for the new creative company director information address
	 * @return the new creative company director information address
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress create(
		long creativeComDirectorAddressId) {

		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress =
				new CreativeCompanyDirectorInformationAddressImpl();

		creativeCompanyDirectorInformationAddress.setNew(true);
		creativeCompanyDirectorInformationAddress.setPrimaryKey(
			creativeComDirectorAddressId);

		creativeCompanyDirectorInformationAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeCompanyDirectorInformationAddress;
	}

	/**
	 * Removes the creative company director information address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress remove(
			long creativeComDirectorAddressId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException {

		return remove((Serializable)creativeComDirectorAddressId);
	}

	/**
	 * Removes the creative company director information address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative company director information address
	 * @return the creative company director information address that was removed
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress remove(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyDirectorInformationAddressException {

		Session session = null;

		try {
			session = openSession();

			CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress =
					(CreativeCompanyDirectorInformationAddress)session.get(
						CreativeCompanyDirectorInformationAddressImpl.class,
						primaryKey);

			if (creativeCompanyDirectorInformationAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeCompanyDirectorInformationAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeCompanyDirectorInformationAddress);
		}
		catch (NoSuchCreativeCompanyDirectorInformationAddressException
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
	protected CreativeCompanyDirectorInformationAddress removeImpl(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeCompanyDirectorInformationAddress)) {
				creativeCompanyDirectorInformationAddress =
					(CreativeCompanyDirectorInformationAddress)session.get(
						CreativeCompanyDirectorInformationAddressImpl.class,
						creativeCompanyDirectorInformationAddress.
							getPrimaryKeyObj());
			}

			if (creativeCompanyDirectorInformationAddress != null) {
				session.delete(creativeCompanyDirectorInformationAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeCompanyDirectorInformationAddress != null) {
			clearCache(creativeCompanyDirectorInformationAddress);
		}

		return creativeCompanyDirectorInformationAddress;
	}

	@Override
	public CreativeCompanyDirectorInformationAddress updateImpl(
		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress) {

		boolean isNew = creativeCompanyDirectorInformationAddress.isNew();

		if (!(creativeCompanyDirectorInformationAddress instanceof
				CreativeCompanyDirectorInformationAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeCompanyDirectorInformationAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeCompanyDirectorInformationAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeCompanyDirectorInformationAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeCompanyDirectorInformationAddress implementation " +
					creativeCompanyDirectorInformationAddress.getClass());
		}

		CreativeCompanyDirectorInformationAddressModelImpl
			creativeCompanyDirectorInformationAddressModelImpl =
				(CreativeCompanyDirectorInformationAddressModelImpl)
					creativeCompanyDirectorInformationAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(creativeCompanyDirectorInformationAddress.getCreateDate() ==
				null)) {

			if (serviceContext == null) {
				creativeCompanyDirectorInformationAddress.setCreateDate(date);
			}
			else {
				creativeCompanyDirectorInformationAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeCompanyDirectorInformationAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				creativeCompanyDirectorInformationAddress.setModifiedDate(date);
			}
			else {
				creativeCompanyDirectorInformationAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeCompanyDirectorInformationAddress);
			}
			else {
				creativeCompanyDirectorInformationAddress =
					(CreativeCompanyDirectorInformationAddress)session.merge(
						creativeCompanyDirectorInformationAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeCompanyDirectorInformationAddressImpl.class,
			creativeCompanyDirectorInformationAddressModelImpl, false, true);

		cacheUniqueFindersCache(
			creativeCompanyDirectorInformationAddressModelImpl);

		if (isNew) {
			creativeCompanyDirectorInformationAddress.setNew(false);
		}

		creativeCompanyDirectorInformationAddress.resetOriginalValues();

		return creativeCompanyDirectorInformationAddress;
	}

	/**
	 * Returns the creative company director information address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative company director information address
	 * @return the creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyDirectorInformationAddressException {

		CreativeCompanyDirectorInformationAddress
			creativeCompanyDirectorInformationAddress = fetchByPrimaryKey(
				primaryKey);

		if (creativeCompanyDirectorInformationAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeCompanyDirectorInformationAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeCompanyDirectorInformationAddress;
	}

	/**
	 * Returns the creative company director information address with the primary key or throws a <code>NoSuchCreativeCompanyDirectorInformationAddressException</code> if it could not be found.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address
	 * @throws NoSuchCreativeCompanyDirectorInformationAddressException if a creative company director information address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress findByPrimaryKey(
			long creativeComDirectorAddressId)
		throws NoSuchCreativeCompanyDirectorInformationAddressException {

		return findByPrimaryKey((Serializable)creativeComDirectorAddressId);
	}

	/**
	 * Returns the creative company director information address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDirectorAddressId the primary key of the creative company director information address
	 * @return the creative company director information address, or <code>null</code> if a creative company director information address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDirectorInformationAddress fetchByPrimaryKey(
		long creativeComDirectorAddressId) {

		return fetchByPrimaryKey((Serializable)creativeComDirectorAddressId);
	}

	/**
	 * Returns all the creative company director information addresses.
	 *
	 * @return the creative company director information addresses
	 */
	@Override
	public List<CreativeCompanyDirectorInformationAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @return the range of creative company director information addresses
	 */
	@Override
	public List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company director information addresses
	 */
	@Override
	public List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDirectorInformationAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative company director information addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDirectorInformationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director information addresses
	 * @param end the upper bound of the range of creative company director information addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company director information addresses
	 */
	@Override
	public List<CreativeCompanyDirectorInformationAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDirectorInformationAddress>
			orderByComparator,
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

		List<CreativeCompanyDirectorInformationAddress> list = null;

		if (useFinderCache) {
			list =
				(List<CreativeCompanyDirectorInformationAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(
					_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS;

				sql = sql.concat(
					CreativeCompanyDirectorInformationAddressModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<CreativeCompanyDirectorInformationAddress>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the creative company director information addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeCompanyDirectorInformationAddress
				creativeCompanyDirectorInformationAddress : findAll()) {

			remove(creativeCompanyDirectorInformationAddress);
		}
	}

	/**
	 * Returns the number of creative company director information addresses.
	 *
	 * @return the number of creative company director information addresses
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
					_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS);

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
		return "creativeComDirectorAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeCompanyDirectorInformationAddressModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative company director information address persistence.
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

		CreativeCompanyDirectorInformationAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeCompanyDirectorInformationAddressUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeCompanyDirectorInformationAddressImpl.class.getName());
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

	private static final String
		_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS =
			"SELECT creativeCompanyDirectorInformationAddress FROM CreativeCompanyDirectorInformationAddress creativeCompanyDirectorInformationAddress";

	private static final String
		_SQL_SELECT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS_WHERE =
			"SELECT creativeCompanyDirectorInformationAddress FROM CreativeCompanyDirectorInformationAddress creativeCompanyDirectorInformationAddress WHERE ";

	private static final String
		_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS =
			"SELECT COUNT(creativeCompanyDirectorInformationAddress) FROM CreativeCompanyDirectorInformationAddress creativeCompanyDirectorInformationAddress";

	private static final String
		_SQL_COUNT_CREATIVECOMPANYDIRECTORINFORMATIONADDRESS_WHERE =
			"SELECT COUNT(creativeCompanyDirectorInformationAddress) FROM CreativeCompanyDirectorInformationAddress creativeCompanyDirectorInformationAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeCompanyDirectorInformationAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeCompanyDirectorInformationAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeCompanyDirectorInformationAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyDirectorInformationAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}