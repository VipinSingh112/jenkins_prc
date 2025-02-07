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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAccommodationFormAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaAccommodationFormAddressTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAccommodationFormAddressModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAccommodationFormAddressUtil;
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
 * The persistence implementation for the tourism bona accommodation form address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAccommodationFormAddressPersistence.class)
public class TourismBonaAccommodationFormAddressPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAccommodationFormAddress>
	implements TourismBonaAccommodationFormAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAccommodationFormAddressUtil</code> to access the tourism bona accommodation form address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAccommodationFormAddressImpl.class.getName();

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
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a matching tourism bona accommodation form address could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress = fetchBygetTourismById(
				tourismApplicationId);

		if (tourismBonaAccommodationFormAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAccommodationFormAddressException(
				sb.toString());
		}

		return tourismBonaAccommodationFormAddress;
	}

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona accommodation form address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress fetchBygetTourismById(
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

		if (result instanceof TourismBonaAccommodationFormAddress) {
			TourismBonaAccommodationFormAddress
				tourismBonaAccommodationFormAddress =
					(TourismBonaAccommodationFormAddress)result;

			if (tourismApplicationId !=
					tourismBonaAccommodationFormAddress.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAccommodationFormAddress> list = query.list();

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
								"TourismBonaAccommodationFormAddressPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAccommodationFormAddress
						tourismBonaAccommodationFormAddress = list.get(0);

					result = tourismBonaAccommodationFormAddress;

					cacheResult(tourismBonaAccommodationFormAddress);
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
			return (TourismBonaAccommodationFormAddress)result;
		}
	}

	/**
	 * Removes the tourism bona accommodation form address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona accommodation form address that was removed
	 */
	@Override
	public TourismBonaAccommodationFormAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress = findBygetTourismById(
				tourismApplicationId);

		return remove(tourismBonaAccommodationFormAddress);
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona accommodation form addresses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAACCOMMODATIONFORMADDRESS_WHERE);

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
			"tourismBonaAccommodationFormAddress.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTB_Acco_AT;
	private FinderPath _finderPathCountBygetTB_Acco_AT;

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the matching tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a matching tourism bona accommodation form address could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress findBygetTB_Acco_AT(
			String addressType, long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress = fetchBygetTB_Acco_AT(
				addressType, tourismBonaAFId);

		if (tourismBonaAccommodationFormAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", tourismBonaAFId=");
			sb.append(tourismBonaAFId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAccommodationFormAddressException(
				sb.toString());
		}

		return tourismBonaAccommodationFormAddress;
	}

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress fetchBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId) {

		return fetchBygetTB_Acco_AT(addressType, tourismBonaAFId, true);
	}

	/**
	 * Returns the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona accommodation form address, or <code>null</code> if a matching tourism bona accommodation form address could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress fetchBygetTB_Acco_AT(
		String addressType, long tourismBonaAFId, boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, tourismBonaAFId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTB_Acco_AT, finderArgs, this);
		}

		if (result instanceof TourismBonaAccommodationFormAddress) {
			TourismBonaAccommodationFormAddress
				tourismBonaAccommodationFormAddress =
					(TourismBonaAccommodationFormAddress)result;

			if (!Objects.equals(
					addressType,
					tourismBonaAccommodationFormAddress.getAddressType()) ||
				(tourismBonaAFId !=
					tourismBonaAccommodationFormAddress.getTourismBonaAFId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_ACCO_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_ACCO_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETTB_ACCO_AT_TOURISMBONAAFID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaAFId);

				List<TourismBonaAccommodationFormAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTB_Acco_AT, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, tourismBonaAFId
								};
							}

							_log.warn(
								"TourismBonaAccommodationFormAddressPersistenceImpl.fetchBygetTB_Acco_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAccommodationFormAddress
						tourismBonaAccommodationFormAddress = list.get(0);

					result = tourismBonaAccommodationFormAddress;

					cacheResult(tourismBonaAccommodationFormAddress);
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
			return (TourismBonaAccommodationFormAddress)result;
		}
	}

	/**
	 * Removes the tourism bona accommodation form address where addressType = &#63; and tourismBonaAFId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the tourism bona accommodation form address that was removed
	 */
	@Override
	public TourismBonaAccommodationFormAddress removeBygetTB_Acco_AT(
			String addressType, long tourismBonaAFId)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress = findBygetTB_Acco_AT(
				addressType, tourismBonaAFId);

		return remove(tourismBonaAccommodationFormAddress);
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses where addressType = &#63; and tourismBonaAFId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAFId the tourism bona af ID
	 * @return the number of matching tourism bona accommodation form addresses
	 */
	@Override
	public int countBygetTB_Acco_AT(String addressType, long tourismBonaAFId) {
		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetTB_Acco_AT;

		Object[] finderArgs = new Object[] {addressType, tourismBonaAFId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMBONAACCOMMODATIONFORMADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_ACCO_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_ACCO_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETTB_ACCO_AT_TOURISMBONAAFID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaAFId);

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

	private static final String _FINDER_COLUMN_GETTB_ACCO_AT_ADDRESSTYPE_2 =
		"tourismBonaAccommodationFormAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETTB_ACCO_AT_ADDRESSTYPE_3 =
		"(tourismBonaAccommodationFormAddress.addressType IS NULL OR tourismBonaAccommodationFormAddress.addressType = '') AND ";

	private static final String _FINDER_COLUMN_GETTB_ACCO_AT_TOURISMBONAAFID_2 =
		"tourismBonaAccommodationFormAddress.tourismBonaAFId = ?";

	public TourismBonaAccommodationFormAddressPersistenceImpl() {
		setModelClass(TourismBonaAccommodationFormAddress.class);

		setModelImplClass(TourismBonaAccommodationFormAddressImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAccommodationFormAddressTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona accommodation form address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationFormAddress the tourism bona accommodation form address
	 */
	@Override
	public void cacheResult(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		entityCache.putResult(
			TourismBonaAccommodationFormAddressImpl.class,
			tourismBonaAccommodationFormAddress.getPrimaryKey(),
			tourismBonaAccommodationFormAddress);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaAccommodationFormAddress.getTourismApplicationId()
			},
			tourismBonaAccommodationFormAddress);

		finderCache.putResult(
			_finderPathFetchBygetTB_Acco_AT,
			new Object[] {
				tourismBonaAccommodationFormAddress.getAddressType(),
				tourismBonaAccommodationFormAddress.getTourismBonaAFId()
			},
			tourismBonaAccommodationFormAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona accommodation form addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAccommodationFormAddresses the tourism bona accommodation form addresses
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAccommodationFormAddress>
			tourismBonaAccommodationFormAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAccommodationFormAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAccommodationFormAddress
				tourismBonaAccommodationFormAddress :
					tourismBonaAccommodationFormAddresses) {

			if (entityCache.getResult(
					TourismBonaAccommodationFormAddressImpl.class,
					tourismBonaAccommodationFormAddress.getPrimaryKey()) ==
						null) {

				cacheResult(tourismBonaAccommodationFormAddress);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona accommodation form addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAccommodationFormAddressImpl.class);

		finderCache.clearCache(TourismBonaAccommodationFormAddressImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona accommodation form address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		entityCache.removeResult(
			TourismBonaAccommodationFormAddressImpl.class,
			tourismBonaAccommodationFormAddress);
	}

	@Override
	public void clearCache(
		List<TourismBonaAccommodationFormAddress>
			tourismBonaAccommodationFormAddresses) {

		for (TourismBonaAccommodationFormAddress
				tourismBonaAccommodationFormAddress :
					tourismBonaAccommodationFormAddresses) {

			entityCache.removeResult(
				TourismBonaAccommodationFormAddressImpl.class,
				tourismBonaAccommodationFormAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAccommodationFormAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAccommodationFormAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAccommodationFormAddressModelImpl
			tourismBonaAccommodationFormAddressModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAccommodationFormAddressModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAccommodationFormAddressModelImpl);

		args = new Object[] {
			tourismBonaAccommodationFormAddressModelImpl.getAddressType(),
			tourismBonaAccommodationFormAddressModelImpl.getTourismBonaAFId()
		};

		finderCache.putResult(
			_finderPathCountBygetTB_Acco_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTB_Acco_AT, args,
			tourismBonaAccommodationFormAddressModelImpl);
	}

	/**
	 * Creates a new tourism bona accommodation form address with the primary key. Does not add the tourism bona accommodation form address to the database.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key for the new tourism bona accommodation form address
	 * @return the new tourism bona accommodation form address
	 */
	@Override
	public TourismBonaAccommodationFormAddress create(
		long tourismBonaAccommodationFAOOId) {

		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress =
				new TourismBonaAccommodationFormAddressImpl();

		tourismBonaAccommodationFormAddress.setNew(true);
		tourismBonaAccommodationFormAddress.setPrimaryKey(
			tourismBonaAccommodationFAOOId);

		tourismBonaAccommodationFormAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAccommodationFormAddress;
	}

	/**
	 * Removes the tourism bona accommodation form address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was removed
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress remove(
			long tourismBonaAccommodationFAOOId)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		return remove((Serializable)tourismBonaAccommodationFAOOId);
	}

	/**
	 * Removes the tourism bona accommodation form address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address that was removed
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress remove(Serializable primaryKey)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAccommodationFormAddress
				tourismBonaAccommodationFormAddress =
					(TourismBonaAccommodationFormAddress)session.get(
						TourismBonaAccommodationFormAddressImpl.class,
						primaryKey);

			if (tourismBonaAccommodationFormAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAccommodationFormAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAccommodationFormAddress);
		}
		catch (NoSuchTourismBonaAccommodationFormAddressException
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
	protected TourismBonaAccommodationFormAddress removeImpl(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAccommodationFormAddress)) {
				tourismBonaAccommodationFormAddress =
					(TourismBonaAccommodationFormAddress)session.get(
						TourismBonaAccommodationFormAddressImpl.class,
						tourismBonaAccommodationFormAddress.getPrimaryKeyObj());
			}

			if (tourismBonaAccommodationFormAddress != null) {
				session.delete(tourismBonaAccommodationFormAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAccommodationFormAddress != null) {
			clearCache(tourismBonaAccommodationFormAddress);
		}

		return tourismBonaAccommodationFormAddress;
	}

	@Override
	public TourismBonaAccommodationFormAddress updateImpl(
		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress) {

		boolean isNew = tourismBonaAccommodationFormAddress.isNew();

		if (!(tourismBonaAccommodationFormAddress instanceof
				TourismBonaAccommodationFormAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaAccommodationFormAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAccommodationFormAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAccommodationFormAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAccommodationFormAddress implementation " +
					tourismBonaAccommodationFormAddress.getClass());
		}

		TourismBonaAccommodationFormAddressModelImpl
			tourismBonaAccommodationFormAddressModelImpl =
				(TourismBonaAccommodationFormAddressModelImpl)
					tourismBonaAccommodationFormAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaAccommodationFormAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaAccommodationFormAddress.setCreateDate(date);
			}
			else {
				tourismBonaAccommodationFormAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAccommodationFormAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				tourismBonaAccommodationFormAddress.setModifiedDate(date);
			}
			else {
				tourismBonaAccommodationFormAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAccommodationFormAddress);
			}
			else {
				tourismBonaAccommodationFormAddress =
					(TourismBonaAccommodationFormAddress)session.merge(
						tourismBonaAccommodationFormAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAccommodationFormAddressImpl.class,
			tourismBonaAccommodationFormAddressModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAccommodationFormAddressModelImpl);

		if (isNew) {
			tourismBonaAccommodationFormAddress.setNew(false);
		}

		tourismBonaAccommodationFormAddress.resetOriginalValues();

		return tourismBonaAccommodationFormAddress;
	}

	/**
	 * Returns the tourism bona accommodation form address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		TourismBonaAccommodationFormAddress
			tourismBonaAccommodationFormAddress = fetchByPrimaryKey(primaryKey);

		if (tourismBonaAccommodationFormAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAccommodationFormAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAccommodationFormAddress;
	}

	/**
	 * Returns the tourism bona accommodation form address with the primary key or throws a <code>NoSuchTourismBonaAccommodationFormAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address
	 * @throws NoSuchTourismBonaAccommodationFormAddressException if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress findByPrimaryKey(
			long tourismBonaAccommodationFAOOId)
		throws NoSuchTourismBonaAccommodationFormAddressException {

		return findByPrimaryKey((Serializable)tourismBonaAccommodationFAOOId);
	}

	/**
	 * Returns the tourism bona accommodation form address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAccommodationFAOOId the primary key of the tourism bona accommodation form address
	 * @return the tourism bona accommodation form address, or <code>null</code> if a tourism bona accommodation form address with the primary key could not be found
	 */
	@Override
	public TourismBonaAccommodationFormAddress fetchByPrimaryKey(
		long tourismBonaAccommodationFAOOId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAccommodationFAOOId);
	}

	/**
	 * Returns all the tourism bona accommodation form addresses.
	 *
	 * @return the tourism bona accommodation form addresses
	 */
	@Override
	public List<TourismBonaAccommodationFormAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @return the range of tourism bona accommodation form addresses
	 */
	@Override
	public List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona accommodation form addresses
	 */
	@Override
	public List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccommodationFormAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona accommodation form addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAccommodationFormAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona accommodation form addresses
	 * @param end the upper bound of the range of tourism bona accommodation form addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona accommodation form addresses
	 */
	@Override
	public List<TourismBonaAccommodationFormAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAccommodationFormAddress>
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

		List<TourismBonaAccommodationFormAddress> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaAccommodationFormAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS;

				sql = sql.concat(
					TourismBonaAccommodationFormAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<TourismBonaAccommodationFormAddress>)QueryUtil.list(
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
	 * Removes all the tourism bona accommodation form addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAccommodationFormAddress
				tourismBonaAccommodationFormAddress : findAll()) {

			remove(tourismBonaAccommodationFormAddress);
		}
	}

	/**
	 * Returns the number of tourism bona accommodation form addresses.
	 *
	 * @return the number of tourism bona accommodation form addresses
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
					_SQL_COUNT_TOURISMBONAACCOMMODATIONFORMADDRESS);

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
		return "tourismBonaAccommodationFAOOId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAccommodationFormAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona accommodation form address persistence.
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

		_finderPathFetchBygetTB_Acco_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTB_Acco_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaAFId"}, true);

		_finderPathCountBygetTB_Acco_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTB_Acco_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaAFId"}, false);

		TourismBonaAccommodationFormAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAccommodationFormAddressUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaAccommodationFormAddressImpl.class.getName());
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

	private static final String
		_SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS =
			"SELECT tourismBonaAccommodationFormAddress FROM TourismBonaAccommodationFormAddress tourismBonaAccommodationFormAddress";

	private static final String
		_SQL_SELECT_TOURISMBONAACCOMMODATIONFORMADDRESS_WHERE =
			"SELECT tourismBonaAccommodationFormAddress FROM TourismBonaAccommodationFormAddress tourismBonaAccommodationFormAddress WHERE ";

	private static final String _SQL_COUNT_TOURISMBONAACCOMMODATIONFORMADDRESS =
		"SELECT COUNT(tourismBonaAccommodationFormAddress) FROM TourismBonaAccommodationFormAddress tourismBonaAccommodationFormAddress";

	private static final String
		_SQL_COUNT_TOURISMBONAACCOMMODATIONFORMADDRESS_WHERE =
			"SELECT COUNT(tourismBonaAccommodationFormAddress) FROM TourismBonaAccommodationFormAddress tourismBonaAccommodationFormAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAccommodationFormAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAccommodationFormAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAccommodationFormAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAccommodationFormAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}