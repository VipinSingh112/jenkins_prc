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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismNewAttractionFormFirstAddressException;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddress;
import com.nbp.tourism.application.form.services.model.TourismNewAttractionFormFirstAddressTable;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstAddressImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormFirstAddressModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismNewAttractionFormFirstAddressUtil;
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
 * The persistence implementation for the tourism new attraction form first address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismNewAttractionFormFirstAddressPersistence.class)
public class TourismNewAttractionFormFirstAddressPersistenceImpl
	extends BasePersistenceImpl<TourismNewAttractionFormFirstAddress>
	implements TourismNewAttractionFormFirstAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismNewAttractionFormFirstAddressUtil</code> to access the tourism new attraction form first address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismNewAttractionFormFirstAddressImpl.class.getName();

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
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a matching tourism new attraction form first address could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress = fetchBygetTourismById(
				tourismApplicationId);

		if (tourismNewAttractionFormFirstAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAttractionFormFirstAddressException(
				sb.toString());
		}

		return tourismNewAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism new attraction form first address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress fetchBygetTourismById(
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

		if (result instanceof TourismNewAttractionFormFirstAddress) {
			TourismNewAttractionFormFirstAddress
				tourismNewAttractionFormFirstAddress =
					(TourismNewAttractionFormFirstAddress)result;

			if (tourismApplicationId !=
					tourismNewAttractionFormFirstAddress.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismNewAttractionFormFirstAddress> list = query.list();

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
								"TourismNewAttractionFormFirstAddressPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAttractionFormFirstAddress
						tourismNewAttractionFormFirstAddress = list.get(0);

					result = tourismNewAttractionFormFirstAddress;

					cacheResult(tourismNewAttractionFormFirstAddress);
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
			return (TourismNewAttractionFormFirstAddress)result;
		}
	}

	/**
	 * Removes the tourism new attraction form first address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new attraction form first address that was removed
	 */
	@Override
	public TourismNewAttractionFormFirstAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress = findBygetTourismById(
				tourismApplicationId);

		return remove(tourismNewAttractionFormFirstAddress);
	}

	/**
	 * Returns the number of tourism new attraction form first addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new attraction form first addresses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS_WHERE);

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
			"tourismNewAttractionFormFirstAddress.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTN_Attract_AT;
	private FinderPath _finderPathCountBygetTN_Attract_AT;

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the matching tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a matching tourism new attraction form first address could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress findBygetTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress = fetchBygetTN_Attract_AT(
				addressType, tourismNewAttractFormFirstId);

		if (tourismNewAttractionFormFirstAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", tourismNewAttractFormFirstId=");
			sb.append(tourismNewAttractFormFirstId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismNewAttractionFormFirstAddressException(
				sb.toString());
		}

		return tourismNewAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress fetchBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId) {

		return fetchBygetTN_Attract_AT(
			addressType, tourismNewAttractFormFirstId, true);
	}

	/**
	 * Returns the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new attraction form first address, or <code>null</code> if a matching tourism new attraction form first address could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress fetchBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				addressType, tourismNewAttractFormFirstId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTN_Attract_AT, finderArgs, this);
		}

		if (result instanceof TourismNewAttractionFormFirstAddress) {
			TourismNewAttractionFormFirstAddress
				tourismNewAttractionFormFirstAddress =
					(TourismNewAttractionFormFirstAddress)result;

			if (!Objects.equals(
					addressType,
					tourismNewAttractionFormFirstAddress.getAddressType()) ||
				(tourismNewAttractFormFirstId !=
					tourismNewAttractionFormFirstAddress.
						getTourismNewAttractFormFirstId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTN_ATTRACT_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTN_ATTRACT_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTN_ATTRACT_AT_TOURISMNEWATTRACTFORMFIRSTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismNewAttractFormFirstId);

				List<TourismNewAttractionFormFirstAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTN_Attract_AT, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, tourismNewAttractFormFirstId
								};
							}

							_log.warn(
								"TourismNewAttractionFormFirstAddressPersistenceImpl.fetchBygetTN_Attract_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismNewAttractionFormFirstAddress
						tourismNewAttractionFormFirstAddress = list.get(0);

					result = tourismNewAttractionFormFirstAddress;

					cacheResult(tourismNewAttractionFormFirstAddress);
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
			return (TourismNewAttractionFormFirstAddress)result;
		}
	}

	/**
	 * Removes the tourism new attraction form first address where addressType = &#63; and tourismNewAttractFormFirstId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the tourism new attraction form first address that was removed
	 */
	@Override
	public TourismNewAttractionFormFirstAddress removeBygetTN_Attract_AT(
			String addressType, long tourismNewAttractFormFirstId)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress = findBygetTN_Attract_AT(
				addressType, tourismNewAttractFormFirstId);

		return remove(tourismNewAttractionFormFirstAddress);
	}

	/**
	 * Returns the number of tourism new attraction form first addresses where addressType = &#63; and tourismNewAttractFormFirstId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismNewAttractFormFirstId the tourism new attract form first ID
	 * @return the number of matching tourism new attraction form first addresses
	 */
	@Override
	public int countBygetTN_Attract_AT(
		String addressType, long tourismNewAttractFormFirstId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetTN_Attract_AT;

		Object[] finderArgs = new Object[] {
			addressType, tourismNewAttractFormFirstId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTN_ATTRACT_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTN_ATTRACT_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTN_ATTRACT_AT_TOURISMNEWATTRACTFORMFIRSTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismNewAttractFormFirstId);

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

	private static final String _FINDER_COLUMN_GETTN_ATTRACT_AT_ADDRESSTYPE_2 =
		"tourismNewAttractionFormFirstAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETTN_ATTRACT_AT_ADDRESSTYPE_3 =
		"(tourismNewAttractionFormFirstAddress.addressType IS NULL OR tourismNewAttractionFormFirstAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTN_ATTRACT_AT_TOURISMNEWATTRACTFORMFIRSTID_2 =
			"tourismNewAttractionFormFirstAddress.tourismNewAttractFormFirstId = ?";

	public TourismNewAttractionFormFirstAddressPersistenceImpl() {
		setModelClass(TourismNewAttractionFormFirstAddress.class);

		setModelImplClass(TourismNewAttractionFormFirstAddressImpl.class);
		setModelPKClass(long.class);

		setTable(TourismNewAttractionFormFirstAddressTable.INSTANCE);
	}

	/**
	 * Caches the tourism new attraction form first address in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirstAddress the tourism new attraction form first address
	 */
	@Override
	public void cacheResult(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		entityCache.putResult(
			TourismNewAttractionFormFirstAddressImpl.class,
			tourismNewAttractionFormFirstAddress.getPrimaryKey(),
			tourismNewAttractionFormFirstAddress);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismNewAttractionFormFirstAddress.getTourismApplicationId()
			},
			tourismNewAttractionFormFirstAddress);

		finderCache.putResult(
			_finderPathFetchBygetTN_Attract_AT,
			new Object[] {
				tourismNewAttractionFormFirstAddress.getAddressType(),
				tourismNewAttractionFormFirstAddress.
					getTourismNewAttractFormFirstId()
			},
			tourismNewAttractionFormFirstAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism new attraction form first addresses in the entity cache if it is enabled.
	 *
	 * @param tourismNewAttractionFormFirstAddresses the tourism new attraction form first addresses
	 */
	@Override
	public void cacheResult(
		List<TourismNewAttractionFormFirstAddress>
			tourismNewAttractionFormFirstAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismNewAttractionFormFirstAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismNewAttractionFormFirstAddress
				tourismNewAttractionFormFirstAddress :
					tourismNewAttractionFormFirstAddresses) {

			if (entityCache.getResult(
					TourismNewAttractionFormFirstAddressImpl.class,
					tourismNewAttractionFormFirstAddress.getPrimaryKey()) ==
						null) {

				cacheResult(tourismNewAttractionFormFirstAddress);
			}
		}
	}

	/**
	 * Clears the cache for all tourism new attraction form first addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismNewAttractionFormFirstAddressImpl.class);

		finderCache.clearCache(TourismNewAttractionFormFirstAddressImpl.class);
	}

	/**
	 * Clears the cache for the tourism new attraction form first address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		entityCache.removeResult(
			TourismNewAttractionFormFirstAddressImpl.class,
			tourismNewAttractionFormFirstAddress);
	}

	@Override
	public void clearCache(
		List<TourismNewAttractionFormFirstAddress>
			tourismNewAttractionFormFirstAddresses) {

		for (TourismNewAttractionFormFirstAddress
				tourismNewAttractionFormFirstAddress :
					tourismNewAttractionFormFirstAddresses) {

			entityCache.removeResult(
				TourismNewAttractionFormFirstAddressImpl.class,
				tourismNewAttractionFormFirstAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismNewAttractionFormFirstAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismNewAttractionFormFirstAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismNewAttractionFormFirstAddressModelImpl
			tourismNewAttractionFormFirstAddressModelImpl) {

		Object[] args = new Object[] {
			tourismNewAttractionFormFirstAddressModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismNewAttractionFormFirstAddressModelImpl);

		args = new Object[] {
			tourismNewAttractionFormFirstAddressModelImpl.getAddressType(),
			tourismNewAttractionFormFirstAddressModelImpl.
				getTourismNewAttractFormFirstId()
		};

		finderCache.putResult(
			_finderPathCountBygetTN_Attract_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTN_Attract_AT, args,
			tourismNewAttractionFormFirstAddressModelImpl);
	}

	/**
	 * Creates a new tourism new attraction form first address with the primary key. Does not add the tourism new attraction form first address to the database.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key for the new tourism new attraction form first address
	 * @return the new tourism new attraction form first address
	 */
	@Override
	public TourismNewAttractionFormFirstAddress create(
		long tourismNewAttractionFormFAOOId) {

		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress =
				new TourismNewAttractionFormFirstAddressImpl();

		tourismNewAttractionFormFirstAddress.setNew(true);
		tourismNewAttractionFormFirstAddress.setPrimaryKey(
			tourismNewAttractionFormFAOOId);

		tourismNewAttractionFormFirstAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismNewAttractionFormFirstAddress;
	}

	/**
	 * Removes the tourism new attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress remove(
			long tourismNewAttractionFormFAOOId)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		return remove((Serializable)tourismNewAttractionFormFAOOId);
	}

	/**
	 * Removes the tourism new attraction form first address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address that was removed
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress remove(Serializable primaryKey)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		Session session = null;

		try {
			session = openSession();

			TourismNewAttractionFormFirstAddress
				tourismNewAttractionFormFirstAddress =
					(TourismNewAttractionFormFirstAddress)session.get(
						TourismNewAttractionFormFirstAddressImpl.class,
						primaryKey);

			if (tourismNewAttractionFormFirstAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismNewAttractionFormFirstAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismNewAttractionFormFirstAddress);
		}
		catch (NoSuchTourismNewAttractionFormFirstAddressException
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
	protected TourismNewAttractionFormFirstAddress removeImpl(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismNewAttractionFormFirstAddress)) {
				tourismNewAttractionFormFirstAddress =
					(TourismNewAttractionFormFirstAddress)session.get(
						TourismNewAttractionFormFirstAddressImpl.class,
						tourismNewAttractionFormFirstAddress.
							getPrimaryKeyObj());
			}

			if (tourismNewAttractionFormFirstAddress != null) {
				session.delete(tourismNewAttractionFormFirstAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismNewAttractionFormFirstAddress != null) {
			clearCache(tourismNewAttractionFormFirstAddress);
		}

		return tourismNewAttractionFormFirstAddress;
	}

	@Override
	public TourismNewAttractionFormFirstAddress updateImpl(
		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress) {

		boolean isNew = tourismNewAttractionFormFirstAddress.isNew();

		if (!(tourismNewAttractionFormFirstAddress instanceof
				TourismNewAttractionFormFirstAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismNewAttractionFormFirstAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismNewAttractionFormFirstAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismNewAttractionFormFirstAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismNewAttractionFormFirstAddress implementation " +
					tourismNewAttractionFormFirstAddress.getClass());
		}

		TourismNewAttractionFormFirstAddressModelImpl
			tourismNewAttractionFormFirstAddressModelImpl =
				(TourismNewAttractionFormFirstAddressModelImpl)
					tourismNewAttractionFormFirstAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismNewAttractionFormFirstAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismNewAttractionFormFirstAddress.setCreateDate(date);
			}
			else {
				tourismNewAttractionFormFirstAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismNewAttractionFormFirstAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				tourismNewAttractionFormFirstAddress.setModifiedDate(date);
			}
			else {
				tourismNewAttractionFormFirstAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismNewAttractionFormFirstAddress);
			}
			else {
				tourismNewAttractionFormFirstAddress =
					(TourismNewAttractionFormFirstAddress)session.merge(
						tourismNewAttractionFormFirstAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismNewAttractionFormFirstAddressImpl.class,
			tourismNewAttractionFormFirstAddressModelImpl, false, true);

		cacheUniqueFindersCache(tourismNewAttractionFormFirstAddressModelImpl);

		if (isNew) {
			tourismNewAttractionFormFirstAddress.setNew(false);
		}

		tourismNewAttractionFormFirstAddress.resetOriginalValues();

		return tourismNewAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism new attraction form first address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		TourismNewAttractionFormFirstAddress
			tourismNewAttractionFormFirstAddress = fetchByPrimaryKey(
				primaryKey);

		if (tourismNewAttractionFormFirstAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismNewAttractionFormFirstAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismNewAttractionFormFirstAddress;
	}

	/**
	 * Returns the tourism new attraction form first address with the primary key or throws a <code>NoSuchTourismNewAttractionFormFirstAddressException</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address
	 * @throws NoSuchTourismNewAttractionFormFirstAddressException if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress findByPrimaryKey(
			long tourismNewAttractionFormFAOOId)
		throws NoSuchTourismNewAttractionFormFirstAddressException {

		return findByPrimaryKey((Serializable)tourismNewAttractionFormFAOOId);
	}

	/**
	 * Returns the tourism new attraction form first address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismNewAttractionFormFAOOId the primary key of the tourism new attraction form first address
	 * @return the tourism new attraction form first address, or <code>null</code> if a tourism new attraction form first address with the primary key could not be found
	 */
	@Override
	public TourismNewAttractionFormFirstAddress fetchByPrimaryKey(
		long tourismNewAttractionFormFAOOId) {

		return fetchByPrimaryKey((Serializable)tourismNewAttractionFormFAOOId);
	}

	/**
	 * Returns all the tourism new attraction form first addresses.
	 *
	 * @return the tourism new attraction form first addresses
	 */
	@Override
	public List<TourismNewAttractionFormFirstAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @return the range of tourism new attraction form first addresses
	 */
	@Override
	public List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new attraction form first addresses
	 */
	@Override
	public List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirstAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism new attraction form first addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewAttractionFormFirstAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new attraction form first addresses
	 * @param end the upper bound of the range of tourism new attraction form first addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new attraction form first addresses
	 */
	@Override
	public List<TourismNewAttractionFormFirstAddress> findAll(
		int start, int end,
		OrderByComparator<TourismNewAttractionFormFirstAddress>
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

		List<TourismNewAttractionFormFirstAddress> list = null;

		if (useFinderCache) {
			list =
				(List<TourismNewAttractionFormFirstAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS;

				sql = sql.concat(
					TourismNewAttractionFormFirstAddressModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<TourismNewAttractionFormFirstAddress>)QueryUtil.list(
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
	 * Removes all the tourism new attraction form first addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismNewAttractionFormFirstAddress
				tourismNewAttractionFormFirstAddress : findAll()) {

			remove(tourismNewAttractionFormFirstAddress);
		}
	}

	/**
	 * Returns the number of tourism new attraction form first addresses.
	 *
	 * @return the number of tourism new attraction form first addresses
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
					_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS);

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
		return "tourismNewAttractionFormFAOOId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismNewAttractionFormFirstAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism new attraction form first address persistence.
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

		_finderPathFetchBygetTN_Attract_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTN_Attract_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismNewAttractFormFirstId"}, true);

		_finderPathCountBygetTN_Attract_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTN_Attract_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismNewAttractFormFirstId"},
			false);

		TourismNewAttractionFormFirstAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismNewAttractionFormFirstAddressUtil.setPersistence(null);

		entityCache.removeCache(
			TourismNewAttractionFormFirstAddressImpl.class.getName());
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
		_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS =
			"SELECT tourismNewAttractionFormFirstAddress FROM TourismNewAttractionFormFirstAddress tourismNewAttractionFormFirstAddress";

	private static final String
		_SQL_SELECT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS_WHERE =
			"SELECT tourismNewAttractionFormFirstAddress FROM TourismNewAttractionFormFirstAddress tourismNewAttractionFormFirstAddress WHERE ";

	private static final String
		_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS =
			"SELECT COUNT(tourismNewAttractionFormFirstAddress) FROM TourismNewAttractionFormFirstAddress tourismNewAttractionFormFirstAddress";

	private static final String
		_SQL_COUNT_TOURISMNEWATTRACTIONFORMFIRSTADDRESS_WHERE =
			"SELECT COUNT(tourismNewAttractionFormFirstAddress) FROM TourismNewAttractionFormFirstAddress tourismNewAttractionFormFirstAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismNewAttractionFormFirstAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismNewAttractionFormFirstAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismNewAttractionFormFirstAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismNewAttractionFormFirstAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}