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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismBonaGroundTransportationAddressException;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddress;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundTransportationAddressTable;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportationAddressModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationAddressPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismBonaGroundTransportationAddressUtil;
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
 * The persistence implementation for the tourism bona ground transportation address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismBonaGroundTransportationAddressPersistence.class)
public class TourismBonaGroundTransportationAddressPersistenceImpl
	extends BasePersistenceImpl<TourismBonaGroundTransportationAddress>
	implements TourismBonaGroundTransportationAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismBonaGroundTransportationAddressUtil</code> to access the tourism bona ground transportation address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismBonaGroundTransportationAddressImpl.class.getName();

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
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a matching tourism bona ground transportation address could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress findBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress = fetchBygetTourismById(
				tourismApplicationId);

		if (tourismBonaGroundTransportationAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaGroundTransportationAddressException(
				sb.toString());
		}

		return tourismBonaGroundTransportationAddress;
	}

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress fetchBygetTourismById(
		long tourismApplicationId) {

		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism bona ground transportation address where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress fetchBygetTourismById(
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

		if (result instanceof TourismBonaGroundTransportationAddress) {
			TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress =
					(TourismBonaGroundTransportationAddress)result;

			if (tourismApplicationId !=
					tourismBonaGroundTransportationAddress.
						getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismBonaGroundTransportationAddress> list =
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
								"TourismBonaGroundTransportationAddressPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaGroundTransportationAddress
						tourismBonaGroundTransportationAddress = list.get(0);

					result = tourismBonaGroundTransportationAddress;

					cacheResult(tourismBonaGroundTransportationAddress);
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
			return (TourismBonaGroundTransportationAddress)result;
		}
	}

	/**
	 * Removes the tourism bona ground transportation address where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism bona ground transportation address that was removed
	 */
	@Override
	public TourismBonaGroundTransportationAddress removeBygetTourismById(
			long tourismApplicationId)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress = findBygetTourismById(
				tourismApplicationId);

		return remove(tourismBonaGroundTransportationAddress);
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism bona ground transportation addresses
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS_WHERE);

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
			"tourismBonaGroundTransportationAddress.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTB_Ground_AT;
	private FinderPath _finderPathCountBygetTB_Ground_AT;

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the matching tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a matching tourism bona ground transportation address could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress findBygetTB_Ground_AT(
			String addressType, long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress = fetchBygetTB_Ground_AT(
				addressType, tourismBonaGroundTransportId);

		if (tourismBonaGroundTransportationAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", tourismBonaGroundTransportId=");
			sb.append(tourismBonaGroundTransportId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismBonaGroundTransportationAddressException(
				sb.toString());
		}

		return tourismBonaGroundTransportationAddress;
	}

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress fetchBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId) {

		return fetchBygetTB_Ground_AT(
			addressType, tourismBonaGroundTransportId, true);
	}

	/**
	 * Returns the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism bona ground transportation address, or <code>null</code> if a matching tourism bona ground transportation address could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress fetchBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				addressType, tourismBonaGroundTransportId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTB_Ground_AT, finderArgs, this);
		}

		if (result instanceof TourismBonaGroundTransportationAddress) {
			TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress =
					(TourismBonaGroundTransportationAddress)result;

			if (!Objects.equals(
					addressType,
					tourismBonaGroundTransportationAddress.getAddressType()) ||
				(tourismBonaGroundTransportId !=
					tourismBonaGroundTransportationAddress.
						getTourismBonaGroundTransportId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_GROUND_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_GROUND_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTB_GROUND_AT_TOURISMBONAGROUNDTRANSPORTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaGroundTransportId);

				List<TourismBonaGroundTransportationAddress> list =
					query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTB_Ground_AT, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, tourismBonaGroundTransportId
								};
							}

							_log.warn(
								"TourismBonaGroundTransportationAddressPersistenceImpl.fetchBygetTB_Ground_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismBonaGroundTransportationAddress
						tourismBonaGroundTransportationAddress = list.get(0);

					result = tourismBonaGroundTransportationAddress;

					cacheResult(tourismBonaGroundTransportationAddress);
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
			return (TourismBonaGroundTransportationAddress)result;
		}
	}

	/**
	 * Removes the tourism bona ground transportation address where addressType = &#63; and tourismBonaGroundTransportId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the tourism bona ground transportation address that was removed
	 */
	@Override
	public TourismBonaGroundTransportationAddress removeBygetTB_Ground_AT(
			String addressType, long tourismBonaGroundTransportId)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress = findBygetTB_Ground_AT(
				addressType, tourismBonaGroundTransportId);

		return remove(tourismBonaGroundTransportationAddress);
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses where addressType = &#63; and tourismBonaGroundTransportId = &#63;.
	 *
	 * @param addressType the address type
	 * @param tourismBonaGroundTransportId the tourism bona ground transport ID
	 * @return the number of matching tourism bona ground transportation addresses
	 */
	@Override
	public int countBygetTB_Ground_AT(
		String addressType, long tourismBonaGroundTransportId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetTB_Ground_AT;

		Object[] finderArgs = new Object[] {
			addressType, tourismBonaGroundTransportId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTB_GROUND_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETTB_GROUND_AT_ADDRESSTYPE_2);
			}

			sb.append(
				_FINDER_COLUMN_GETTB_GROUND_AT_TOURISMBONAGROUNDTRANSPORTID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(tourismBonaGroundTransportId);

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

	private static final String _FINDER_COLUMN_GETTB_GROUND_AT_ADDRESSTYPE_2 =
		"tourismBonaGroundTransportationAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETTB_GROUND_AT_ADDRESSTYPE_3 =
		"(tourismBonaGroundTransportationAddress.addressType IS NULL OR tourismBonaGroundTransportationAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTB_GROUND_AT_TOURISMBONAGROUNDTRANSPORTID_2 =
			"tourismBonaGroundTransportationAddress.tourismBonaGroundTransportId = ?";

	public TourismBonaGroundTransportationAddressPersistenceImpl() {
		setModelClass(TourismBonaGroundTransportationAddress.class);

		setModelImplClass(TourismBonaGroundTransportationAddressImpl.class);
		setModelPKClass(long.class);

		setTable(TourismBonaGroundTransportationAddressTable.INSTANCE);
	}

	/**
	 * Caches the tourism bona ground transportation address in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportationAddress the tourism bona ground transportation address
	 */
	@Override
	public void cacheResult(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		entityCache.putResult(
			TourismBonaGroundTransportationAddressImpl.class,
			tourismBonaGroundTransportationAddress.getPrimaryKey(),
			tourismBonaGroundTransportationAddress);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {
				tourismBonaGroundTransportationAddress.getTourismApplicationId()
			},
			tourismBonaGroundTransportationAddress);

		finderCache.putResult(
			_finderPathFetchBygetTB_Ground_AT,
			new Object[] {
				tourismBonaGroundTransportationAddress.getAddressType(),
				tourismBonaGroundTransportationAddress.
					getTourismBonaGroundTransportId()
			},
			tourismBonaGroundTransportationAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism bona ground transportation addresses in the entity cache if it is enabled.
	 *
	 * @param tourismBonaGroundTransportationAddresses the tourism bona ground transportation addresses
	 */
	@Override
	public void cacheResult(
		List<TourismBonaGroundTransportationAddress>
			tourismBonaGroundTransportationAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismBonaGroundTransportationAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress :
					tourismBonaGroundTransportationAddresses) {

			if (entityCache.getResult(
					TourismBonaGroundTransportationAddressImpl.class,
					tourismBonaGroundTransportationAddress.getPrimaryKey()) ==
						null) {

				cacheResult(tourismBonaGroundTransportationAddress);
			}
		}
	}

	/**
	 * Clears the cache for all tourism bona ground transportation addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			TourismBonaGroundTransportationAddressImpl.class);

		finderCache.clearCache(
			TourismBonaGroundTransportationAddressImpl.class);
	}

	/**
	 * Clears the cache for the tourism bona ground transportation address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		entityCache.removeResult(
			TourismBonaGroundTransportationAddressImpl.class,
			tourismBonaGroundTransportationAddress);
	}

	@Override
	public void clearCache(
		List<TourismBonaGroundTransportationAddress>
			tourismBonaGroundTransportationAddresses) {

		for (TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress :
					tourismBonaGroundTransportationAddresses) {

			entityCache.removeResult(
				TourismBonaGroundTransportationAddressImpl.class,
				tourismBonaGroundTransportationAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			TourismBonaGroundTransportationAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismBonaGroundTransportationAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismBonaGroundTransportationAddressModelImpl
			tourismBonaGroundTransportationAddressModelImpl) {

		Object[] args = new Object[] {
			tourismBonaGroundTransportationAddressModelImpl.
				getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismBonaGroundTransportationAddressModelImpl);

		args = new Object[] {
			tourismBonaGroundTransportationAddressModelImpl.getAddressType(),
			tourismBonaGroundTransportationAddressModelImpl.
				getTourismBonaGroundTransportId()
		};

		finderCache.putResult(
			_finderPathCountBygetTB_Ground_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTB_Ground_AT, args,
			tourismBonaGroundTransportationAddressModelImpl);
	}

	/**
	 * Creates a new tourism bona ground transportation address with the primary key. Does not add the tourism bona ground transportation address to the database.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key for the new tourism bona ground transportation address
	 * @return the new tourism bona ground transportation address
	 */
	@Override
	public TourismBonaGroundTransportationAddress create(
		long tourismBonaGroundTransAddresId) {

		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress =
				new TourismBonaGroundTransportationAddressImpl();

		tourismBonaGroundTransportationAddress.setNew(true);
		tourismBonaGroundTransportationAddress.setPrimaryKey(
			tourismBonaGroundTransAddresId);

		tourismBonaGroundTransportationAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismBonaGroundTransportationAddress;
	}

	/**
	 * Removes the tourism bona ground transportation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was removed
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress remove(
			long tourismBonaGroundTransAddresId)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		return remove((Serializable)tourismBonaGroundTransAddresId);
	}

	/**
	 * Removes the tourism bona ground transportation address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address that was removed
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress remove(
			Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		Session session = null;

		try {
			session = openSession();

			TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress =
					(TourismBonaGroundTransportationAddress)session.get(
						TourismBonaGroundTransportationAddressImpl.class,
						primaryKey);

			if (tourismBonaGroundTransportationAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismBonaGroundTransportationAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismBonaGroundTransportationAddress);
		}
		catch (NoSuchTourismBonaGroundTransportationAddressException
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
	protected TourismBonaGroundTransportationAddress removeImpl(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismBonaGroundTransportationAddress)) {
				tourismBonaGroundTransportationAddress =
					(TourismBonaGroundTransportationAddress)session.get(
						TourismBonaGroundTransportationAddressImpl.class,
						tourismBonaGroundTransportationAddress.
							getPrimaryKeyObj());
			}

			if (tourismBonaGroundTransportationAddress != null) {
				session.delete(tourismBonaGroundTransportationAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismBonaGroundTransportationAddress != null) {
			clearCache(tourismBonaGroundTransportationAddress);
		}

		return tourismBonaGroundTransportationAddress;
	}

	@Override
	public TourismBonaGroundTransportationAddress updateImpl(
		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress) {

		boolean isNew = tourismBonaGroundTransportationAddress.isNew();

		if (!(tourismBonaGroundTransportationAddress instanceof
				TourismBonaGroundTransportationAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					tourismBonaGroundTransportationAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismBonaGroundTransportationAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismBonaGroundTransportationAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismBonaGroundTransportationAddress implementation " +
					tourismBonaGroundTransportationAddress.getClass());
		}

		TourismBonaGroundTransportationAddressModelImpl
			tourismBonaGroundTransportationAddressModelImpl =
				(TourismBonaGroundTransportationAddressModelImpl)
					tourismBonaGroundTransportationAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(tourismBonaGroundTransportationAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				tourismBonaGroundTransportationAddress.setCreateDate(date);
			}
			else {
				tourismBonaGroundTransportationAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismBonaGroundTransportationAddressModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				tourismBonaGroundTransportationAddress.setModifiedDate(date);
			}
			else {
				tourismBonaGroundTransportationAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismBonaGroundTransportationAddress);
			}
			else {
				tourismBonaGroundTransportationAddress =
					(TourismBonaGroundTransportationAddress)session.merge(
						tourismBonaGroundTransportationAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismBonaGroundTransportationAddressImpl.class,
			tourismBonaGroundTransportationAddressModelImpl, false, true);

		cacheUniqueFindersCache(
			tourismBonaGroundTransportationAddressModelImpl);

		if (isNew) {
			tourismBonaGroundTransportationAddress.setNew(false);
		}

		tourismBonaGroundTransportationAddress.resetOriginalValues();

		return tourismBonaGroundTransportationAddress;
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		TourismBonaGroundTransportationAddress
			tourismBonaGroundTransportationAddress = fetchByPrimaryKey(
				primaryKey);

		if (tourismBonaGroundTransportationAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismBonaGroundTransportationAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismBonaGroundTransportationAddress;
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key or throws a <code>NoSuchTourismBonaGroundTransportationAddressException</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address
	 * @throws NoSuchTourismBonaGroundTransportationAddressException if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress findByPrimaryKey(
			long tourismBonaGroundTransAddresId)
		throws NoSuchTourismBonaGroundTransportationAddressException {

		return findByPrimaryKey((Serializable)tourismBonaGroundTransAddresId);
	}

	/**
	 * Returns the tourism bona ground transportation address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismBonaGroundTransAddresId the primary key of the tourism bona ground transportation address
	 * @return the tourism bona ground transportation address, or <code>null</code> if a tourism bona ground transportation address with the primary key could not be found
	 */
	@Override
	public TourismBonaGroundTransportationAddress fetchByPrimaryKey(
		long tourismBonaGroundTransAddresId) {

		return fetchByPrimaryKey((Serializable)tourismBonaGroundTransAddresId);
	}

	/**
	 * Returns all the tourism bona ground transportation addresses.
	 *
	 * @return the tourism bona ground transportation addresses
	 */
	@Override
	public List<TourismBonaGroundTransportationAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @return the range of tourism bona ground transportation addresses
	 */
	@Override
	public List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism bona ground transportation addresses
	 */
	@Override
	public List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportationAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism bona ground transportation addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismBonaGroundTransportationAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism bona ground transportation addresses
	 * @param end the upper bound of the range of tourism bona ground transportation addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism bona ground transportation addresses
	 */
	@Override
	public List<TourismBonaGroundTransportationAddress> findAll(
		int start, int end,
		OrderByComparator<TourismBonaGroundTransportationAddress>
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

		List<TourismBonaGroundTransportationAddress> list = null;

		if (useFinderCache) {
			list =
				(List<TourismBonaGroundTransportationAddress>)
					finderCache.getResult(finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS;

				sql = sql.concat(
					TourismBonaGroundTransportationAddressModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<TourismBonaGroundTransportationAddress>)
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
	 * Removes all the tourism bona ground transportation addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismBonaGroundTransportationAddress
				tourismBonaGroundTransportationAddress : findAll()) {

			remove(tourismBonaGroundTransportationAddress);
		}
	}

	/**
	 * Returns the number of tourism bona ground transportation addresses.
	 *
	 * @return the number of tourism bona ground transportation addresses
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
					_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS);

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
		return "tourismBonaGroundTransAddresId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismBonaGroundTransportationAddressModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism bona ground transportation address persistence.
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

		_finderPathFetchBygetTB_Ground_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTB_Ground_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaGroundTransportId"}, true);

		_finderPathCountBygetTB_Ground_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTB_Ground_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "tourismBonaGroundTransportId"},
			false);

		TourismBonaGroundTransportationAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismBonaGroundTransportationAddressUtil.setPersistence(null);

		entityCache.removeCache(
			TourismBonaGroundTransportationAddressImpl.class.getName());
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
		_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS =
			"SELECT tourismBonaGroundTransportationAddress FROM TourismBonaGroundTransportationAddress tourismBonaGroundTransportationAddress";

	private static final String
		_SQL_SELECT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS_WHERE =
			"SELECT tourismBonaGroundTransportationAddress FROM TourismBonaGroundTransportationAddress tourismBonaGroundTransportationAddress WHERE ";

	private static final String
		_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS =
			"SELECT COUNT(tourismBonaGroundTransportationAddress) FROM TourismBonaGroundTransportationAddress tourismBonaGroundTransportationAddress";

	private static final String
		_SQL_COUNT_TOURISMBONAGROUNDTRANSPORTATIONADDRESS_WHERE =
			"SELECT COUNT(tourismBonaGroundTransportationAddress) FROM TourismBonaGroundTransportationAddress tourismBonaGroundTransportationAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismBonaGroundTransportationAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismBonaGroundTransportationAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismBonaGroundTransportationAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismBonaGroundTransportationAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}