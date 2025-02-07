/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence.impl;

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

import com.nbp.hsra.stage.services.exception.NoSuchHSRAApplicationDueDiligenceException;
import com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligence;
import com.nbp.hsra.stage.services.model.HSRAApplicationDueDiligenceTable;
import com.nbp.hsra.stage.services.model.impl.HSRAApplicationDueDiligenceImpl;
import com.nbp.hsra.stage.services.model.impl.HSRAApplicationDueDiligenceModelImpl;
import com.nbp.hsra.stage.services.service.persistence.HSRAApplicationDueDiligencePersistence;
import com.nbp.hsra.stage.services.service.persistence.HSRAApplicationDueDiligenceUtil;
import com.nbp.hsra.stage.services.service.persistence.impl.constants.HSRA_STAGEPersistenceConstants;

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
 * The persistence implementation for the hsra application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HSRAApplicationDueDiligencePersistence.class)
public class HSRAApplicationDueDiligencePersistenceImpl
	extends BasePersistenceImpl<HSRAApplicationDueDiligence>
	implements HSRAApplicationDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HSRAApplicationDueDiligenceUtil</code> to access the hsra application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HSRAApplicationDueDiligenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHSRADD_By_CAI;
	private FinderPath _finderPathCountBygetHSRADD_By_CAI;

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetHSRADD_By_CAI(String caseId)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetHSRADD_By_CAI(caseId);

		if (hsraApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
		}

		return hsraApplicationDueDiligence;
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_By_CAI(String caseId) {
		return fetchBygetHSRADD_By_CAI(caseId, true);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_By_CAI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHSRADD_By_CAI, finderArgs, this);
		}

		if (result instanceof HSRAApplicationDueDiligence) {
			HSRAApplicationDueDiligence hsraApplicationDueDiligence =
				(HSRAApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, hsraApplicationDueDiligence.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRADD_BY_CAI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRADD_BY_CAI_CASEID_2);
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

				List<HSRAApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHSRADD_By_CAI, finderArgs,
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
								"HSRAApplicationDueDiligencePersistenceImpl.fetchBygetHSRADD_By_CAI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HSRAApplicationDueDiligence hsraApplicationDueDiligence =
						list.get(0);

					result = hsraApplicationDueDiligence;

					cacheResult(hsraApplicationDueDiligence);
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
			return (HSRAApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the hsra application due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application due diligence that was removed
	 */
	@Override
	public HSRAApplicationDueDiligence removeBygetHSRADD_By_CAI(String caseId)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			findBygetHSRADD_By_CAI(caseId);

		return remove(hsraApplicationDueDiligence);
	}

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application due diligences
	 */
	@Override
	public int countBygetHSRADD_By_CAI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHSRADD_By_CAI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRADD_BY_CAI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRADD_BY_CAI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRADD_BY_CAI_CASEID_2 =
		"hsraApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRADD_BY_CAI_CASEID_3 =
		"(hsraApplicationDueDiligence.caseId IS NULL OR hsraApplicationDueDiligence.caseId = '')";

	private FinderPath _finderPathFetchBygetHSRADD_CAI;
	private FinderPath _finderPathCountBygetHSRADD_CAI;

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetHSRADD_CAI(
			long hsraApplicationId)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetHSRADD_CAI(hsraApplicationId);

		if (hsraApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
		}

		return hsraApplicationDueDiligence;
	}

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CAI(
		long hsraApplicationId) {

		return fetchBygetHSRADD_CAI(hsraApplicationId, true);
	}

	/**
	 * Returns the hsra application due diligence where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CAI(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHSRADD_CAI, finderArgs, this);
		}

		if (result instanceof HSRAApplicationDueDiligence) {
			HSRAApplicationDueDiligence hsraApplicationDueDiligence =
				(HSRAApplicationDueDiligence)result;

			if (hsraApplicationId !=
					hsraApplicationDueDiligence.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRADD_CAI_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<HSRAApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHSRADD_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"HSRAApplicationDueDiligencePersistenceImpl.fetchBygetHSRADD_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HSRAApplicationDueDiligence hsraApplicationDueDiligence =
						list.get(0);

					result = hsraApplicationDueDiligence;

					cacheResult(hsraApplicationDueDiligence);
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
			return (HSRAApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the hsra application due diligence where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application due diligence that was removed
	 */
	@Override
	public HSRAApplicationDueDiligence removeBygetHSRADD_CAI(
			long hsraApplicationId)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			findBygetHSRADD_CAI(hsraApplicationId);

		return remove(hsraApplicationDueDiligence);
	}

	/**
	 * Returns the number of hsra application due diligences where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application due diligences
	 */
	@Override
	public int countBygetHSRADD_CAI(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHSRADD_CAI;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRADD_CAI_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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
		_FINDER_COLUMN_GETHSRADD_CAI_HSRAAPPLICATIONID_2 =
			"hsraApplicationDueDiligence.hsraApplicationId = ?";

	private FinderPath _finderPathFetchBygetHSRADD_CaseIdAgnecyName;
	private FinderPath _finderPathCountBygetHSRADD_CaseIdAgnecyName;

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetHSRADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetHSRADD_CaseIdAgnecyName(caseId, agencyName);

		if (hsraApplicationDueDiligence == null) {
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

			throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
		}

		return hsraApplicationDueDiligence;
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return fetchBygetHSRADD_CaseIdAgnecyName(caseId, agencyName, true);
	}

	/**
	 * Returns the hsra application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_CaseIdAgnecyName(
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
				_finderPathFetchBygetHSRADD_CaseIdAgnecyName, finderArgs, this);
		}

		if (result instanceof HSRAApplicationDueDiligence) {
			HSRAApplicationDueDiligence hsraApplicationDueDiligence =
				(HSRAApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, hsraApplicationDueDiligence.getCaseId()) ||
				!Objects.equals(
					agencyName, hsraApplicationDueDiligence.getAgencyName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(
					_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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

				List<HSRAApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHSRADD_CaseIdAgnecyName,
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
								"HSRAApplicationDueDiligencePersistenceImpl.fetchBygetHSRADD_CaseIdAgnecyName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HSRAApplicationDueDiligence hsraApplicationDueDiligence =
						list.get(0);

					result = hsraApplicationDueDiligence;

					cacheResult(hsraApplicationDueDiligence);
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
			return (HSRAApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the hsra application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the hsra application due diligence that was removed
	 */
	@Override
	public HSRAApplicationDueDiligence removeBygetHSRADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			findBygetHSRADD_CaseIdAgnecyName(caseId, agencyName);

		return remove(hsraApplicationDueDiligence);
	}

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching hsra application due diligences
	 */
	@Override
	public int countBygetHSRADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		caseId = Objects.toString(caseId, "");
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetHSRADD_CaseIdAgnecyName;

		Object[] finderArgs = new Object[] {caseId, agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(
					_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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
		_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_CASEID_2 =
			"hsraApplicationDueDiligence.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_CASEID_3 =
			"(hsraApplicationDueDiligence.caseId IS NULL OR hsraApplicationDueDiligence.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_AGENCYNAME_2 =
			"hsraApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETHSRADD_CASEIDAGNECYNAME_AGENCYNAME_3 =
			"(hsraApplicationDueDiligence.agencyName IS NULL OR hsraApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetHSRADD_AgnecyName;
	private FinderPath _finderPathWithoutPaginationFindBygetHSRADD_AgnecyName;
	private FinderPath _finderPathCountBygetHSRADD_AgnecyName;

	/**
	 * Returns all the hsra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName) {

		return findBygetHSRADD_AgnecyName(
			agencyName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName, int start, int end) {

		return findBygetHSRADD_AgnecyName(agencyName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return findBygetHSRADD_AgnecyName(
			agencyName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetHSRADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHSRADD_AgnecyName;
				finderArgs = new Object[] {agencyName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHSRADD_AgnecyName;
			finderArgs = new Object[] {
				agencyName, start, end, orderByComparator
			};
		}

		List<HSRAApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<HSRAApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
						list) {

					if (!agencyName.equals(
							hsraApplicationDueDiligence.getAgencyName())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HSRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<HSRAApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetHSRADD_AgnecyName_First(
			String agencyName,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetHSRADD_AgnecyName_First(agencyName, orderByComparator);

		if (hsraApplicationDueDiligence != null) {
			return hsraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agencyName=");
		sb.append(agencyName);

		sb.append("}");

		throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_AgnecyName_First(
		String agencyName,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		List<HSRAApplicationDueDiligence> list = findBygetHSRADD_AgnecyName(
			agencyName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetHSRADD_AgnecyName_Last(
			String agencyName,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetHSRADD_AgnecyName_Last(agencyName, orderByComparator);

		if (hsraApplicationDueDiligence != null) {
			return hsraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agencyName=");
		sb.append(agencyName);

		sb.append("}");

		throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetHSRADD_AgnecyName_Last(
		String agencyName,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		int count = countBygetHSRADD_AgnecyName(agencyName);

		if (count == 0) {
			return null;
		}

		List<HSRAApplicationDueDiligence> list = findBygetHSRADD_AgnecyName(
			agencyName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application due diligences before and after the current hsra application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param hsraAppDDId the primary key of the current hsra application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence[] findBygetHSRADD_AgnecyName_PrevAndNext(
			long hsraAppDDId, String agencyName,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException {

		agencyName = Objects.toString(agencyName, "");

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			findByPrimaryKey(hsraAppDDId);

		Session session = null;

		try {
			session = openSession();

			HSRAApplicationDueDiligence[] array =
				new HSRAApplicationDueDiligenceImpl[3];

			array[0] = getBygetHSRADD_AgnecyName_PrevAndNext(
				session, hsraApplicationDueDiligence, agencyName,
				orderByComparator, true);

			array[1] = hsraApplicationDueDiligence;

			array[2] = getBygetHSRADD_AgnecyName_PrevAndNext(
				session, hsraApplicationDueDiligence, agencyName,
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

	protected HSRAApplicationDueDiligence getBygetHSRADD_AgnecyName_PrevAndNext(
		Session session,
		HSRAApplicationDueDiligence hsraApplicationDueDiligence,
		String agencyName,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindAgencyName = false;

		if (agencyName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_3);
		}
		else {
			bindAgencyName = true;

			sb.append(_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_2);
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
			sb.append(HSRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						hsraApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HSRAApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	@Override
	public void removeBygetHSRADD_AgnecyName(String agencyName) {
		for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
				findBygetHSRADD_AgnecyName(
					agencyName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of hsra application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching hsra application due diligences
	 */
	@Override
	public int countBygetHSRADD_AgnecyName(String agencyName) {
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetHSRADD_AgnecyName;

		Object[] finderArgs = new Object[] {agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_2);
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
		_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_2 =
			"hsraApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETHSRADD_AGNECYNAME_AGENCYNAME_3 =
			"(hsraApplicationDueDiligence.agencyName IS NULL OR hsraApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetPHARMADD_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetPHARMADD_CaseId;
	private FinderPath _finderPathCountBygetPHARMADD_CaseId;

	/**
	 * Returns all the hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId) {

		return findBygetPHARMADD_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end) {

		return findBygetPHARMADD_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return findBygetPHARMADD_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPHARMADD_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPHARMADD_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<HSRAApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<HSRAApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
						list) {

					if (!caseId.equals(
							hsraApplicationDueDiligence.getCaseId())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HSRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<HSRAApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetPHARMADD_CaseId_First(
			String caseId,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetPHARMADD_CaseId_First(caseId, orderByComparator);

		if (hsraApplicationDueDiligence != null) {
			return hsraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetPHARMADD_CaseId_First(
		String caseId,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		List<HSRAApplicationDueDiligence> list = findBygetPHARMADD_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findBygetPHARMADD_CaseId_Last(
			String caseId,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchBygetPHARMADD_CaseId_Last(caseId, orderByComparator);

		if (hsraApplicationDueDiligence != null) {
			return hsraApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHSRAApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application due diligence, or <code>null</code> if a matching hsra application due diligence could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchBygetPHARMADD_CaseId_Last(
		String caseId,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		int count = countBygetPHARMADD_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<HSRAApplicationDueDiligence> list = findBygetPHARMADD_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application due diligences before and after the current hsra application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param hsraAppDDId the primary key of the current hsra application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence[] findBygetPHARMADD_CaseId_PrevAndNext(
			long hsraAppDDId, String caseId,
			OrderByComparator<HSRAApplicationDueDiligence> orderByComparator)
		throws NoSuchHSRAApplicationDueDiligenceException {

		caseId = Objects.toString(caseId, "");

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			findByPrimaryKey(hsraAppDDId);

		Session session = null;

		try {
			session = openSession();

			HSRAApplicationDueDiligence[] array =
				new HSRAApplicationDueDiligenceImpl[3];

			array[0] = getBygetPHARMADD_CaseId_PrevAndNext(
				session, hsraApplicationDueDiligence, caseId, orderByComparator,
				true);

			array[1] = hsraApplicationDueDiligence;

			array[2] = getBygetPHARMADD_CaseId_PrevAndNext(
				session, hsraApplicationDueDiligence, caseId, orderByComparator,
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

	protected HSRAApplicationDueDiligence getBygetPHARMADD_CaseId_PrevAndNext(
		Session session,
		HSRAApplicationDueDiligence hsraApplicationDueDiligence, String caseId,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_2);
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
			sb.append(HSRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						hsraApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HSRAApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPHARMADD_CaseId(String caseId) {
		for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
				findBygetPHARMADD_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of hsra application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application due diligences
	 */
	@Override
	public int countBygetPHARMADD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPHARMADD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_2 =
		"hsraApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_3 =
		"(hsraApplicationDueDiligence.caseId IS NULL OR hsraApplicationDueDiligence.caseId = '')";

	public HSRAApplicationDueDiligencePersistenceImpl() {
		setModelClass(HSRAApplicationDueDiligence.class);

		setModelImplClass(HSRAApplicationDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(HSRAApplicationDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the hsra application due diligence in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDueDiligence the hsra application due diligence
	 */
	@Override
	public void cacheResult(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		entityCache.putResult(
			HSRAApplicationDueDiligenceImpl.class,
			hsraApplicationDueDiligence.getPrimaryKey(),
			hsraApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetHSRADD_By_CAI,
			new Object[] {hsraApplicationDueDiligence.getCaseId()},
			hsraApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetHSRADD_CAI,
			new Object[] {hsraApplicationDueDiligence.getHsraApplicationId()},
			hsraApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetHSRADD_CaseIdAgnecyName,
			new Object[] {
				hsraApplicationDueDiligence.getCaseId(),
				hsraApplicationDueDiligence.getAgencyName()
			},
			hsraApplicationDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra application due diligences in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationDueDiligences the hsra application due diligences
	 */
	@Override
	public void cacheResult(
		List<HSRAApplicationDueDiligence> hsraApplicationDueDiligences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplicationDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
				hsraApplicationDueDiligences) {

			if (entityCache.getResult(
					HSRAApplicationDueDiligenceImpl.class,
					hsraApplicationDueDiligence.getPrimaryKey()) == null) {

				cacheResult(hsraApplicationDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all hsra application due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HSRAApplicationDueDiligenceImpl.class);

		finderCache.clearCache(HSRAApplicationDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the hsra application due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		entityCache.removeResult(
			HSRAApplicationDueDiligenceImpl.class, hsraApplicationDueDiligence);
	}

	@Override
	public void clearCache(
		List<HSRAApplicationDueDiligence> hsraApplicationDueDiligences) {

		for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
				hsraApplicationDueDiligences) {

			entityCache.removeResult(
				HSRAApplicationDueDiligenceImpl.class,
				hsraApplicationDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HSRAApplicationDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HSRAApplicationDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HSRAApplicationDueDiligenceModelImpl
			hsraApplicationDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			hsraApplicationDueDiligenceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetHSRADD_By_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHSRADD_By_CAI, args,
			hsraApplicationDueDiligenceModelImpl);

		args = new Object[] {
			hsraApplicationDueDiligenceModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHSRADD_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHSRADD_CAI, args,
			hsraApplicationDueDiligenceModelImpl);

		args = new Object[] {
			hsraApplicationDueDiligenceModelImpl.getCaseId(),
			hsraApplicationDueDiligenceModelImpl.getAgencyName()
		};

		finderCache.putResult(
			_finderPathCountBygetHSRADD_CaseIdAgnecyName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHSRADD_CaseIdAgnecyName, args,
			hsraApplicationDueDiligenceModelImpl);
	}

	/**
	 * Creates a new hsra application due diligence with the primary key. Does not add the hsra application due diligence to the database.
	 *
	 * @param hsraAppDDId the primary key for the new hsra application due diligence
	 * @return the new hsra application due diligence
	 */
	@Override
	public HSRAApplicationDueDiligence create(long hsraAppDDId) {
		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			new HSRAApplicationDueDiligenceImpl();

		hsraApplicationDueDiligence.setNew(true);
		hsraApplicationDueDiligence.setPrimaryKey(hsraAppDDId);

		hsraApplicationDueDiligence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return hsraApplicationDueDiligence;
	}

	/**
	 * Removes the hsra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence that was removed
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence remove(long hsraAppDDId)
		throws NoSuchHSRAApplicationDueDiligenceException {

		return remove((Serializable)hsraAppDDId);
	}

	/**
	 * Removes the hsra application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application due diligence
	 * @return the hsra application due diligence that was removed
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence remove(Serializable primaryKey)
		throws NoSuchHSRAApplicationDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			HSRAApplicationDueDiligence hsraApplicationDueDiligence =
				(HSRAApplicationDueDiligence)session.get(
					HSRAApplicationDueDiligenceImpl.class, primaryKey);

			if (hsraApplicationDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHSRAApplicationDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplicationDueDiligence);
		}
		catch (NoSuchHSRAApplicationDueDiligenceException
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
	protected HSRAApplicationDueDiligence removeImpl(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplicationDueDiligence)) {
				hsraApplicationDueDiligence =
					(HSRAApplicationDueDiligence)session.get(
						HSRAApplicationDueDiligenceImpl.class,
						hsraApplicationDueDiligence.getPrimaryKeyObj());
			}

			if (hsraApplicationDueDiligence != null) {
				session.delete(hsraApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplicationDueDiligence != null) {
			clearCache(hsraApplicationDueDiligence);
		}

		return hsraApplicationDueDiligence;
	}

	@Override
	public HSRAApplicationDueDiligence updateImpl(
		HSRAApplicationDueDiligence hsraApplicationDueDiligence) {

		boolean isNew = hsraApplicationDueDiligence.isNew();

		if (!(hsraApplicationDueDiligence instanceof
				HSRAApplicationDueDiligenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					hsraApplicationDueDiligence.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplicationDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplicationDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HSRAApplicationDueDiligence implementation " +
					hsraApplicationDueDiligence.getClass());
		}

		HSRAApplicationDueDiligenceModelImpl
			hsraApplicationDueDiligenceModelImpl =
				(HSRAApplicationDueDiligenceModelImpl)
					hsraApplicationDueDiligence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplicationDueDiligence.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplicationDueDiligence.setCreateDate(date);
			}
			else {
				hsraApplicationDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplicationDueDiligence.setModifiedDate(date);
			}
			else {
				hsraApplicationDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplicationDueDiligence);
			}
			else {
				hsraApplicationDueDiligence =
					(HSRAApplicationDueDiligence)session.merge(
						hsraApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HSRAApplicationDueDiligenceImpl.class,
			hsraApplicationDueDiligenceModelImpl, false, true);

		cacheUniqueFindersCache(hsraApplicationDueDiligenceModelImpl);

		if (isNew) {
			hsraApplicationDueDiligence.setNew(false);
		}

		hsraApplicationDueDiligence.resetOriginalValues();

		return hsraApplicationDueDiligence;
	}

	/**
	 * Returns the hsra application due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application due diligence
	 * @return the hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHSRAApplicationDueDiligenceException {

		HSRAApplicationDueDiligence hsraApplicationDueDiligence =
			fetchByPrimaryKey(primaryKey);

		if (hsraApplicationDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHSRAApplicationDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplicationDueDiligence;
	}

	/**
	 * Returns the hsra application due diligence with the primary key or throws a <code>NoSuchHSRAApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence
	 * @throws NoSuchHSRAApplicationDueDiligenceException if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence findByPrimaryKey(long hsraAppDDId)
		throws NoSuchHSRAApplicationDueDiligenceException {

		return findByPrimaryKey((Serializable)hsraAppDDId);
	}

	/**
	 * Returns the hsra application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraAppDDId the primary key of the hsra application due diligence
	 * @return the hsra application due diligence, or <code>null</code> if a hsra application due diligence with the primary key could not be found
	 */
	@Override
	public HSRAApplicationDueDiligence fetchByPrimaryKey(long hsraAppDDId) {
		return fetchByPrimaryKey((Serializable)hsraAppDDId);
	}

	/**
	 * Returns all the hsra application due diligences.
	 *
	 * @return the hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @return the range of hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application due diligences
	 * @param end the upper bound of the range of hsra application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application due diligences
	 */
	@Override
	public List<HSRAApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationDueDiligence> orderByComparator,
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

		List<HSRAApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<HSRAApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE;

				sql = sql.concat(
					HSRAApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HSRAApplicationDueDiligence>)QueryUtil.list(
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
	 * Removes all the hsra application due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HSRAApplicationDueDiligence hsraApplicationDueDiligence :
				findAll()) {

			remove(hsraApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of hsra application due diligences.
	 *
	 * @return the number of hsra application due diligences
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
					_SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE);

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
		return "hsraAppDDId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HSRAApplicationDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application due diligence persistence.
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

		_finderPathFetchBygetHSRADD_By_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHSRADD_By_CAI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHSRADD_By_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHSRADD_By_CAI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetHSRADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHSRADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHSRADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHSRADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		_finderPathFetchBygetHSRADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHSRADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, true);

		_finderPathCountBygetHSRADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHSRADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, false);

		_finderPathWithPaginationFindBygetHSRADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetHSRADD_AgnecyName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agencyName"}, true);

		_finderPathWithoutPaginationFindBygetHSRADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHSRADD_AgnecyName", new String[] {String.class.getName()},
			new String[] {"agencyName"}, true);

		_finderPathCountBygetHSRADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHSRADD_AgnecyName",
			new String[] {String.class.getName()}, new String[] {"agencyName"},
			false);

		_finderPathWithPaginationFindBygetPHARMADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPHARMADD_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetPHARMADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetPHARMADD_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetPHARMADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPHARMADD_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		HSRAApplicationDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HSRAApplicationDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(
			HSRAApplicationDueDiligenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE =
		"SELECT hsraApplicationDueDiligence FROM HSRAApplicationDueDiligence hsraApplicationDueDiligence";

	private static final String _SQL_SELECT_HSRAAPPLICATIONDUEDILIGENCE_WHERE =
		"SELECT hsraApplicationDueDiligence FROM HSRAApplicationDueDiligence hsraApplicationDueDiligence WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE =
		"SELECT COUNT(hsraApplicationDueDiligence) FROM HSRAApplicationDueDiligence hsraApplicationDueDiligence";

	private static final String _SQL_COUNT_HSRAAPPLICATIONDUEDILIGENCE_WHERE =
		"SELECT COUNT(hsraApplicationDueDiligence) FROM HSRAApplicationDueDiligence hsraApplicationDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraApplicationDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HSRAApplicationDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HSRAApplicationDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HSRAApplicationDueDiligencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}