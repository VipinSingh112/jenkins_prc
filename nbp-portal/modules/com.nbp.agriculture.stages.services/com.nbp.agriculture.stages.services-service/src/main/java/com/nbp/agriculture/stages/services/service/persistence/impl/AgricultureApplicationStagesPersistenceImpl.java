/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence.impl;

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

import com.nbp.agriculture.stages.services.exception.NoSuchAgricultureApplicationStagesException;
import com.nbp.agriculture.stages.services.model.AgricultureApplicationStages;
import com.nbp.agriculture.stages.services.model.AgricultureApplicationStagesTable;
import com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesImpl;
import com.nbp.agriculture.stages.services.model.impl.AgricultureApplicationStagesModelImpl;
import com.nbp.agriculture.stages.services.service.persistence.AgricultureApplicationStagesPersistence;
import com.nbp.agriculture.stages.services.service.persistence.AgricultureApplicationStagesUtil;
import com.nbp.agriculture.stages.services.service.persistence.impl.constants.NBP_AGRIPersistenceConstants;

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
 * The persistence implementation for the agriculture application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureApplicationStagesPersistence.class)
public class AgricultureApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<AgricultureApplicationStages>
	implements AgricultureApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureApplicationStagesUtil</code> to access the agriculture application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByAAS_CAI;
	private FinderPath _finderPathCountByAAS_CAI;

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_CAI(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_CAI(agricultureApplicationId);

		if (agricultureApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApplicationStagesException(
				sb.toString());
		}

		return agricultureApplicationStages;
	}

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CAI(
		long agricultureApplicationId) {

		return fetchByAAS_CAI(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture application stages where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CAI(
		long agricultureApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {agricultureApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByAAS_CAI, finderArgs, this);
		}

		if (result instanceof AgricultureApplicationStages) {
			AgricultureApplicationStages agricultureApplicationStages =
				(AgricultureApplicationStages)result;

			if (agricultureApplicationId !=
					agricultureApplicationStages.
						getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_AAS_CAI_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByAAS_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									agricultureApplicationId
								};
							}

							_log.warn(
								"AgricultureApplicationStagesPersistenceImpl.fetchByAAS_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplicationStages agricultureApplicationStages =
						list.get(0);

					result = agricultureApplicationStages;

					cacheResult(agricultureApplicationStages);
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
			return (AgricultureApplicationStages)result;
		}
	}

	/**
	 * Removes the agriculture application stages where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture application stages that was removed
	 */
	@Override
	public AgricultureApplicationStages removeByAAS_CAI(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			findByAAS_CAI(agricultureApplicationId);

		return remove(agricultureApplicationStages);
	}

	/**
	 * Returns the number of agriculture application stageses where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countByAAS_CAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountByAAS_CAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_AAS_CAI_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_AAS_CAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureApplicationStages.agricultureApplicationId = ?";

	private FinderPath _finderPathFetchByAAS_CaseIdStageName;
	private FinderPath _finderPathCountByAAS_CaseIdStageName;

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_CaseIdStageName(caseId, stageName);

		if (agricultureApplicationStages == null) {
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

			throw new NoSuchAgricultureApplicationStagesException(
				sb.toString());
		}

		return agricultureApplicationStages;
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchByAAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseIdStageName(
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
				_finderPathFetchByAAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof AgricultureApplicationStages) {
			AgricultureApplicationStages agricultureApplicationStages =
				(AgricultureApplicationStages)result;

			if (!Objects.equals(
					caseId, agricultureApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, agricultureApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<AgricultureApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByAAS_CaseIdStageName, finderArgs,
							list);
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
								"AgricultureApplicationStagesPersistenceImpl.fetchByAAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplicationStages agricultureApplicationStages =
						list.get(0);

					result = agricultureApplicationStages;

					cacheResult(agricultureApplicationStages);
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
			return (AgricultureApplicationStages)result;
		}
	}

	/**
	 * Removes the agriculture application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the agriculture application stages that was removed
	 */
	@Override
	public AgricultureApplicationStages removeByAAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			findByAAS_CaseIdStageName(caseId, stageName);

		return remove(agricultureApplicationStages);
	}

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countByAAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountByAAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_AAS_CASEIDSTAGENAME_CASEID_2 =
		"agricultureApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_AAS_CASEIDSTAGENAME_CASEID_3 =
		"(agricultureApplicationStages.caseId IS NULL OR agricultureApplicationStages.caseId = '') AND ";

	private static final String _FINDER_COLUMN_AAS_CASEIDSTAGENAME_STAGENAME_2 =
		"agricultureApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_AAS_CASEIDSTAGENAME_STAGENAME_3 =
		"(agricultureApplicationStages.stageName IS NULL OR agricultureApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindByAAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindByAAS_StageName;
	private FinderPath _finderPathCountByAAS_StageName;

	/**
	 * Returns all the agriculture application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName) {

		return findByAAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end) {

		return findByAAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return findByAAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<AgricultureApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureApplicationStages agricultureApplicationStages :
						list) {

					if (!stageName.equals(
							agricultureApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<AgricultureApplicationStages>)QueryUtil.list(
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
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_StageName_First(
			String stageName,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_StageName_First(stageName, orderByComparator);

		if (agricultureApplicationStages != null) {
			return agricultureApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchAgricultureApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_StageName_First(
		String stageName,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		List<AgricultureApplicationStages> list = findByAAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_StageName_Last(
			String stageName,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_StageName_Last(stageName, orderByComparator);

		if (agricultureApplicationStages != null) {
			return agricultureApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchAgricultureApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_StageName_Last(
		String stageName,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		int count = countByAAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<AgricultureApplicationStages> list = findByAAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where stageName = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages[] findByAAS_StageName_PrevAndNext(
			long agricultureApplicationstageId, String stageName,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		AgricultureApplicationStages agricultureApplicationStages =
			findByPrimaryKey(agricultureApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			AgricultureApplicationStages[] array =
				new AgricultureApplicationStagesImpl[3];

			array[0] = getByAAS_StageName_PrevAndNext(
				session, agricultureApplicationStages, stageName,
				orderByComparator, true);

			array[1] = agricultureApplicationStages;

			array[2] = getByAAS_StageName_PrevAndNext(
				session, agricultureApplicationStages, stageName,
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

	protected AgricultureApplicationStages getByAAS_StageName_PrevAndNext(
		Session session,
		AgricultureApplicationStages agricultureApplicationStages,
		String stageName,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_AAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_AAS_STAGENAME_STAGENAME_2);
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
			sb.append(AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						agricultureApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeByAAS_StageName(String stageName) {
		for (AgricultureApplicationStages agricultureApplicationStages :
				findByAAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(agricultureApplicationStages);
		}
	}

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countByAAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountByAAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_AAS_STAGENAME_STAGENAME_2 =
		"agricultureApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_AAS_STAGENAME_STAGENAME_3 =
		"(agricultureApplicationStages.stageName IS NULL OR agricultureApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchByAAS_CaseIdStageStatus;
	private FinderPath _finderPathCountByAAS_CaseIdStageStatus;

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (agricultureApplicationStages == null) {
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

			throw new NoSuchAgricultureApplicationStagesException(
				sb.toString());
		}

		return agricultureApplicationStages;
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchByAAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseIdStageStatus(
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
				_finderPathFetchByAAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof AgricultureApplicationStages) {
			AgricultureApplicationStages agricultureApplicationStages =
				(AgricultureApplicationStages)result;

			if (!Objects.equals(
					caseId, agricultureApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, agricultureApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus,
					agricultureApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<AgricultureApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByAAS_CaseIdStageStatus, finderArgs,
							list);
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
								"AgricultureApplicationStagesPersistenceImpl.fetchByAAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplicationStages agricultureApplicationStages =
						list.get(0);

					result = agricultureApplicationStages;

					cacheResult(agricultureApplicationStages);
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
			return (AgricultureApplicationStages)result;
		}
	}

	/**
	 * Removes the agriculture application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the agriculture application stages that was removed
	 */
	@Override
	public AgricultureApplicationStages removeByAAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			findByAAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(agricultureApplicationStages);
	}

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countByAAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByAAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_CASEID_2 =
		"agricultureApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_CASEID_3 =
		"(agricultureApplicationStages.caseId IS NULL OR agricultureApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"agricultureApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(agricultureApplicationStages.stageName IS NULL OR agricultureApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"agricultureApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_AAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(agricultureApplicationStages.stageStatus IS NULL OR agricultureApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchByAAS_CaseIdAndStatus;
	private FinderPath _finderPathCountByAAS_CaseIdAndStatus;

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_CaseIdAndStatus(
			String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_CaseIdAndStatus(stageName, stageStatus);

		if (agricultureApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApplicationStagesException(
				sb.toString());
		}

		return agricultureApplicationStages;
	}

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseIdAndStatus(
		String stageName, String stageStatus) {

		return fetchByAAS_CaseIdAndStatus(stageName, stageStatus, true);
	}

	/**
	 * Returns the agriculture application stages where stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseIdAndStatus(
		String stageName, String stageStatus, boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {stageName, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByAAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof AgricultureApplicationStages) {
			AgricultureApplicationStages agricultureApplicationStages =
				(AgricultureApplicationStages)result;

			if (!Objects.equals(
					stageName, agricultureApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus,
					agricultureApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<AgricultureApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByAAS_CaseIdAndStatus, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									stageName, stageStatus
								};
							}

							_log.warn(
								"AgricultureApplicationStagesPersistenceImpl.fetchByAAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplicationStages agricultureApplicationStages =
						list.get(0);

					result = agricultureApplicationStages;

					cacheResult(agricultureApplicationStages);
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
			return (AgricultureApplicationStages)result;
		}
	}

	/**
	 * Removes the agriculture application stages where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the agriculture application stages that was removed
	 */
	@Override
	public AgricultureApplicationStages removeByAAS_CaseIdAndStatus(
			String stageName, String stageStatus)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			findByAAS_CaseIdAndStatus(stageName, stageStatus);

		return remove(agricultureApplicationStages);
	}

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countByAAS_CaseIdAndStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByAAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGENAME_2 =
		"agricultureApplicationStages.stageName = ? AND ";

	private static final String _FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGENAME_3 =
		"(agricultureApplicationStages.stageName IS NULL OR agricultureApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"agricultureApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_AAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(agricultureApplicationStages.stageStatus IS NULL OR agricultureApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetAgricultureBy_SN_SS;
	private FinderPath _finderPathWithoutPaginationFindBygetAgricultureBy_SN_SS;
	private FinderPath _finderPathCountBygetAgricultureBy_SN_SS;

	/**
	 * Returns all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus) {

		return findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus, int start, int end) {

		return findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAgricultureBy_SN_SS;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAgricultureBy_SN_SS;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<AgricultureApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureApplicationStages agricultureApplicationStages :
						list) {

					if (!stageName.equals(
							agricultureApplicationStages.getStageName()) ||
						!stageStatus.equals(
							agricultureApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<AgricultureApplicationStages>)QueryUtil.list(
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
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findBygetAgricultureBy_SN_SS_First(
			String stageName, String stageStatus,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchBygetAgricultureBy_SN_SS_First(
				stageName, stageStatus, orderByComparator);

		if (agricultureApplicationStages != null) {
			return agricultureApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchAgricultureApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchBygetAgricultureBy_SN_SS_First(
		String stageName, String stageStatus,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		List<AgricultureApplicationStages> list = findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findBygetAgricultureBy_SN_SS_Last(
			String stageName, String stageStatus,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchBygetAgricultureBy_SN_SS_Last(
				stageName, stageStatus, orderByComparator);

		if (agricultureApplicationStages != null) {
			return agricultureApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchAgricultureApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchBygetAgricultureBy_SN_SS_Last(
		String stageName, String stageStatus,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		int count = countBygetAgricultureBy_SN_SS(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<AgricultureApplicationStages> list = findBygetAgricultureBy_SN_SS(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages[]
			findBygetAgricultureBy_SN_SS_PrevAndNext(
				long agricultureApplicationstageId, String stageName,
				String stageStatus,
				OrderByComparator<AgricultureApplicationStages>
					orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		AgricultureApplicationStages agricultureApplicationStages =
			findByPrimaryKey(agricultureApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			AgricultureApplicationStages[] array =
				new AgricultureApplicationStagesImpl[3];

			array[0] = getBygetAgricultureBy_SN_SS_PrevAndNext(
				session, agricultureApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = agricultureApplicationStages;

			array[2] = getBygetAgricultureBy_SN_SS_PrevAndNext(
				session, agricultureApplicationStages, stageName, stageStatus,
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

	protected AgricultureApplicationStages
		getBygetAgricultureBy_SN_SS_PrevAndNext(
			Session session,
			AgricultureApplicationStages agricultureApplicationStages,
			String stageName, String stageStatus,
			OrderByComparator<AgricultureApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_2);
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
			sb.append(AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						agricultureApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus) {

		for (AgricultureApplicationStages agricultureApplicationStages :
				findBygetAgricultureBy_SN_SS(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureApplicationStages);
		}
	}

	/**
	 * Returns the number of agriculture application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countBygetAgricultureBy_SN_SS(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetAgricultureBy_SN_SS;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_2 =
			"agricultureApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGENAME_3 =
			"(agricultureApplicationStages.stageName IS NULL OR agricultureApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_2 =
			"agricultureApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREBY_SN_SS_STAGESTATUS_3 =
			"(agricultureApplicationStages.stageStatus IS NULL OR agricultureApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindByAAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindByAAS_CaseId;
	private FinderPath _finderPathCountByAAS_CaseId;

	/**
	 * Returns all the agriculture application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_CaseId(String caseId) {
		return findByAAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end) {

		return findByAAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return findByAAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findByAAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<AgricultureApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureApplicationStages agricultureApplicationStages :
						list) {

					if (!caseId.equals(
							agricultureApplicationStages.getCaseId())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_AAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<AgricultureApplicationStages>)QueryUtil.list(
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
	 * Returns the first agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_CaseId_First(
			String caseId,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_CaseId_First(caseId, orderByComparator);

		if (agricultureApplicationStages != null) {
			return agricultureApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAgricultureApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseId_First(
		String caseId,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		List<AgricultureApplicationStages> list = findByAAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages findByAAS_CaseId_Last(
			String caseId,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByAAS_CaseId_Last(caseId, orderByComparator);

		if (agricultureApplicationStages != null) {
			return agricultureApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAgricultureApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application stages, or <code>null</code> if a matching agriculture application stages could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByAAS_CaseId_Last(
		String caseId,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		int count = countByAAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<AgricultureApplicationStages> list = findByAAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture application stageses before and after the current agriculture application stages in the ordered set where caseId = &#63;.
	 *
	 * @param agricultureApplicationstageId the primary key of the current agriculture application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages[] findByAAS_CaseId_PrevAndNext(
			long agricultureApplicationstageId, String caseId,
			OrderByComparator<AgricultureApplicationStages> orderByComparator)
		throws NoSuchAgricultureApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		AgricultureApplicationStages agricultureApplicationStages =
			findByPrimaryKey(agricultureApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			AgricultureApplicationStages[] array =
				new AgricultureApplicationStagesImpl[3];

			array[0] = getByAAS_CaseId_PrevAndNext(
				session, agricultureApplicationStages, caseId,
				orderByComparator, true);

			array[1] = agricultureApplicationStages;

			array[2] = getByAAS_CaseId_PrevAndNext(
				session, agricultureApplicationStages, caseId,
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

	protected AgricultureApplicationStages getByAAS_CaseId_PrevAndNext(
		Session session,
		AgricultureApplicationStages agricultureApplicationStages,
		String caseId,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_AAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_AAS_CASEID_CASEID_2);
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
			sb.append(AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						agricultureApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeByAAS_CaseId(String caseId) {
		for (AgricultureApplicationStages agricultureApplicationStages :
				findByAAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(agricultureApplicationStages);
		}
	}

	/**
	 * Returns the number of agriculture application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture application stageses
	 */
	@Override
	public int countByAAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByAAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_AAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_AAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_AAS_CASEID_CASEID_2 =
		"agricultureApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_AAS_CASEID_CASEID_3 =
		"(agricultureApplicationStages.caseId IS NULL OR agricultureApplicationStages.caseId = '')";

	public AgricultureApplicationStagesPersistenceImpl() {
		setModelClass(AgricultureApplicationStages.class);

		setModelImplClass(AgricultureApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the agriculture application stages in the entity cache if it is enabled.
	 *
	 * @param agricultureApplicationStages the agriculture application stages
	 */
	@Override
	public void cacheResult(
		AgricultureApplicationStages agricultureApplicationStages) {

		entityCache.putResult(
			AgricultureApplicationStagesImpl.class,
			agricultureApplicationStages.getPrimaryKey(),
			agricultureApplicationStages);

		finderCache.putResult(
			_finderPathFetchByAAS_CAI,
			new Object[] {
				agricultureApplicationStages.getAgricultureApplicationId()
			},
			agricultureApplicationStages);

		finderCache.putResult(
			_finderPathFetchByAAS_CaseIdStageName,
			new Object[] {
				agricultureApplicationStages.getCaseId(),
				agricultureApplicationStages.getStageName()
			},
			agricultureApplicationStages);

		finderCache.putResult(
			_finderPathFetchByAAS_CaseIdStageStatus,
			new Object[] {
				agricultureApplicationStages.getCaseId(),
				agricultureApplicationStages.getStageName(),
				agricultureApplicationStages.getStageStatus()
			},
			agricultureApplicationStages);

		finderCache.putResult(
			_finderPathFetchByAAS_CaseIdAndStatus,
			new Object[] {
				agricultureApplicationStages.getStageName(),
				agricultureApplicationStages.getStageStatus()
			},
			agricultureApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture application stageses in the entity cache if it is enabled.
	 *
	 * @param agricultureApplicationStageses the agriculture application stageses
	 */
	@Override
	public void cacheResult(
		List<AgricultureApplicationStages> agricultureApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureApplicationStages agricultureApplicationStages :
				agricultureApplicationStageses) {

			if (entityCache.getResult(
					AgricultureApplicationStagesImpl.class,
					agricultureApplicationStages.getPrimaryKey()) == null) {

				cacheResult(agricultureApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureApplicationStagesImpl.class);

		finderCache.clearCache(AgricultureApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the agriculture application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AgricultureApplicationStages agricultureApplicationStages) {

		entityCache.removeResult(
			AgricultureApplicationStagesImpl.class,
			agricultureApplicationStages);
	}

	@Override
	public void clearCache(
		List<AgricultureApplicationStages> agricultureApplicationStageses) {

		for (AgricultureApplicationStages agricultureApplicationStages :
				agricultureApplicationStageses) {

			entityCache.removeResult(
				AgricultureApplicationStagesImpl.class,
				agricultureApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureApplicationStagesModelImpl
			agricultureApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			agricultureApplicationStagesModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(_finderPathCountByAAS_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByAAS_CAI, args,
			agricultureApplicationStagesModelImpl);

		args = new Object[] {
			agricultureApplicationStagesModelImpl.getCaseId(),
			agricultureApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountByAAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByAAS_CaseIdStageName, args,
			agricultureApplicationStagesModelImpl);

		args = new Object[] {
			agricultureApplicationStagesModelImpl.getCaseId(),
			agricultureApplicationStagesModelImpl.getStageName(),
			agricultureApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByAAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByAAS_CaseIdStageStatus, args,
			agricultureApplicationStagesModelImpl);

		args = new Object[] {
			agricultureApplicationStagesModelImpl.getStageName(),
			agricultureApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByAAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByAAS_CaseIdAndStatus, args,
			agricultureApplicationStagesModelImpl);
	}

	/**
	 * Creates a new agriculture application stages with the primary key. Does not add the agriculture application stages to the database.
	 *
	 * @param agricultureApplicationstageId the primary key for the new agriculture application stages
	 * @return the new agriculture application stages
	 */
	@Override
	public AgricultureApplicationStages create(
		long agricultureApplicationstageId) {

		AgricultureApplicationStages agricultureApplicationStages =
			new AgricultureApplicationStagesImpl();

		agricultureApplicationStages.setNew(true);
		agricultureApplicationStages.setPrimaryKey(
			agricultureApplicationstageId);

		agricultureApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return agricultureApplicationStages;
	}

	/**
	 * Removes the agriculture application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages that was removed
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages remove(
			long agricultureApplicationstageId)
		throws NoSuchAgricultureApplicationStagesException {

		return remove((Serializable)agricultureApplicationstageId);
	}

	/**
	 * Removes the agriculture application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture application stages
	 * @return the agriculture application stages that was removed
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages remove(Serializable primaryKey)
		throws NoSuchAgricultureApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			AgricultureApplicationStages agricultureApplicationStages =
				(AgricultureApplicationStages)session.get(
					AgricultureApplicationStagesImpl.class, primaryKey);

			if (agricultureApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureApplicationStages);
		}
		catch (NoSuchAgricultureApplicationStagesException
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
	protected AgricultureApplicationStages removeImpl(
		AgricultureApplicationStages agricultureApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureApplicationStages)) {
				agricultureApplicationStages =
					(AgricultureApplicationStages)session.get(
						AgricultureApplicationStagesImpl.class,
						agricultureApplicationStages.getPrimaryKeyObj());
			}

			if (agricultureApplicationStages != null) {
				session.delete(agricultureApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureApplicationStages != null) {
			clearCache(agricultureApplicationStages);
		}

		return agricultureApplicationStages;
	}

	@Override
	public AgricultureApplicationStages updateImpl(
		AgricultureApplicationStages agricultureApplicationStages) {

		boolean isNew = agricultureApplicationStages.isNew();

		if (!(agricultureApplicationStages instanceof
				AgricultureApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					agricultureApplicationStages.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureApplicationStages implementation " +
					agricultureApplicationStages.getClass());
		}

		AgricultureApplicationStagesModelImpl
			agricultureApplicationStagesModelImpl =
				(AgricultureApplicationStagesModelImpl)
					agricultureApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureApplicationStages.setCreateDate(date);
			}
			else {
				agricultureApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureApplicationStages.setModifiedDate(date);
			}
			else {
				agricultureApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureApplicationStages);
			}
			else {
				agricultureApplicationStages =
					(AgricultureApplicationStages)session.merge(
						agricultureApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureApplicationStagesImpl.class,
			agricultureApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(agricultureApplicationStagesModelImpl);

		if (isNew) {
			agricultureApplicationStages.setNew(false);
		}

		agricultureApplicationStages.resetOriginalValues();

		return agricultureApplicationStages;
	}

	/**
	 * Returns the agriculture application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture application stages
	 * @return the agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchAgricultureApplicationStagesException {

		AgricultureApplicationStages agricultureApplicationStages =
			fetchByPrimaryKey(primaryKey);

		if (agricultureApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureApplicationStages;
	}

	/**
	 * Returns the agriculture application stages with the primary key or throws a <code>NoSuchAgricultureApplicationStagesException</code> if it could not be found.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages
	 * @throws NoSuchAgricultureApplicationStagesException if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages findByPrimaryKey(
			long agricultureApplicationstageId)
		throws NoSuchAgricultureApplicationStagesException {

		return findByPrimaryKey((Serializable)agricultureApplicationstageId);
	}

	/**
	 * Returns the agriculture application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApplicationstageId the primary key of the agriculture application stages
	 * @return the agriculture application stages, or <code>null</code> if a agriculture application stages with the primary key could not be found
	 */
	@Override
	public AgricultureApplicationStages fetchByPrimaryKey(
		long agricultureApplicationstageId) {

		return fetchByPrimaryKey((Serializable)agricultureApplicationstageId);
	}

	/**
	 * Returns all the agriculture application stageses.
	 *
	 * @return the agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @return the range of agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture application stageses
	 * @param end the upper bound of the range of agriculture application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture application stageses
	 */
	@Override
	public List<AgricultureApplicationStages> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplicationStages> orderByComparator,
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

		List<AgricultureApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES;

				sql = sql.concat(
					AgricultureApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureApplicationStages>)QueryUtil.list(
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
	 * Removes all the agriculture application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureApplicationStages agricultureApplicationStages :
				findAll()) {

			remove(agricultureApplicationStages);
		}
	}

	/**
	 * Returns the number of agriculture application stageses.
	 *
	 * @return the number of agriculture application stageses
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
					_SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES);

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
		return "agricultureApplicationstageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture application stages persistence.
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

		_finderPathFetchByAAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByAAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountByAAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		_finderPathFetchByAAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByAAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountByAAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindByAAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindByAAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountByAAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathFetchByAAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByAAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountByAAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchByAAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByAAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountByAAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByAAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetAgricultureBy_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetAgricultureBy_SN_SS",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetAgricultureBy_SN_SS =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAgricultureBy_SN_SS",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetAgricultureBy_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureBy_SN_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathWithPaginationFindByAAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindByAAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountByAAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AgricultureApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(
			AgricultureApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_AGRIPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES =
		"SELECT agricultureApplicationStages FROM AgricultureApplicationStages agricultureApplicationStages";

	private static final String _SQL_SELECT_AGRICULTUREAPPLICATIONSTAGES_WHERE =
		"SELECT agricultureApplicationStages FROM AgricultureApplicationStages agricultureApplicationStages WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES =
		"SELECT COUNT(agricultureApplicationStages) FROM AgricultureApplicationStages agricultureApplicationStages";

	private static final String _SQL_COUNT_AGRICULTUREAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(agricultureApplicationStages) FROM AgricultureApplicationStages agricultureApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}