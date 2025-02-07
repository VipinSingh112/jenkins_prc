/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service.persistence.impl;

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

import com.nbp.wra.stage.service.exception.NoSuchWRAApplicationDueDiligenceException;
import com.nbp.wra.stage.service.model.WRAApplicationDueDiligence;
import com.nbp.wra.stage.service.model.WRAApplicationDueDiligenceTable;
import com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceImpl;
import com.nbp.wra.stage.service.model.impl.WRAApplicationDueDiligenceModelImpl;
import com.nbp.wra.stage.service.service.persistence.WRAApplicationDueDiligencePersistence;
import com.nbp.wra.stage.service.service.persistence.WRAApplicationDueDiligenceUtil;
import com.nbp.wra.stage.service.service.persistence.impl.constants.WRA_STAGESPersistenceConstants;

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
 * The persistence implementation for the wra application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WRAApplicationDueDiligencePersistence.class)
public class WRAApplicationDueDiligencePersistenceImpl
	extends BasePersistenceImpl<WRAApplicationDueDiligence>
	implements WRAApplicationDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WRAApplicationDueDiligenceUtil</code> to access the wra application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WRAApplicationDueDiligenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRADD_By_CAI;
	private FinderPath _finderPathCountBygetWRADD_By_CAI;

	/**
	 * Returns the wra application due diligence where caseId = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRADD_By_CAI(String caseId)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRADD_By_CAI(caseId);

		if (wraApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
		}

		return wraApplicationDueDiligence;
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRADD_By_CAI(String caseId) {
		return fetchBygetWRADD_By_CAI(caseId, true);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRADD_By_CAI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRADD_By_CAI, finderArgs, this);
		}

		if (result instanceof WRAApplicationDueDiligence) {
			WRAApplicationDueDiligence wraApplicationDueDiligence =
				(WRAApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, wraApplicationDueDiligence.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRADD_BY_CAI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRADD_BY_CAI_CASEID_2);
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

				List<WRAApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRADD_By_CAI, finderArgs,
							list);
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
								"WRAApplicationDueDiligencePersistenceImpl.fetchBygetWRADD_By_CAI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplicationDueDiligence wraApplicationDueDiligence =
						list.get(0);

					result = wraApplicationDueDiligence;

					cacheResult(wraApplicationDueDiligence);
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
			return (WRAApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the wra application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application due diligence that was removed
	 */
	@Override
	public WRAApplicationDueDiligence removeBygetWRADD_By_CAI(String caseId)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			findBygetWRADD_By_CAI(caseId);

		return remove(wraApplicationDueDiligence);
	}

	/**
	 * Returns the number of wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application due diligences
	 */
	@Override
	public int countBygetWRADD_By_CAI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWRADD_By_CAI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRADD_BY_CAI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRADD_BY_CAI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRADD_BY_CAI_CASEID_2 =
		"wraApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRADD_BY_CAI_CASEID_3 =
		"(wraApplicationDueDiligence.caseId IS NULL OR wraApplicationDueDiligence.caseId = '')";

	private FinderPath _finderPathFetchBygetWRAADD_CAI;
	private FinderPath _finderPathCountBygetWRAADD_CAI;

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRAADD_CAI(long wraApplicationId)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRAADD_CAI(wraApplicationId);

		if (wraApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
		}

		return wraApplicationDueDiligence;
	}

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRAADD_CAI(
		long wraApplicationId) {

		return fetchBygetWRAADD_CAI(wraApplicationId, true);
	}

	/**
	 * Returns the wra application due diligence where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRAADD_CAI(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRAADD_CAI, finderArgs, this);
		}

		if (result instanceof WRAApplicationDueDiligence) {
			WRAApplicationDueDiligence wraApplicationDueDiligence =
				(WRAApplicationDueDiligence)result;

			if (wraApplicationId !=
					wraApplicationDueDiligence.getWraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETWRAADD_CAI_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<WRAApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRAADD_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"WRAApplicationDueDiligencePersistenceImpl.fetchBygetWRAADD_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplicationDueDiligence wraApplicationDueDiligence =
						list.get(0);

					result = wraApplicationDueDiligence;

					cacheResult(wraApplicationDueDiligence);
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
			return (WRAApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the wra application due diligence where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra application due diligence that was removed
	 */
	@Override
	public WRAApplicationDueDiligence removeBygetWRAADD_CAI(
			long wraApplicationId)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			findBygetWRAADD_CAI(wraApplicationId);

		return remove(wraApplicationDueDiligence);
	}

	/**
	 * Returns the number of wra application due diligences where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra application due diligences
	 */
	@Override
	public int countBygetWRAADD_CAI(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRAADD_CAI;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETWRAADD_CAI_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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
		_FINDER_COLUMN_GETWRAADD_CAI_WRAAPPLICATIONID_2 =
			"wraApplicationDueDiligence.wraApplicationId = ?";

	private FinderPath _finderPathFetchBygetWRAADD_CaseIdAgnecyName;
	private FinderPath _finderPathCountBygetWRAADD_CaseIdAgnecyName;

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRAADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRAADD_CaseIdAgnecyName(caseId, agencyName);

		if (wraApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", agencyName=");
			sb.append(agencyName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
		}

		return wraApplicationDueDiligence;
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return fetchBygetWRAADD_CaseIdAgnecyName(caseId, agencyName, true);
	}

	/**
	 * Returns the wra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		agencyName = Objects.toString(agencyName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, agencyName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRAADD_CaseIdAgnecyName, finderArgs, this);
		}

		if (result instanceof WRAApplicationDueDiligence) {
			WRAApplicationDueDiligence wraApplicationDueDiligence =
				(WRAApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, wraApplicationDueDiligence.getCaseId()) ||
				!Objects.equals(
					agencyName, wraApplicationDueDiligence.getAgencyName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(
					_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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

				if (bindAgencyName) {
					queryPos.add(agencyName);
				}

				List<WRAApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRAADD_CaseIdAgnecyName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, agencyName};
							}

							_log.warn(
								"WRAApplicationDueDiligencePersistenceImpl.fetchBygetWRAADD_CaseIdAgnecyName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplicationDueDiligence wraApplicationDueDiligence =
						list.get(0);

					result = wraApplicationDueDiligence;

					cacheResult(wraApplicationDueDiligence);
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
			return (WRAApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the wra application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the wra application due diligence that was removed
	 */
	@Override
	public WRAApplicationDueDiligence removeBygetWRAADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			findBygetWRAADD_CaseIdAgnecyName(caseId, agencyName);

		return remove(wraApplicationDueDiligence);
	}

	/**
	 * Returns the number of wra application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching wra application due diligences
	 */
	@Override
	public int countBygetWRAADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		caseId = Objects.toString(caseId, "");
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetWRAADD_CaseIdAgnecyName;

		Object[] finderArgs = new Object[] {caseId, agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(
					_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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

				if (bindAgencyName) {
					queryPos.add(agencyName);
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
		_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_CASEID_2 =
			"wraApplicationDueDiligence.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_CASEID_3 =
			"(wraApplicationDueDiligence.caseId IS NULL OR wraApplicationDueDiligence.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_AGENCYNAME_2 =
			"wraApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETWRAADD_CASEIDAGNECYNAME_AGENCYNAME_3 =
			"(wraApplicationDueDiligence.agencyName IS NULL OR wraApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetWRADD_AgnecyName;
	private FinderPath _finderPathWithoutPaginationFindBygetWRADD_AgnecyName;
	private FinderPath _finderPathCountBygetWRADD_AgnecyName;

	/**
	 * Returns all the wra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName) {

		return findBygetWRADD_AgnecyName(
			agencyName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end) {

		return findBygetWRADD_AgnecyName(agencyName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return findBygetWRADD_AgnecyName(
			agencyName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetWRADD_AgnecyName;
				finderArgs = new Object[] {agencyName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRADD_AgnecyName;
			finderArgs = new Object[] {
				agencyName, start, end, orderByComparator
			};
		}

		List<WRAApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<WRAApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAApplicationDueDiligence wraApplicationDueDiligence :
						list) {

					if (!agencyName.equals(
							wraApplicationDueDiligence.getAgencyName())) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAgencyName) {
					queryPos.add(agencyName);
				}

				list = (List<WRAApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRADD_AgnecyName_First(
			String agencyName,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRADD_AgnecyName_First(agencyName, orderByComparator);

		if (wraApplicationDueDiligence != null) {
			return wraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agencyName=");
		sb.append(agencyName);

		sb.append("}");

		throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRADD_AgnecyName_First(
		String agencyName,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		List<WRAApplicationDueDiligence> list = findBygetWRADD_AgnecyName(
			agencyName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRADD_AgnecyName_Last(
			String agencyName,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRADD_AgnecyName_Last(agencyName, orderByComparator);

		if (wraApplicationDueDiligence != null) {
			return wraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agencyName=");
		sb.append(agencyName);

		sb.append("}");

		throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRADD_AgnecyName_Last(
		String agencyName,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		int count = countBygetWRADD_AgnecyName(agencyName);

		if (count == 0) {
			return null;
		}

		List<WRAApplicationDueDiligence> list = findBygetWRADD_AgnecyName(
			agencyName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application due diligences before and after the current wra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the current wra application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence[] findBygetWRADD_AgnecyName_PrevAndNext(
			long wRAApplicationDueDiligenceId, String agencyName,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException {

		agencyName = Objects.toString(agencyName, "");

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			findByPrimaryKey(wRAApplicationDueDiligenceId);

		Session session = null;

		try {
			session = openSession();

			WRAApplicationDueDiligence[] array =
				new WRAApplicationDueDiligenceImpl[3];

			array[0] = getBygetWRADD_AgnecyName_PrevAndNext(
				session, wraApplicationDueDiligence, agencyName,
				orderByComparator, true);

			array[1] = wraApplicationDueDiligence;

			array[2] = getBygetWRADD_AgnecyName_PrevAndNext(
				session, wraApplicationDueDiligence, agencyName,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WRAApplicationDueDiligence getBygetWRADD_AgnecyName_PrevAndNext(
		Session session, WRAApplicationDueDiligence wraApplicationDueDiligence,
		String agencyName,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindAgencyName = false;

		if (agencyName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_3);
		}
		else {
			bindAgencyName = true;

			sb.append(_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_2);
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
			sb.append(WRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindAgencyName) {
			queryPos.add(agencyName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	@Override
	public void removeBygetWRADD_AgnecyName(String agencyName) {
		for (WRAApplicationDueDiligence wraApplicationDueDiligence :
				findBygetWRADD_AgnecyName(
					agencyName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of wra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching wra application due diligences
	 */
	@Override
	public int countBygetWRADD_AgnecyName(String agencyName) {
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetWRADD_AgnecyName;

		Object[] finderArgs = new Object[] {agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAgencyName) {
					queryPos.add(agencyName);
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
		_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_2 =
			"wraApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETWRADD_AGNECYNAME_AGENCYNAME_3 =
			"(wraApplicationDueDiligence.agencyName IS NULL OR wraApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetWRADD_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetWRADD_CaseId;
	private FinderPath _finderPathCountBygetWRADD_CaseId;

	/**
	 * Returns all the wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId) {

		return findBygetWRADD_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end) {

		return findBygetWRADD_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return findBygetWRADD_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findBygetWRADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWRADD_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRADD_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<WRAApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<WRAApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAApplicationDueDiligence wraApplicationDueDiligence :
						list) {

					if (!caseId.equals(
							wraApplicationDueDiligence.getCaseId())) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRADD_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<WRAApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRADD_CaseId_First(
			String caseId,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRADD_CaseId_First(caseId, orderByComparator);

		if (wraApplicationDueDiligence != null) {
			return wraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRADD_CaseId_First(
		String caseId,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		List<WRAApplicationDueDiligence> list = findBygetWRADD_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findBygetWRADD_CaseId_Last(
			String caseId,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchBygetWRADD_CaseId_Last(caseId, orderByComparator);

		if (wraApplicationDueDiligence != null) {
			return wraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchWRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application due diligence, or <code>null</code> if a matching wra application due diligence could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchBygetWRADD_CaseId_Last(
		String caseId,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		int count = countBygetWRADD_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<WRAApplicationDueDiligence> list = findBygetWRADD_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra application due diligences before and after the current wra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the current wra application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence[] findBygetWRADD_CaseId_PrevAndNext(
			long wRAApplicationDueDiligenceId, String caseId,
			OrderByComparator<WRAApplicationDueDiligence> orderByComparator)
		throws NoSuchWRAApplicationDueDiligenceException {

		caseId = Objects.toString(caseId, "");

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			findByPrimaryKey(wRAApplicationDueDiligenceId);

		Session session = null;

		try {
			session = openSession();

			WRAApplicationDueDiligence[] array =
				new WRAApplicationDueDiligenceImpl[3];

			array[0] = getBygetWRADD_CaseId_PrevAndNext(
				session, wraApplicationDueDiligence, caseId, orderByComparator,
				true);

			array[1] = wraApplicationDueDiligence;

			array[2] = getBygetWRADD_CaseId_PrevAndNext(
				session, wraApplicationDueDiligence, caseId, orderByComparator,
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

	protected WRAApplicationDueDiligence getBygetWRADD_CaseId_PrevAndNext(
		Session session, WRAApplicationDueDiligence wraApplicationDueDiligence,
		String caseId,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETWRADD_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETWRADD_CASEID_CASEID_2);
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
			sb.append(WRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						wraApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetWRADD_CaseId(String caseId) {
		for (WRAApplicationDueDiligence wraApplicationDueDiligence :
				findBygetWRADD_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of wra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra application due diligences
	 */
	@Override
	public int countBygetWRADD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWRADD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRADD_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRADD_CASEID_CASEID_2 =
		"wraApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRADD_CASEID_CASEID_3 =
		"(wraApplicationDueDiligence.caseId IS NULL OR wraApplicationDueDiligence.caseId = '')";

	public WRAApplicationDueDiligencePersistenceImpl() {
		setModelClass(WRAApplicationDueDiligence.class);

		setModelImplClass(WRAApplicationDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(WRAApplicationDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the wra application due diligence in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDueDiligence the wra application due diligence
	 */
	@Override
	public void cacheResult(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		entityCache.putResult(
			WRAApplicationDueDiligenceImpl.class,
			wraApplicationDueDiligence.getPrimaryKey(),
			wraApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetWRADD_By_CAI,
			new Object[] {wraApplicationDueDiligence.getCaseId()},
			wraApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetWRAADD_CAI,
			new Object[] {wraApplicationDueDiligence.getWraApplicationId()},
			wraApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetWRAADD_CaseIdAgnecyName,
			new Object[] {
				wraApplicationDueDiligence.getCaseId(),
				wraApplicationDueDiligence.getAgencyName()
			},
			wraApplicationDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra application due diligences in the entity cache if it is enabled.
	 *
	 * @param wraApplicationDueDiligences the wra application due diligences
	 */
	@Override
	public void cacheResult(
		List<WRAApplicationDueDiligence> wraApplicationDueDiligences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraApplicationDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WRAApplicationDueDiligence wraApplicationDueDiligence :
				wraApplicationDueDiligences) {

			if (entityCache.getResult(
					WRAApplicationDueDiligenceImpl.class,
					wraApplicationDueDiligence.getPrimaryKey()) == null) {

				cacheResult(wraApplicationDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all wra application due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WRAApplicationDueDiligenceImpl.class);

		finderCache.clearCache(WRAApplicationDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the wra application due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		entityCache.removeResult(
			WRAApplicationDueDiligenceImpl.class, wraApplicationDueDiligence);
	}

	@Override
	public void clearCache(
		List<WRAApplicationDueDiligence> wraApplicationDueDiligences) {

		for (WRAApplicationDueDiligence wraApplicationDueDiligence :
				wraApplicationDueDiligences) {

			entityCache.removeResult(
				WRAApplicationDueDiligenceImpl.class,
				wraApplicationDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WRAApplicationDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				WRAApplicationDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WRAApplicationDueDiligenceModelImpl
			wraApplicationDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			wraApplicationDueDiligenceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRADD_By_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRADD_By_CAI, args,
			wraApplicationDueDiligenceModelImpl);

		args = new Object[] {
			wraApplicationDueDiligenceModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRAADD_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRAADD_CAI, args,
			wraApplicationDueDiligenceModelImpl);

		args = new Object[] {
			wraApplicationDueDiligenceModelImpl.getCaseId(),
			wraApplicationDueDiligenceModelImpl.getAgencyName()
		};

		finderCache.putResult(
			_finderPathCountBygetWRAADD_CaseIdAgnecyName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRAADD_CaseIdAgnecyName, args,
			wraApplicationDueDiligenceModelImpl);
	}

	/**
	 * Creates a new wra application due diligence with the primary key. Does not add the wra application due diligence to the database.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key for the new wra application due diligence
	 * @return the new wra application due diligence
	 */
	@Override
	public WRAApplicationDueDiligence create(
		long wRAApplicationDueDiligenceId) {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			new WRAApplicationDueDiligenceImpl();

		wraApplicationDueDiligence.setNew(true);
		wraApplicationDueDiligence.setPrimaryKey(wRAApplicationDueDiligenceId);

		wraApplicationDueDiligence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return wraApplicationDueDiligence;
	}

	/**
	 * Removes the wra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence that was removed
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence remove(long wRAApplicationDueDiligenceId)
		throws NoSuchWRAApplicationDueDiligenceException {

		return remove((Serializable)wRAApplicationDueDiligenceId);
	}

	/**
	 * Removes the wra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra application due diligence
	 * @return the wra application due diligence that was removed
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence remove(Serializable primaryKey)
		throws NoSuchWRAApplicationDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			WRAApplicationDueDiligence wraApplicationDueDiligence =
				(WRAApplicationDueDiligence)session.get(
					WRAApplicationDueDiligenceImpl.class, primaryKey);

			if (wraApplicationDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWRAApplicationDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraApplicationDueDiligence);
		}
		catch (NoSuchWRAApplicationDueDiligenceException
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
	protected WRAApplicationDueDiligence removeImpl(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraApplicationDueDiligence)) {
				wraApplicationDueDiligence =
					(WRAApplicationDueDiligence)session.get(
						WRAApplicationDueDiligenceImpl.class,
						wraApplicationDueDiligence.getPrimaryKeyObj());
			}

			if (wraApplicationDueDiligence != null) {
				session.delete(wraApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraApplicationDueDiligence != null) {
			clearCache(wraApplicationDueDiligence);
		}

		return wraApplicationDueDiligence;
	}

	@Override
	public WRAApplicationDueDiligence updateImpl(
		WRAApplicationDueDiligence wraApplicationDueDiligence) {

		boolean isNew = wraApplicationDueDiligence.isNew();

		if (!(wraApplicationDueDiligence instanceof
				WRAApplicationDueDiligenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraApplicationDueDiligence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraApplicationDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraApplicationDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WRAApplicationDueDiligence implementation " +
					wraApplicationDueDiligence.getClass());
		}

		WRAApplicationDueDiligenceModelImpl
			wraApplicationDueDiligenceModelImpl =
				(WRAApplicationDueDiligenceModelImpl)wraApplicationDueDiligence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraApplicationDueDiligence.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraApplicationDueDiligence.setCreateDate(date);
			}
			else {
				wraApplicationDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraApplicationDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraApplicationDueDiligence.setModifiedDate(date);
			}
			else {
				wraApplicationDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraApplicationDueDiligence);
			}
			else {
				wraApplicationDueDiligence =
					(WRAApplicationDueDiligence)session.merge(
						wraApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WRAApplicationDueDiligenceImpl.class,
			wraApplicationDueDiligenceModelImpl, false, true);

		cacheUniqueFindersCache(wraApplicationDueDiligenceModelImpl);

		if (isNew) {
			wraApplicationDueDiligence.setNew(false);
		}

		wraApplicationDueDiligence.resetOriginalValues();

		return wraApplicationDueDiligence;
	}

	/**
	 * Returns the wra application due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra application due diligence
	 * @return the wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWRAApplicationDueDiligenceException {

		WRAApplicationDueDiligence wraApplicationDueDiligence =
			fetchByPrimaryKey(primaryKey);

		if (wraApplicationDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWRAApplicationDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraApplicationDueDiligence;
	}

	/**
	 * Returns the wra application due diligence with the primary key or throws a <code>NoSuchWRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence
	 * @throws NoSuchWRAApplicationDueDiligenceException if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence findByPrimaryKey(
			long wRAApplicationDueDiligenceId)
		throws NoSuchWRAApplicationDueDiligenceException {

		return findByPrimaryKey((Serializable)wRAApplicationDueDiligenceId);
	}

	/**
	 * Returns the wra application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wRAApplicationDueDiligenceId the primary key of the wra application due diligence
	 * @return the wra application due diligence, or <code>null</code> if a wra application due diligence with the primary key could not be found
	 */
	@Override
	public WRAApplicationDueDiligence fetchByPrimaryKey(
		long wRAApplicationDueDiligenceId) {

		return fetchByPrimaryKey((Serializable)wRAApplicationDueDiligenceId);
	}

	/**
	 * Returns all the wra application due diligences.
	 *
	 * @return the wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @return the range of wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra application due diligences
	 * @param end the upper bound of the range of wra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra application due diligences
	 */
	@Override
	public List<WRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<WRAApplicationDueDiligence> orderByComparator,
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

		List<WRAApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<WRAApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE;

				sql = sql.concat(
					WRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WRAApplicationDueDiligence>)QueryUtil.list(
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
	 * Removes all the wra application due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WRAApplicationDueDiligence wraApplicationDueDiligence :
				findAll()) {

			remove(wraApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of wra application due diligences.
	 *
	 * @return the number of wra application due diligences
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
					_SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE);

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
		return "wRAApplicationDueDiligenceId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WRAApplicationDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra application due diligence persistence.
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

		_finderPathFetchBygetWRADD_By_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRADD_By_CAI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWRADD_By_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRADD_By_CAI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetWRAADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRAADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRAADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRAADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		_finderPathFetchBygetWRAADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRAADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, true);

		_finderPathCountBygetWRAADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRAADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, false);

		_finderPathWithPaginationFindBygetWRADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRADD_AgnecyName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agencyName"}, true);

		_finderPathWithoutPaginationFindBygetWRADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetWRADD_AgnecyName", new String[] {String.class.getName()},
			new String[] {"agencyName"}, true);

		_finderPathCountBygetWRADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRADD_AgnecyName", new String[] {String.class.getName()},
			new String[] {"agencyName"}, false);

		_finderPathWithPaginationFindBygetWRADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRADD_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetWRADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWRADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWRADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		WRAApplicationDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WRAApplicationDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(WRAApplicationDueDiligenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE =
		"SELECT wraApplicationDueDiligence FROM WRAApplicationDueDiligence wraApplicationDueDiligence";

	private static final String _SQL_SELECT_WRAAPPLICATIONDUEDILIGENCE_WHERE =
		"SELECT wraApplicationDueDiligence FROM WRAApplicationDueDiligence wraApplicationDueDiligence WHERE ";

	private static final String _SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE =
		"SELECT COUNT(wraApplicationDueDiligence) FROM WRAApplicationDueDiligence wraApplicationDueDiligence";

	private static final String _SQL_COUNT_WRAAPPLICATIONDUEDILIGENCE_WHERE =
		"SELECT COUNT(wraApplicationDueDiligence) FROM WRAApplicationDueDiligence wraApplicationDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"wraApplicationDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WRAApplicationDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WRAApplicationDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WRAApplicationDueDiligencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}