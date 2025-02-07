/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezOccupantGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezOccupantGeneralBussinessAddressTable;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessAddressImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessAddressModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantGeneralBussinessAddressPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezOccupantGeneralBussinessAddressUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez occupant general bussiness address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezOccupantGeneralBussinessAddressPersistence.class)
public class SezOccupantGeneralBussinessAddressPersistenceImpl
	extends BasePersistenceImpl<SezOccupantGeneralBussinessAddress>
	implements SezOccupantGeneralBussinessAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezOccupantGeneralBussinessAddressUtil</code> to access the sez occupant general bussiness address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezOccupantGeneralBussinessAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezOccupantGeneralBussinessAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantGeneralBussinessAddressException(
				sb.toString());
		}

		return sezOccupantGeneralBussinessAddress;
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezOccupantGeneralBussinessAddress) {
			SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress =
					(SezOccupantGeneralBussinessAddress)result;

			if (sezStatusApplicationId !=
					sezOccupantGeneralBussinessAddress.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezOccupantGeneralBussinessAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezOccupantGeneralBussinessAddressPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantGeneralBussinessAddress
						sezOccupantGeneralBussinessAddress = list.get(0);

					result = sezOccupantGeneralBussinessAddress;

					cacheResult(sezOccupantGeneralBussinessAddress);
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
			return (SezOccupantGeneralBussinessAddress)result;
		}
	}

	/**
	 * Removes the sez occupant general bussiness address where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez occupant general bussiness address that was removed
	 */
	@Override
	public SezOccupantGeneralBussinessAddress removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezOccupantGeneralBussinessAddress);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantGeneralBussinessAddress.sezStatusApplicationId = ?";

	private FinderPath _finderPathFetchBygetSezStatusByAddressType_SAI;
	private FinderPath _finderPathCountBygetSezStatusByAddressType_SAI;

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
			findBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			fetchBygetSezStatusByAddressType_SAI(
				sezStatusApplicationId, addresstype);

		if (sezOccupantGeneralBussinessAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append(", addresstype=");
			sb.append(addresstype);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantGeneralBussinessAddressException(
				sb.toString());
		}

		return sezOccupantGeneralBussinessAddress;
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype) {

		return fetchBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype, true);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype,
			boolean useFinderCache) {

		addresstype = Objects.toString(addresstype, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId, addresstype};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAddressType_SAI, finderArgs,
				this);
		}

		if (result instanceof SezOccupantGeneralBussinessAddress) {
			SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress =
					(SezOccupantGeneralBussinessAddress)result;

			if ((sezStatusApplicationId !=
					sezOccupantGeneralBussinessAddress.
						getSezStatusApplicationId()) ||
				!Objects.equals(
					addresstype,
					sezOccupantGeneralBussinessAddress.getAddresstype())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_SEZSTATUSAPPLICATIONID_2);

			boolean bindAddresstype = false;

			if (addresstype.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_3);
			}
			else {
				bindAddresstype = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				if (bindAddresstype) {
					queryPos.add(addresstype);
				}

				List<SezOccupantGeneralBussinessAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAddressType_SAI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId, addresstype
								};
							}

							_log.warn(
								"SezOccupantGeneralBussinessAddressPersistenceImpl.fetchBygetSezStatusByAddressType_SAI(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantGeneralBussinessAddress
						sezOccupantGeneralBussinessAddress = list.get(0);

					result = sezOccupantGeneralBussinessAddress;

					cacheResult(sezOccupantGeneralBussinessAddress);
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
			return (SezOccupantGeneralBussinessAddress)result;
		}
	}

	/**
	 * Removes the sez occupant general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the sez occupant general bussiness address that was removed
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAddressType_SAI(
				long sezStatusApplicationId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			findBygetSezStatusByAddressType_SAI(
				sezStatusApplicationId, addresstype);

		return remove(sezOccupantGeneralBussinessAddress);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezStatusApplicationId = &#63; and addresstype = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	@Override
	public int countBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype) {

		addresstype = Objects.toString(addresstype, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByAddressType_SAI;

		Object[] finderArgs = new Object[] {
			sezStatusApplicationId, addresstype
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_SEZSTATUSAPPLICATIONID_2);

			boolean bindAddresstype = false;

			if (addresstype.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_3);
			}
			else {
				bindAddresstype = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				if (bindAddresstype) {
					queryPos.add(addresstype);
				}

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
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_SEZSTATUSAPPLICATIONID_2 =
			"sezOccupantGeneralBussinessAddress.sezStatusApplicationId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_2 =
			"sezOccupantGeneralBussinessAddress.addresstype = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_3 =
			"(sezOccupantGeneralBussinessAddress.addresstype IS NULL OR sezOccupantGeneralBussinessAddress.addresstype = '')";

	private FinderPath _finderPathFetchBygetSezStatusByAddressType_GBI;
	private FinderPath _finderPathCountBygetSezStatusByAddressType_GBI;

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
			findBygetSezStatusByAddressType_GBI(
				long sezOccGenBussId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			fetchBygetSezStatusByAddressType_GBI(sezOccGenBussId, addresstype);

		if (sezOccupantGeneralBussinessAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezOccGenBussId=");
			sb.append(sezOccGenBussId);

			sb.append(", addresstype=");
			sb.append(addresstype);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezOccupantGeneralBussinessAddressException(
				sb.toString());
		}

		return sezOccupantGeneralBussinessAddress;
	}

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezOccGenBussId, String addresstype) {

		return fetchBygetSezStatusByAddressType_GBI(
			sezOccGenBussId, addresstype, true);
	}

	/**
	 * Returns the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez occupant general bussiness address, or <code>null</code> if a matching sez occupant general bussiness address could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
		fetchBygetSezStatusByAddressType_GBI(
			long sezOccGenBussId, String addresstype, boolean useFinderCache) {

		addresstype = Objects.toString(addresstype, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezOccGenBussId, addresstype};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAddressType_GBI, finderArgs,
				this);
		}

		if (result instanceof SezOccupantGeneralBussinessAddress) {
			SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress =
					(SezOccupantGeneralBussinessAddress)result;

			if ((sezOccGenBussId !=
					sezOccupantGeneralBussinessAddress.getSezOccGenBussId()) ||
				!Objects.equals(
					addresstype,
					sezOccupantGeneralBussinessAddress.getAddresstype())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_SEZOCCGENBUSSID_2);

			boolean bindAddresstype = false;

			if (addresstype.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_3);
			}
			else {
				bindAddresstype = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezOccGenBussId);

				if (bindAddresstype) {
					queryPos.add(addresstype);
				}

				List<SezOccupantGeneralBussinessAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAddressType_GBI,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezOccGenBussId, addresstype
								};
							}

							_log.warn(
								"SezOccupantGeneralBussinessAddressPersistenceImpl.fetchBygetSezStatusByAddressType_GBI(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezOccupantGeneralBussinessAddress
						sezOccupantGeneralBussinessAddress = list.get(0);

					result = sezOccupantGeneralBussinessAddress;

					cacheResult(sezOccupantGeneralBussinessAddress);
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
			return (SezOccupantGeneralBussinessAddress)result;
		}
	}

	/**
	 * Removes the sez occupant general bussiness address where sezOccGenBussId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the sez occupant general bussiness address that was removed
	 */
	@Override
	public SezOccupantGeneralBussinessAddress
			removeBygetSezStatusByAddressType_GBI(
				long sezOccGenBussId, String addresstype)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			findBygetSezStatusByAddressType_GBI(sezOccGenBussId, addresstype);

		return remove(sezOccupantGeneralBussinessAddress);
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses where sezOccGenBussId = &#63; and addresstype = &#63;.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez occupant general bussiness addresses
	 */
	@Override
	public int countBygetSezStatusByAddressType_GBI(
		long sezOccGenBussId, String addresstype) {

		addresstype = Objects.toString(addresstype, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByAddressType_GBI;

		Object[] finderArgs = new Object[] {sezOccGenBussId, addresstype};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_SEZOCCGENBUSSID_2);

			boolean bindAddresstype = false;

			if (addresstype.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_3);
			}
			else {
				bindAddresstype = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezOccGenBussId);

				if (bindAddresstype) {
					queryPos.add(addresstype);
				}

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
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_SEZOCCGENBUSSID_2 =
			"sezOccupantGeneralBussinessAddress.sezOccGenBussId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_2 =
			"sezOccupantGeneralBussinessAddress.addresstype = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_3 =
			"(sezOccupantGeneralBussinessAddress.addresstype IS NULL OR sezOccupantGeneralBussinessAddress.addresstype = '')";

	public SezOccupantGeneralBussinessAddressPersistenceImpl() {
		setModelClass(SezOccupantGeneralBussinessAddress.class);

		setModelImplClass(SezOccupantGeneralBussinessAddressImpl.class);
		setModelPKClass(long.class);

		setTable(SezOccupantGeneralBussinessAddressTable.INSTANCE);
	}

	/**
	 * Caches the sez occupant general bussiness address in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessAddress the sez occupant general bussiness address
	 */
	@Override
	public void cacheResult(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		entityCache.putResult(
			SezOccupantGeneralBussinessAddressImpl.class,
			sezOccupantGeneralBussinessAddress.getPrimaryKey(),
			sezOccupantGeneralBussinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezOccupantGeneralBussinessAddress.getSezStatusApplicationId()
			},
			sezOccupantGeneralBussinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_SAI,
			new Object[] {
				sezOccupantGeneralBussinessAddress.getSezStatusApplicationId(),
				sezOccupantGeneralBussinessAddress.getAddresstype()
			},
			sezOccupantGeneralBussinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_GBI,
			new Object[] {
				sezOccupantGeneralBussinessAddress.getSezOccGenBussId(),
				sezOccupantGeneralBussinessAddress.getAddresstype()
			},
			sezOccupantGeneralBussinessAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez occupant general bussiness addresses in the entity cache if it is enabled.
	 *
	 * @param sezOccupantGeneralBussinessAddresses the sez occupant general bussiness addresses
	 */
	@Override
	public void cacheResult(
		List<SezOccupantGeneralBussinessAddress>
			sezOccupantGeneralBussinessAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezOccupantGeneralBussinessAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress :
					sezOccupantGeneralBussinessAddresses) {

			if (entityCache.getResult(
					SezOccupantGeneralBussinessAddressImpl.class,
					sezOccupantGeneralBussinessAddress.getPrimaryKey()) ==
						null) {

				cacheResult(sezOccupantGeneralBussinessAddress);
			}
		}
	}

	/**
	 * Clears the cache for all sez occupant general bussiness addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezOccupantGeneralBussinessAddressImpl.class);

		finderCache.clearCache(SezOccupantGeneralBussinessAddressImpl.class);
	}

	/**
	 * Clears the cache for the sez occupant general bussiness address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		entityCache.removeResult(
			SezOccupantGeneralBussinessAddressImpl.class,
			sezOccupantGeneralBussinessAddress);
	}

	@Override
	public void clearCache(
		List<SezOccupantGeneralBussinessAddress>
			sezOccupantGeneralBussinessAddresses) {

		for (SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress :
					sezOccupantGeneralBussinessAddresses) {

			entityCache.removeResult(
				SezOccupantGeneralBussinessAddressImpl.class,
				sezOccupantGeneralBussinessAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezOccupantGeneralBussinessAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezOccupantGeneralBussinessAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezOccupantGeneralBussinessAddressModelImpl
			sezOccupantGeneralBussinessAddressModelImpl) {

		Object[] args = new Object[] {
			sezOccupantGeneralBussinessAddressModelImpl.
				getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezOccupantGeneralBussinessAddressModelImpl);

		args = new Object[] {
			sezOccupantGeneralBussinessAddressModelImpl.
				getSezStatusApplicationId(),
			sezOccupantGeneralBussinessAddressModelImpl.getAddresstype()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAddressType_SAI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_SAI, args,
			sezOccupantGeneralBussinessAddressModelImpl);

		args = new Object[] {
			sezOccupantGeneralBussinessAddressModelImpl.getSezOccGenBussId(),
			sezOccupantGeneralBussinessAddressModelImpl.getAddresstype()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAddressType_GBI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_GBI, args,
			sezOccupantGeneralBussinessAddressModelImpl);
	}

	/**
	 * Creates a new sez occupant general bussiness address with the primary key. Does not add the sez occupant general bussiness address to the database.
	 *
	 * @param sezOccGenBussAddressId the primary key for the new sez occupant general bussiness address
	 * @return the new sez occupant general bussiness address
	 */
	@Override
	public SezOccupantGeneralBussinessAddress create(
		long sezOccGenBussAddressId) {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			new SezOccupantGeneralBussinessAddressImpl();

		sezOccupantGeneralBussinessAddress.setNew(true);
		sezOccupantGeneralBussinessAddress.setPrimaryKey(
			sezOccGenBussAddressId);

		sezOccupantGeneralBussinessAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezOccupantGeneralBussinessAddress;
	}

	/**
	 * Removes the sez occupant general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress remove(
			long sezOccGenBussAddressId)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		return remove((Serializable)sezOccGenBussAddressId);
	}

	/**
	 * Removes the sez occupant general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address that was removed
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress remove(Serializable primaryKey)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		Session session = null;

		try {
			session = openSession();

			SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress =
					(SezOccupantGeneralBussinessAddress)session.get(
						SezOccupantGeneralBussinessAddressImpl.class,
						primaryKey);

			if (sezOccupantGeneralBussinessAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezOccupantGeneralBussinessAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezOccupantGeneralBussinessAddress);
		}
		catch (NoSuchSezOccupantGeneralBussinessAddressException
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
	protected SezOccupantGeneralBussinessAddress removeImpl(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezOccupantGeneralBussinessAddress)) {
				sezOccupantGeneralBussinessAddress =
					(SezOccupantGeneralBussinessAddress)session.get(
						SezOccupantGeneralBussinessAddressImpl.class,
						sezOccupantGeneralBussinessAddress.getPrimaryKeyObj());
			}

			if (sezOccupantGeneralBussinessAddress != null) {
				session.delete(sezOccupantGeneralBussinessAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezOccupantGeneralBussinessAddress != null) {
			clearCache(sezOccupantGeneralBussinessAddress);
		}

		return sezOccupantGeneralBussinessAddress;
	}

	@Override
	public SezOccupantGeneralBussinessAddress updateImpl(
		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress) {

		boolean isNew = sezOccupantGeneralBussinessAddress.isNew();

		if (!(sezOccupantGeneralBussinessAddress instanceof
				SezOccupantGeneralBussinessAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezOccupantGeneralBussinessAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezOccupantGeneralBussinessAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezOccupantGeneralBussinessAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezOccupantGeneralBussinessAddress implementation " +
					sezOccupantGeneralBussinessAddress.getClass());
		}

		SezOccupantGeneralBussinessAddressModelImpl
			sezOccupantGeneralBussinessAddressModelImpl =
				(SezOccupantGeneralBussinessAddressModelImpl)
					sezOccupantGeneralBussinessAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(sezOccupantGeneralBussinessAddress.getCreateDate() == null)) {

			if (serviceContext == null) {
				sezOccupantGeneralBussinessAddress.setCreateDate(date);
			}
			else {
				sezOccupantGeneralBussinessAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezOccupantGeneralBussinessAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezOccupantGeneralBussinessAddress.setModifiedDate(date);
			}
			else {
				sezOccupantGeneralBussinessAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezOccupantGeneralBussinessAddress);
			}
			else {
				sezOccupantGeneralBussinessAddress =
					(SezOccupantGeneralBussinessAddress)session.merge(
						sezOccupantGeneralBussinessAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezOccupantGeneralBussinessAddressImpl.class,
			sezOccupantGeneralBussinessAddressModelImpl, false, true);

		cacheUniqueFindersCache(sezOccupantGeneralBussinessAddressModelImpl);

		if (isNew) {
			sezOccupantGeneralBussinessAddress.setNew(false);
		}

		sezOccupantGeneralBussinessAddress.resetOriginalValues();

		return sezOccupantGeneralBussinessAddress;
	}

	/**
	 * Returns the sez occupant general bussiness address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress =
			fetchByPrimaryKey(primaryKey);

		if (sezOccupantGeneralBussinessAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezOccupantGeneralBussinessAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezOccupantGeneralBussinessAddress;
	}

	/**
	 * Returns the sez occupant general bussiness address with the primary key or throws a <code>NoSuchSezOccupantGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address
	 * @throws NoSuchSezOccupantGeneralBussinessAddressException if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress findByPrimaryKey(
			long sezOccGenBussAddressId)
		throws NoSuchSezOccupantGeneralBussinessAddressException {

		return findByPrimaryKey((Serializable)sezOccGenBussAddressId);
	}

	/**
	 * Returns the sez occupant general bussiness address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezOccGenBussAddressId the primary key of the sez occupant general bussiness address
	 * @return the sez occupant general bussiness address, or <code>null</code> if a sez occupant general bussiness address with the primary key could not be found
	 */
	@Override
	public SezOccupantGeneralBussinessAddress fetchByPrimaryKey(
		long sezOccGenBussAddressId) {

		return fetchByPrimaryKey((Serializable)sezOccGenBussAddressId);
	}

	/**
	 * Returns all the sez occupant general bussiness addresses.
	 *
	 * @return the sez occupant general bussiness addresses
	 */
	@Override
	public List<SezOccupantGeneralBussinessAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @return the range of sez occupant general bussiness addresses
	 */
	@Override
	public List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez occupant general bussiness addresses
	 */
	@Override
	public List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessAddress>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez occupant general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezOccupantGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant general bussiness addresses
	 * @param end the upper bound of the range of sez occupant general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez occupant general bussiness addresses
	 */
	@Override
	public List<SezOccupantGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezOccupantGeneralBussinessAddress> orderByComparator,
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

		List<SezOccupantGeneralBussinessAddress> list = null;

		if (useFinderCache) {
			list =
				(List<SezOccupantGeneralBussinessAddress>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS;

				sql = sql.concat(
					SezOccupantGeneralBussinessAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezOccupantGeneralBussinessAddress>)QueryUtil.list(
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
	 * Removes all the sez occupant general bussiness addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezOccupantGeneralBussinessAddress
				sezOccupantGeneralBussinessAddress : findAll()) {

			remove(sezOccupantGeneralBussinessAddress);
		}
	}

	/**
	 * Returns the number of sez occupant general bussiness addresses.
	 *
	 * @return the number of sez occupant general bussiness addresses
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
					_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSADDRESS);

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
		return "sezOccGenBussAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezOccupantGeneralBussinessAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez occupant general bussiness address persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		_finderPathFetchBygetSezStatusByAddressType_SAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAddressType_SAI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"sezStatusApplicationId", "addresstype"}, true);

		_finderPathCountBygetSezStatusByAddressType_SAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAddressType_SAI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"sezStatusApplicationId", "addresstype"}, false);

		_finderPathFetchBygetSezStatusByAddressType_GBI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAddressType_GBI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"sezOccGenBussId", "addresstype"}, true);

		_finderPathCountBygetSezStatusByAddressType_GBI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAddressType_GBI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"sezOccGenBussId", "addresstype"}, false);

		SezOccupantGeneralBussinessAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezOccupantGeneralBussinessAddressUtil.setPersistence(null);

		entityCache.removeCache(
			SezOccupantGeneralBussinessAddressImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS =
		"SELECT sezOccupantGeneralBussinessAddress FROM SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress";

	private static final String
		_SQL_SELECT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE =
			"SELECT sezOccupantGeneralBussinessAddress FROM SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress WHERE ";

	private static final String _SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSADDRESS =
		"SELECT COUNT(sezOccupantGeneralBussinessAddress) FROM SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress";

	private static final String
		_SQL_COUNT_SEZOCCUPANTGENERALBUSSINESSADDRESS_WHERE =
			"SELECT COUNT(sezOccupantGeneralBussinessAddress) FROM SezOccupantGeneralBussinessAddress sezOccupantGeneralBussinessAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezOccupantGeneralBussinessAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezOccupantGeneralBussinessAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezOccupantGeneralBussinessAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezOccupantGeneralBussinessAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}