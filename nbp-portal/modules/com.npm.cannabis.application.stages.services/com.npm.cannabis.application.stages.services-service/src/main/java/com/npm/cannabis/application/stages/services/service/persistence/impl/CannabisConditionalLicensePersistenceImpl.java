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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisConditionalLicenseException;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicense;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicenseTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicenseModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisConditionalLicensePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisConditionalLicenseUtil;
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
 * The persistence implementation for the cannabis conditional license service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisConditionalLicensePersistence.class)
public class CannabisConditionalLicensePersistenceImpl
	extends BasePersistenceImpl<CannabisConditionalLicense>
	implements CannabisConditionalLicensePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisConditionalLicenseUtil</code> to access the cannabis conditional license persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisConditionalLicenseImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCCL_CAI;
	private FinderPath _finderPathCountBygetCCL_CAI;

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense findBygetCCL_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			fetchBygetCCL_CAI(cannabisApplicationId);

		if (cannabisConditionalLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisConditionalLicenseException(sb.toString());
		}

		return cannabisConditionalLicense;
	}

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchBygetCCL_CAI(
		long cannabisApplicationId) {

		return fetchBygetCCL_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis conditional license where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchBygetCCL_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCCL_CAI, finderArgs, this);
		}

		if (result instanceof CannabisConditionalLicense) {
			CannabisConditionalLicense cannabisConditionalLicense =
				(CannabisConditionalLicense)result;

			if (cannabisApplicationId !=
					cannabisConditionalLicense.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETCCL_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisConditionalLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCCL_CAI, finderArgs, list);
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
								"CannabisConditionalLicensePersistenceImpl.fetchBygetCCL_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisConditionalLicense cannabisConditionalLicense =
						list.get(0);

					result = cannabisConditionalLicense;

					cacheResult(cannabisConditionalLicense);
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
			return (CannabisConditionalLicense)result;
		}
	}

	/**
	 * Removes the cannabis conditional license where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis conditional license that was removed
	 */
	@Override
	public CannabisConditionalLicense removeBygetCCL_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			findBygetCCL_CAI(cannabisApplicationId);

		return remove(cannabisConditionalLicense);
	}

	/**
	 * Returns the number of cannabis conditional licenses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional licenses
	 */
	@Override
	public int countBygetCCL_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCCL_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSE_WHERE);

			sb.append(_FINDER_COLUMN_GETCCL_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCCL_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisConditionalLicense.cannabisApplicationId = ?";

	private FinderPath _finderPathFetchBygetCCL_CaseId;
	private FinderPath _finderPathCountBygetCCL_CaseId;

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense findBygetCCL_CaseId(String caseId)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			fetchBygetCCL_CaseId(caseId);

		if (cannabisConditionalLicense == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisConditionalLicenseException(sb.toString());
		}

		return cannabisConditionalLicense;
	}

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchBygetCCL_CaseId(String caseId) {
		return fetchBygetCCL_CaseId(caseId, true);
	}

	/**
	 * Returns the cannabis conditional license where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchBygetCCL_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCCL_CaseId, finderArgs, this);
		}

		if (result instanceof CannabisConditionalLicense) {
			CannabisConditionalLicense cannabisConditionalLicense =
				(CannabisConditionalLicense)result;

			if (!Objects.equals(
					caseId, cannabisConditionalLicense.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCCL_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCCL_CASEID_CASEID_2);
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

				List<CannabisConditionalLicense> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCCL_CaseId, finderArgs, list);
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
								"CannabisConditionalLicensePersistenceImpl.fetchBygetCCL_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisConditionalLicense cannabisConditionalLicense =
						list.get(0);

					result = cannabisConditionalLicense;

					cacheResult(cannabisConditionalLicense);
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
			return (CannabisConditionalLicense)result;
		}
	}

	/**
	 * Removes the cannabis conditional license where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis conditional license that was removed
	 */
	@Override
	public CannabisConditionalLicense removeBygetCCL_CaseId(String caseId)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			findBygetCCL_CaseId(caseId);

		return remove(cannabisConditionalLicense);
	}

	/**
	 * Returns the number of cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional licenses
	 */
	@Override
	public int countBygetCCL_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCCL_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCCL_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCCL_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCCL_CASEID_CASEID_2 =
		"cannabisConditionalLicense.caseId = ?";

	private static final String _FINDER_COLUMN_GETCCL_CASEID_CASEID_3 =
		"(cannabisConditionalLicense.caseId IS NULL OR cannabisConditionalLicense.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCCL_BycaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCCL_BycaseId;
	private FinderPath _finderPathCountBygetCCL_BycaseId;

	/**
	 * Returns all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId) {

		return findBygetCCL_BycaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of matching cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end) {

		return findBygetCCL_BycaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return findBygetCCL_BycaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findBygetCCL_BycaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCCL_BycaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCCL_BycaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisConditionalLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisConditionalLicense>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConditionalLicense cannabisConditionalLicense :
						list) {

					if (!caseId.equals(
							cannabisConditionalLicense.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCCL_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCCL_BYCASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisConditionalLicenseModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisConditionalLicense>)QueryUtil.list(
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
	 * Returns the first cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense findBygetCCL_BycaseId_First(
			String caseId,
			OrderByComparator<CannabisConditionalLicense> orderByComparator)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			fetchBygetCCL_BycaseId_First(caseId, orderByComparator);

		if (cannabisConditionalLicense != null) {
			return cannabisConditionalLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicenseException(sb.toString());
	}

	/**
	 * Returns the first cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchBygetCCL_BycaseId_First(
		String caseId,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		List<CannabisConditionalLicense> list = findBygetCCL_BycaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense findBygetCCL_BycaseId_Last(
			String caseId,
			OrderByComparator<CannabisConditionalLicense> orderByComparator)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			fetchBygetCCL_BycaseId_Last(caseId, orderByComparator);

		if (cannabisConditionalLicense != null) {
			return cannabisConditionalLicense;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicenseException(sb.toString());
	}

	/**
	 * Returns the last cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license, or <code>null</code> if a matching cannabis conditional license could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchBygetCCL_BycaseId_Last(
		String caseId,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		int count = countBygetCCL_BycaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisConditionalLicense> list = findBygetCCL_BycaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis conditional licenses before and after the current cannabis conditional license in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the current cannabis conditional license
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicense[] findBygetCCL_BycaseId_PrevAndNext(
			long cannabisConditonalLicenseId, String caseId,
			OrderByComparator<CannabisConditionalLicense> orderByComparator)
		throws NoSuchCannabisConditionalLicenseException {

		caseId = Objects.toString(caseId, "");

		CannabisConditionalLicense cannabisConditionalLicense =
			findByPrimaryKey(cannabisConditonalLicenseId);

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicense[] array =
				new CannabisConditionalLicenseImpl[3];

			array[0] = getBygetCCL_BycaseId_PrevAndNext(
				session, cannabisConditionalLicense, caseId, orderByComparator,
				true);

			array[1] = cannabisConditionalLicense;

			array[2] = getBygetCCL_BycaseId_PrevAndNext(
				session, cannabisConditionalLicense, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisConditionalLicense getBygetCCL_BycaseId_PrevAndNext(
		Session session, CannabisConditionalLicense cannabisConditionalLicense,
		String caseId,
		OrderByComparator<CannabisConditionalLicense> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCCL_BYCASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCCL_BYCASEID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(CannabisConditionalLicenseModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisConditionalLicense)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConditionalLicense> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis conditional licenses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCCL_BycaseId(String caseId) {
		for (CannabisConditionalLicense cannabisConditionalLicense :
				findBygetCCL_BycaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisConditionalLicense);
		}
	}

	/**
	 * Returns the number of cannabis conditional licenses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional licenses
	 */
	@Override
	public int countBygetCCL_BycaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCCL_BycaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCCL_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCCL_BYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCCL_BYCASEID_CASEID_2 =
		"cannabisConditionalLicense.caseId = ?";

	private static final String _FINDER_COLUMN_GETCCL_BYCASEID_CASEID_3 =
		"(cannabisConditionalLicense.caseId IS NULL OR cannabisConditionalLicense.caseId = '')";

	public CannabisConditionalLicensePersistenceImpl() {
		setModelClass(CannabisConditionalLicense.class);

		setModelImplClass(CannabisConditionalLicenseImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisConditionalLicenseTable.INSTANCE);
	}

	/**
	 * Caches the cannabis conditional license in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicense the cannabis conditional license
	 */
	@Override
	public void cacheResult(
		CannabisConditionalLicense cannabisConditionalLicense) {

		entityCache.putResult(
			CannabisConditionalLicenseImpl.class,
			cannabisConditionalLicense.getPrimaryKey(),
			cannabisConditionalLicense);

		finderCache.putResult(
			_finderPathFetchBygetCCL_CAI,
			new Object[] {
				cannabisConditionalLicense.getCannabisApplicationId()
			},
			cannabisConditionalLicense);

		finderCache.putResult(
			_finderPathFetchBygetCCL_CaseId,
			new Object[] {cannabisConditionalLicense.getCaseId()},
			cannabisConditionalLicense);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis conditional licenses in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicenses the cannabis conditional licenses
	 */
	@Override
	public void cacheResult(
		List<CannabisConditionalLicense> cannabisConditionalLicenses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisConditionalLicenses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisConditionalLicense cannabisConditionalLicense :
				cannabisConditionalLicenses) {

			if (entityCache.getResult(
					CannabisConditionalLicenseImpl.class,
					cannabisConditionalLicense.getPrimaryKey()) == null) {

				cacheResult(cannabisConditionalLicense);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis conditional licenses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisConditionalLicenseImpl.class);

		finderCache.clearCache(CannabisConditionalLicenseImpl.class);
	}

	/**
	 * Clears the cache for the cannabis conditional license.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisConditionalLicense cannabisConditionalLicense) {

		entityCache.removeResult(
			CannabisConditionalLicenseImpl.class, cannabisConditionalLicense);
	}

	@Override
	public void clearCache(
		List<CannabisConditionalLicense> cannabisConditionalLicenses) {

		for (CannabisConditionalLicense cannabisConditionalLicense :
				cannabisConditionalLicenses) {

			entityCache.removeResult(
				CannabisConditionalLicenseImpl.class,
				cannabisConditionalLicense);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisConditionalLicenseImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisConditionalLicenseImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisConditionalLicenseModelImpl
			cannabisConditionalLicenseModelImpl) {

		Object[] args = new Object[] {
			cannabisConditionalLicenseModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCCL_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCCL_CAI, args,
			cannabisConditionalLicenseModelImpl);

		args = new Object[] {cannabisConditionalLicenseModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetCCL_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCCL_CaseId, args,
			cannabisConditionalLicenseModelImpl);
	}

	/**
	 * Creates a new cannabis conditional license with the primary key. Does not add the cannabis conditional license to the database.
	 *
	 * @param cannabisConditonalLicenseId the primary key for the new cannabis conditional license
	 * @return the new cannabis conditional license
	 */
	@Override
	public CannabisConditionalLicense create(long cannabisConditonalLicenseId) {
		CannabisConditionalLicense cannabisConditionalLicense =
			new CannabisConditionalLicenseImpl();

		cannabisConditionalLicense.setNew(true);
		cannabisConditionalLicense.setPrimaryKey(cannabisConditonalLicenseId);

		cannabisConditionalLicense.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisConditionalLicense;
	}

	/**
	 * Removes the cannabis conditional license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicense remove(long cannabisConditonalLicenseId)
		throws NoSuchCannabisConditionalLicenseException {

		return remove((Serializable)cannabisConditonalLicenseId);
	}

	/**
	 * Removes the cannabis conditional license with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis conditional license
	 * @return the cannabis conditional license that was removed
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicense remove(Serializable primaryKey)
		throws NoSuchCannabisConditionalLicenseException {

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicense cannabisConditionalLicense =
				(CannabisConditionalLicense)session.get(
					CannabisConditionalLicenseImpl.class, primaryKey);

			if (cannabisConditionalLicense == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisConditionalLicenseException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisConditionalLicense);
		}
		catch (NoSuchCannabisConditionalLicenseException
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
	protected CannabisConditionalLicense removeImpl(
		CannabisConditionalLicense cannabisConditionalLicense) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisConditionalLicense)) {
				cannabisConditionalLicense =
					(CannabisConditionalLicense)session.get(
						CannabisConditionalLicenseImpl.class,
						cannabisConditionalLicense.getPrimaryKeyObj());
			}

			if (cannabisConditionalLicense != null) {
				session.delete(cannabisConditionalLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisConditionalLicense != null) {
			clearCache(cannabisConditionalLicense);
		}

		return cannabisConditionalLicense;
	}

	@Override
	public CannabisConditionalLicense updateImpl(
		CannabisConditionalLicense cannabisConditionalLicense) {

		boolean isNew = cannabisConditionalLicense.isNew();

		if (!(cannabisConditionalLicense instanceof
				CannabisConditionalLicenseModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisConditionalLicense.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisConditionalLicense);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisConditionalLicense proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisConditionalLicense implementation " +
					cannabisConditionalLicense.getClass());
		}

		CannabisConditionalLicenseModelImpl
			cannabisConditionalLicenseModelImpl =
				(CannabisConditionalLicenseModelImpl)cannabisConditionalLicense;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisConditionalLicense.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisConditionalLicense.setCreateDate(date);
			}
			else {
				cannabisConditionalLicense.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisConditionalLicenseModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisConditionalLicense.setModifiedDate(date);
			}
			else {
				cannabisConditionalLicense.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisConditionalLicense);
			}
			else {
				cannabisConditionalLicense =
					(CannabisConditionalLicense)session.merge(
						cannabisConditionalLicense);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisConditionalLicenseImpl.class,
			cannabisConditionalLicenseModelImpl, false, true);

		cacheUniqueFindersCache(cannabisConditionalLicenseModelImpl);

		if (isNew) {
			cannabisConditionalLicense.setNew(false);
		}

		cannabisConditionalLicense.resetOriginalValues();

		return cannabisConditionalLicense;
	}

	/**
	 * Returns the cannabis conditional license with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis conditional license
	 * @return the cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicense findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisConditionalLicenseException {

		CannabisConditionalLicense cannabisConditionalLicense =
			fetchByPrimaryKey(primaryKey);

		if (cannabisConditionalLicense == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisConditionalLicenseException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisConditionalLicense;
	}

	/**
	 * Returns the cannabis conditional license with the primary key or throws a <code>NoSuchCannabisConditionalLicenseException</code> if it could not be found.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license
	 * @throws NoSuchCannabisConditionalLicenseException if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicense findByPrimaryKey(
			long cannabisConditonalLicenseId)
		throws NoSuchCannabisConditionalLicenseException {

		return findByPrimaryKey((Serializable)cannabisConditonalLicenseId);
	}

	/**
	 * Returns the cannabis conditional license with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisConditonalLicenseId the primary key of the cannabis conditional license
	 * @return the cannabis conditional license, or <code>null</code> if a cannabis conditional license with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicense fetchByPrimaryKey(
		long cannabisConditonalLicenseId) {

		return fetchByPrimaryKey((Serializable)cannabisConditonalLicenseId);
	}

	/**
	 * Returns all the cannabis conditional licenses.
	 *
	 * @return the cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @return the range of cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional licenses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicenseModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional licenses
	 * @param end the upper bound of the range of cannabis conditional licenses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis conditional licenses
	 */
	@Override
	public List<CannabisConditionalLicense> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicense> orderByComparator,
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

		List<CannabisConditionalLicense> list = null;

		if (useFinderCache) {
			list = (List<CannabisConditionalLicense>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISCONDITIONALLICENSE;

				sql = sql.concat(
					CannabisConditionalLicenseModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisConditionalLicense>)QueryUtil.list(
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
	 * Removes all the cannabis conditional licenses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisConditionalLicense cannabisConditionalLicense :
				findAll()) {

			remove(cannabisConditionalLicense);
		}
	}

	/**
	 * Returns the number of cannabis conditional licenses.
	 *
	 * @return the number of cannabis conditional licenses
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
					_SQL_COUNT_CANNABISCONDITIONALLICENSE);

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
		return "cannabisConditonalLicenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISCONDITIONALLICENSE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisConditionalLicenseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis conditional license persistence.
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

		_finderPathFetchBygetCCL_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCCL_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCCL_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCCL_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathFetchBygetCCL_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCCL_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCCL_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCCL_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCCL_BycaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCCL_BycaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCCL_BycaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCCL_BycaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCCL_BycaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCCL_BycaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		CannabisConditionalLicenseUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisConditionalLicenseUtil.setPersistence(null);

		entityCache.removeCache(CannabisConditionalLicenseImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISCONDITIONALLICENSE =
		"SELECT cannabisConditionalLicense FROM CannabisConditionalLicense cannabisConditionalLicense";

	private static final String _SQL_SELECT_CANNABISCONDITIONALLICENSE_WHERE =
		"SELECT cannabisConditionalLicense FROM CannabisConditionalLicense cannabisConditionalLicense WHERE ";

	private static final String _SQL_COUNT_CANNABISCONDITIONALLICENSE =
		"SELECT COUNT(cannabisConditionalLicense) FROM CannabisConditionalLicense cannabisConditionalLicense";

	private static final String _SQL_COUNT_CANNABISCONDITIONALLICENSE_WHERE =
		"SELECT COUNT(cannabisConditionalLicense) FROM CannabisConditionalLicense cannabisConditionalLicense WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisConditionalLicense.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisConditionalLicense exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisConditionalLicense exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisConditionalLicensePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}