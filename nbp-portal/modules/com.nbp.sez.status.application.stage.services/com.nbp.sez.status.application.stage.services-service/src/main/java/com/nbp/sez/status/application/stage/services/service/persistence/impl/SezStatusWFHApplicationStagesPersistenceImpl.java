/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.stage.services.service.persistence.impl;

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

import com.nbp.sez.status.application.stage.services.exception.NoSuchSezStatusWFHApplicationStagesException;
import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStages;
import com.nbp.sez.status.application.stage.services.model.SezStatusWFHApplicationStagesTable;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesImpl;
import com.nbp.sez.status.application.stage.services.model.impl.SezStatusWFHApplicationStagesModelImpl;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusWFHApplicationStagesPersistence;
import com.nbp.sez.status.application.stage.services.service.persistence.SezStatusWFHApplicationStagesUtil;
import com.nbp.sez.status.application.stage.services.service.persistence.impl.constants.SEZ_STATUS_STAGESPersistenceConstants;

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
 * The persistence implementation for the sez status wfh application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusWFHApplicationStagesPersistence.class)
public class SezStatusWFHApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<SezStatusWFHApplicationStages>
	implements SezStatusWFHApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusWFHApplicationStagesUtil</code> to access the sez status wfh application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusWFHApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSAS_SAI;
	private FinderPath _finderPathCountBygetSAS_SAI;

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_SAI(sezStatusApplicationId);

		if (sezStatusWFHApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusWFHApplicationStagesException(
				sb.toString());
		}

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId) {

		return fetchBygetSAS_SAI(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez status wfh application stages where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_SAI(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSAS_SAI, finderArgs, this);
		}

		if (result instanceof SezStatusWFHApplicationStages) {
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
				(SezStatusWFHApplicationStages)result;

			if (sezStatusApplicationId !=
					sezStatusWFHApplicationStages.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETSAS_SAI_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezStatusWFHApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_SAI, finderArgs, list);
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
								"SezStatusWFHApplicationStagesPersistenceImpl.fetchBygetSAS_SAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages = list.get(0);

					result = sezStatusWFHApplicationStages;

					cacheResult(sezStatusWFHApplicationStages);
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
			return (SezStatusWFHApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status wfh application stages where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez status wfh application stages that was removed
	 */
	@Override
	public SezStatusWFHApplicationStages removeBygetSAS_SAI(
			long sezStatusApplicationId)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			findBygetSAS_SAI(sezStatusApplicationId);

		return remove(sezStatusWFHApplicationStages);
	}

	/**
	 * Returns the number of sez status wfh application stageses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez status wfh application stageses
	 */
	@Override
	public int countBygetSAS_SAI(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSAS_SAI;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETSAS_SAI_SEZSTATUSAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETSAS_SAI_SEZSTATUSAPPLICATIONID_2 =
			"sezStatusWFHApplicationStages.sezStatusApplicationId = ?";

	private FinderPath _finderPathFetchBygetSAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetSAS_CaseIdStageName;

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_CaseIdStageName(caseId, stageName);

		if (sezStatusWFHApplicationStages == null) {
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

			throw new NoSuchSezStatusWFHApplicationStagesException(
				sb.toString());
		}

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetSAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageName(
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
				_finderPathFetchBygetSAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof SezStatusWFHApplicationStages) {
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
				(SezStatusWFHApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusWFHApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, sezStatusWFHApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<SezStatusWFHApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_CaseIdStageName,
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
								"SezStatusWFHApplicationStagesPersistenceImpl.fetchBygetSAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages = list.get(0);

					result = sezStatusWFHApplicationStages;

					cacheResult(sezStatusWFHApplicationStages);
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
			return (SezStatusWFHApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the sez status wfh application stages that was removed
	 */
	@Override
	public SezStatusWFHApplicationStages removeBygetSAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			findBygetSAS_CaseIdStageName(caseId, stageName);

		return remove(sezStatusWFHApplicationStages);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching sez status wfh application stageses
	 */
	@Override
	public int countBygetSAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_2 =
		"sezStatusWFHApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_CASEID_3 =
		"(sezStatusWFHApplicationStages.caseId IS NULL OR sezStatusWFHApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_2 =
			"sezStatusWFHApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(sezStatusWFHApplicationStages.stageName IS NULL OR sezStatusWFHApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetSAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetSAS_StageName;
	private FinderPath _finderPathCountBygetSAS_StageName;

	/**
	 * Returns all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName) {

		return findBygetSAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end) {

		return findBygetSAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return findBygetSAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<SezStatusWFHApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWFHApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages : list) {

					if (!stageName.equals(
							sezStatusWFHApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusWFHApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusWFHApplicationStages>)QueryUtil.list(
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
	 * Returns the first sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_StageName_First(
			String stageName,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_StageName_First(stageName, orderByComparator);

		if (sezStatusWFHApplicationStages != null) {
			return sezStatusWFHApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchSezStatusWFHApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_StageName_First(
		String stageName,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		List<SezStatusWFHApplicationStages> list = findBygetSAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_StageName_Last(
			String stageName,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_StageName_Last(stageName, orderByComparator);

		if (sezStatusWFHApplicationStages != null) {
			return sezStatusWFHApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchSezStatusWFHApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_StageName_Last(
		String stageName,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		int count = countBygetSAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<SezStatusWFHApplicationStages> list = findBygetSAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status wfh application stageses before and after the current sez status wfh application stages in the ordered set where stageName = &#63;.
	 *
	 * @param sezWFHAppStagesId the primary key of the current sez status wfh application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages[] findBygetSAS_StageName_PrevAndNext(
			long sezWFHAppStagesId, String stageName,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			findByPrimaryKey(sezWFHAppStagesId);

		Session session = null;

		try {
			session = openSession();

			SezStatusWFHApplicationStages[] array =
				new SezStatusWFHApplicationStagesImpl[3];

			array[0] = getBygetSAS_StageName_PrevAndNext(
				session, sezStatusWFHApplicationStages, stageName,
				orderByComparator, true);

			array[1] = sezStatusWFHApplicationStages;

			array[2] = getBygetSAS_StageName_PrevAndNext(
				session, sezStatusWFHApplicationStages, stageName,
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

	protected SezStatusWFHApplicationStages getBygetSAS_StageName_PrevAndNext(
		Session session,
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages,
		String stageName,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2);
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
			sb.append(SezStatusWFHApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						sezStatusWFHApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusWFHApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status wfh application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetSAS_StageName(String stageName) {
		for (SezStatusWFHApplicationStages sezStatusWFHApplicationStages :
				findBygetSAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusWFHApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status wfh application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching sez status wfh application stageses
	 */
	@Override
	public int countBygetSAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetSAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_2 =
		"sezStatusWFHApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETSAS_STAGENAME_STAGENAME_3 =
		"(sezStatusWFHApplicationStages.stageName IS NULL OR sezStatusWFHApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetSAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetSAS_CaseIdStageStatus;

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (sezStatusWFHApplicationStages == null) {
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

			throw new NoSuchSezStatusWFHApplicationStagesException(
				sb.toString());
		}

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetSAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdStageStatus(
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
				_finderPathFetchBygetSAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof SezStatusWFHApplicationStages) {
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
				(SezStatusWFHApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusWFHApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, sezStatusWFHApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus,
					sezStatusWFHApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<SezStatusWFHApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_CaseIdStageStatus,
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
								"SezStatusWFHApplicationStagesPersistenceImpl.fetchBygetSAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages = list.get(0);

					result = sezStatusWFHApplicationStages;

					cacheResult(sezStatusWFHApplicationStages);
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
			return (SezStatusWFHApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the sez status wfh application stages that was removed
	 */
	@Override
	public SezStatusWFHApplicationStages removeBygetSAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			findBygetSAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(sezStatusWFHApplicationStages);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching sez status wfh application stageses
	 */
	@Override
	public int countBygetSAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_2 =
			"sezStatusWFHApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(sezStatusWFHApplicationStages.caseId IS NULL OR sezStatusWFHApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"sezStatusWFHApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(sezStatusWFHApplicationStages.stageName IS NULL OR sezStatusWFHApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"sezStatusWFHApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(sezStatusWFHApplicationStages.stageStatus IS NULL OR sezStatusWFHApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetSAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetSAS_CaseIdAndStatus;

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_CaseIdAndStatus(caseId, stageStatus);

		if (sezStatusWFHApplicationStages == null) {
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

			throw new NoSuchSezStatusWFHApplicationStagesException(
				sb.toString());
		}

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetSAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseIdAndStatus(
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
				_finderPathFetchBygetSAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof SezStatusWFHApplicationStages) {
			SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
				(SezStatusWFHApplicationStages)result;

			if (!Objects.equals(
					caseId, sezStatusWFHApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus,
					sezStatusWFHApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<SezStatusWFHApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSAS_CaseIdAndStatus,
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
								"SezStatusWFHApplicationStagesPersistenceImpl.fetchBygetSAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages = list.get(0);

					result = sezStatusWFHApplicationStages;

					cacheResult(sezStatusWFHApplicationStages);
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
			return (SezStatusWFHApplicationStages)result;
		}
	}

	/**
	 * Removes the sez status wfh application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the sez status wfh application stages that was removed
	 */
	@Override
	public SezStatusWFHApplicationStages removeBygetSAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			findBygetSAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(sezStatusWFHApplicationStages);
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching sez status wfh application stageses
	 */
	@Override
	public int countBygetSAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_2 =
		"sezStatusWFHApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_CASEID_3 =
		"(sezStatusWFHApplicationStages.caseId IS NULL OR sezStatusWFHApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"sezStatusWFHApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETSAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(sezStatusWFHApplicationStages.stageStatus IS NULL OR sezStatusWFHApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetSAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetSAS_CaseId;
	private FinderPath _finderPathCountBygetSAS_CaseId;

	/**
	 * Returns all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId) {

		return findBygetSAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end) {

		return findBygetSAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return findBygetSAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findBygetSAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<SezStatusWFHApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWFHApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusWFHApplicationStages
						sezStatusWFHApplicationStages : list) {

					if (!caseId.equals(
							sezStatusWFHApplicationStages.getCaseId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusWFHApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<SezStatusWFHApplicationStages>)QueryUtil.list(
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
	 * Returns the first sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_CaseId_First(
			String caseId,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_CaseId_First(caseId, orderByComparator);

		if (sezStatusWFHApplicationStages != null) {
			return sezStatusWFHApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchSezStatusWFHApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseId_First(
		String caseId,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		List<SezStatusWFHApplicationStages> list = findBygetSAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findBygetSAS_CaseId_Last(
			String caseId,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchBygetSAS_CaseId_Last(caseId, orderByComparator);

		if (sezStatusWFHApplicationStages != null) {
			return sezStatusWFHApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchSezStatusWFHApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status wfh application stages, or <code>null</code> if a matching sez status wfh application stages could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchBygetSAS_CaseId_Last(
		String caseId,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		int count = countBygetSAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<SezStatusWFHApplicationStages> list = findBygetSAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status wfh application stageses before and after the current sez status wfh application stages in the ordered set where caseId = &#63;.
	 *
	 * @param sezWFHAppStagesId the primary key of the current sez status wfh application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages[] findBygetSAS_CaseId_PrevAndNext(
			long sezWFHAppStagesId, String caseId,
			OrderByComparator<SezStatusWFHApplicationStages> orderByComparator)
		throws NoSuchSezStatusWFHApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			findByPrimaryKey(sezWFHAppStagesId);

		Session session = null;

		try {
			session = openSession();

			SezStatusWFHApplicationStages[] array =
				new SezStatusWFHApplicationStagesImpl[3];

			array[0] = getBygetSAS_CaseId_PrevAndNext(
				session, sezStatusWFHApplicationStages, caseId,
				orderByComparator, true);

			array[1] = sezStatusWFHApplicationStages;

			array[2] = getBygetSAS_CaseId_PrevAndNext(
				session, sezStatusWFHApplicationStages, caseId,
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

	protected SezStatusWFHApplicationStages getBygetSAS_CaseId_PrevAndNext(
		Session session,
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages,
		String caseId,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_2);
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
			sb.append(SezStatusWFHApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						sezStatusWFHApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusWFHApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status wfh application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetSAS_CaseId(String caseId) {
		for (SezStatusWFHApplicationStages sezStatusWFHApplicationStages :
				findBygetSAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusWFHApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status wfh application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status wfh application stageses
	 */
	@Override
	public int countBygetSAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetSAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETSAS_CASEID_CASEID_2 =
		"sezStatusWFHApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETSAS_CASEID_CASEID_3 =
		"(sezStatusWFHApplicationStages.caseId IS NULL OR sezStatusWFHApplicationStages.caseId = '')";

	public SezStatusWFHApplicationStagesPersistenceImpl() {
		setModelClass(SezStatusWFHApplicationStages.class);

		setModelImplClass(SezStatusWFHApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusWFHApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the sez status wfh application stages in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFHApplicationStages the sez status wfh application stages
	 */
	@Override
	public void cacheResult(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		entityCache.putResult(
			SezStatusWFHApplicationStagesImpl.class,
			sezStatusWFHApplicationStages.getPrimaryKey(),
			sezStatusWFHApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_SAI,
			new Object[] {
				sezStatusWFHApplicationStages.getSezStatusApplicationId()
			},
			sezStatusWFHApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageName,
			new Object[] {
				sezStatusWFHApplicationStages.getCaseId(),
				sezStatusWFHApplicationStages.getStageName()
			},
			sezStatusWFHApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageStatus,
			new Object[] {
				sezStatusWFHApplicationStages.getCaseId(),
				sezStatusWFHApplicationStages.getStageName(),
				sezStatusWFHApplicationStages.getStageStatus()
			},
			sezStatusWFHApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdAndStatus,
			new Object[] {
				sezStatusWFHApplicationStages.getCaseId(),
				sezStatusWFHApplicationStages.getStageStatus()
			},
			sezStatusWFHApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status wfh application stageses in the entity cache if it is enabled.
	 *
	 * @param sezStatusWFHApplicationStageses the sez status wfh application stageses
	 */
	@Override
	public void cacheResult(
		List<SezStatusWFHApplicationStages> sezStatusWFHApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusWFHApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusWFHApplicationStages sezStatusWFHApplicationStages :
				sezStatusWFHApplicationStageses) {

			if (entityCache.getResult(
					SezStatusWFHApplicationStagesImpl.class,
					sezStatusWFHApplicationStages.getPrimaryKey()) == null) {

				cacheResult(sezStatusWFHApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all sez status wfh application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusWFHApplicationStagesImpl.class);

		finderCache.clearCache(SezStatusWFHApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the sez status wfh application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		entityCache.removeResult(
			SezStatusWFHApplicationStagesImpl.class,
			sezStatusWFHApplicationStages);
	}

	@Override
	public void clearCache(
		List<SezStatusWFHApplicationStages> sezStatusWFHApplicationStageses) {

		for (SezStatusWFHApplicationStages sezStatusWFHApplicationStages :
				sezStatusWFHApplicationStageses) {

			entityCache.removeResult(
				SezStatusWFHApplicationStagesImpl.class,
				sezStatusWFHApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusWFHApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusWFHApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusWFHApplicationStagesModelImpl
			sezStatusWFHApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			sezStatusWFHApplicationStagesModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_SAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_SAI, args,
			sezStatusWFHApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusWFHApplicationStagesModelImpl.getCaseId(),
			sezStatusWFHApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageName, args,
			sezStatusWFHApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusWFHApplicationStagesModelImpl.getCaseId(),
			sezStatusWFHApplicationStagesModelImpl.getStageName(),
			sezStatusWFHApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdStageStatus, args,
			sezStatusWFHApplicationStagesModelImpl);

		args = new Object[] {
			sezStatusWFHApplicationStagesModelImpl.getCaseId(),
			sezStatusWFHApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetSAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSAS_CaseIdAndStatus, args,
			sezStatusWFHApplicationStagesModelImpl);
	}

	/**
	 * Creates a new sez status wfh application stages with the primary key. Does not add the sez status wfh application stages to the database.
	 *
	 * @param sezWFHAppStagesId the primary key for the new sez status wfh application stages
	 * @return the new sez status wfh application stages
	 */
	@Override
	public SezStatusWFHApplicationStages create(long sezWFHAppStagesId) {
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			new SezStatusWFHApplicationStagesImpl();

		sezStatusWFHApplicationStages.setNew(true);
		sezStatusWFHApplicationStages.setPrimaryKey(sezWFHAppStagesId);

		sezStatusWFHApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Removes the sez status wfh application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages remove(long sezWFHAppStagesId)
		throws NoSuchSezStatusWFHApplicationStagesException {

		return remove((Serializable)sezWFHAppStagesId);
	}

	/**
	 * Removes the sez status wfh application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages that was removed
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages remove(Serializable primaryKey)
		throws NoSuchSezStatusWFHApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
				(SezStatusWFHApplicationStages)session.get(
					SezStatusWFHApplicationStagesImpl.class, primaryKey);

			if (sezStatusWFHApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusWFHApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusWFHApplicationStages);
		}
		catch (NoSuchSezStatusWFHApplicationStagesException
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
	protected SezStatusWFHApplicationStages removeImpl(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusWFHApplicationStages)) {
				sezStatusWFHApplicationStages =
					(SezStatusWFHApplicationStages)session.get(
						SezStatusWFHApplicationStagesImpl.class,
						sezStatusWFHApplicationStages.getPrimaryKeyObj());
			}

			if (sezStatusWFHApplicationStages != null) {
				session.delete(sezStatusWFHApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusWFHApplicationStages != null) {
			clearCache(sezStatusWFHApplicationStages);
		}

		return sezStatusWFHApplicationStages;
	}

	@Override
	public SezStatusWFHApplicationStages updateImpl(
		SezStatusWFHApplicationStages sezStatusWFHApplicationStages) {

		boolean isNew = sezStatusWFHApplicationStages.isNew();

		if (!(sezStatusWFHApplicationStages instanceof
				SezStatusWFHApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezStatusWFHApplicationStages.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusWFHApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusWFHApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusWFHApplicationStages implementation " +
					sezStatusWFHApplicationStages.getClass());
		}

		SezStatusWFHApplicationStagesModelImpl
			sezStatusWFHApplicationStagesModelImpl =
				(SezStatusWFHApplicationStagesModelImpl)
					sezStatusWFHApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusWFHApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusWFHApplicationStages.setCreateDate(date);
			}
			else {
				sezStatusWFHApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusWFHApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusWFHApplicationStages.setModifiedDate(date);
			}
			else {
				sezStatusWFHApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusWFHApplicationStages);
			}
			else {
				sezStatusWFHApplicationStages =
					(SezStatusWFHApplicationStages)session.merge(
						sezStatusWFHApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusWFHApplicationStagesImpl.class,
			sezStatusWFHApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(sezStatusWFHApplicationStagesModelImpl);

		if (isNew) {
			sezStatusWFHApplicationStages.setNew(false);
		}

		sezStatusWFHApplicationStages.resetOriginalValues();

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Returns the sez status wfh application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezStatusWFHApplicationStagesException {

		SezStatusWFHApplicationStages sezStatusWFHApplicationStages =
			fetchByPrimaryKey(primaryKey);

		if (sezStatusWFHApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusWFHApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusWFHApplicationStages;
	}

	/**
	 * Returns the sez status wfh application stages with the primary key or throws a <code>NoSuchSezStatusWFHApplicationStagesException</code> if it could not be found.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages
	 * @throws NoSuchSezStatusWFHApplicationStagesException if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages findByPrimaryKey(
			long sezWFHAppStagesId)
		throws NoSuchSezStatusWFHApplicationStagesException {

		return findByPrimaryKey((Serializable)sezWFHAppStagesId);
	}

	/**
	 * Returns the sez status wfh application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezWFHAppStagesId the primary key of the sez status wfh application stages
	 * @return the sez status wfh application stages, or <code>null</code> if a sez status wfh application stages with the primary key could not be found
	 */
	@Override
	public SezStatusWFHApplicationStages fetchByPrimaryKey(
		long sezWFHAppStagesId) {

		return fetchByPrimaryKey((Serializable)sezWFHAppStagesId);
	}

	/**
	 * Returns all the sez status wfh application stageses.
	 *
	 * @return the sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @return the range of sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status wfh application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusWFHApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status wfh application stageses
	 * @param end the upper bound of the range of sez status wfh application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status wfh application stageses
	 */
	@Override
	public List<SezStatusWFHApplicationStages> findAll(
		int start, int end,
		OrderByComparator<SezStatusWFHApplicationStages> orderByComparator,
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

		List<SezStatusWFHApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<SezStatusWFHApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES;

				sql = sql.concat(
					SezStatusWFHApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusWFHApplicationStages>)QueryUtil.list(
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
	 * Removes all the sez status wfh application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusWFHApplicationStages sezStatusWFHApplicationStages :
				findAll()) {

			remove(sezStatusWFHApplicationStages);
		}
	}

	/**
	 * Returns the number of sez status wfh application stageses.
	 *
	 * @return the number of sez status wfh application stageses
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
					_SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES);

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
		return "sezWFHAppStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusWFHApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status wfh application stages persistence.
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

		_finderPathFetchBygetSAS_SAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_SAI",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSAS_SAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSAS_SAI",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		_finderPathFetchBygetSAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetSAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetSAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetSAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetSAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetSAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetSAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetSAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetSAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetSAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetSAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		SezStatusWFHApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusWFHApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(
			SezStatusWFHApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES =
		"SELECT sezStatusWFHApplicationStages FROM SezStatusWFHApplicationStages sezStatusWFHApplicationStages";

	private static final String
		_SQL_SELECT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE =
			"SELECT sezStatusWFHApplicationStages FROM SezStatusWFHApplicationStages sezStatusWFHApplicationStages WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES =
		"SELECT COUNT(sezStatusWFHApplicationStages) FROM SezStatusWFHApplicationStages sezStatusWFHApplicationStages";

	private static final String _SQL_COUNT_SEZSTATUSWFHAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(sezStatusWFHApplicationStages) FROM SezStatusWFHApplicationStages sezStatusWFHApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusWFHApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusWFHApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusWFHApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusWFHApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}