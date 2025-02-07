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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaWaterSportsFormFirstAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaWaterSportsFormFirstAddressTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstAddressImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormFirstAddressModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaWaterSportsFormFirstAddressUtil;
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
 * The persistence implementation for the tourism bona water sports form first address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaWaterSportsFormFirstAddressPersistence.class)
public class TourismBonaWaterSportsFormFirstAddressPersistenceImpl
	extends BasePersistenceImpl<TourismBonaWaterSportsFormFirstAddress>
	implements TourismBonaWaterSportsFormFirstAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaWaterSportsFormFirstAddressUtil</code> to access the tourism bona water sports form first address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaWaterSportsFormFirstAddressImpl.class.getName();

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
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a matching tourism bona water sports form first address could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress = fetchBygetTourismById(
				tourismApplicationId);

		if (tourismBonaWaterSportsFormFirstAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaWaterSportsFormFirstAddressException(
				sb.toString());
		}

		return tourismBonaWaterSportsFormFirstAddress;
	}

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona water sports form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTourismById(
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

		if (result instanceof TourismBonaWaterSportsFormFirstAddress) {
			TourismBonaWaterSportsFormFirstAddress
				tourismBonaWaterSportsFormFirstAddress =
					(TourismBonaWaterSportsFormFirstAddress)result;

			if (tourismApplicationId !=
					tourismBonaWaterSportsFormFirstAddress.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaWaterSportsFormFirstAddress> list =
					query.list();

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
								"TourismBonaWaterSportsFormFirstAddressPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaWaterSportsFormFirstAddress
						tourismBonaWaterSportsFormFirstAddress = list.get(0);

					result = tourismBonaWaterSportsFormFirstAddress;

					cacheResult(tourismBonaWaterSportsFormFirstAddress);
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
			return (TourismBonaWaterSportsFormFirstAddress)result;
		}
	}

	/**
	 * Removes the tourism bona water sports form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona water sports form first address that was removed
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress = findBygetTourismById(
				tourismApplicationId);

		return remove(tourismBonaWaterSportsFormFirstAddress);
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona water sports form first addresses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS_WHERE);

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
			"tourismBonaWaterSportsFormFirstAddress.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTB_Water_AT;
	private FinderPath _finderPathCountBygetTB_Water_AT;

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the matching tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a matching tourism bona water sports form first address could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress findBygetTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress = fetchBygetTB_Water_AT(
				addressType, tourismBonaWaterSFFirstId);

		if (tourismBonaWaterSportsFormFirstAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", tourismBonaWaterSFFirstId=");
			sb.append(tourismBonaWaterSFFirstId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaWaterSportsFormFirstAddressException(
				sb.toString());
		}

		return tourismBonaWaterSportsFormFirstAddress;
	}

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId) {

		return fetchBygetTB_Water_AT(
			addressType, tourismBonaWaterSFFirstId, true);
	}

	/**
	 * Returns the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona water sports form first address, or <code>null</code> if a matching tourism bona water sports form first address could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress fetchBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, tourismBonaWaterSFFirstId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTB_Water_AT, finderArgs, this);
		}

		if (result instanceof TourismBonaWaterSportsFormFirstAddress) {
			TourismBonaWaterSportsFormFirstAddress
				tourismBonaWaterSportsFormFirstAddress =
					(TourismBonaWaterSportsFormFirstAddress)result;

			if (!Objects.equals(
					addressType,
					tourismBonaWaterSportsFormFirstAddress.getAddressType()) ||
				(tourismBonaWaterSFFirstId !=
					tourismBonaWaterSportsFormFirstAddress.
						getTourismBonaWaterSFFirstId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_WATER_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_WATER_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTB_WATER_AT_TOURISMBONAWATERSFFIRSTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaWaterSFFirstId);

				List<TourismBonaWaterSportsFormFirstAddress> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTB_Water_AT, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, tourismBonaWaterSFFirstId
								};
							}

							_log.warn(
								"TourismBonaWaterSportsFormFirstAddressPersistenceImpl.fetchBygetTB_Water_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaWaterSportsFormFirstAddress
						tourismBonaWaterSportsFormFirstAddress = list.get(0);

					result = tourismBonaWaterSportsFormFirstAddress;

					cacheResult(tourismBonaWaterSportsFormFirstAddress);
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
			return (TourismBonaWaterSportsFormFirstAddress)result;
		}
	}

	/**
	 * Removes the tourism bona water sports form first address where addressType = &#63; and tourismBonaWaterSFFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the tourism bona water sports form first address that was removed
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress removeBygetTB_Water_AT(
			String addressType, long tourismBonaWaterSFFirstId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress = findBygetTB_Water_AT(
				addressType, tourismBonaWaterSFFirstId);

		return remove(tourismBonaWaterSportsFormFirstAddress);
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses where addressType = &#63; and tourismBonaWaterSFFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaWaterSFFirstId the tourism bona water sf first ID
	 * @return the number of matching tourism bona water sports form first addresses
	 */
	@Override
	public int countBygetTB_Water_AT(
		String addressType, long tourismBonaWaterSFFirstId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetTB_Water_AT;

		Object[] finderArgs = new Object[] {
			addressType, tourismBonaWaterSFFirstId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_WATER_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_WATER_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTB_WATER_AT_TOURISMBONAWATERSFFIRSTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaWaterSFFirstId);

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

	private static final String _FINDER_COLUMN_GETTB_WATER_AT_ADDRESSTYPE_2 =
		"tourismBonaWaterSportsFormFirstAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETTB_WATER_AT_ADDRESSTYPE_3 =
		"(tourismBonaWaterSportsFormFirstAddress.addressType IS NULL OR tourismBonaWaterSportsFormFirstAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTB_WATER_AT_TOURISMBONAWATERSFFIRSTID_2 =
			"tourismBonaWaterSportsFormFirstAddress.tourismBonaWaterSFFirstId = ?";

	public TourismBonaWaterSportsFormFirstAddressPersistenceImpl() {
		setModelClass(TourismBonaWaterSportsFormFirstAddress.class);

		setModelImplClass(TourismBonaWaterSportsFormFirstAddressImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaWaterSportsFormFirstAddressTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona water sports form first address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirstAddress the tourism bona water sports form first address
	 */
	@Override
	public void cacheResult(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		entityCache.putResult(
			TourismBonaWaterSportsFormFirstAddressImpl.class,
			tourismBonaWaterSportsFormFirstAddress.getPrimaryKey(),
			tourismBonaWaterSportsFormFirstAddress);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaWaterSportsFormFirstAddress.getTourismApplicationId()
			},
			tourismBonaWaterSportsFormFirstAddress);

		finderCache.putResult(
			_finderPathFetchBygetTB_Water_AT,
			new Object[] {
				tourismBonaWaterSportsFormFirstAddress.getAddressType(),
				tourismBonaWaterSportsFormFirstAddress.
					getTourismBonaWaterSFFirstId()
			},
			tourismBonaWaterSportsFormFirstAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona water sports form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaWaterSportsFormFirstAddresses the tourism bona water sports form first addresses
	 */
	@Override
	public void cacheResult(
		List<TourismBonaWaterSportsFormFirstAddress>
			tourismBonaWaterSportsFormFirstAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaWaterSportsFormFirstAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaWaterSportsFormFirstAddress
				tourismBonaWaterSportsFormFirstAddress :
					tourismBonaWaterSportsFormFirstAddresses) {

			if (entityCache.getResult(
					TourismBonaWaterSportsFormFirstAddressImpl.class,
					tourismBonaWaterSportsFormFirstAddress.getPrimaryKey()) ==
						null) {

				cacheResult(tourismBonaWaterSportsFormFirstAddress);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona water sports form first addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			TourismBonaWaterSportsFormFirstAddressImpl.class);

		finderCache.clearCache(
			TourismBonaWaterSportsFormFirstAddressImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona water sports form first address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		entityCache.removeResult(
			TourismBonaWaterSportsFormFirstAddressImpl.class,
			tourismBonaWaterSportsFormFirstAddress);
	}

	@Override
	public void clearCache(
		List<TourismBonaWaterSportsFormFirstAddress>
			tourismBonaWaterSportsFormFirstAddresses) {

		for (TourismBonaWaterSportsFormFirstAddress
				tourismBonaWaterSportsFormFirstAddress :
					tourismBonaWaterSportsFormFirstAddresses) {

			entityCache.removeResult(
				TourismBonaWaterSportsFormFirstAddressImpl.class,
				tourismBonaWaterSportsFormFirstAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			TourismBonaWaterSportsFormFirstAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaWaterSportsFormFirstAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaWaterSportsFormFirstAddressModelImpl
			tourismBonaWaterSportsFormFirstAddressModelImpl) {

		Object[] args = new Object[] {
			tourismBonaWaterSportsFormFirstAddressModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaWaterSportsFormFirstAddressModelImpl);

		args = new Object[] {
			tourismBonaWaterSportsFormFirstAddressModelImpl.getAddressType(),
			tourismBonaWaterSportsFormFirstAddressModelImpl.
				getTourismBonaWaterSFFirstId()
		};

		finderCache.putResult(
			_finderPathCountBygetTB_Water_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTB_Water_AT, args,
			tourismBonaWaterSportsFormFirstAddressModelImpl);
	}

	/**
	 * Creates a new tourism bona water sports form first address with the primary key. Does not add the tourism bona water sports form first address to the database.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key for the new tourism bona water sports form first address
	 * @return the new tourism bona water sports form first address
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress create(
		long tourismBonaWaterSportsFFAId) {

		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress =
				new TourismBonaWaterSportsFormFirstAddressImpl();

		tourismBonaWaterSportsFormFirstAddress.setNew(true);
		tourismBonaWaterSportsFormFirstAddress.setPrimaryKey(
			tourismBonaWaterSportsFFAId);

		tourismBonaWaterSportsFormFirstAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaWaterSportsFormFirstAddress;
	}

	/**
	 * Removes the tourism bona water sports form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress remove(
			long tourismBonaWaterSportsFFAId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return remove((Serializable)tourismBonaWaterSportsFFAId);
	}

	/**
	 * Removes the tourism bona water sports form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address that was removed
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress remove(
			Serializable primaryKey)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaWaterSportsFormFirstAddress
				tourismBonaWaterSportsFormFirstAddress =
					(TourismBonaWaterSportsFormFirstAddress)session.get(
						TourismBonaWaterSportsFormFirstAddressImpl.class,
						primaryKey);

			if (tourismBonaWaterSportsFormFirstAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaWaterSportsFormFirstAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaWaterSportsFormFirstAddress);
		}
		catch (NoSuchTourismBonaWaterSportsFormFirstAddressException
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
	protected TourismBonaWaterSportsFormFirstAddress removeImpl(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaWaterSportsFormFirstAddress)) {
				tourismBonaWaterSportsFormFirstAddress =
					(TourismBonaWaterSportsFormFirstAddress)session.get(
						TourismBonaWaterSportsFormFirstAddressImpl.class,
						tourismBonaWaterSportsFormFirstAddress.
							getPrimaryKeyObj());
			}

			if (tourismBonaWaterSportsFormFirstAddress != null) {
				session.delete(tourismBonaWaterSportsFormFirstAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaWaterSportsFormFirstAddress != null) {
			clearCache(tourismBonaWaterSportsFormFirstAddress);
		}

		return tourismBonaWaterSportsFormFirstAddress;
	}

	@Override
	public TourismBonaWaterSportsFormFirstAddress updateImpl(
		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress) {

		boolean isNew = tourismBonaWaterSportsFormFirstAddress.isNew();

		if (!(tourismBonaWaterSportsFormFirstAddress instanceof
				TourismBonaWaterSportsFormFirstAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaWaterSportsFormFirstAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaWaterSportsFormFirstAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaWaterSportsFormFirstAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaWaterSportsFormFirstAddress implementation " +
					tourismBonaWaterSportsFormFirstAddress.getClass());
		}

		TourismBonaWaterSportsFormFirstAddressModelImpl
			tourismBonaWaterSportsFormFirstAddressModelImpl =
				(TourismBonaWaterSportsFormFirstAddressModelImpl)
					tourismBonaWaterSportsFormFirstAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaWaterSportsFormFirstAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaWaterSportsFormFirstAddress.setCreateDate(date);
			}
			else {
				tourismBonaWaterSportsFormFirstAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaWaterSportsFormFirstAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				tourismBonaWaterSportsFormFirstAddress.setModifiedDate(date);
			}
			else {
				tourismBonaWaterSportsFormFirstAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaWaterSportsFormFirstAddress);
			}
			else {
				tourismBonaWaterSportsFormFirstAddress =
					(TourismBonaWaterSportsFormFirstAddress)session.merge(
						tourismBonaWaterSportsFormFirstAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaWaterSportsFormFirstAddressImpl.class,
			tourismBonaWaterSportsFormFirstAddressModelImpl, false, true);

		cacheUniqueFindersCache(
			tourismBonaWaterSportsFormFirstAddressModelImpl);

		if (isNew) {
			tourismBonaWaterSportsFormFirstAddress.setNew(false);
		}

		tourismBonaWaterSportsFormFirstAddress.resetOriginalValues();

		return tourismBonaWaterSportsFormFirstAddress;
	}

	/**
	 * Returns the tourism bona water sports form first address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		TourismBonaWaterSportsFormFirstAddress
			tourismBonaWaterSportsFormFirstAddress = fetchByPrimaryKey(
				primaryKey);

		if (tourismBonaWaterSportsFormFirstAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaWaterSportsFormFirstAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaWaterSportsFormFirstAddress;
	}

	/**
	 * Returns the tourism bona water sports form first address with the primary key or throws a <code>NoSuchTourismBonaWaterSportsFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address
	 * @throws NoSuchTourismBonaWaterSportsFormFirstAddressException if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress findByPrimaryKey(
			long tourismBonaWaterSportsFFAId)
		throws NoSuchTourismBonaWaterSportsFormFirstAddressException {

		return findByPrimaryKey((Serializable)tourismBonaWaterSportsFFAId);
	}

	/**
	 * Returns the tourism bona water sports form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaWaterSportsFFAId the primary key of the tourism bona water sports form first address
	 * @return the tourism bona water sports form first address, or <code>null</code> if a tourism bona water sports form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaWaterSportsFormFirstAddress fetchByPrimaryKey(
		long tourismBonaWaterSportsFFAId) {

		return fetchByPrimaryKey((Serializable)tourismBonaWaterSportsFFAId);
	}

	/**
	 * Returns all the tourism bona water sports form first addresses.
	 *
	 * @return the tourism bona water sports form first addresses
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirstAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @return the range of tourism bona water sports form first addresses
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona water sports form first addresses
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirstAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona water sports form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaWaterSportsFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona water sports form first addresses
	 * @param end the upper bound of the range of tourism bona water sports form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona water sports form first addresses
	 */
	@Override
	public List<TourismBonaWaterSportsFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaWaterSportsFormFirstAddress>
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

		List<TourismBonaWaterSportsFormFirstAddress> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaWaterSportsFormFirstAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS;

				sql = sql.concat(
					TourismBonaWaterSportsFormFirstAddressModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<TourismBonaWaterSportsFormFirstAddress>)
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
	 * Removes all the tourism bona water sports form first addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaWaterSportsFormFirstAddress
				tourismBonaWaterSportsFormFirstAddress : findAll()) {

			remove(tourismBonaWaterSportsFormFirstAddress);
		}
	}

	/**
	 * Returns the number of tourism bona water sports form first addresses.
	 *
	 * @return the number of tourism bona water sports form first addresses
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
					_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS);

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
		return "tourismBonaWaterSportsFFAId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaWaterSportsFormFirstAddressModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona water sports form first address persistence.
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

		_finderPathFetchBygetTB_Water_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTB_Water_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaWaterSFFirstId"}, true);

		_finderPathCountBygetTB_Water_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTB_Water_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaWaterSFFirstId"}, false);

		TourismBonaWaterSportsFormFirstAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaWaterSportsFormFirstAddressUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaWaterSportsFormFirstAddressImpl.class.getName());
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
		_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS =
			"SELECT tourismBonaWaterSportsFormFirstAddress FROM TourismBonaWaterSportsFormFirstAddress tourismBonaWaterSportsFormFirstAddress";

	private static final String
		_SQL_SELECT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS_WHERE =
			"SELECT tourismBonaWaterSportsFormFirstAddress FROM TourismBonaWaterSportsFormFirstAddress tourismBonaWaterSportsFormFirstAddress WHERE ";

	private static final String
		_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS =
			"SELECT COUNT(tourismBonaWaterSportsFormFirstAddress) FROM TourismBonaWaterSportsFormFirstAddress tourismBonaWaterSportsFormFirstAddress";

	private static final String
		_SQL_COUNT_TOURISMBONAWATERSPORTSFORMFIRSTADDRESS_WHERE =
			"SELECT COUNT(tourismBonaWaterSportsFormFirstAddress) FROM TourismBonaWaterSportsFormFirstAddress tourismBonaWaterSportsFormFirstAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaWaterSportsFormFirstAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaWaterSportsFormFirstAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaWaterSportsFormFirstAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaWaterSportsFormFirstAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}