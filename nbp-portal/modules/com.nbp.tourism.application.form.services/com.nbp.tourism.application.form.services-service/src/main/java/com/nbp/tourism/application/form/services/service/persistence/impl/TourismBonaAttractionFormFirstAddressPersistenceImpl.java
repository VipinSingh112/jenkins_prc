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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaAttractionFormFirstAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaAttractionFormFirstAddressTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaAttractionFormFirstAddressModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaAttractionFormFirstAddressUtil;
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
 * The persistence implementation for the tourism bona attraction form first address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaAttractionFormFirstAddressPersistence.class)
public class TourismBonaAttractionFormFirstAddressPersistenceImpl
	extends BasePersistenceImpl<TourismBonaAttractionFormFirstAddress>
	implements TourismBonaAttractionFormFirstAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaAttractionFormFirstAddressUtil</code> to access the tourism bona attraction form first address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaAttractionFormFirstAddressImpl.class.getName();

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
	 * Returns the tourism bona attraction form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a matching tourism bona attraction form first address could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress = fetchBygetTourismById(
				tourismApplicationId);

		if (tourismBonaAttractionFormFirstAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAttractionFormFirstAddressException(
				sb.toString());
		}

		return tourismBonaAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism bona attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress fetchBygetTourismById(
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

		if (result instanceof TourismBonaAttractionFormFirstAddress) {
			TourismBonaAttractionFormFirstAddress
				tourismBonaAttractionFormFirstAddress =
					(TourismBonaAttractionFormFirstAddress)result;

			if (tourismApplicationId !=
					tourismBonaAttractionFormFirstAddress.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaAttractionFormFirstAddress> list = query.list();

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
								"TourismBonaAttractionFormFirstAddressPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAttractionFormFirstAddress
						tourismBonaAttractionFormFirstAddress = list.get(0);

					result = tourismBonaAttractionFormFirstAddress;

					cacheResult(tourismBonaAttractionFormFirstAddress);
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
			return (TourismBonaAttractionFormFirstAddress)result;
		}
	}

	/**
	 * Removes the tourism bona attraction form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona attraction form first address that was removed
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress = findBygetTourismById(
				tourismApplicationId);

		return remove(tourismBonaAttractionFormFirstAddress);
	}

	/**
	 * Returns the number of tourism bona attraction form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona attraction form first addresses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS_WHERE);

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
			"tourismBonaAttractionFormFirstAddress.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTB_Attract_AT;
	private FinderPath _finderPathCountBygetTB_Attract_AT;

	/**
	 * Returns the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; or throws a <code>NoSuchTourismBonaAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the matching tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a matching tourism bona attraction form first address could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress findBygetTB_Attract_AT(
			String addressType, long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress = fetchBygetTB_Attract_AT(
				addressType, tourismBonaAttractFormFirstId);

		if (tourismBonaAttractionFormFirstAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", tourismBonaAttractFormFirstId=");
			sb.append(tourismBonaAttractFormFirstId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaAttractionFormFirstAddressException(
				sb.toString());
		}

		return tourismBonaAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress fetchBygetTB_Attract_AT(
		String addressType, long tourismBonaAttractFormFirstId) {

		return fetchBygetTB_Attract_AT(
			addressType, tourismBonaAttractFormFirstId, true);
	}

	/**
	 * Returns the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona attraction form first address, or <code>null</code> if a matching tourism bona attraction form first address could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress fetchBygetTB_Attract_AT(
		String addressType, long tourismBonaAttractFormFirstId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				addressType, tourismBonaAttractFormFirstId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTB_Attract_AT, finderArgs, this);
		}

		if (result instanceof TourismBonaAttractionFormFirstAddress) {
			TourismBonaAttractionFormFirstAddress
				tourismBonaAttractionFormFirstAddress =
					(TourismBonaAttractionFormFirstAddress)result;

			if (!Objects.equals(
					addressType,
					tourismBonaAttractionFormFirstAddress.getAddressType()) ||
				(tourismBonaAttractFormFirstId !=
					tourismBonaAttractionFormFirstAddress.
						getTourismBonaAttractFormFirstId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_ATTRACT_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_ATTRACT_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTB_ATTRACT_AT_TOURISMBONAATTRACTFORMFIRSTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaAttractFormFirstId);

				List<TourismBonaAttractionFormFirstAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTB_Attract_AT, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, tourismBonaAttractFormFirstId
								};
							}

							_log.warn(
								"TourismBonaAttractionFormFirstAddressPersistenceImpl.fetchBygetTB_Attract_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaAttractionFormFirstAddress
						tourismBonaAttractionFormFirstAddress = list.get(0);

					result = tourismBonaAttractionFormFirstAddress;

					cacheResult(tourismBonaAttractionFormFirstAddress);
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
			return (TourismBonaAttractionFormFirstAddress)result;
		}
	}

	/**
	 * Removes the tourism bona attraction form first address where addressType = &#63; and tourismBonaAttractFormFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the tourism bona attraction form first address that was removed
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress removeBygetTB_Attract_AT(
			String addressType, long tourismBonaAttractFormFirstId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress = findBygetTB_Attract_AT(
				addressType, tourismBonaAttractFormFirstId);

		return remove(tourismBonaAttractionFormFirstAddress);
	}

	/**
	 * Returns the number of tourism bona attraction form first addresses where addressType = &#63; and tourismBonaAttractFormFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaAttractFormFirstId the tourism bona attract form first ID
	 * @return the number of matching tourism bona attraction form first addresses
	 */
	@Override
	public int countBygetTB_Attract_AT(
		String addressType, long tourismBonaAttractFormFirstId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetTB_Attract_AT;

		Object[] finderArgs = new Object[] {
			addressType, tourismBonaAttractFormFirstId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_ATTRACT_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_ATTRACT_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTB_ATTRACT_AT_TOURISMBONAATTRACTFORMFIRSTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaAttractFormFirstId);

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

	private static final String _FINDER_COLUMN_GETTB_ATTRACT_AT_ADDRESSTYPE_2 =
		"tourismBonaAttractionFormFirstAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETTB_ATTRACT_AT_ADDRESSTYPE_3 =
		"(tourismBonaAttractionFormFirstAddress.addressType IS NULL OR tourismBonaAttractionFormFirstAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTB_ATTRACT_AT_TOURISMBONAATTRACTFORMFIRSTID_2 =
			"tourismBonaAttractionFormFirstAddress.tourismBonaAttractFormFirstId = ?";

	public TourismBonaAttractionFormFirstAddressPersistenceImpl() {
		setModelClass(TourismBonaAttractionFormFirstAddress.class);

		setModelImplClass(TourismBonaAttractionFormFirstAddressImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaAttractionFormFirstAddressTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona attraction form first address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirstAddress the tourism bona attraction form first address
	 */
	@Override
	public void cacheResult(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress) {

		entityCache.putResult(
			TourismBonaAttractionFormFirstAddressImpl.class,
			tourismBonaAttractionFormFirstAddress.getPrimaryKey(),
			tourismBonaAttractionFormFirstAddress);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaAttractionFormFirstAddress.getTourismApplicationId()
			},
			tourismBonaAttractionFormFirstAddress);

		finderCache.putResult(
			_finderPathFetchBygetTB_Attract_AT,
			new Object[] {
				tourismBonaAttractionFormFirstAddress.getAddressType(),
				tourismBonaAttractionFormFirstAddress.
					getTourismBonaAttractFormFirstId()
			},
			tourismBonaAttractionFormFirstAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona attraction form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaAttractionFormFirstAddresses the tourism bona attraction form first addresses
	 */
	@Override
	public void cacheResult(
		List<TourismBonaAttractionFormFirstAddress>
			tourismBonaAttractionFormFirstAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaAttractionFormFirstAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaAttractionFormFirstAddress
				tourismBonaAttractionFormFirstAddress :
					tourismBonaAttractionFormFirstAddresses) {

			if (entityCache.getResult(
					TourismBonaAttractionFormFirstAddressImpl.class,
					tourismBonaAttractionFormFirstAddress.getPrimaryKey()) ==
						null) {

				cacheResult(tourismBonaAttractionFormFirstAddress);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona attraction form first addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismBonaAttractionFormFirstAddressImpl.class);

		finderCache.clearCache(TourismBonaAttractionFormFirstAddressImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona attraction form first address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress) {

		entityCache.removeResult(
			TourismBonaAttractionFormFirstAddressImpl.class,
			tourismBonaAttractionFormFirstAddress);
	}

	@Override
	public void clearCache(
		List<TourismBonaAttractionFormFirstAddress>
			tourismBonaAttractionFormFirstAddresses) {

		for (TourismBonaAttractionFormFirstAddress
				tourismBonaAttractionFormFirstAddress :
					tourismBonaAttractionFormFirstAddresses) {

			entityCache.removeResult(
				TourismBonaAttractionFormFirstAddressImpl.class,
				tourismBonaAttractionFormFirstAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismBonaAttractionFormFirstAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaAttractionFormFirstAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaAttractionFormFirstAddressModelImpl
			tourismBonaAttractionFormFirstAddressModelImpl) {

		Object[] args = new Object[] {
			tourismBonaAttractionFormFirstAddressModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaAttractionFormFirstAddressModelImpl);

		args = new Object[] {
			tourismBonaAttractionFormFirstAddressModelImpl.getAddressType(),
			tourismBonaAttractionFormFirstAddressModelImpl.
				getTourismBonaAttractFormFirstId()
		};

		finderCache.putResult(
			_finderPathCountBygetTB_Attract_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTB_Attract_AT, args,
			tourismBonaAttractionFormFirstAddressModelImpl);
	}

	/**
	 * Creates a new tourism bona attraction form first address with the primary key. Does not add the tourism bona attraction form first address to the database.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key for the new tourism bona attraction form first address
	 * @return the new tourism bona attraction form first address
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress create(
		long tourismBonaAttractionFFAOOId) {

		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress =
				new TourismBonaAttractionFormFirstAddressImpl();

		tourismBonaAttractionFormFirstAddress.setNew(true);
		tourismBonaAttractionFormFirstAddress.setPrimaryKey(
			tourismBonaAttractionFFAOOId);

		tourismBonaAttractionFormFirstAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaAttractionFormFirstAddress;
	}

	/**
	 * Removes the tourism bona attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress remove(
			long tourismBonaAttractionFFAOOId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		return remove((Serializable)tourismBonaAttractionFFAOOId);
	}

	/**
	 * Removes the tourism bona attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address that was removed
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress remove(Serializable primaryKey)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaAttractionFormFirstAddress
				tourismBonaAttractionFormFirstAddress =
					(TourismBonaAttractionFormFirstAddress)session.get(
						TourismBonaAttractionFormFirstAddressImpl.class,
						primaryKey);

			if (tourismBonaAttractionFormFirstAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaAttractionFormFirstAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaAttractionFormFirstAddress);
		}
		catch (NoSuchTourismBonaAttractionFormFirstAddressException
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
	protected TourismBonaAttractionFormFirstAddress removeImpl(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaAttractionFormFirstAddress)) {
				tourismBonaAttractionFormFirstAddress =
					(TourismBonaAttractionFormFirstAddress)session.get(
						TourismBonaAttractionFormFirstAddressImpl.class,
						tourismBonaAttractionFormFirstAddress.
							getPrimaryKeyObj());
			}

			if (tourismBonaAttractionFormFirstAddress != null) {
				session.delete(tourismBonaAttractionFormFirstAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaAttractionFormFirstAddress != null) {
			clearCache(tourismBonaAttractionFormFirstAddress);
		}

		return tourismBonaAttractionFormFirstAddress;
	}

	@Override
	public TourismBonaAttractionFormFirstAddress updateImpl(
		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress) {

		boolean isNew = tourismBonaAttractionFormFirstAddress.isNew();

		if (!(tourismBonaAttractionFormFirstAddress instanceof
				TourismBonaAttractionFormFirstAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaAttractionFormFirstAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaAttractionFormFirstAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaAttractionFormFirstAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaAttractionFormFirstAddress implementation " +
					tourismBonaAttractionFormFirstAddress.getClass());
		}

		TourismBonaAttractionFormFirstAddressModelImpl
			tourismBonaAttractionFormFirstAddressModelImpl =
				(TourismBonaAttractionFormFirstAddressModelImpl)
					tourismBonaAttractionFormFirstAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaAttractionFormFirstAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaAttractionFormFirstAddress.setCreateDate(date);
			}
			else {
				tourismBonaAttractionFormFirstAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaAttractionFormFirstAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				tourismBonaAttractionFormFirstAddress.setModifiedDate(date);
			}
			else {
				tourismBonaAttractionFormFirstAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaAttractionFormFirstAddress);
			}
			else {
				tourismBonaAttractionFormFirstAddress =
					(TourismBonaAttractionFormFirstAddress)session.merge(
						tourismBonaAttractionFormFirstAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaAttractionFormFirstAddressImpl.class,
			tourismBonaAttractionFormFirstAddressModelImpl, false, true);

		cacheUniqueFindersCache(tourismBonaAttractionFormFirstAddressModelImpl);

		if (isNew) {
			tourismBonaAttractionFormFirstAddress.setNew(false);
		}

		tourismBonaAttractionFormFirstAddress.resetOriginalValues();

		return tourismBonaAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism bona attraction form first address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		TourismBonaAttractionFormFirstAddress
			tourismBonaAttractionFormFirstAddress = fetchByPrimaryKey(
				primaryKey);

		if (tourismBonaAttractionFormFirstAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaAttractionFormFirstAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism bona attraction form first address with the primary key or throws a <code>NoSuchTourismBonaAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address
	 * @throws NoSuchTourismBonaAttractionFormFirstAddressException if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress findByPrimaryKey(
			long tourismBonaAttractionFFAOOId)
		throws NoSuchTourismBonaAttractionFormFirstAddressException {

		return findByPrimaryKey((Serializable)tourismBonaAttractionFFAOOId);
	}

	/**
	 * Returns the tourism bona attraction form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaAttractionFFAOOId the primary key of the tourism bona attraction form first address
	 * @return the tourism bona attraction form first address, or <code>null</code> if a tourism bona attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismBonaAttractionFormFirstAddress fetchByPrimaryKey(
		long tourismBonaAttractionFFAOOId) {

		return fetchByPrimaryKey((Serializable)tourismBonaAttractionFFAOOId);
	}

	/**
	 * Returns all the tourism bona attraction form first addresses.
	 *
	 * @return the tourism bona attraction form first addresses
	 */
	@Override
	public List<TourismBonaAttractionFormFirstAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @return the range of tourism bona attraction form first addresses
	 */
	@Override
	public List<TourismBonaAttractionFormFirstAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona attraction form first addresses
	 */
	@Override
	public List<TourismBonaAttractionFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirstAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona attraction form first addresses
	 * @param end the upper bound of the range of tourism bona attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona attraction form first addresses
	 */
	@Override
	public List<TourismBonaAttractionFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaAttractionFormFirstAddress>
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

		List<TourismBonaAttractionFormFirstAddress> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaAttractionFormFirstAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS;

				sql = sql.concat(
					TourismBonaAttractionFormFirstAddressModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<TourismBonaAttractionFormFirstAddress>)QueryUtil.list(
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
	 * Removes all the tourism bona attraction form first addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaAttractionFormFirstAddress
				tourismBonaAttractionFormFirstAddress : findAll()) {

			remove(tourismBonaAttractionFormFirstAddress);
		}
	}

	/**
	 * Returns the number of tourism bona attraction form first addresses.
	 *
	 * @return the number of tourism bona attraction form first addresses
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
					_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS);

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
		return "tourismBonaAttractionFFAOOId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaAttractionFormFirstAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona attraction form first address persistence.
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

		_finderPathFetchBygetTB_Attract_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTB_Attract_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaAttractFormFirstId"},
			true);

		_finderPathCountBygetTB_Attract_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTB_Attract_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaAttractFormFirstId"},
			false);

		TourismBonaAttractionFormFirstAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaAttractionFormFirstAddressUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaAttractionFormFirstAddressImpl.class.getName());
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
		_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS =
			"SELECT tourismBonaAttractionFormFirstAddress FROM TourismBonaAttractionFormFirstAddress tourismBonaAttractionFormFirstAddress";

	private static final String
		_SQL_SELECT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS_WHERE =
			"SELECT tourismBonaAttractionFormFirstAddress FROM TourismBonaAttractionFormFirstAddress tourismBonaAttractionFormFirstAddress WHERE ";

	private static final String
		_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS =
			"SELECT COUNT(tourismBonaAttractionFormFirstAddress) FROM TourismBonaAttractionFormFirstAddress tourismBonaAttractionFormFirstAddress";

	private static final String
		_SQL_COUNT_TOURISMBONAATTRACTIONFORMFIRSTADDRESS_WHERE =
			"SELECT COUNT(tourismBonaAttractionFormFirstAddress) FROM TourismBonaAttractionFormFirstAddress tourismBonaAttractionFormFirstAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaAttractionFormFirstAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaAttractionFormFirstAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaAttractionFormFirstAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaAttractionFormFirstAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}