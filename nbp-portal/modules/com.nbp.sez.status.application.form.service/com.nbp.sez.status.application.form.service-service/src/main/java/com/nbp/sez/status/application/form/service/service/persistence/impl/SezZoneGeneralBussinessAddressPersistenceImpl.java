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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezZoneGeneralBussinessAddressException;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddress;
import com.nbp.sez.status.application.form.service.model.SezZoneGeneralBussinessAddressTable;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezZoneGeneralBussinessAddressModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneGeneralBussinessAddressPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezZoneGeneralBussinessAddressUtil;
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
 * The persistence implementation for the sez zone general bussiness address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezZoneGeneralBussinessAddressPersistence.class)
public class SezZoneGeneralBussinessAddressPersistenceImpl
	extends BasePersistenceImpl<SezZoneGeneralBussinessAddress>
	implements SezZoneGeneralBussinessAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezZoneGeneralBussinessAddressUtil</code> to access the sez zone general bussiness address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezZoneGeneralBussinessAddressImpl.class.getName();

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
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezZoneGeneralBussinessAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneGeneralBussinessAddressException(
				sb.toString());
		}

		return sezZoneGeneralBussinessAddress;
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAppId(
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

		if (result instanceof SezZoneGeneralBussinessAddress) {
			SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
				(SezZoneGeneralBussinessAddress)result;

			if (sezStatusApplicationId !=
					sezZoneGeneralBussinessAddress.
						getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezZoneGeneralBussinessAddress> list = query.list();

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
								"SezZoneGeneralBussinessAddressPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneGeneralBussinessAddress
						sezZoneGeneralBussinessAddress = list.get(0);

					result = sezZoneGeneralBussinessAddress;

					cacheResult(sezZoneGeneralBussinessAddress);
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
			return (SezZoneGeneralBussinessAddress)result;
		}
	}

	/**
	 * Removes the sez zone general bussiness address where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez zone general bussiness address that was removed
	 */
	@Override
	public SezZoneGeneralBussinessAddress removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezZoneGeneralBussinessAddress);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez zone general bussiness addresses
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZZONEGENERALBUSSINESSADDRESS_WHERE);

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
			"sezZoneGeneralBussinessAddress.sezStatusApplicationId = ?";

	private FinderPath _finderPathFetchBygetSezStatusByAddressType_SAI;
	private FinderPath _finderPathCountBygetSezStatusByAddressType_SAI;

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress findBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			fetchBygetSezStatusByAddressType_SAI(
				sezStatusApplicationId, addresstype);

		if (sezZoneGeneralBussinessAddress == null) {
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

			throw new NoSuchSezZoneGeneralBussinessAddressException(
				sb.toString());
		}

		return sezZoneGeneralBussinessAddress;
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_SAI(
		long sezStatusApplicationId, String addresstype) {

		return fetchBygetSezStatusByAddressType_SAI(
			sezStatusApplicationId, addresstype, true);
	}

	/**
	 * Returns the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_SAI(
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

		if (result instanceof SezZoneGeneralBussinessAddress) {
			SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
				(SezZoneGeneralBussinessAddress)result;

			if ((sezStatusApplicationId !=
					sezZoneGeneralBussinessAddress.
						getSezStatusApplicationId()) ||
				!Objects.equals(
					addresstype,
					sezZoneGeneralBussinessAddress.getAddresstype())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS_WHERE);

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

				List<SezZoneGeneralBussinessAddress> list = query.list();

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
								"SezZoneGeneralBussinessAddressPersistenceImpl.fetchBygetSezStatusByAddressType_SAI(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneGeneralBussinessAddress
						sezZoneGeneralBussinessAddress = list.get(0);

					result = sezZoneGeneralBussinessAddress;

					cacheResult(sezZoneGeneralBussinessAddress);
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
			return (SezZoneGeneralBussinessAddress)result;
		}
	}

	/**
	 * Removes the sez zone general bussiness address where sezStatusApplicationId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the sez zone general bussiness address that was removed
	 */
	@Override
	public SezZoneGeneralBussinessAddress removeBygetSezStatusByAddressType_SAI(
			long sezStatusApplicationId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			findBygetSezStatusByAddressType_SAI(
				sezStatusApplicationId, addresstype);

		return remove(sezZoneGeneralBussinessAddress);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses where sezStatusApplicationId = &#63; and addresstype = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez zone general bussiness addresses
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

			sb.append(_SQL_COUNT_SEZZONEGENERALBUSSINESSADDRESS_WHERE);

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
			"sezZoneGeneralBussinessAddress.sezStatusApplicationId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_2 =
			"sezZoneGeneralBussinessAddress.addresstype = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_SAI_ADDRESSTYPE_3 =
			"(sezZoneGeneralBussinessAddress.addresstype IS NULL OR sezZoneGeneralBussinessAddress.addresstype = '')";

	private FinderPath _finderPathFetchBygetSezStatusByAddressType_GBI;
	private FinderPath _finderPathCountBygetSezStatusByAddressType_GBI;

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress findBygetSezStatusByAddressType_GBI(
			long sezZoneGeneralBusinessInfoId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			fetchBygetSezStatusByAddressType_GBI(
				sezZoneGeneralBusinessInfoId, addresstype);

		if (sezZoneGeneralBussinessAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezZoneGeneralBusinessInfoId=");
			sb.append(sezZoneGeneralBusinessInfoId);

			sb.append(", addresstype=");
			sb.append(addresstype);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezZoneGeneralBussinessAddressException(
				sb.toString());
		}

		return sezZoneGeneralBussinessAddress;
	}

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype) {

		return fetchBygetSezStatusByAddressType_GBI(
			sezZoneGeneralBusinessInfoId, addresstype, true);
	}

	/**
	 * Returns the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez zone general bussiness address, or <code>null</code> if a matching sez zone general bussiness address could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype,
		boolean useFinderCache) {

		addresstype = Objects.toString(addresstype, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				sezZoneGeneralBusinessInfoId, addresstype
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAddressType_GBI, finderArgs,
				this);
		}

		if (result instanceof SezZoneGeneralBussinessAddress) {
			SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
				(SezZoneGeneralBussinessAddress)result;

			if ((sezZoneGeneralBusinessInfoId !=
					sezZoneGeneralBussinessAddress.
						getSezZoneGeneralBusinessInfoId()) ||
				!Objects.equals(
					addresstype,
					sezZoneGeneralBussinessAddress.getAddresstype())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_SEZZONEGENERALBUSINESSINFOID_2);

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

				queryPos.add(sezZoneGeneralBusinessInfoId);

				if (bindAddresstype) {
					queryPos.add(addresstype);
				}

				List<SezZoneGeneralBussinessAddress> list = query.list();

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
									sezZoneGeneralBusinessInfoId, addresstype
								};
							}

							_log.warn(
								"SezZoneGeneralBussinessAddressPersistenceImpl.fetchBygetSezStatusByAddressType_GBI(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezZoneGeneralBussinessAddress
						sezZoneGeneralBussinessAddress = list.get(0);

					result = sezZoneGeneralBussinessAddress;

					cacheResult(sezZoneGeneralBussinessAddress);
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
			return (SezZoneGeneralBussinessAddress)result;
		}
	}

	/**
	 * Removes the sez zone general bussiness address where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63; from the database.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the sez zone general bussiness address that was removed
	 */
	@Override
	public SezZoneGeneralBussinessAddress removeBygetSezStatusByAddressType_GBI(
			long sezZoneGeneralBusinessInfoId, String addresstype)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			findBygetSezStatusByAddressType_GBI(
				sezZoneGeneralBusinessInfoId, addresstype);

		return remove(sezZoneGeneralBussinessAddress);
	}

	/**
	 * Returns the number of sez zone general bussiness addresses where sezZoneGeneralBusinessInfoId = &#63; and addresstype = &#63;.
	 *
	 * @param sezZoneGeneralBusinessInfoId the sez zone general business info ID
	 * @param addresstype the addresstype
	 * @return the number of matching sez zone general bussiness addresses
	 */
	@Override
	public int countBygetSezStatusByAddressType_GBI(
		long sezZoneGeneralBusinessInfoId, String addresstype) {

		addresstype = Objects.toString(addresstype, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByAddressType_GBI;

		Object[] finderArgs = new Object[] {
			sezZoneGeneralBusinessInfoId, addresstype
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZZONEGENERALBUSSINESSADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_SEZZONEGENERALBUSINESSINFOID_2);

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

				queryPos.add(sezZoneGeneralBusinessInfoId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_SEZZONEGENERALBUSINESSINFOID_2 =
			"sezZoneGeneralBussinessAddress.sezZoneGeneralBusinessInfoId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_2 =
			"sezZoneGeneralBussinessAddress.addresstype = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYADDRESSTYPE_GBI_ADDRESSTYPE_3 =
			"(sezZoneGeneralBussinessAddress.addresstype IS NULL OR sezZoneGeneralBussinessAddress.addresstype = '')";

	public SezZoneGeneralBussinessAddressPersistenceImpl() {
		setModelClass(SezZoneGeneralBussinessAddress.class);

		setModelImplClass(SezZoneGeneralBussinessAddressImpl.class);
		setModelPKClass(long.class);

		setTable(SezZoneGeneralBussinessAddressTable.INSTANCE);
	}

	/**
	 * Caches the sez zone general bussiness address in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBussinessAddress the sez zone general bussiness address
	 */
	@Override
	public void cacheResult(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		entityCache.putResult(
			SezZoneGeneralBussinessAddressImpl.class,
			sezZoneGeneralBussinessAddress.getPrimaryKey(),
			sezZoneGeneralBussinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezZoneGeneralBussinessAddress.getSezStatusApplicationId()
			},
			sezZoneGeneralBussinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_SAI,
			new Object[] {
				sezZoneGeneralBussinessAddress.getSezStatusApplicationId(),
				sezZoneGeneralBussinessAddress.getAddresstype()
			},
			sezZoneGeneralBussinessAddress);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_GBI,
			new Object[] {
				sezZoneGeneralBussinessAddress.
					getSezZoneGeneralBusinessInfoId(),
				sezZoneGeneralBussinessAddress.getAddresstype()
			},
			sezZoneGeneralBussinessAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez zone general bussiness addresses in the entity cache if it is enabled.
	 *
	 * @param sezZoneGeneralBussinessAddresses the sez zone general bussiness addresses
	 */
	@Override
	public void cacheResult(
		List<SezZoneGeneralBussinessAddress> sezZoneGeneralBussinessAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezZoneGeneralBussinessAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress :
				sezZoneGeneralBussinessAddresses) {

			if (entityCache.getResult(
					SezZoneGeneralBussinessAddressImpl.class,
					sezZoneGeneralBussinessAddress.getPrimaryKey()) == null) {

				cacheResult(sezZoneGeneralBussinessAddress);
			}
		}
	}

	/**
	 * Clears the cache for all sez zone general bussiness addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezZoneGeneralBussinessAddressImpl.class);

		finderCache.clearCache(SezZoneGeneralBussinessAddressImpl.class);
	}

	/**
	 * Clears the cache for the sez zone general bussiness address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		entityCache.removeResult(
			SezZoneGeneralBussinessAddressImpl.class,
			sezZoneGeneralBussinessAddress);
	}

	@Override
	public void clearCache(
		List<SezZoneGeneralBussinessAddress> sezZoneGeneralBussinessAddresses) {

		for (SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress :
				sezZoneGeneralBussinessAddresses) {

			entityCache.removeResult(
				SezZoneGeneralBussinessAddressImpl.class,
				sezZoneGeneralBussinessAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezZoneGeneralBussinessAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezZoneGeneralBussinessAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezZoneGeneralBussinessAddressModelImpl
			sezZoneGeneralBussinessAddressModelImpl) {

		Object[] args = new Object[] {
			sezZoneGeneralBussinessAddressModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezZoneGeneralBussinessAddressModelImpl);

		args = new Object[] {
			sezZoneGeneralBussinessAddressModelImpl.getSezStatusApplicationId(),
			sezZoneGeneralBussinessAddressModelImpl.getAddresstype()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAddressType_SAI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_SAI, args,
			sezZoneGeneralBussinessAddressModelImpl);

		args = new Object[] {
			sezZoneGeneralBussinessAddressModelImpl.
				getSezZoneGeneralBusinessInfoId(),
			sezZoneGeneralBussinessAddressModelImpl.getAddresstype()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAddressType_GBI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAddressType_GBI, args,
			sezZoneGeneralBussinessAddressModelImpl);
	}

	/**
	 * Creates a new sez zone general bussiness address with the primary key. Does not add the sez zone general bussiness address to the database.
	 *
	 * @param sezZoneGenBussAddressId the primary key for the new sez zone general bussiness address
	 * @return the new sez zone general bussiness address
	 */
	@Override
	public SezZoneGeneralBussinessAddress create(long sezZoneGenBussAddressId) {
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			new SezZoneGeneralBussinessAddressImpl();

		sezZoneGeneralBussinessAddress.setNew(true);
		sezZoneGeneralBussinessAddress.setPrimaryKey(sezZoneGenBussAddressId);

		sezZoneGeneralBussinessAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezZoneGeneralBussinessAddress;
	}

	/**
	 * Removes the sez zone general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress remove(long sezZoneGenBussAddressId)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		return remove((Serializable)sezZoneGenBussAddressId);
	}

	/**
	 * Removes the sez zone general bussiness address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address that was removed
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress remove(Serializable primaryKey)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		Session session = null;

		try {
			session = openSession();

			SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
				(SezZoneGeneralBussinessAddress)session.get(
					SezZoneGeneralBussinessAddressImpl.class, primaryKey);

			if (sezZoneGeneralBussinessAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezZoneGeneralBussinessAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezZoneGeneralBussinessAddress);
		}
		catch (NoSuchSezZoneGeneralBussinessAddressException
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
	protected SezZoneGeneralBussinessAddress removeImpl(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezZoneGeneralBussinessAddress)) {
				sezZoneGeneralBussinessAddress =
					(SezZoneGeneralBussinessAddress)session.get(
						SezZoneGeneralBussinessAddressImpl.class,
						sezZoneGeneralBussinessAddress.getPrimaryKeyObj());
			}

			if (sezZoneGeneralBussinessAddress != null) {
				session.delete(sezZoneGeneralBussinessAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezZoneGeneralBussinessAddress != null) {
			clearCache(sezZoneGeneralBussinessAddress);
		}

		return sezZoneGeneralBussinessAddress;
	}

	@Override
	public SezZoneGeneralBussinessAddress updateImpl(
		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress) {

		boolean isNew = sezZoneGeneralBussinessAddress.isNew();

		if (!(sezZoneGeneralBussinessAddress instanceof
				SezZoneGeneralBussinessAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezZoneGeneralBussinessAddress.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezZoneGeneralBussinessAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezZoneGeneralBussinessAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezZoneGeneralBussinessAddress implementation " +
					sezZoneGeneralBussinessAddress.getClass());
		}

		SezZoneGeneralBussinessAddressModelImpl
			sezZoneGeneralBussinessAddressModelImpl =
				(SezZoneGeneralBussinessAddressModelImpl)
					sezZoneGeneralBussinessAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezZoneGeneralBussinessAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezZoneGeneralBussinessAddress.setCreateDate(date);
			}
			else {
				sezZoneGeneralBussinessAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezZoneGeneralBussinessAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezZoneGeneralBussinessAddress.setModifiedDate(date);
			}
			else {
				sezZoneGeneralBussinessAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezZoneGeneralBussinessAddress);
			}
			else {
				sezZoneGeneralBussinessAddress =
					(SezZoneGeneralBussinessAddress)session.merge(
						sezZoneGeneralBussinessAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezZoneGeneralBussinessAddressImpl.class,
			sezZoneGeneralBussinessAddressModelImpl, false, true);

		cacheUniqueFindersCache(sezZoneGeneralBussinessAddressModelImpl);

		if (isNew) {
			sezZoneGeneralBussinessAddress.setNew(false);
		}

		sezZoneGeneralBussinessAddress.resetOriginalValues();

		return sezZoneGeneralBussinessAddress;
	}

	/**
	 * Returns the sez zone general bussiness address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress =
			fetchByPrimaryKey(primaryKey);

		if (sezZoneGeneralBussinessAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezZoneGeneralBussinessAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezZoneGeneralBussinessAddress;
	}

	/**
	 * Returns the sez zone general bussiness address with the primary key or throws a <code>NoSuchSezZoneGeneralBussinessAddressException</code> if it could not be found.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address
	 * @throws NoSuchSezZoneGeneralBussinessAddressException if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress findByPrimaryKey(
			long sezZoneGenBussAddressId)
		throws NoSuchSezZoneGeneralBussinessAddressException {

		return findByPrimaryKey((Serializable)sezZoneGenBussAddressId);
	}

	/**
	 * Returns the sez zone general bussiness address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezZoneGenBussAddressId the primary key of the sez zone general bussiness address
	 * @return the sez zone general bussiness address, or <code>null</code> if a sez zone general bussiness address with the primary key could not be found
	 */
	@Override
	public SezZoneGeneralBussinessAddress fetchByPrimaryKey(
		long sezZoneGenBussAddressId) {

		return fetchByPrimaryKey((Serializable)sezZoneGenBussAddressId);
	}

	/**
	 * Returns all the sez zone general bussiness addresses.
	 *
	 * @return the sez zone general bussiness addresses
	 */
	@Override
	public List<SezZoneGeneralBussinessAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @return the range of sez zone general bussiness addresses
	 */
	@Override
	public List<SezZoneGeneralBussinessAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez zone general bussiness addresses
	 */
	@Override
	public List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezZoneGeneralBussinessAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez zone general bussiness addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezZoneGeneralBussinessAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone general bussiness addresses
	 * @param end the upper bound of the range of sez zone general bussiness addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez zone general bussiness addresses
	 */
	@Override
	public List<SezZoneGeneralBussinessAddress> findAll(
		int start, int end,
		OrderByComparator<SezZoneGeneralBussinessAddress> orderByComparator,
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

		List<SezZoneGeneralBussinessAddress> list = null;

		if (useFinderCache) {
			list = (List<SezZoneGeneralBussinessAddress>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS;

				sql = sql.concat(
					SezZoneGeneralBussinessAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezZoneGeneralBussinessAddress>)QueryUtil.list(
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
	 * Removes all the sez zone general bussiness addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress :
				findAll()) {

			remove(sezZoneGeneralBussinessAddress);
		}
	}

	/**
	 * Returns the number of sez zone general bussiness addresses.
	 *
	 * @return the number of sez zone general bussiness addresses
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
					_SQL_COUNT_SEZZONEGENERALBUSSINESSADDRESS);

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
		return "sezZoneGenBussAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezZoneGeneralBussinessAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez zone general bussiness address persistence.
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
			new String[] {"sezZoneGeneralBusinessInfoId", "addresstype"}, true);

		_finderPathCountBygetSezStatusByAddressType_GBI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAddressType_GBI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"sezZoneGeneralBusinessInfoId", "addresstype"},
			false);

		SezZoneGeneralBussinessAddressUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezZoneGeneralBussinessAddressUtil.setPersistence(null);

		entityCache.removeCache(
			SezZoneGeneralBussinessAddressImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS =
		"SELECT sezZoneGeneralBussinessAddress FROM SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress";

	private static final String
		_SQL_SELECT_SEZZONEGENERALBUSSINESSADDRESS_WHERE =
			"SELECT sezZoneGeneralBussinessAddress FROM SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress WHERE ";

	private static final String _SQL_COUNT_SEZZONEGENERALBUSSINESSADDRESS =
		"SELECT COUNT(sezZoneGeneralBussinessAddress) FROM SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress";

	private static final String
		_SQL_COUNT_SEZZONEGENERALBUSSINESSADDRESS_WHERE =
			"SELECT COUNT(sezZoneGeneralBussinessAddress) FROM SezZoneGeneralBussinessAddress sezZoneGeneralBussinessAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezZoneGeneralBussinessAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezZoneGeneralBussinessAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezZoneGeneralBussinessAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezZoneGeneralBussinessAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}