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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeCompanyDetailsAddressException;
import com.nbp.creative.application.form.service.model.CreativeCompanyDetailsAddress;
import com.nbp.creative.application.form.service.model.CreativeCompanyDetailsAddressTable;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeCompanyDetailsAddressModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsAddressPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeCompanyDetailsAddressUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the creative company details address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeCompanyDetailsAddressPersistence.class)
public class CreativeCompanyDetailsAddressPersistenceImpl
	extends BasePersistenceImpl<CreativeCompanyDetailsAddress>
	implements CreativeCompanyDetailsAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeCompanyDetailsAddressUtil</code> to access the creative company details address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeCompanyDetailsAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCreative_Com_Detail_AT;
	private FinderPath _finderPathCountBygetCreative_Com_Detail_AT;

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or throws a <code>NoSuchCreativeCompanyDetailsAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the matching creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a matching creative company details address could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress findBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId)
		throws NoSuchCreativeCompanyDetailsAddressException {

		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress =
			fetchBygetCreative_Com_Detail_AT(
				addressType, creativeCompanyDetailsId);

		if (creativeCompanyDetailsAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", creativeCompanyDetailsId=");
			sb.append(creativeCompanyDetailsId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeCompanyDetailsAddressException(
				sb.toString());
		}

		return creativeCompanyDetailsAddress;
	}

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the matching creative company details address, or <code>null</code> if a matching creative company details address could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress fetchBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId) {

		return fetchBygetCreative_Com_Detail_AT(
			addressType, creativeCompanyDetailsId, true);
	}

	/**
	 * Returns the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative company details address, or <code>null</code> if a matching creative company details address could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress fetchBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, creativeCompanyDetailsId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreative_Com_Detail_AT, finderArgs, this);
		}

		if (result instanceof CreativeCompanyDetailsAddress) {
			CreativeCompanyDetailsAddress creativeCompanyDetailsAddress =
				(CreativeCompanyDetailsAddress)result;

			if (!Objects.equals(
					addressType,
					creativeCompanyDetailsAddress.getAddressType()) ||
				(creativeCompanyDetailsId !=
					creativeCompanyDetailsAddress.
						getCreativeCompanyDetailsId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CREATIVECOMPANYDETAILSADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(
					_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_CREATIVECOMPANYDETAILSID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(creativeCompanyDetailsId);

				List<CreativeCompanyDetailsAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreative_Com_Detail_AT,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, creativeCompanyDetailsId
								};
							}

							_log.warn(
								"CreativeCompanyDetailsAddressPersistenceImpl.fetchBygetCreative_Com_Detail_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeCompanyDetailsAddress
						creativeCompanyDetailsAddress = list.get(0);

					result = creativeCompanyDetailsAddress;

					cacheResult(creativeCompanyDetailsAddress);
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
			return (CreativeCompanyDetailsAddress)result;
		}
	}

	/**
	 * Removes the creative company details address where addressType = &#63; and creativeCompanyDetailsId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the creative company details address that was removed
	 */
	@Override
	public CreativeCompanyDetailsAddress removeBygetCreative_Com_Detail_AT(
			String addressType, long creativeCompanyDetailsId)
		throws NoSuchCreativeCompanyDetailsAddressException {

		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress =
			findBygetCreative_Com_Detail_AT(
				addressType, creativeCompanyDetailsId);

		return remove(creativeCompanyDetailsAddress);
	}

	/**
	 * Returns the number of creative company details addresses where addressType = &#63; and creativeCompanyDetailsId = &#63;.
	 *
	 * @param addressType the address type
	 * @param creativeCompanyDetailsId the creative company details ID
	 * @return the number of matching creative company details addresses
	 */
	@Override
	public int countBygetCreative_Com_Detail_AT(
		String addressType, long creativeCompanyDetailsId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetCreative_Com_Detail_AT;

		Object[] finderArgs = new Object[] {
			addressType, creativeCompanyDetailsId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVECOMPANYDETAILSADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(
					_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_CREATIVECOMPANYDETAILSID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(creativeCompanyDetailsId);

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
		_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_ADDRESSTYPE_2 =
			"creativeCompanyDetailsAddress.addressType = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_ADDRESSTYPE_3 =
			"(creativeCompanyDetailsAddress.addressType IS NULL OR creativeCompanyDetailsAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCREATIVE_COM_DETAIL_AT_CREATIVECOMPANYDETAILSID_2 =
			"creativeCompanyDetailsAddress.creativeCompanyDetailsId = ?";

	public CreativeCompanyDetailsAddressPersistenceImpl() {
		setModelClass(CreativeCompanyDetailsAddress.class);

		setModelImplClass(CreativeCompanyDetailsAddressImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeCompanyDetailsAddressTable.INSTANCE);
	}

	/**
	 * Caches the creative company details address in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailsAddress the creative company details address
	 */
	@Override
	public void cacheResult(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		entityCache.putResult(
			CreativeCompanyDetailsAddressImpl.class,
			creativeCompanyDetailsAddress.getPrimaryKey(),
			creativeCompanyDetailsAddress);

		finderCache.putResult(
			_finderPathFetchBygetCreative_Com_Detail_AT,
			new Object[] {
				creativeCompanyDetailsAddress.getAddressType(),
				creativeCompanyDetailsAddress.getCreativeCompanyDetailsId()
			},
			creativeCompanyDetailsAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative company details addresses in the entity cache if it is enabled.
	 *
	 * @param creativeCompanyDetailsAddresses the creative company details addresses
	 */
	@Override
	public void cacheResult(
		List<CreativeCompanyDetailsAddress> creativeCompanyDetailsAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeCompanyDetailsAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeCompanyDetailsAddress creativeCompanyDetailsAddress :
				creativeCompanyDetailsAddresses) {

			if (entityCache.getResult(
					CreativeCompanyDetailsAddressImpl.class,
					creativeCompanyDetailsAddress.getPrimaryKey()) == null) {

				cacheResult(creativeCompanyDetailsAddress);
			}
		}
	}

	/**
	 * Clears the cache for all creative company details addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeCompanyDetailsAddressImpl.class);

		finderCache.clearCache(CreativeCompanyDetailsAddressImpl.class);
	}

	/**
	 * Clears the cache for the creative company details address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		entityCache.removeResult(
			CreativeCompanyDetailsAddressImpl.class,
			creativeCompanyDetailsAddress);
	}

	@Override
	public void clearCache(
		List<CreativeCompanyDetailsAddress> creativeCompanyDetailsAddresses) {

		for (CreativeCompanyDetailsAddress creativeCompanyDetailsAddress :
				creativeCompanyDetailsAddresses) {

			entityCache.removeResult(
				CreativeCompanyDetailsAddressImpl.class,
				creativeCompanyDetailsAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeCompanyDetailsAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeCompanyDetailsAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeCompanyDetailsAddressModelImpl
			creativeCompanyDetailsAddressModelImpl) {

		Object[] args = new Object[] {
			creativeCompanyDetailsAddressModelImpl.getAddressType(),
			creativeCompanyDetailsAddressModelImpl.getCreativeCompanyDetailsId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreative_Com_Detail_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreative_Com_Detail_AT, args,
			creativeCompanyDetailsAddressModelImpl);
	}

	/**
	 * Creates a new creative company details address with the primary key. Does not add the creative company details address to the database.
	 *
	 * @param creativeComDetailsAddressId the primary key for the new creative company details address
	 * @return the new creative company details address
	 */
	@Override
	public CreativeCompanyDetailsAddress create(
		long creativeComDetailsAddressId) {

		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress =
			new CreativeCompanyDetailsAddressImpl();

		creativeCompanyDetailsAddress.setNew(true);
		creativeCompanyDetailsAddress.setPrimaryKey(
			creativeComDetailsAddressId);

		creativeCompanyDetailsAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeCompanyDetailsAddress;
	}

	/**
	 * Removes the creative company details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address that was removed
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress remove(
			long creativeComDetailsAddressId)
		throws NoSuchCreativeCompanyDetailsAddressException {

		return remove((Serializable)creativeComDetailsAddressId);
	}

	/**
	 * Removes the creative company details address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative company details address
	 * @return the creative company details address that was removed
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress remove(Serializable primaryKey)
		throws NoSuchCreativeCompanyDetailsAddressException {

		Session session = null;

		try {
			session = openSession();

			CreativeCompanyDetailsAddress creativeCompanyDetailsAddress =
				(CreativeCompanyDetailsAddress)session.get(
					CreativeCompanyDetailsAddressImpl.class, primaryKey);

			if (creativeCompanyDetailsAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeCompanyDetailsAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeCompanyDetailsAddress);
		}
		catch (NoSuchCreativeCompanyDetailsAddressException
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
	protected CreativeCompanyDetailsAddress removeImpl(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeCompanyDetailsAddress)) {
				creativeCompanyDetailsAddress =
					(CreativeCompanyDetailsAddress)session.get(
						CreativeCompanyDetailsAddressImpl.class,
						creativeCompanyDetailsAddress.getPrimaryKeyObj());
			}

			if (creativeCompanyDetailsAddress != null) {
				session.delete(creativeCompanyDetailsAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeCompanyDetailsAddress != null) {
			clearCache(creativeCompanyDetailsAddress);
		}

		return creativeCompanyDetailsAddress;
	}

	@Override
	public CreativeCompanyDetailsAddress updateImpl(
		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress) {

		boolean isNew = creativeCompanyDetailsAddress.isNew();

		if (!(creativeCompanyDetailsAddress instanceof
				CreativeCompanyDetailsAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					creativeCompanyDetailsAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeCompanyDetailsAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeCompanyDetailsAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeCompanyDetailsAddress implementation " +
					creativeCompanyDetailsAddress.getClass());
		}

		CreativeCompanyDetailsAddressModelImpl
			creativeCompanyDetailsAddressModelImpl =
				(CreativeCompanyDetailsAddressModelImpl)
					creativeCompanyDetailsAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeCompanyDetailsAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeCompanyDetailsAddress.setCreateDate(date);
			}
			else {
				creativeCompanyDetailsAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeCompanyDetailsAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeCompanyDetailsAddress.setModifiedDate(date);
			}
			else {
				creativeCompanyDetailsAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeCompanyDetailsAddress);
			}
			else {
				creativeCompanyDetailsAddress =
					(CreativeCompanyDetailsAddress)session.merge(
						creativeCompanyDetailsAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeCompanyDetailsAddressImpl.class,
			creativeCompanyDetailsAddressModelImpl, false, true);

		cacheUniqueFindersCache(creativeCompanyDetailsAddressModelImpl);

		if (isNew) {
			creativeCompanyDetailsAddress.setNew(false);
		}

		creativeCompanyDetailsAddress.resetOriginalValues();

		return creativeCompanyDetailsAddress;
	}

	/**
	 * Returns the creative company details address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative company details address
	 * @return the creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCreativeCompanyDetailsAddressException {

		CreativeCompanyDetailsAddress creativeCompanyDetailsAddress =
			fetchByPrimaryKey(primaryKey);

		if (creativeCompanyDetailsAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeCompanyDetailsAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeCompanyDetailsAddress;
	}

	/**
	 * Returns the creative company details address with the primary key or throws a <code>NoSuchCreativeCompanyDetailsAddressException</code> if it could not be found.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address
	 * @throws NoSuchCreativeCompanyDetailsAddressException if a creative company details address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress findByPrimaryKey(
			long creativeComDetailsAddressId)
		throws NoSuchCreativeCompanyDetailsAddressException {

		return findByPrimaryKey((Serializable)creativeComDetailsAddressId);
	}

	/**
	 * Returns the creative company details address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeComDetailsAddressId the primary key of the creative company details address
	 * @return the creative company details address, or <code>null</code> if a creative company details address with the primary key could not be found
	 */
	@Override
	public CreativeCompanyDetailsAddress fetchByPrimaryKey(
		long creativeComDetailsAddressId) {

		return fetchByPrimaryKey((Serializable)creativeComDetailsAddressId);
	}

	/**
	 * Returns all the creative company details addresses.
	 *
	 * @return the creative company details addresses
	 */
	@Override
	public List<CreativeCompanyDetailsAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @return the range of creative company details addresses
	 */
	@Override
	public List<CreativeCompanyDetailsAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative company details addresses
	 */
	@Override
	public List<CreativeCompanyDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDetailsAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative company details addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeCompanyDetailsAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company details addresses
	 * @param end the upper bound of the range of creative company details addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative company details addresses
	 */
	@Override
	public List<CreativeCompanyDetailsAddress> findAll(
		int start, int end,
		OrderByComparator<CreativeCompanyDetailsAddress> orderByComparator,
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

		List<CreativeCompanyDetailsAddress> list = null;

		if (useFinderCache) {
			list = (List<CreativeCompanyDetailsAddress>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVECOMPANYDETAILSADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVECOMPANYDETAILSADDRESS;

				sql = sql.concat(
					CreativeCompanyDetailsAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeCompanyDetailsAddress>)QueryUtil.list(
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
	 * Removes all the creative company details addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeCompanyDetailsAddress creativeCompanyDetailsAddress :
				findAll()) {

			remove(creativeCompanyDetailsAddress);
		}
	}

	/**
	 * Returns the number of creative company details addresses.
	 *
	 * @return the number of creative company details addresses
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
					_SQL_COUNT_CREATIVECOMPANYDETAILSADDRESS);

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
		return "creativeComDetailsAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVECOMPANYDETAILSADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeCompanyDetailsAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative company details address persistence.
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

		_finderPathFetchBygetCreative_Com_Detail_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreative_Com_Detail_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "creativeCompanyDetailsId"}, true);

		_finderPathCountBygetCreative_Com_Detail_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreative_Com_Detail_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "creativeCompanyDetailsId"}, false);

		CreativeCompanyDetailsAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeCompanyDetailsAddressUtil.setPersistence(null);

		entityCache.removeCache(
			CreativeCompanyDetailsAddressImpl.class.getName());
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

	private static final String _SQL_SELECT_CREATIVECOMPANYDETAILSADDRESS =
		"SELECT creativeCompanyDetailsAddress FROM CreativeCompanyDetailsAddress creativeCompanyDetailsAddress";

	private static final String
		_SQL_SELECT_CREATIVECOMPANYDETAILSADDRESS_WHERE =
			"SELECT creativeCompanyDetailsAddress FROM CreativeCompanyDetailsAddress creativeCompanyDetailsAddress WHERE ";

	private static final String _SQL_COUNT_CREATIVECOMPANYDETAILSADDRESS =
		"SELECT COUNT(creativeCompanyDetailsAddress) FROM CreativeCompanyDetailsAddress creativeCompanyDetailsAddress";

	private static final String _SQL_COUNT_CREATIVECOMPANYDETAILSADDRESS_WHERE =
		"SELECT COUNT(creativeCompanyDetailsAddress) FROM CreativeCompanyDetailsAddress creativeCompanyDetailsAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeCompanyDetailsAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeCompanyDetailsAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeCompanyDetailsAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeCompanyDetailsAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}