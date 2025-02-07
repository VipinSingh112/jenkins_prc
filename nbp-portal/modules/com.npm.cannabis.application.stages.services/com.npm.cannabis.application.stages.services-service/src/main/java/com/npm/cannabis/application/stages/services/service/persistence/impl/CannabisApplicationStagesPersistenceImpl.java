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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationStagesException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationStages;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationStagesTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationStagesModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationStagesPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationStagesUtil;
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
 * The persistence implementation for the cannabis application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationStagesPersistence.class)
public class CannabisApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationStages>
	implements CannabisApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationStagesUtil</code> to access the cannabis application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCAS_CAI;
	private FinderPath _finderPathCountBygetCAS_CAI;

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages = fetchBygetCAS_CAI(
			cannabisApplicationId);

		if (cannabisApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationStagesException(sb.toString());
		}

		return cannabisApplicationStages;
	}

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CAI(
		long cannabisApplicationId) {

		return fetchBygetCAS_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis application stages where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCAS_CAI, finderArgs, this);
		}

		if (result instanceof CannabisApplicationStages) {
			CannabisApplicationStages cannabisApplicationStages =
				(CannabisApplicationStages)result;

			if (cannabisApplicationId !=
					cannabisApplicationStages.getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETCAS_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CAI, finderArgs, list);
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
								"CannabisApplicationStagesPersistenceImpl.fetchBygetCAS_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationStages cannabisApplicationStages =
						list.get(0);

					result = cannabisApplicationStages;

					cacheResult(cannabisApplicationStages);
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
			return (CannabisApplicationStages)result;
		}
	}

	/**
	 * Removes the cannabis application stages where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application stages that was removed
	 */
	@Override
	public CannabisApplicationStages removeBygetCAS_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages = findBygetCAS_CAI(
			cannabisApplicationId);

		return remove(cannabisApplicationStages);
	}

	/**
	 * Returns the number of cannabis application stageses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCAS_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETCAS_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCAS_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisApplicationStages.cannabisApplicationId = ?";

	private FinderPath _finderPathFetchBygetCAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetCAS_CaseIdStageName;

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_CaseIdStageName(caseId, stageName);

		if (cannabisApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationStagesException(sb.toString());
		}

		return cannabisApplicationStages;
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetCAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof CannabisApplicationStages) {
			CannabisApplicationStages cannabisApplicationStages =
				(CannabisApplicationStages)result;

			if (!Objects.equals(
					caseId, cannabisApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, cannabisApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<CannabisApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdStageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"CannabisApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationStages cannabisApplicationStages =
						list.get(0);

					result = cannabisApplicationStages;

					cacheResult(cannabisApplicationStages);
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
			return (CannabisApplicationStages)result;
		}
	}

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the cannabis application stages that was removed
	 */
	@Override
	public CannabisApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			findBygetCAS_CaseIdStageName(caseId, stageName);

		return remove(cannabisApplicationStages);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2 =
		"cannabisApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3 =
		"(cannabisApplicationStages.caseId IS NULL OR cannabisApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2 =
			"cannabisApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(cannabisApplicationStages.stageName IS NULL OR cannabisApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetCAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetCAS_CaseIdStageStatus;

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (cannabisApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationStagesException(sb.toString());
		}

		return cannabisApplicationStages;
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof CannabisApplicationStages) {
			CannabisApplicationStages cannabisApplicationStages =
				(CannabisApplicationStages)result;

			if (!Objects.equals(
					caseId, cannabisApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, cannabisApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, cannabisApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<CannabisApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageName, stageStatus
								};
							}

							_log.warn(
								"CannabisApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationStages cannabisApplicationStages =
						list.get(0);

					result = cannabisApplicationStages;

					cacheResult(cannabisApplicationStages);
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
			return (CannabisApplicationStages)result;
		}
	}

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the cannabis application stages that was removed
	 */
	@Override
	public CannabisApplicationStages removeBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			findBygetCAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(cannabisApplicationStages);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_2 =
			"cannabisApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(cannabisApplicationStages.caseId IS NULL OR cannabisApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"cannabisApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(cannabisApplicationStages.stageName IS NULL OR cannabisApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"cannabisApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(cannabisApplicationStages.stageStatus IS NULL OR cannabisApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetCAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetCAS_CaseIdAndStatus;

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_CaseIdAndStatus(caseId, stageStatus);

		if (cannabisApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationStagesException(sb.toString());
		}

		return cannabisApplicationStages;
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetCAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the cannabis application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof CannabisApplicationStages) {
			CannabisApplicationStages cannabisApplicationStages =
				(CannabisApplicationStages)result;

			if (!Objects.equals(
					caseId, cannabisApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, cannabisApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<CannabisApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdAndStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"CannabisApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationStages cannabisApplicationStages =
						list.get(0);

					result = cannabisApplicationStages;

					cacheResult(cannabisApplicationStages);
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
			return (CannabisApplicationStages)result;
		}
	}

	/**
	 * Removes the cannabis application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the cannabis application stages that was removed
	 */
	@Override
	public CannabisApplicationStages removeBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			findBygetCAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(cannabisApplicationStages);
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_2 =
		"cannabisApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_3 =
		"(cannabisApplicationStages.caseId IS NULL OR cannabisApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"cannabisApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(cannabisApplicationStages.stageStatus IS NULL OR cannabisApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathCountBygetCAS_CaseId;

	/**
	 * Returns all the cannabis application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_CaseId(String caseId) {
		return findBygetCAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return findBygetCAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return findBygetCAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationStages cannabisApplicationStages :
						list) {

					if (!caseId.equals(cannabisApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationStages>)QueryUtil.list(
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
	 * Returns the first cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_CaseId_First(caseId, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		List<CannabisApplicationStages> list = findBygetCAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_CaseId_Last(caseId, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		int count = countBygetCAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationStages> list = findBygetCAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long cannabisApplicationstageId, String caseId,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		CannabisApplicationStages cannabisApplicationStages = findByPrimaryKey(
			cannabisApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationStages[] array =
				new CannabisApplicationStagesImpl[3];

			array[0] = getBygetCAS_CaseId_PrevAndNext(
				session, cannabisApplicationStages, caseId, orderByComparator,
				true);

			array[1] = cannabisApplicationStages;

			array[2] = getBygetCAS_CaseId_PrevAndNext(
				session, cannabisApplicationStages, caseId, orderByComparator,
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

	protected CannabisApplicationStages getBygetCAS_CaseId_PrevAndNext(
		Session session, CannabisApplicationStages cannabisApplicationStages,
		String caseId,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
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
			sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCAS_CaseId(String caseId) {
		for (CannabisApplicationStages cannabisApplicationStages :
				findBygetCAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationStages);
		}
	}

	/**
	 * Returns the number of cannabis application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_2 =
		"cannabisApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_3 =
		"(cannabisApplicationStages.caseId IS NULL OR cannabisApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_StageName;
	private FinderPath _finderPathCountBygetCAS_StageName;

	/**
	 * Returns all the cannabis application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName) {

		return findBygetCAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end) {

		return findBygetCAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return findBygetCAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<CannabisApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationStages cannabisApplicationStages :
						list) {

					if (!stageName.equals(
							cannabisApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<CannabisApplicationStages>)QueryUtil.list(
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
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_StageName_First(
			String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_StageName_First(stageName, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_StageName_First(
		String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		List<CannabisApplicationStages> list = findBygetCAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_StageName_Last(
			String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_StageName_Last(stageName, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_StageName_Last(
		String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		int count = countBygetCAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationStages> list = findBygetCAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageName = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages[] findBygetCAS_StageName_PrevAndNext(
			long cannabisApplicationstageId, String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		CannabisApplicationStages cannabisApplicationStages = findByPrimaryKey(
			cannabisApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationStages[] array =
				new CannabisApplicationStagesImpl[3];

			array[0] = getBygetCAS_StageName_PrevAndNext(
				session, cannabisApplicationStages, stageName,
				orderByComparator, true);

			array[1] = cannabisApplicationStages;

			array[2] = getBygetCAS_StageName_PrevAndNext(
				session, cannabisApplicationStages, stageName,
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

	protected CannabisApplicationStages getBygetCAS_StageName_PrevAndNext(
		Session session, CannabisApplicationStages cannabisApplicationStages,
		String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2);
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
			sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetCAS_StageName(String stageName) {
		for (CannabisApplicationStages cannabisApplicationStages :
				findBygetCAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationStages);
		}
	}

	/**
	 * Returns the number of cannabis application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetCAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2 =
		"cannabisApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3 =
		"(cannabisApplicationStages.stageName IS NULL OR cannabisApplicationStages.stageName = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetCAS_StageName_StageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCAS_StageName_StageStatus;
	private FinderPath _finderPathCountBygetCAS_StageName_StageStatus;

	/**
	 * Returns all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName) {

		return findBygetCAS_StageName_StageStatus(
			stageStatus, stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName, int start, int end) {

		return findBygetCAS_StageName_StageStatus(
			stageStatus, stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return findBygetCAS_StageName_StageStatus(
			stageStatus, stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCAS_StageName_StageStatus;
				finderArgs = new Object[] {stageStatus, stageName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCAS_StageName_StageStatus;
			finderArgs = new Object[] {
				stageStatus, stageName, start, end, orderByComparator
			};
		}

		List<CannabisApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationStages cannabisApplicationStages :
						list) {

					if (!stageStatus.equals(
							cannabisApplicationStages.getStageStatus()) ||
						!stageName.equals(
							cannabisApplicationStages.getStageName())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<CannabisApplicationStages>)QueryUtil.list(
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
	 * Returns the first cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_StageName_StageStatus_First(
			String stageStatus, String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_StageName_StageStatus_First(
				stageStatus, stageName, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageStatus=");
		sb.append(stageStatus);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_StageName_StageStatus_First(
		String stageStatus, String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		List<CannabisApplicationStages> list =
			findBygetCAS_StageName_StageStatus(
				stageStatus, stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_StageName_StageStatus_Last(
			String stageStatus, String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_StageName_StageStatus_Last(
				stageStatus, stageName, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageStatus=");
		sb.append(stageStatus);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_StageName_StageStatus_Last(
		String stageStatus, String stageName,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		int count = countBygetCAS_StageName_StageStatus(stageStatus, stageName);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationStages> list =
			findBygetCAS_StageName_StageStatus(
				stageStatus, stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages[]
			findBygetCAS_StageName_StageStatus_PrevAndNext(
				long cannabisApplicationstageId, String stageStatus,
				String stageName,
				OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		CannabisApplicationStages cannabisApplicationStages = findByPrimaryKey(
			cannabisApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationStages[] array =
				new CannabisApplicationStagesImpl[3];

			array[0] = getBygetCAS_StageName_StageStatus_PrevAndNext(
				session, cannabisApplicationStages, stageStatus, stageName,
				orderByComparator, true);

			array[1] = cannabisApplicationStages;

			array[2] = getBygetCAS_StageName_StageStatus_PrevAndNext(
				session, cannabisApplicationStages, stageStatus, stageName,
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

	protected CannabisApplicationStages
		getBygetCAS_StageName_StageStatus_PrevAndNext(
			Session session,
			CannabisApplicationStages cannabisApplicationStages,
			String stageStatus, String stageName,
			OrderByComparator<CannabisApplicationStages> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(
				_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
		}

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_2);
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
			sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageStatus) {
			queryPos.add(stageStatus);
		}

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application stageses where stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName) {

		for (CannabisApplicationStages cannabisApplicationStages :
				findBygetCAS_StageName_StageStatus(
					stageStatus, stageName, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationStages);
		}
	}

	/**
	 * Returns the number of cannabis application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_StageName_StageStatus(
		String stageStatus, String stageName) {

		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetCAS_StageName_StageStatus;

		Object[] finderArgs = new Object[] {stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				if (bindStageName) {
					queryPos.add(stageName);
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
		_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_2 =
			"cannabisApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGESTATUS_3 =
			"(cannabisApplicationStages.stageStatus IS NULL OR cannabisApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_2 =
			"cannabisApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_STAGENAME_STAGESTATUS_STAGENAME_3 =
			"(cannabisApplicationStages.stageName IS NULL OR cannabisApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_StageNameStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_StageNameStatus;
	private FinderPath _finderPathCountBygetCAS_StageNameStatus;

	/**
	 * Returns all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus) {

		return findBygetCAS_StageNameStatus(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus, int start, int end) {

		return findBygetCAS_StageNameStatus(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return findBygetCAS_StageNameStatus(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findBygetCAS_StageNameStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCAS_StageNameStatus;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_StageNameStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<CannabisApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationStages cannabisApplicationStages :
						list) {

					if (!stageName.equals(
							cannabisApplicationStages.getStageName()) ||
						!stageStatus.equals(
							cannabisApplicationStages.getStageStatus())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				list = (List<CannabisApplicationStages>)QueryUtil.list(
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
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_StageNameStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_StageNameStatus_First(
				stageName, stageStatus, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_StageNameStatus_First(
		String stageName, String stageStatus,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		List<CannabisApplicationStages> list = findBygetCAS_StageNameStatus(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages findBygetCAS_StageNameStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages =
			fetchBygetCAS_StageNameStatus_Last(
				stageName, stageStatus, orderByComparator);

		if (cannabisApplicationStages != null) {
			return cannabisApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchCannabisApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application stages, or <code>null</code> if a matching cannabis application stages could not be found
	 */
	@Override
	public CannabisApplicationStages fetchBygetCAS_StageNameStatus_Last(
		String stageName, String stageStatus,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		int count = countBygetCAS_StageNameStatus(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationStages> list = findBygetCAS_StageNameStatus(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application stageses before and after the current cannabis application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param cannabisApplicationstageId the primary key of the current cannabis application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages[] findBygetCAS_StageNameStatus_PrevAndNext(
			long cannabisApplicationstageId, String stageName,
			String stageStatus,
			OrderByComparator<CannabisApplicationStages> orderByComparator)
		throws NoSuchCannabisApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		CannabisApplicationStages cannabisApplicationStages = findByPrimaryKey(
			cannabisApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationStages[] array =
				new CannabisApplicationStagesImpl[3];

			array[0] = getBygetCAS_StageNameStatus_PrevAndNext(
				session, cannabisApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = cannabisApplicationStages;

			array[2] = getBygetCAS_StageNameStatus_PrevAndNext(
				session, cannabisApplicationStages, stageName, stageStatus,
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

	protected CannabisApplicationStages getBygetCAS_StageNameStatus_PrevAndNext(
		Session session, CannabisApplicationStages cannabisApplicationStages,
		String stageName, String stageStatus,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_2);
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
			sb.append(CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindStageStatus) {
			queryPos.add(stageStatus);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetCAS_StageNameStatus(
		String stageName, String stageStatus) {

		for (CannabisApplicationStages cannabisApplicationStages :
				findBygetCAS_StageNameStatus(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationStages);
		}
	}

	/**
	 * Returns the number of cannabis application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching cannabis application stageses
	 */
	@Override
	public int countBygetCAS_StageNameStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetCAS_StageNameStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_2 =
			"cannabisApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGENAME_3 =
			"(cannabisApplicationStages.stageName IS NULL OR cannabisApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_2 =
			"cannabisApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_STAGENAMESTATUS_STAGESTATUS_3 =
			"(cannabisApplicationStages.stageStatus IS NULL OR cannabisApplicationStages.stageStatus = '')";

	public CannabisApplicationStagesPersistenceImpl() {
		setModelClass(CannabisApplicationStages.class);

		setModelImplClass(CannabisApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application stages in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationStages the cannabis application stages
	 */
	@Override
	public void cacheResult(
		CannabisApplicationStages cannabisApplicationStages) {

		entityCache.putResult(
			CannabisApplicationStagesImpl.class,
			cannabisApplicationStages.getPrimaryKey(),
			cannabisApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CAI,
			new Object[] {cannabisApplicationStages.getCannabisApplicationId()},
			cannabisApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName,
			new Object[] {
				cannabisApplicationStages.getCaseId(),
				cannabisApplicationStages.getStageName()
			},
			cannabisApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageStatus,
			new Object[] {
				cannabisApplicationStages.getCaseId(),
				cannabisApplicationStages.getStageName(),
				cannabisApplicationStages.getStageStatus()
			},
			cannabisApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdAndStatus,
			new Object[] {
				cannabisApplicationStages.getCaseId(),
				cannabisApplicationStages.getStageStatus()
			},
			cannabisApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application stageses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationStageses the cannabis application stageses
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationStages> cannabisApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationStages cannabisApplicationStages :
				cannabisApplicationStageses) {

			if (entityCache.getResult(
					CannabisApplicationStagesImpl.class,
					cannabisApplicationStages.getPrimaryKey()) == null) {

				cacheResult(cannabisApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationStagesImpl.class);

		finderCache.clearCache(CannabisApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationStages cannabisApplicationStages) {

		entityCache.removeResult(
			CannabisApplicationStagesImpl.class, cannabisApplicationStages);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationStages> cannabisApplicationStageses) {

		for (CannabisApplicationStages cannabisApplicationStages :
				cannabisApplicationStageses) {

			entityCache.removeResult(
				CannabisApplicationStagesImpl.class, cannabisApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationStagesModelImpl cannabisApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationStagesModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CAI, args,
			cannabisApplicationStagesModelImpl);

		args = new Object[] {
			cannabisApplicationStagesModelImpl.getCaseId(),
			cannabisApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName, args,
			cannabisApplicationStagesModelImpl);

		args = new Object[] {
			cannabisApplicationStagesModelImpl.getCaseId(),
			cannabisApplicationStagesModelImpl.getStageName(),
			cannabisApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageStatus, args,
			cannabisApplicationStagesModelImpl);

		args = new Object[] {
			cannabisApplicationStagesModelImpl.getCaseId(),
			cannabisApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdAndStatus, args,
			cannabisApplicationStagesModelImpl);
	}

	/**
	 * Creates a new cannabis application stages with the primary key. Does not add the cannabis application stages to the database.
	 *
	 * @param cannabisApplicationstageId the primary key for the new cannabis application stages
	 * @return the new cannabis application stages
	 */
	@Override
	public CannabisApplicationStages create(long cannabisApplicationstageId) {
		CannabisApplicationStages cannabisApplicationStages =
			new CannabisApplicationStagesImpl();

		cannabisApplicationStages.setNew(true);
		cannabisApplicationStages.setPrimaryKey(cannabisApplicationstageId);

		cannabisApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationStages;
	}

	/**
	 * Removes the cannabis application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages that was removed
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages remove(long cannabisApplicationstageId)
		throws NoSuchCannabisApplicationStagesException {

		return remove((Serializable)cannabisApplicationstageId);
	}

	/**
	 * Removes the cannabis application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application stages
	 * @return the cannabis application stages that was removed
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationStages cannabisApplicationStages =
				(CannabisApplicationStages)session.get(
					CannabisApplicationStagesImpl.class, primaryKey);

			if (cannabisApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationStages);
		}
		catch (NoSuchCannabisApplicationStagesException noSuchEntityException) {
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
	protected CannabisApplicationStages removeImpl(
		CannabisApplicationStages cannabisApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationStages)) {
				cannabisApplicationStages =
					(CannabisApplicationStages)session.get(
						CannabisApplicationStagesImpl.class,
						cannabisApplicationStages.getPrimaryKeyObj());
			}

			if (cannabisApplicationStages != null) {
				session.delete(cannabisApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationStages != null) {
			clearCache(cannabisApplicationStages);
		}

		return cannabisApplicationStages;
	}

	@Override
	public CannabisApplicationStages updateImpl(
		CannabisApplicationStages cannabisApplicationStages) {

		boolean isNew = cannabisApplicationStages.isNew();

		if (!(cannabisApplicationStages instanceof
				CannabisApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationStages implementation " +
					cannabisApplicationStages.getClass());
		}

		CannabisApplicationStagesModelImpl cannabisApplicationStagesModelImpl =
			(CannabisApplicationStagesModelImpl)cannabisApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisApplicationStages.setCreateDate(date);
			}
			else {
				cannabisApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationStages.setModifiedDate(date);
			}
			else {
				cannabisApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationStages);
			}
			else {
				cannabisApplicationStages =
					(CannabisApplicationStages)session.merge(
						cannabisApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationStagesImpl.class,
			cannabisApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationStagesModelImpl);

		if (isNew) {
			cannabisApplicationStages.setNew(false);
		}

		cannabisApplicationStages.resetOriginalValues();

		return cannabisApplicationStages;
	}

	/**
	 * Returns the cannabis application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application stages
	 * @return the cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisApplicationStagesException {

		CannabisApplicationStages cannabisApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (cannabisApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationStages;
	}

	/**
	 * Returns the cannabis application stages with the primary key or throws a <code>NoSuchCannabisApplicationStagesException</code> if it could not be found.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages
	 * @throws NoSuchCannabisApplicationStagesException if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages findByPrimaryKey(
			long cannabisApplicationstageId)
		throws NoSuchCannabisApplicationStagesException {

		return findByPrimaryKey((Serializable)cannabisApplicationstageId);
	}

	/**
	 * Returns the cannabis application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationstageId the primary key of the cannabis application stages
	 * @return the cannabis application stages, or <code>null</code> if a cannabis application stages with the primary key could not be found
	 */
	@Override
	public CannabisApplicationStages fetchByPrimaryKey(
		long cannabisApplicationstageId) {

		return fetchByPrimaryKey((Serializable)cannabisApplicationstageId);
	}

	/**
	 * Returns all the cannabis application stageses.
	 *
	 * @return the cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @return the range of cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application stageses
	 * @param end the upper bound of the range of cannabis application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application stageses
	 */
	@Override
	public List<CannabisApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationStages> orderByComparator,
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

		List<CannabisApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONSTAGES;

				sql = sql.concat(
					CannabisApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationStages>)QueryUtil.list(
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
	 * Removes all the cannabis application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationStages cannabisApplicationStages : findAll()) {
			remove(cannabisApplicationStages);
		}
	}

	/**
	 * Returns the number of cannabis application stageses.
	 *
	 * @return the number of cannabis application stageses
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
					_SQL_COUNT_CANNABISAPPLICATIONSTAGES);

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
		return "cannabisApplicationstageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application stages persistence.
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

		_finderPathFetchBygetCAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathFetchBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetCAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetCAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetCAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetCAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetCAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetCAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathWithPaginationFindBygetCAS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCAS_StageName_StageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"stageStatus", "stageName"}, true);

		_finderPathWithoutPaginationFindBygetCAS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCAS_StageName_StageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageStatus", "stageName"}, true);

		_finderPathCountBygetCAS_StageName_StageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_StageName_StageStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageStatus", "stageName"}, false);

		_finderPathWithPaginationFindBygetCAS_StageNameStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetCAS_StageNameStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetCAS_StageNameStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCAS_StageNameStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetCAS_StageNameStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_StageNameStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		CannabisApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(CannabisApplicationStagesImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISAPPLICATIONSTAGES =
		"SELECT cannabisApplicationStages FROM CannabisApplicationStages cannabisApplicationStages";

	private static final String _SQL_SELECT_CANNABISAPPLICATIONSTAGES_WHERE =
		"SELECT cannabisApplicationStages FROM CannabisApplicationStages cannabisApplicationStages WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONSTAGES =
		"SELECT COUNT(cannabisApplicationStages) FROM CannabisApplicationStages cannabisApplicationStages";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(cannabisApplicationStages) FROM CannabisApplicationStages cannabisApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}