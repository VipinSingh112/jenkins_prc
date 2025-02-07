/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAccommodationAddressException;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationAddress;
import com.nbp.tourism.application.form.services.model.TourismNewAccommodationAddressTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationAddressImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAccommodationAddressModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAccommodationAddressUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

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
 * The persistence implementation for the tourism new accommodation address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAccommodationAddressPersistence.class)
public class TourismNewAccommodationAddressPersistenceImpl
	extends BasePersistenceImpl<TourismNewAccommodationAddress>
	implements TourismNewAccommodationAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAccommodationAddressUtil</code> to access the tourism new accommodation address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAccommodationAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTourismById;
	private FinderPath _finderPathCountBygetTourismById;

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a matching tourism new accommodation address could not be found
	 */
	@Override
	public TourismNewAccommodationAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationAddressException {

		TourismNewAccommodationAddress tourismNewAccommodationAddress =
			fetchBygetTourismById(tourismApplicationId);

		if (tourismNewAccommodationAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccommodationAddressException(
				sb.toString());
		}

		return tourismNewAccommodationAddress;
	}

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	@Override
	public TourismNewAccommodationAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new accommodation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	@Override
	public TourismNewAccommodationAddress fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs, this);
		}

		if (result instanceof TourismNewAccommodationAddress) {
			TourismNewAccommodationAddress tourismNewAccommodationAddress =
				(TourismNewAccommodationAddress)result;

			if (tourismApplicationId !=
					tourismNewAccommodationAddress.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAccommodationAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismNewAccommodationAddressPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccommodationAddress
						tourismNewAccommodationAddress = list.get(0);

					result = tourismNewAccommodationAddress;

					cacheResult(tourismNewAccommodationAddress);
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
			return (TourismNewAccommodationAddress)result;
		}
	}

	/**
	 * Removes the tourism new accommodation address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new accommodation address that was removed
	 */
	@Override
	public TourismNewAccommodationAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAccommodationAddressException {

		TourismNewAccommodationAddress tourismNewAccommodationAddress =
			findBygetTourismById(tourismApplicationId);

		return remove(tourismNewAccommodationAddress);
	}

	/**
	 * Returns the number of tourism new accommodation addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new accommodation addresses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWACCOMMODATIONADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2 =
			"tourismNewAccommodationAddress.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTN_A_AT;
	private FinderPath _finderPathCountBygetTN_A_AT;

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the matching tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a matching tourism new accommodation address could not be found
	 */
	@Override
	public TourismNewAccommodationAddress findBygetTN_A_AT(
			String addressType, long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationAddressException {

		TourismNewAccommodationAddress tourismNewAccommodationAddress =
			fetchBygetTN_A_AT(addressType, tourismNewAccoFormId);

		if (tourismNewAccommodationAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", tourismNewAccoFormId=");
			sb.append(tourismNewAccoFormId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAccommodationAddressException(
				sb.toString());
		}

		return tourismNewAccommodationAddress;
	}

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	@Override
	public TourismNewAccommodationAddress fetchBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId) {

		return fetchBygetTN_A_AT(addressType, tourismNewAccoFormId, true);
	}

	/**
	 * Returns the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new accommodation address, or <code>null</code> if a matching tourism new accommodation address could not be found
	 */
	@Override
	public TourismNewAccommodationAddress fetchBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId, boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, tourismNewAccoFormId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTN_A_AT, finderArgs, this);
		}

		if (result instanceof TourismNewAccommodationAddress) {
			TourismNewAccommodationAddress tourismNewAccommodationAddress =
				(TourismNewAccommodationAddress)result;

			if (!Objects.equals(
					addressType,
					tourismNewAccommodationAddress.getAddressType()) ||
				(tourismNewAccoFormId !=
					tourismNewAccommodationAddress.getTourismNewAccoFormId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTN_A_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTN_A_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETTN_A_AT_TOURISMNEWACCOFORMID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismNewAccoFormId);

				List<TourismNewAccommodationAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTN_A_AT, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, tourismNewAccoFormId
								};
							}

							_log.warn(
								"TourismNewAccommodationAddressPersistenceImpl.fetchBygetTN_A_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAccommodationAddress
						tourismNewAccommodationAddress = list.get(0);

					result = tourismNewAccommodationAddress;

					cacheResult(tourismNewAccommodationAddress);
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
			return (TourismNewAccommodationAddress)result;
		}
	}

	/**
	 * Removes the tourism new accommodation address where addressType = &#63; and tourismNewAccoFormId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the tourism new accommodation address that was removed
	 */
	@Override
	public TourismNewAccommodationAddress removeBygetTN_A_AT(
			String addressType, long tourismNewAccoFormId)
		throws NoSuchTourismNewAccommodationAddressException {

		TourismNewAccommodationAddress tourismNewAccommodationAddress =
			findBygetTN_A_AT(addressType, tourismNewAccoFormId);

		return remove(tourismNewAccommodationAddress);
	}

	/**
	 * Returns the number of tourism new accommodation addresses where addressType = &#63; and tourismNewAccoFormId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismNewAccoFormId the tourism new acco form ID
	 * @return the number of matching tourism new accommodation addresses
	 */
	@Override
	public int countBygetTN_A_AT(
		String addressType, long tourismNewAccoFormId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetTN_A_AT;

		Object[] finderArgs = new Object[] {addressType, tourismNewAccoFormId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMNEWACCOMMODATIONADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTN_A_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTN_A_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETTN_A_AT_TOURISMNEWACCOFORMID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismNewAccoFormId);

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

	private static final String _FINDER_COLUMN_GETTN_A_AT_ADDRESSTYPE_2 =
		"tourismNewAccommodationAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETTN_A_AT_ADDRESSTYPE_3 =
		"(tourismNewAccommodationAddress.addressType IS NULL OR tourismNewAccommodationAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTN_A_AT_TOURISMNEWACCOFORMID_2 =
			"tourismNewAccommodationAddress.tourismNewAccoFormId = ?";

	public TourismNewAccommodationAddressPersistenceImpl() {
		setModelClass(TourismNewAccommodationAddress.class);

		setModelImplClass(TourismNewAccommodationAddressImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAccommodationAddressTable.INSTANCE);
	}

	/**
	 * Caches the tourism new accommodation address in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationAddress the tourism new accommodation address
	 */
	@Override
	public void cacheResult(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		entityCache.putResult(
			TourismNewAccommodationAddressImpl.class,
			tourismNewAccommodationAddress.getPrimaryKey(),
			tourismNewAccommodationAddress);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAccommodationAddress.getTourismApplicationId()
			},
			tourismNewAccommodationAddress);

		finderCache.putResult(
			_finderPathFetchBygetTN_A_AT,
			new Object[] {
				tourismNewAccommodationAddress.getAddressType(),
				tourismNewAccommodationAddress.getTourismNewAccoFormId()
			},
			tourismNewAccommodationAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new accommodation addresses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAccommodationAddresses the tourism new accommodation addresses
	 */
	@Override
	public void cacheResult(
		List<TourismNewAccommodationAddress> tourismNewAccommodationAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAccommodationAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAccommodationAddress tourismNewAccommodationAddress :
				tourismNewAccommodationAddresses) {

			if (entityCache.getResult(
					TourismNewAccommodationAddressImpl.class,
					tourismNewAccommodationAddress.getPrimaryKey()) == null) {

				cacheResult(tourismNewAccommodationAddress);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new accommodation addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAccommodationAddressImpl.class);

		finderCache.clearCache(TourismNewAccommodationAddressImpl.class);
	}

	/**
	 * Clears the cache for the tourism new accommodation address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		entityCache.removeResult(
			TourismNewAccommodationAddressImpl.class,
			tourismNewAccommodationAddress);
	}

	@Override
	public void clearCache(
		List<TourismNewAccommodationAddress> tourismNewAccommodationAddresses) {

		for (TourismNewAccommodationAddress tourismNewAccommodationAddress :
				tourismNewAccommodationAddresses) {

			entityCache.removeResult(
				TourismNewAccommodationAddressImpl.class,
				tourismNewAccommodationAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAccommodationAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAccommodationAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAccommodationAddressModelImpl
			tourismNewAccommodationAddressModelImpl) {

		Object[] args = new Object[] {
			tourismNewAccommodationAddressModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAccommodationAddressModelImpl);

		args = new Object[] {
			tourismNewAccommodationAddressModelImpl.getAddressType(),
			tourismNewAccommodationAddressModelImpl.getTourismNewAccoFormId()
		};

		finderCache.putResult(
			_finderPathCountBygetTN_A_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTN_A_AT, args,
			tourismNewAccommodationAddressModelImpl);
	}

	/**
	 * Creates a new tourism new accommodation address with the primary key. Does not add the tourism new accommodation address to the database.
	 *
	 * @param tourismNewAccommodationAOOId the primary key for the new tourism new accommodation address
	 * @return the new tourism new accommodation address
	 */
	@Override
	public TourismNewAccommodationAddress create(
		long tourismNewAccommodationAOOId) {

		TourismNewAccommodationAddress tourismNewAccommodationAddress =
			new TourismNewAccommodationAddressImpl();

		tourismNewAccommodationAddress.setNew(true);
		tourismNewAccommodationAddress.setPrimaryKey(
			tourismNewAccommodationAOOId);

		tourismNewAccommodationAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAccommodationAddress;
	}

	/**
	 * Removes the tourism new accommodation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address that was removed
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationAddress remove(
			long tourismNewAccommodationAOOId)
		throws NoSuchTourismNewAccommodationAddressException {

		return remove((Serializable)tourismNewAccommodationAOOId);
	}

	/**
	 * Removes the tourism new accommodation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address that was removed
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationAddress remove(Serializable primaryKey)
		throws NoSuchTourismNewAccommodationAddressException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAccommodationAddress tourismNewAccommodationAddress =
				(TourismNewAccommodationAddress)session.get(
					TourismNewAccommodationAddressImpl.class, primaryKey);

			if (tourismNewAccommodationAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAccommodationAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAccommodationAddress);
		}
		catch (NoSuchTourismNewAccommodationAddressException
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
	protected TourismNewAccommodationAddress removeImpl(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAccommodationAddress)) {
				tourismNewAccommodationAddress =
					(TourismNewAccommodationAddress)session.get(
						TourismNewAccommodationAddressImpl.class,
						tourismNewAccommodationAddress.getPrimaryKeyObj());
			}

			if (tourismNewAccommodationAddress != null) {
				session.delete(tourismNewAccommodationAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAccommodationAddress != null) {
			clearCache(tourismNewAccommodationAddress);
		}

		return tourismNewAccommodationAddress;
	}

	@Override
	public TourismNewAccommodationAddress updateImpl(
		TourismNewAccommodationAddress tourismNewAccommodationAddress) {

		boolean isNew = tourismNewAccommodationAddress.isNew();

		if (!(tourismNewAccommodationAddress instanceof
				TourismNewAccommodationAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAccommodationAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAccommodationAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAccommodationAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAccommodationAddress implementation " +
					tourismNewAccommodationAddress.getClass());
		}

		TourismNewAccommodationAddressModelImpl
			tourismNewAccommodationAddressModelImpl =
				(TourismNewAccommodationAddressModelImpl)
					tourismNewAccommodationAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismNewAccommodationAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismNewAccommodationAddress.setCreateDate(date);
			}
			else {
				tourismNewAccommodationAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAccommodationAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismNewAccommodationAddress.setModifiedDate(date);
			}
			else {
				tourismNewAccommodationAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAccommodationAddress);
			}
			else {
				tourismNewAccommodationAddress =
					(TourismNewAccommodationAddress)session.merge(
						tourismNewAccommodationAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAccommodationAddressImpl.class,
			tourismNewAccommodationAddressModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAccommodationAddressModelImpl);

		if (isNew) {
			tourismNewAccommodationAddress.setNew(false);
		}

		tourismNewAccommodationAddress.resetOriginalValues();

		return tourismNewAccommodationAddress;
	}

	/**
	 * Returns the tourism new accommodation address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismNewAccommodationAddressException {

		TourismNewAccommodationAddress tourismNewAccommodationAddress =
			fetchByPrimaryKey(primaryKey);

		if (tourismNewAccommodationAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAccommodationAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAccommodationAddress;
	}

	/**
	 * Returns the tourism new accommodation address with the primary key or throws a <code>NoSuchTourismNewAccommodationAddressException</code> if it could not be found.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address
	 * @throws NoSuchTourismNewAccommodationAddressException if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationAddress findByPrimaryKey(
			long tourismNewAccommodationAOOId)
		throws NoSuchTourismNewAccommodationAddressException {

		return findByPrimaryKey((Serializable)tourismNewAccommodationAOOId);
	}

	/**
	 * Returns the tourism new accommodation address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAccommodationAOOId the primary key of the tourism new accommodation address
	 * @return the tourism new accommodation address, or <code>null</code> if a tourism new accommodation address with the primary key could not be found
	 */
	@Override
	public TourismNewAccommodationAddress fetchByPrimaryKey(
		long tourismNewAccommodationAOOId) {

		return fetchByPrimaryKey((Serializable)tourismNewAccommodationAOOId);
	}

	/**
	 * Returns all the tourism new accommodation addresses.
	 *
	 * @return the tourism new accommodation addresses
	 */
	@Override
	public List<TourismNewAccommodationAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @return the range of tourism new accommodation addresses
	 */
	@Override
	public List<TourismNewAccommodationAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new accommodation addresses
	 */
	@Override
	public List<TourismNewAccommodationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new accommodation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAccommodationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new accommodation addresses
	 * @param end the upper bound of the range of tourism new accommodation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new accommodation addresses
	 */
	@Override
	public List<TourismNewAccommodationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAccommodationAddress> orderByComparator,
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

		List<TourismNewAccommodationAddress> list = null;

		if (useFinderCache) {
			list = (List<TourismNewAccommodationAddress>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS;

				sql = sql.concat(
					TourismNewAccommodationAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismNewAccommodationAddress>)QueryUtil.list(
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
	 * Removes all the tourism new accommodation addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAccommodationAddress tourismNewAccommodationAddress :
				findAll()) {

			remove(tourismNewAccommodationAddress);
		}
	}

	/**
	 * Returns the number of tourism new accommodation addresses.
	 *
	 * @return the number of tourism new accommodation addresses
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
					_SQL_COUNT_TOURISMNEWACCOMMODATIONADDRESS);

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
		return "tourismNewAccommodationAOOId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAccommodationAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new accommodation address persistence.
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

		_finderPathFetchBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		_finderPathFetchBygetTN_A_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTN_A_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismNewAccoFormId"}, true);

		_finderPathCountBygetTN_A_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTN_A_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismNewAccoFormId"}, false);

		TourismNewAccommodationAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAccommodationAddressUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewAccommodationAddressImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS =
		"SELECT tourismNewAccommodationAddress FROM TourismNewAccommodationAddress tourismNewAccommodationAddress";

	private static final String
		_SQL_SELECT_TOURISMNEWACCOMMODATIONADDRESS_WHERE =
			"SELECT tourismNewAccommodationAddress FROM TourismNewAccommodationAddress tourismNewAccommodationAddress WHERE ";

	private static final String _SQL_COUNT_TOURISMNEWACCOMMODATIONADDRESS =
		"SELECT COUNT(tourismNewAccommodationAddress) FROM TourismNewAccommodationAddress tourismNewAccommodationAddress";

	private static final String
		_SQL_COUNT_TOURISMNEWACCOMMODATIONADDRESS_WHERE =
			"SELECT COUNT(tourismNewAccommodationAddress) FROM TourismNewAccommodationAddress tourismNewAccommodationAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAccommodationAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAccommodationAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAccommodationAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAccommodationAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}