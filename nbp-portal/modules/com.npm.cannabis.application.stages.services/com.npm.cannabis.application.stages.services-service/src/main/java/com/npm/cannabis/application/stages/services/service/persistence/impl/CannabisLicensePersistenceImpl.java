/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service.persistence.impl;

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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisLicenseException;
import com.npm.cannabis.application.stages.services.model.CannabisLicense;
import com.npm.cannabis.application.stages.services.model.CannabisLicenseTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisLicenseModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicensePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisLicenseUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

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
 * The persistence implementation for the cannabis license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisLicensePersistence.class)
public class CannabisLicensePersistenceImpl
	extends BasePersistenceImpl<CannabisLicense>
	implements CannabisLicensePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisLicenseUtil</code> to access the cannabis license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisLicenseImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCL_CAI;
	private FinderPath _finderPathCountBygetCL_CAI;

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense findBygetCL_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = fetchBygetCL_CAI(
			cannabisApplicationId);

		if (cannabisLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisLicenseException(sb.toString());
		}

		return cannabisLicense;
	}

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense fetchBygetCL_CAI(long cannabisApplicationId) {
		return fetchBygetCL_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense fetchBygetCL_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCL_CAI, finderArgs, this);
		}

		if (result instanceof CannabisLicense) {
			CannabisLicense cannabisLicense = (CannabisLicense)result;

			if (cannabisApplicationId !=
					cannabisLicense.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISLICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETCL_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCL_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									cannabisApplicationId
								};
							}

							_log.warn(
								"CannabisLicensePersistenceImpl.fetchBygetCL_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisLicense cannabisLicense = list.get(0);

					result = cannabisLicense;

					cacheResult(cannabisLicense);
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
			return (CannabisLicense)result;
		}
	}

	/**
	 * Removes the cannabis license where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis license that was removed
	 */
	@Override
	public CannabisLicense removeBygetCL_CAI(long cannabisApplicationId)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = findBygetCL_CAI(
			cannabisApplicationId);

		return remove(cannabisLicense);
	}

	/**
	 * Returns the number of cannabis licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis licenses
	 */
	@Override
	public int countBygetCL_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCL_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETCL_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCL_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisLicense.cannabisApplicationId = ?";

	private FinderPath _finderPathFetchBygetCL_CaseId;
	private FinderPath _finderPathCountBygetCL_CaseId;

	/**
	 * Returns the cannabis license where caseId = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense findBygetCL_CaseId(String caseId)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = fetchBygetCL_CaseId(caseId);

		if (cannabisLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisLicenseException(sb.toString());
		}

		return cannabisLicense;
	}

	/**
	 * Returns the cannabis license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense fetchBygetCL_CaseId(String caseId) {
		return fetchBygetCL_CaseId(caseId, true);
	}

	/**
	 * Returns the cannabis license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense fetchBygetCL_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCL_CaseId, finderArgs, this);
		}

		if (result instanceof CannabisLicense) {
			CannabisLicense cannabisLicense = (CannabisLicense)result;

			if (!Objects.equals(caseId, cannabisLicense.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCL_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCL_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<CannabisLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCL_CaseId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"CannabisLicensePersistenceImpl.fetchBygetCL_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisLicense cannabisLicense = list.get(0);

					result = cannabisLicense;

					cacheResult(cannabisLicense);
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
			return (CannabisLicense)result;
		}
	}

	/**
	 * Removes the cannabis license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis license that was removed
	 */
	@Override
	public CannabisLicense removeBygetCL_CaseId(String caseId)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = findBygetCL_CaseId(caseId);

		return remove(cannabisLicense);
	}

	/**
	 * Returns the number of cannabis licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis licenses
	 */
	@Override
	public int countBygetCL_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCL_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCL_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCL_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
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

	private static final String _FINDER_COLUMN_GETCL_CASEID_CASEID_2 =
		"cannabisLicense.caseId = ?";

	private static final String _FINDER_COLUMN_GETCL_CASEID_CASEID_3 =
		"(cannabisLicense.caseId IS NULL OR cannabisLicense.caseId = '')";

	private FinderPath _finderPathFetchBygetCL_LN;
	private FinderPath _finderPathCountBygetCL_LN;

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching cannabis license
	 * @throws NoSuchCannabisLicenseException if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense findBygetCL_LN(String licenseNumber)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = fetchBygetCL_LN(licenseNumber);

		if (cannabisLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("licenseNumber=");
			sb.append(licenseNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisLicenseException(sb.toString());
		}

		return cannabisLicense;
	}

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense fetchBygetCL_LN(String licenseNumber) {
		return fetchBygetCL_LN(licenseNumber, true);
	}

	/**
	 * Returns the cannabis license where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis license, or <code>null</code> if a matching cannabis license could not be found
	 */
	@Override
	public CannabisLicense fetchBygetCL_LN(
		String licenseNumber, boolean useFinderCache) {

		licenseNumber = Objects.toString(licenseNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {licenseNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCL_LN, finderArgs, this);
		}

		if (result instanceof CannabisLicense) {
			CannabisLicense cannabisLicense = (CannabisLicense)result;

			if (!Objects.equals(
					licenseNumber, cannabisLicense.getLicenseNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISLICENSE_WHERE);

			boolean bindLicenseNumber = false;

			if (licenseNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCL_LN_LICENSENUMBER_3);
			}
			else {
				bindLicenseNumber = true;

				sb.append(_FINDER_COLUMN_GETCL_LN_LICENSENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseNumber) {
					queryPos.add(licenseNumber);
				}

				List<CannabisLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCL_LN, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {licenseNumber};
							}

							_log.warn(
								"CannabisLicensePersistenceImpl.fetchBygetCL_LN(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisLicense cannabisLicense = list.get(0);

					result = cannabisLicense;

					cacheResult(cannabisLicense);
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
			return (CannabisLicense)result;
		}
	}

	/**
	 * Removes the cannabis license where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the cannabis license that was removed
	 */
	@Override
	public CannabisLicense removeBygetCL_LN(String licenseNumber)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = findBygetCL_LN(licenseNumber);

		return remove(cannabisLicense);
	}

	/**
	 * Returns the number of cannabis licenses where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching cannabis licenses
	 */
	@Override
	public int countBygetCL_LN(String licenseNumber) {
		licenseNumber = Objects.toString(licenseNumber, "");

		FinderPath finderPath = _finderPathCountBygetCL_LN;

		Object[] finderArgs = new Object[] {licenseNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISLICENSE_WHERE);

			boolean bindLicenseNumber = false;

			if (licenseNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCL_LN_LICENSENUMBER_3);
			}
			else {
				bindLicenseNumber = true;

				sb.append(_FINDER_COLUMN_GETCL_LN_LICENSENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseNumber) {
					queryPos.add(licenseNumber);
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

	private static final String _FINDER_COLUMN_GETCL_LN_LICENSENUMBER_2 =
		"cannabisLicense.licenseNumber = ?";

	private static final String _FINDER_COLUMN_GETCL_LN_LICENSENUMBER_3 =
		"(cannabisLicense.licenseNumber IS NULL OR cannabisLicense.licenseNumber = '')";

	public CannabisLicensePersistenceImpl() {
		setModelClass(CannabisLicense.class);

		setModelImplClass(CannabisLicenseImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisLicenseTable.INSTANCE);
	}

	/**
	 * Caches the cannabis license in the entity cache if it is enabled.
	 *
	 * @param cannabisLicense the cannabis license
	 */
	@Override
	public void cacheResult(CannabisLicense cannabisLicense) {
		entityCache.putResult(
			CannabisLicenseImpl.class, cannabisLicense.getPrimaryKey(),
			cannabisLicense);

		finderCache.putResult(
			_finderPathFetchBygetCL_CAI,
			new Object[] {cannabisLicense.getCannabisApplicationId()},
			cannabisLicense);

		finderCache.putResult(
			_finderPathFetchBygetCL_CaseId,
			new Object[] {cannabisLicense.getCaseId()}, cannabisLicense);

		finderCache.putResult(
			_finderPathFetchBygetCL_LN,
			new Object[] {cannabisLicense.getLicenseNumber()}, cannabisLicense);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisLicenses the cannabis licenses
	 */
	@Override
	public void cacheResult(List<CannabisLicense> cannabisLicenses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisLicenses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisLicense cannabisLicense : cannabisLicenses) {
			if (entityCache.getResult(
					CannabisLicenseImpl.class,
					cannabisLicense.getPrimaryKey()) == null) {

				cacheResult(cannabisLicense);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis licenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisLicenseImpl.class);

		finderCache.clearCache(CannabisLicenseImpl.class);
	}

	/**
	 * Clears the cache for the cannabis license.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisLicense cannabisLicense) {
		entityCache.removeResult(CannabisLicenseImpl.class, cannabisLicense);
	}

	@Override
	public void clearCache(List<CannabisLicense> cannabisLicenses) {
		for (CannabisLicense cannabisLicense : cannabisLicenses) {
			entityCache.removeResult(
				CannabisLicenseImpl.class, cannabisLicense);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisLicenseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CannabisLicenseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisLicenseModelImpl cannabisLicenseModelImpl) {

		Object[] args = new Object[] {
			cannabisLicenseModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCL_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCL_CAI, args, cannabisLicenseModelImpl);

		args = new Object[] {cannabisLicenseModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetCL_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCL_CaseId, args, cannabisLicenseModelImpl);

		args = new Object[] {cannabisLicenseModelImpl.getLicenseNumber()};

		finderCache.putResult(
			_finderPathCountBygetCL_LN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCL_LN, args, cannabisLicenseModelImpl);
	}

	/**
	 * Creates a new cannabis license with the primary key. Does not add the cannabis license to the database.
	 *
	 * @param cannabisLicenseId the primary key for the new cannabis license
	 * @return the new cannabis license
	 */
	@Override
	public CannabisLicense create(long cannabisLicenseId) {
		CannabisLicense cannabisLicense = new CannabisLicenseImpl();

		cannabisLicense.setNew(true);
		cannabisLicense.setPrimaryKey(cannabisLicenseId);

		cannabisLicense.setCompanyId(CompanyThreadLocal.getCompanyId());

		return cannabisLicense;
	}

	/**
	 * Removes the cannabis license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license that was removed
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	@Override
	public CannabisLicense remove(long cannabisLicenseId)
		throws NoSuchCannabisLicenseException {

		return remove((Serializable)cannabisLicenseId);
	}

	/**
	 * Removes the cannabis license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis license
	 * @return the cannabis license that was removed
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	@Override
	public CannabisLicense remove(Serializable primaryKey)
		throws NoSuchCannabisLicenseException {

		Session session = null;

		try {
			session = openSession();

			CannabisLicense cannabisLicense = (CannabisLicense)session.get(
				CannabisLicenseImpl.class, primaryKey);

			if (cannabisLicense == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisLicenseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisLicense);
		}
		catch (NoSuchCannabisLicenseException noSuchEntityException) {
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
	protected CannabisLicense removeImpl(CannabisLicense cannabisLicense) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisLicense)) {
				cannabisLicense = (CannabisLicense)session.get(
					CannabisLicenseImpl.class,
					cannabisLicense.getPrimaryKeyObj());
			}

			if (cannabisLicense != null) {
				session.delete(cannabisLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisLicense != null) {
			clearCache(cannabisLicense);
		}

		return cannabisLicense;
	}

	@Override
	public CannabisLicense updateImpl(CannabisLicense cannabisLicense) {
		boolean isNew = cannabisLicense.isNew();

		if (!(cannabisLicense instanceof CannabisLicenseModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisLicense.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisLicense);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisLicense proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisLicense implementation " +
					cannabisLicense.getClass());
		}

		CannabisLicenseModelImpl cannabisLicenseModelImpl =
			(CannabisLicenseModelImpl)cannabisLicense;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisLicense.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisLicense.setCreateDate(date);
			}
			else {
				cannabisLicense.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisLicenseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisLicense.setModifiedDate(date);
			}
			else {
				cannabisLicense.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisLicense);
			}
			else {
				cannabisLicense = (CannabisLicense)session.merge(
					cannabisLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisLicenseImpl.class, cannabisLicenseModelImpl, false, true);

		cacheUniqueFindersCache(cannabisLicenseModelImpl);

		if (isNew) {
			cannabisLicense.setNew(false);
		}

		cannabisLicense.resetOriginalValues();

		return cannabisLicense;
	}

	/**
	 * Returns the cannabis license with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis license
	 * @return the cannabis license
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	@Override
	public CannabisLicense findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisLicenseException {

		CannabisLicense cannabisLicense = fetchByPrimaryKey(primaryKey);

		if (cannabisLicense == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisLicenseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisLicense;
	}

	/**
	 * Returns the cannabis license with the primary key or throws a <code>NoSuchCannabisLicenseException</code> if it could not be found.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license
	 * @throws NoSuchCannabisLicenseException if a cannabis license with the primary key could not be found
	 */
	@Override
	public CannabisLicense findByPrimaryKey(long cannabisLicenseId)
		throws NoSuchCannabisLicenseException {

		return findByPrimaryKey((Serializable)cannabisLicenseId);
	}

	/**
	 * Returns the cannabis license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisLicenseId the primary key of the cannabis license
	 * @return the cannabis license, or <code>null</code> if a cannabis license with the primary key could not be found
	 */
	@Override
	public CannabisLicense fetchByPrimaryKey(long cannabisLicenseId) {
		return fetchByPrimaryKey((Serializable)cannabisLicenseId);
	}

	/**
	 * Returns all the cannabis licenses.
	 *
	 * @return the cannabis licenses
	 */
	@Override
	public List<CannabisLicense> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @return the range of cannabis licenses
	 */
	@Override
	public List<CannabisLicense> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis licenses
	 */
	@Override
	public List<CannabisLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisLicense> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis licenses
	 * @param end the upper bound of the range of cannabis licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis licenses
	 */
	@Override
	public List<CannabisLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisLicense> orderByComparator,
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

		List<CannabisLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisLicense>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISLICENSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISLICENSE;

				sql = sql.concat(CannabisLicenseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisLicense>)QueryUtil.list(
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
	 * Removes all the cannabis licenses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisLicense cannabisLicense : findAll()) {
			remove(cannabisLicense);
		}
	}

	/**
	 * Returns the number of cannabis licenses.
	 *
	 * @return the number of cannabis licenses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_CANNABISLICENSE);

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
		return "cannabisLicenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISLICENSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisLicenseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis license persistence.
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

		_finderPathFetchBygetCL_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCL_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCL_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCL_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathFetchBygetCL_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCL_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCL_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCL_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetCL_LN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCL_LN",
			new String[] {String.class.getName()},
			new String[] {"licenseNumber"}, true);

		_finderPathCountBygetCL_LN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCL_LN",
			new String[] {String.class.getName()},
			new String[] {"licenseNumber"}, false);

		CannabisLicenseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisLicenseUtil.setPersistence(null);

		entityCache.removeCache(CannabisLicenseImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISLICENSE =
		"SELECT cannabisLicense FROM CannabisLicense cannabisLicense";

	private static final String _SQL_SELECT_CANNABISLICENSE_WHERE =
		"SELECT cannabisLicense FROM CannabisLicense cannabisLicense WHERE ";

	private static final String _SQL_COUNT_CANNABISLICENSE =
		"SELECT COUNT(cannabisLicense) FROM CannabisLicense cannabisLicense";

	private static final String _SQL_COUNT_CANNABISLICENSE_WHERE =
		"SELECT COUNT(cannabisLicense) FROM CannabisLicense cannabisLicense WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "cannabisLicense.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisLicense exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisLicense exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisLicensePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}