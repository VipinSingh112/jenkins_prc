/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service.persistence.impl;

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

import com.nbp.manufacturing.application.stages.services.exception.NoSuchManufacturingApplicationStagesException;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStages;
import com.nbp.manufacturing.application.stages.services.model.ManufacturingApplicationStagesTable;
import com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesImpl;
import com.nbp.manufacturing.application.stages.services.model.impl.ManufacturingApplicationStagesModelImpl;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingApplicationStagesPersistence;
import com.nbp.manufacturing.application.stages.services.service.persistence.ManufacturingApplicationStagesUtil;
import com.nbp.manufacturing.application.stages.services.service.persistence.impl.constants.MANUFACTURING_STAGESPersistenceConstants;

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
 * The persistence implementation for the manufacturing application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = ManufacturingApplicationStagesPersistence.class)
public class ManufacturingApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<ManufacturingApplicationStages>
	implements ManufacturingApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ManufacturingApplicationStagesUtil</code> to access the manufacturing application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ManufacturingApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetMAS_MAI;
	private FinderPath _finderPathCountBygetMAS_MAI;

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_MAI(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_MAI(manufacturingApplicationId);

		if (manufacturingApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("manufacturingApplicationId=");
			sb.append(manufacturingApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingApplicationStagesException(
				sb.toString());
		}

		return manufacturingApplicationStages;
	}

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_MAI(
		long manufacturingApplicationId) {

		return fetchBygetMAS_MAI(manufacturingApplicationId, true);
	}

	/**
	 * Returns the manufacturing application stages where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_MAI(
		long manufacturingApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {manufacturingApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMAS_MAI, finderArgs, this);
		}

		if (result instanceof ManufacturingApplicationStages) {
			ManufacturingApplicationStages manufacturingApplicationStages =
				(ManufacturingApplicationStages)result;

			if (manufacturingApplicationId !=
					manufacturingApplicationStages.
						getManufacturingApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMAS_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

				List<ManufacturingApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMAS_MAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									manufacturingApplicationId
								};
							}

							_log.warn(
								"ManufacturingApplicationStagesPersistenceImpl.fetchBygetMAS_MAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplicationStages
						manufacturingApplicationStages = list.get(0);

					result = manufacturingApplicationStages;

					cacheResult(manufacturingApplicationStages);
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
			return (ManufacturingApplicationStages)result;
		}
	}

	/**
	 * Removes the manufacturing application stages where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manufacturing application stages that was removed
	 */
	@Override
	public ManufacturingApplicationStages removeBygetMAS_MAI(
			long manufacturingApplicationId)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			findBygetMAS_MAI(manufacturingApplicationId);

		return remove(manufacturingApplicationStages);
	}

	/**
	 * Returns the number of manufacturing application stageses where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_MAI(long manufacturingApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMAS_MAI;

		Object[] finderArgs = new Object[] {manufacturingApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETMAS_MAI_MANUFACTURINGAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(manufacturingApplicationId);

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
		_FINDER_COLUMN_GETMAS_MAI_MANUFACTURINGAPPLICATIONID_2 =
			"manufacturingApplicationStages.manufacturingApplicationId = ?";

	private FinderPath _finderPathFetchBygetMAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetMAS_CaseIdStageName;

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_CaseIdStageName(caseId, stageName);

		if (manufacturingApplicationStages == null) {
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

			throw new NoSuchManufacturingApplicationStagesException(
				sb.toString());
		}

		return manufacturingApplicationStages;
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetMAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageName(
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
				_finderPathFetchBygetMAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof ManufacturingApplicationStages) {
			ManufacturingApplicationStages manufacturingApplicationStages =
				(ManufacturingApplicationStages)result;

			if (!Objects.equals(
					caseId, manufacturingApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, manufacturingApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<ManufacturingApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMAS_CaseIdStageName,
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
								"ManufacturingApplicationStagesPersistenceImpl.fetchBygetMAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplicationStages
						manufacturingApplicationStages = list.get(0);

					result = manufacturingApplicationStages;

					cacheResult(manufacturingApplicationStages);
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
			return (ManufacturingApplicationStages)result;
		}
	}

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the manufacturing application stages that was removed
	 */
	@Override
	public ManufacturingApplicationStages removeBygetMAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			findBygetMAS_CaseIdStageName(caseId, stageName);

		return remove(manufacturingApplicationStages);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_CASEID_2 =
		"manufacturingApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_CASEID_3 =
		"(manufacturingApplicationStages.caseId IS NULL OR manufacturingApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_STAGENAME_2 =
			"manufacturingApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(manufacturingApplicationStages.stageName IS NULL OR manufacturingApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetMAS_CaseIdStageStatus;

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_CaseIdStageStatus(caseId, stageStatus, stageName);

		if (manufacturingApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchManufacturingApplicationStagesException(
				sb.toString());
		}

		return manufacturingApplicationStages;
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetMAS_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof ManufacturingApplicationStages) {
			ManufacturingApplicationStages manufacturingApplicationStages =
				(ManufacturingApplicationStages)result;

			if (!Objects.equals(
					caseId, manufacturingApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus,
					manufacturingApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, manufacturingApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<ManufacturingApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMAS_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageStatus, stageName
								};
							}

							_log.warn(
								"ManufacturingApplicationStagesPersistenceImpl.fetchBygetMAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplicationStages
						manufacturingApplicationStages = list.get(0);

					result = manufacturingApplicationStages;

					cacheResult(manufacturingApplicationStages);
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
			return (ManufacturingApplicationStages)result;
		}
	}

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the manufacturing application stages that was removed
	 */
	@Override
	public ManufacturingApplicationStages removeBygetMAS_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			findBygetMAS_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(manufacturingApplicationStages);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_CASEID_2 =
			"manufacturingApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(manufacturingApplicationStages.caseId IS NULL OR manufacturingApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"manufacturingApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(manufacturingApplicationStages.stageStatus IS NULL OR manufacturingApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"manufacturingApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(manufacturingApplicationStages.stageName IS NULL OR manufacturingApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetMAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetMAS_CaseIdAndStatus;

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_CaseIdAndStatus(caseId, stageStatus);

		if (manufacturingApplicationStages == null) {
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

			throw new NoSuchManufacturingApplicationStagesException(
				sb.toString());
		}

		return manufacturingApplicationStages;
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetMAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the manufacturing application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseIdAndStatus(
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
				_finderPathFetchBygetMAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof ManufacturingApplicationStages) {
			ManufacturingApplicationStages manufacturingApplicationStages =
				(ManufacturingApplicationStages)result;

			if (!Objects.equals(
					caseId, manufacturingApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus,
					manufacturingApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<ManufacturingApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMAS_CaseIdAndStatus,
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
								"ManufacturingApplicationStagesPersistenceImpl.fetchBygetMAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					ManufacturingApplicationStages
						manufacturingApplicationStages = list.get(0);

					result = manufacturingApplicationStages;

					cacheResult(manufacturingApplicationStages);
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
			return (ManufacturingApplicationStages)result;
		}
	}

	/**
	 * Removes the manufacturing application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the manufacturing application stages that was removed
	 */
	@Override
	public ManufacturingApplicationStages removeBygetMAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			findBygetMAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(manufacturingApplicationStages);
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetMAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_CASEID_2 =
		"manufacturingApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_CASEID_3 =
		"(manufacturingApplicationStages.caseId IS NULL OR manufacturingApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"manufacturingApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETMAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(manufacturingApplicationStages.stageStatus IS NULL OR manufacturingApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetMAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetMAS_CaseId;
	private FinderPath _finderPathCountBygetMAS_CaseId;

	/**
	 * Returns all the manufacturing application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId) {

		return findBygetMAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end) {

		return findBygetMAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return findBygetMAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<ManufacturingApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManufacturingApplicationStages
						manufacturingApplicationStages : list) {

					if (!caseId.equals(
							manufacturingApplicationStages.getCaseId())) {

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

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<ManufacturingApplicationStages>)QueryUtil.list(
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
	 * Returns the first manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_CaseId_First(
			String caseId,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_CaseId_First(caseId, orderByComparator);

		if (manufacturingApplicationStages != null) {
			return manufacturingApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchManufacturingApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseId_First(
		String caseId,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		List<ManufacturingApplicationStages> list = findBygetMAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_CaseId_Last(
			String caseId,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_CaseId_Last(caseId, orderByComparator);

		if (manufacturingApplicationStages != null) {
			return manufacturingApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchManufacturingApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_CaseId_Last(
		String caseId,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		int count = countBygetMAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<ManufacturingApplicationStages> list = findBygetMAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where caseId = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages[] findBygetMAS_CaseId_PrevAndNext(
			long manufacturingAppStagesId, String caseId,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		ManufacturingApplicationStages manufacturingApplicationStages =
			findByPrimaryKey(manufacturingAppStagesId);

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplicationStages[] array =
				new ManufacturingApplicationStagesImpl[3];

			array[0] = getBygetMAS_CaseId_PrevAndNext(
				session, manufacturingApplicationStages, caseId,
				orderByComparator, true);

			array[1] = manufacturingApplicationStages;

			array[2] = getBygetMAS_CaseId_PrevAndNext(
				session, manufacturingApplicationStages, caseId,
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

	protected ManufacturingApplicationStages getBygetMAS_CaseId_PrevAndNext(
		Session session,
		ManufacturingApplicationStages manufacturingApplicationStages,
		String caseId,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETMAS_CASEID_CASEID_2);
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
			sb.append(ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						manufacturingApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManufacturingApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manufacturing application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetMAS_CaseId(String caseId) {
		for (ManufacturingApplicationStages manufacturingApplicationStages :
				findBygetMAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(manufacturingApplicationStages);
		}
	}

	/**
	 * Returns the number of manufacturing application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMAS_CASEID_CASEID_2 =
		"manufacturingApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETMAS_CASEID_CASEID_3 =
		"(manufacturingApplicationStages.caseId IS NULL OR manufacturingApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMAS_SN_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetMAS_SN_Status;
	private FinderPath _finderPathCountBygetMAS_SN_Status;

	/**
	 * Returns all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName) {

		return findBygetMAS_SN_Status(
			stageStatus, stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName, int start, int end) {

		return findBygetMAS_SN_Status(stageStatus, stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return findBygetMAS_SN_Status(
			stageStatus, stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_SN_Status(
		String stageStatus, String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMAS_SN_Status;
				finderArgs = new Object[] {stageStatus, stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMAS_SN_Status;
			finderArgs = new Object[] {
				stageStatus, stageName, start, end, orderByComparator
			};
		}

		List<ManufacturingApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManufacturingApplicationStages
						manufacturingApplicationStages : list) {

					if (!stageStatus.equals(
							manufacturingApplicationStages.getStageStatus()) ||
						!stageName.equals(
							manufacturingApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<ManufacturingApplicationStages>)QueryUtil.list(
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
	 * Returns the first manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_SN_Status_First(
			String stageStatus, String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_SN_Status_First(
				stageStatus, stageName, orderByComparator);

		if (manufacturingApplicationStages != null) {
			return manufacturingApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageStatus=");
		sb.append(stageStatus);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchManufacturingApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_SN_Status_First(
		String stageStatus, String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		List<ManufacturingApplicationStages> list = findBygetMAS_SN_Status(
			stageStatus, stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_SN_Status_Last(
			String stageStatus, String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_SN_Status_Last(
				stageStatus, stageName, orderByComparator);

		if (manufacturingApplicationStages != null) {
			return manufacturingApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageStatus=");
		sb.append(stageStatus);

		sb.append(", stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchManufacturingApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_SN_Status_Last(
		String stageStatus, String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		int count = countBygetMAS_SN_Status(stageStatus, stageName);

		if (count == 0) {
			return null;
		}

		List<ManufacturingApplicationStages> list = findBygetMAS_SN_Status(
			stageStatus, stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages[] findBygetMAS_SN_Status_PrevAndNext(
			long manufacturingAppStagesId, String stageStatus, String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		ManufacturingApplicationStages manufacturingApplicationStages =
			findByPrimaryKey(manufacturingAppStagesId);

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplicationStages[] array =
				new ManufacturingApplicationStagesImpl[3];

			array[0] = getBygetMAS_SN_Status_PrevAndNext(
				session, manufacturingApplicationStages, stageStatus, stageName,
				orderByComparator, true);

			array[1] = manufacturingApplicationStages;

			array[2] = getBygetMAS_SN_Status_PrevAndNext(
				session, manufacturingApplicationStages, stageStatus, stageName,
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

	protected ManufacturingApplicationStages getBygetMAS_SN_Status_PrevAndNext(
		Session session,
		ManufacturingApplicationStages manufacturingApplicationStages,
		String stageStatus, String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_2);
		}

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_2);
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
			sb.append(ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						manufacturingApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManufacturingApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manufacturing application stageses where stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetMAS_SN_Status(String stageStatus, String stageName) {
		for (ManufacturingApplicationStages manufacturingApplicationStages :
				findBygetMAS_SN_Status(
					stageStatus, stageName, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(manufacturingApplicationStages);
		}
	}

	/**
	 * Returns the number of manufacturing application stageses where stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_SN_Status(String stageStatus, String stageName) {
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMAS_SN_Status;

		Object[] finderArgs = new Object[] {stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_2 =
		"manufacturingApplicationStages.stageStatus = ? AND ";

	private static final String _FINDER_COLUMN_GETMAS_SN_STATUS_STAGESTATUS_3 =
		"(manufacturingApplicationStages.stageStatus IS NULL OR manufacturingApplicationStages.stageStatus = '') AND ";

	private static final String _FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_2 =
		"manufacturingApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETMAS_SN_STATUS_STAGENAME_3 =
		"(manufacturingApplicationStages.stageName IS NULL OR manufacturingApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetMAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetMAS_StageName;
	private FinderPath _finderPathCountBygetMAS_StageName;

	/**
	 * Returns all the manufacturing application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName) {

		return findBygetMAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName, int start, int end) {

		return findBygetMAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return findBygetMAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findBygetMAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<ManufacturingApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ManufacturingApplicationStages
						manufacturingApplicationStages : list) {

					if (!stageName.equals(
							manufacturingApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<ManufacturingApplicationStages>)QueryUtil.list(
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
	 * Returns the first manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_StageName_First(
			String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_StageName_First(stageName, orderByComparator);

		if (manufacturingApplicationStages != null) {
			return manufacturingApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchManufacturingApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_StageName_First(
		String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		List<ManufacturingApplicationStages> list = findBygetMAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages findBygetMAS_StageName_Last(
			String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchBygetMAS_StageName_Last(stageName, orderByComparator);

		if (manufacturingApplicationStages != null) {
			return manufacturingApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchManufacturingApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manufacturing application stages, or <code>null</code> if a matching manufacturing application stages could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchBygetMAS_StageName_Last(
		String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		int count = countBygetMAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<ManufacturingApplicationStages> list = findBygetMAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the manufacturing application stageses before and after the current manufacturing application stages in the ordered set where stageName = &#63;.
	 *
	 * @param manufacturingAppStagesId the primary key of the current manufacturing application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages[] findBygetMAS_StageName_PrevAndNext(
			long manufacturingAppStagesId, String stageName,
			OrderByComparator<ManufacturingApplicationStages> orderByComparator)
		throws NoSuchManufacturingApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		ManufacturingApplicationStages manufacturingApplicationStages =
			findByPrimaryKey(manufacturingAppStagesId);

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplicationStages[] array =
				new ManufacturingApplicationStagesImpl[3];

			array[0] = getBygetMAS_StageName_PrevAndNext(
				session, manufacturingApplicationStages, stageName,
				orderByComparator, true);

			array[1] = manufacturingApplicationStages;

			array[2] = getBygetMAS_StageName_PrevAndNext(
				session, manufacturingApplicationStages, stageName,
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

	protected ManufacturingApplicationStages getBygetMAS_StageName_PrevAndNext(
		Session session,
		ManufacturingApplicationStages manufacturingApplicationStages,
		String stageName,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_2);
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
			sb.append(ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						manufacturingApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ManufacturingApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the manufacturing application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetMAS_StageName(String stageName) {
		for (ManufacturingApplicationStages manufacturingApplicationStages :
				findBygetMAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(manufacturingApplicationStages);
		}
	}

	/**
	 * Returns the number of manufacturing application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching manufacturing application stageses
	 */
	@Override
	public int countBygetMAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetMAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_2 =
		"manufacturingApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETMAS_STAGENAME_STAGENAME_3 =
		"(manufacturingApplicationStages.stageName IS NULL OR manufacturingApplicationStages.stageName = '')";

	public ManufacturingApplicationStagesPersistenceImpl() {
		setModelClass(ManufacturingApplicationStages.class);

		setModelImplClass(ManufacturingApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(ManufacturingApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the manufacturing application stages in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplicationStages the manufacturing application stages
	 */
	@Override
	public void cacheResult(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		entityCache.putResult(
			ManufacturingApplicationStagesImpl.class,
			manufacturingApplicationStages.getPrimaryKey(),
			manufacturingApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMAS_MAI,
			new Object[] {
				manufacturingApplicationStages.getManufacturingApplicationId()
			},
			manufacturingApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMAS_CaseIdStageName,
			new Object[] {
				manufacturingApplicationStages.getCaseId(),
				manufacturingApplicationStages.getStageName()
			},
			manufacturingApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMAS_CaseIdStageStatus,
			new Object[] {
				manufacturingApplicationStages.getCaseId(),
				manufacturingApplicationStages.getStageStatus(),
				manufacturingApplicationStages.getStageName()
			},
			manufacturingApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetMAS_CaseIdAndStatus,
			new Object[] {
				manufacturingApplicationStages.getCaseId(),
				manufacturingApplicationStages.getStageStatus()
			},
			manufacturingApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the manufacturing application stageses in the entity cache if it is enabled.
	 *
	 * @param manufacturingApplicationStageses the manufacturing application stageses
	 */
	@Override
	public void cacheResult(
		List<ManufacturingApplicationStages> manufacturingApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (manufacturingApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (ManufacturingApplicationStages manufacturingApplicationStages :
				manufacturingApplicationStageses) {

			if (entityCache.getResult(
					ManufacturingApplicationStagesImpl.class,
					manufacturingApplicationStages.getPrimaryKey()) == null) {

				cacheResult(manufacturingApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all manufacturing application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ManufacturingApplicationStagesImpl.class);

		finderCache.clearCache(ManufacturingApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the manufacturing application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		entityCache.removeResult(
			ManufacturingApplicationStagesImpl.class,
			manufacturingApplicationStages);
	}

	@Override
	public void clearCache(
		List<ManufacturingApplicationStages> manufacturingApplicationStageses) {

		for (ManufacturingApplicationStages manufacturingApplicationStages :
				manufacturingApplicationStageses) {

			entityCache.removeResult(
				ManufacturingApplicationStagesImpl.class,
				manufacturingApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ManufacturingApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ManufacturingApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ManufacturingApplicationStagesModelImpl
			manufacturingApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			manufacturingApplicationStagesModelImpl.
				getManufacturingApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetMAS_MAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMAS_MAI, args,
			manufacturingApplicationStagesModelImpl);

		args = new Object[] {
			manufacturingApplicationStagesModelImpl.getCaseId(),
			manufacturingApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMAS_CaseIdStageName, args,
			manufacturingApplicationStagesModelImpl);

		args = new Object[] {
			manufacturingApplicationStagesModelImpl.getCaseId(),
			manufacturingApplicationStagesModelImpl.getStageStatus(),
			manufacturingApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetMAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMAS_CaseIdStageStatus, args,
			manufacturingApplicationStagesModelImpl);

		args = new Object[] {
			manufacturingApplicationStagesModelImpl.getCaseId(),
			manufacturingApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetMAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMAS_CaseIdAndStatus, args,
			manufacturingApplicationStagesModelImpl);
	}

	/**
	 * Creates a new manufacturing application stages with the primary key. Does not add the manufacturing application stages to the database.
	 *
	 * @param manufacturingAppStagesId the primary key for the new manufacturing application stages
	 * @return the new manufacturing application stages
	 */
	@Override
	public ManufacturingApplicationStages create(
		long manufacturingAppStagesId) {

		ManufacturingApplicationStages manufacturingApplicationStages =
			new ManufacturingApplicationStagesImpl();

		manufacturingApplicationStages.setNew(true);
		manufacturingApplicationStages.setPrimaryKey(manufacturingAppStagesId);

		manufacturingApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return manufacturingApplicationStages;
	}

	/**
	 * Removes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages remove(long manufacturingAppStagesId)
		throws NoSuchManufacturingApplicationStagesException {

		return remove((Serializable)manufacturingAppStagesId);
	}

	/**
	 * Removes the manufacturing application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the manufacturing application stages
	 * @return the manufacturing application stages that was removed
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages remove(Serializable primaryKey)
		throws NoSuchManufacturingApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			ManufacturingApplicationStages manufacturingApplicationStages =
				(ManufacturingApplicationStages)session.get(
					ManufacturingApplicationStagesImpl.class, primaryKey);

			if (manufacturingApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchManufacturingApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(manufacturingApplicationStages);
		}
		catch (NoSuchManufacturingApplicationStagesException
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
	protected ManufacturingApplicationStages removeImpl(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(manufacturingApplicationStages)) {
				manufacturingApplicationStages =
					(ManufacturingApplicationStages)session.get(
						ManufacturingApplicationStagesImpl.class,
						manufacturingApplicationStages.getPrimaryKeyObj());
			}

			if (manufacturingApplicationStages != null) {
				session.delete(manufacturingApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (manufacturingApplicationStages != null) {
			clearCache(manufacturingApplicationStages);
		}

		return manufacturingApplicationStages;
	}

	@Override
	public ManufacturingApplicationStages updateImpl(
		ManufacturingApplicationStages manufacturingApplicationStages) {

		boolean isNew = manufacturingApplicationStages.isNew();

		if (!(manufacturingApplicationStages instanceof
				ManufacturingApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					manufacturingApplicationStages.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					manufacturingApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in manufacturingApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ManufacturingApplicationStages implementation " +
					manufacturingApplicationStages.getClass());
		}

		ManufacturingApplicationStagesModelImpl
			manufacturingApplicationStagesModelImpl =
				(ManufacturingApplicationStagesModelImpl)
					manufacturingApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (manufacturingApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				manufacturingApplicationStages.setCreateDate(date);
			}
			else {
				manufacturingApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!manufacturingApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				manufacturingApplicationStages.setModifiedDate(date);
			}
			else {
				manufacturingApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(manufacturingApplicationStages);
			}
			else {
				manufacturingApplicationStages =
					(ManufacturingApplicationStages)session.merge(
						manufacturingApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ManufacturingApplicationStagesImpl.class,
			manufacturingApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(manufacturingApplicationStagesModelImpl);

		if (isNew) {
			manufacturingApplicationStages.setNew(false);
		}

		manufacturingApplicationStages.resetOriginalValues();

		return manufacturingApplicationStages;
	}

	/**
	 * Returns the manufacturing application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchManufacturingApplicationStagesException {

		ManufacturingApplicationStages manufacturingApplicationStages =
			fetchByPrimaryKey(primaryKey);

		if (manufacturingApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchManufacturingApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return manufacturingApplicationStages;
	}

	/**
	 * Returns the manufacturing application stages with the primary key or throws a <code>NoSuchManufacturingApplicationStagesException</code> if it could not be found.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages
	 * @throws NoSuchManufacturingApplicationStagesException if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages findByPrimaryKey(
			long manufacturingAppStagesId)
		throws NoSuchManufacturingApplicationStagesException {

		return findByPrimaryKey((Serializable)manufacturingAppStagesId);
	}

	/**
	 * Returns the manufacturing application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manufacturingAppStagesId the primary key of the manufacturing application stages
	 * @return the manufacturing application stages, or <code>null</code> if a manufacturing application stages with the primary key could not be found
	 */
	@Override
	public ManufacturingApplicationStages fetchByPrimaryKey(
		long manufacturingAppStagesId) {

		return fetchByPrimaryKey((Serializable)manufacturingAppStagesId);
	}

	/**
	 * Returns all the manufacturing application stageses.
	 *
	 * @return the manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @return the range of manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the manufacturing application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManufacturingApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manufacturing application stageses
	 * @param end the upper bound of the range of manufacturing application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manufacturing application stageses
	 */
	@Override
	public List<ManufacturingApplicationStages> findAll(
		int start, int end,
		OrderByComparator<ManufacturingApplicationStages> orderByComparator,
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

		List<ManufacturingApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<ManufacturingApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES;

				sql = sql.concat(
					ManufacturingApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ManufacturingApplicationStages>)QueryUtil.list(
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
	 * Removes all the manufacturing application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ManufacturingApplicationStages manufacturingApplicationStages :
				findAll()) {

			remove(manufacturingApplicationStages);
		}
	}

	/**
	 * Returns the number of manufacturing application stageses.
	 *
	 * @return the number of manufacturing application stageses
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
					_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES);

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
		return "manufacturingAppStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ManufacturingApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the manufacturing application stages persistence.
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

		_finderPathFetchBygetMAS_MAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMAS_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, true);

		_finderPathCountBygetMAS_MAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMAS_MAI",
			new String[] {Long.class.getName()},
			new String[] {"manufacturingApplicationId"}, false);

		_finderPathFetchBygetMAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetMAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetMAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetMAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetMAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetMAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetMAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetMAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMAS_SN_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMAS_SN_Status",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageStatus", "stageName"}, true);

		_finderPathWithoutPaginationFindBygetMAS_SN_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMAS_SN_Status",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageStatus", "stageName"}, true);

		_finderPathCountBygetMAS_SN_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMAS_SN_Status",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageStatus", "stageName"}, false);

		_finderPathWithPaginationFindBygetMAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetMAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetMAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		ManufacturingApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		ManufacturingApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(
			ManufacturingApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MANUFACTURING_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES =
		"SELECT manufacturingApplicationStages FROM ManufacturingApplicationStages manufacturingApplicationStages";

	private static final String
		_SQL_SELECT_MANUFACTURINGAPPLICATIONSTAGES_WHERE =
			"SELECT manufacturingApplicationStages FROM ManufacturingApplicationStages manufacturingApplicationStages WHERE ";

	private static final String _SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES =
		"SELECT COUNT(manufacturingApplicationStages) FROM ManufacturingApplicationStages manufacturingApplicationStages";

	private static final String
		_SQL_COUNT_MANUFACTURINGAPPLICATIONSTAGES_WHERE =
			"SELECT COUNT(manufacturingApplicationStages) FROM ManufacturingApplicationStages manufacturingApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"manufacturingApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ManufacturingApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ManufacturingApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ManufacturingApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}