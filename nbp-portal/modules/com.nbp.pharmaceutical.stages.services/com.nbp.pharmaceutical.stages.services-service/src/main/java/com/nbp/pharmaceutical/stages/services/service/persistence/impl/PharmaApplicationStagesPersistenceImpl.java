/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.pharmaceutical.stages.services.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationStagesException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStages;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationStagesTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationStagesModelImpl;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationStagesPersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationStagesUtil;
import com.nbp.pharmaceutical.stages.services.service.persistence.impl.constants.PHARMA_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the pharma application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {PharmaApplicationStagesPersistence.class, BasePersistence.class}
)
public class PharmaApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<PharmaApplicationStages>
	implements PharmaApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaApplicationStagesUtil</code> to access the pharma application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPS_CAI;
	private FinderPath _finderPathCountBygetPS_CAI;

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_CAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages = fetchBygetPS_CAI(
			pharmaApplicationId);

		if (pharmaApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationStagesException(sb.toString());
		}

		return pharmaApplicationStages;
	}

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CAI(long pharmaApplicationId) {
		return fetchBygetPS_CAI(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma application stages where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CAI(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPS_CAI, finderArgs,this);
		}

		if (result instanceof PharmaApplicationStages) {
			PharmaApplicationStages pharmaApplicationStages =
				(PharmaApplicationStages)result;

			if (pharmaApplicationId !=
					pharmaApplicationStages.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETPS_CAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPS_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaApplicationStagesPersistenceImpl.fetchBygetPS_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationStages pharmaApplicationStages = list.get(
						0);

					result = pharmaApplicationStages;

					cacheResult(pharmaApplicationStages);
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
			return (PharmaApplicationStages)result;
		}
	}

	/**
	 * Removes the pharma application stages where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application stages that was removed
	 */
	@Override
	public PharmaApplicationStages removeBygetPS_CAI(long pharmaApplicationId)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages = findBygetPS_CAI(
			pharmaApplicationId);

		return remove(pharmaApplicationStages);
	}

	/**
	 * Returns the number of pharma application stageses where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_CAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPS_CAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETPS_CAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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

	private static final String _FINDER_COLUMN_GETPS_CAI_PHARMAAPPLICATIONID_2 =
		"pharmaApplicationStages.pharmaApplicationId = ?";

	private FinderPath _finderPathFetchBygetPS_CaseIdStageName;
	private FinderPath _finderPathCountBygetPS_CaseIdStageName;

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_CaseIdStageName(caseId, stageName);

		if (pharmaApplicationStages == null) {
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

			throw new NoSuchPharmaApplicationStagesException(sb.toString());
		}

		return pharmaApplicationStages;
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetPS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CaseIdStageName(
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
				_finderPathFetchBygetPS_CaseIdStageName, finderArgs,this);
		}

		if (result instanceof PharmaApplicationStages) {
			PharmaApplicationStages pharmaApplicationStages =
				(PharmaApplicationStages)result;

			if (!Objects.equals(caseId, pharmaApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, pharmaApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<PharmaApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPS_CaseIdStageName, finderArgs,
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
								"PharmaApplicationStagesPersistenceImpl.fetchBygetPS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationStages pharmaApplicationStages = list.get(
						0);

					result = pharmaApplicationStages;

					cacheResult(pharmaApplicationStages);
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
			return (PharmaApplicationStages)result;
		}
	}

	/**
	 * Removes the pharma application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the pharma application stages that was removed
	 */
	@Override
	public PharmaApplicationStages removeBygetPS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			findBygetPS_CaseIdStageName(caseId, stageName);

		return remove(pharmaApplicationStages);
	}

	/**
	 * Returns the number of pharma application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetPS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETPS_CASEIDSTAGENAME_CASEID_2 =
		"pharmaApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETPS_CASEIDSTAGENAME_CASEID_3 =
		"(pharmaApplicationStages.caseId IS NULL OR pharmaApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_STAGENAME_2 =
			"pharmaApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETPS_CASEIDSTAGENAME_STAGENAME_3 =
			"(pharmaApplicationStages.stageName IS NULL OR pharmaApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetPS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetPS_StageName;
	private FinderPath _finderPathCountBygetPS_StageName;

	/**
	 * Returns all the pharma application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName) {

		return findBygetPS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end) {

		return findBygetPS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return findBygetPS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName(
		String stageName, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetPS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<PharmaApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationStages pharmaApplicationStages : list) {
					if (!stageName.equals(
							pharmaApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<PharmaApplicationStages>)QueryUtil.list(
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
	 * Returns the first pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_StageName_First(
			String stageName,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_StageName_First(stageName, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_StageName_First(
		String stageName,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		List<PharmaApplicationStages> list = findBygetPS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_StageName_Last(
			String stageName,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_StageName_Last(stageName, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_StageName_Last(
		String stageName,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		int count = countBygetPS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationStages> list = findBygetPS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages[] findBygetPS_StageName_PrevAndNext(
			long pharmaApplicationstageId, String stageName,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		PharmaApplicationStages pharmaApplicationStages = findByPrimaryKey(
			pharmaApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationStages[] array =
				new PharmaApplicationStagesImpl[3];

			array[0] = getBygetPS_StageName_PrevAndNext(
				session, pharmaApplicationStages, stageName, orderByComparator,
				true);

			array[1] = pharmaApplicationStages;

			array[2] = getBygetPS_StageName_PrevAndNext(
				session, pharmaApplicationStages, stageName, orderByComparator,
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

	protected PharmaApplicationStages getBygetPS_StageName_PrevAndNext(
		Session session, PharmaApplicationStages pharmaApplicationStages,
		String stageName,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_2);
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
			sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						pharmaApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetPS_StageName(String stageName) {
		for (PharmaApplicationStages pharmaApplicationStages :
				findBygetPS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationStages);
		}
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetPS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_2 =
		"pharmaApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETPS_STAGENAME_STAGENAME_3 =
		"(pharmaApplicationStages.stageName IS NULL OR pharmaApplicationStages.stageName = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetPS_StageName_StageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPS_StageName_StageStatus;
	private FinderPath _finderPathCountBygetPS_StageName_StageStatus;

	/**
	 * Returns all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName_StageStatus(
		String stageName, String stageStatus) {

		return findBygetPS_StageName_StageStatus(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName_StageStatus(
		String stageName, String stageStatus, int start, int end) {

		return findBygetPS_StageName_StageStatus(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName_StageStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return findBygetPS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_StageName_StageStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPS_StageName_StageStatus;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetPS_StageName_StageStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<PharmaApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationStages pharmaApplicationStages : list) {
					if (!stageName.equals(
							pharmaApplicationStages.getStageName()) ||
						!stageStatus.equals(
							pharmaApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<PharmaApplicationStages>)QueryUtil.list(
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
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_StageName_StageStatus_First(
				stageName, stageStatus, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_StageName_StageStatus_First(
		String stageName, String stageStatus,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		List<PharmaApplicationStages> list = findBygetPS_StageName_StageStatus(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_StageName_StageStatus_Last(
				stageName, stageStatus, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_StageName_StageStatus_Last(
		String stageName, String stageStatus,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		int count = countBygetPS_StageName_StageStatus(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationStages> list = findBygetPS_StageName_StageStatus(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages[]
			findBygetPS_StageName_StageStatus_PrevAndNext(
				long pharmaApplicationstageId, String stageName,
				String stageStatus,
				OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		PharmaApplicationStages pharmaApplicationStages = findByPrimaryKey(
			pharmaApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationStages[] array =
				new PharmaApplicationStagesImpl[3];

			array[0] = getBygetPS_StageName_StageStatus_PrevAndNext(
				session, pharmaApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = pharmaApplicationStages;

			array[2] = getBygetPS_StageName_StageStatus_PrevAndNext(
				session, pharmaApplicationStages, stageName, stageStatus,
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

	protected PharmaApplicationStages
		getBygetPS_StageName_StageStatus_PrevAndNext(
			Session session, PharmaApplicationStages pharmaApplicationStages,
			String stageName, String stageStatus,
			OrderByComparator<PharmaApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
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
			sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						pharmaApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetPS_StageName_StageStatus(
		String stageName, String stageStatus) {

		for (PharmaApplicationStages pharmaApplicationStages :
				findBygetPS_StageName_StageStatus(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationStages);
		}
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_StageName_StageStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetPS_StageName_StageStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_2 =
			"pharmaApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGENAME_3 =
			"(pharmaApplicationStages.stageName IS NULL OR pharmaApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_2 =
			"pharmaApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETPS_STAGENAME_STAGESTATUS_STAGESTATUS_3 =
			"(pharmaApplicationStages.stageStatus IS NULL OR pharmaApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetPS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetPS_CaseIdAndStatus;

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_CaseIdAndStatus(caseId, stageStatus);

		if (pharmaApplicationStages == null) {
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

			throw new NoSuchPharmaApplicationStagesException(sb.toString());
		}

		return pharmaApplicationStages;
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetPS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the pharma application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CaseIdAndStatus(
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
				_finderPathFetchBygetPS_CaseIdAndStatus, finderArgs,this);
		}

		if (result instanceof PharmaApplicationStages) {
			PharmaApplicationStages pharmaApplicationStages =
				(PharmaApplicationStages)result;

			if (!Objects.equals(caseId, pharmaApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, pharmaApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<PharmaApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPS_CaseIdAndStatus, finderArgs,
							list);
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
								"PharmaApplicationStagesPersistenceImpl.fetchBygetPS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationStages pharmaApplicationStages = list.get(
						0);

					result = pharmaApplicationStages;

					cacheResult(pharmaApplicationStages);
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
			return (PharmaApplicationStages)result;
		}
	}

	/**
	 * Removes the pharma application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the pharma application stages that was removed
	 */
	@Override
	public PharmaApplicationStages removeBygetPS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			findBygetPS_CaseIdAndStatus(caseId, stageStatus);

		return remove(pharmaApplicationStages);
	}

	/**
	 * Returns the number of pharma application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_CaseIdAndStatus(String caseId, String stageStatus) {
		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetPS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETPS_CASEIDANDSTATUS_CASEID_2 =
		"pharmaApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETPS_CASEIDANDSTATUS_CASEID_3 =
		"(pharmaApplicationStages.caseId IS NULL OR pharmaApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"pharmaApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETPS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(pharmaApplicationStages.stageStatus IS NULL OR pharmaApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetPS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetPS_CaseId;
	private FinderPath _finderPathCountBygetPS_CaseId;

	/**
	 * Returns all the pharma application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_CaseId(String caseId) {
		return findBygetPS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end) {

		return findBygetPS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return findBygetPS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetPS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<PharmaApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationStages pharmaApplicationStages : list) {
					if (!caseId.equals(pharmaApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<PharmaApplicationStages>)QueryUtil.list(
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
	 * Returns the first pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_CaseId_First(
			String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_CaseId_First(caseId, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CaseId_First(
		String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		List<PharmaApplicationStages> list = findBygetPS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_CaseId_Last(
			String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_CaseId_Last(caseId, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_CaseId_Last(
		String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		int count = countBygetPS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationStages> list = findBygetPS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages[] findBygetPS_CaseId_PrevAndNext(
			long pharmaApplicationstageId, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		PharmaApplicationStages pharmaApplicationStages = findByPrimaryKey(
			pharmaApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationStages[] array =
				new PharmaApplicationStagesImpl[3];

			array[0] = getBygetPS_CaseId_PrevAndNext(
				session, pharmaApplicationStages, caseId, orderByComparator,
				true);

			array[1] = pharmaApplicationStages;

			array[2] = getBygetPS_CaseId_PrevAndNext(
				session, pharmaApplicationStages, caseId, orderByComparator,
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

	protected PharmaApplicationStages getBygetPS_CaseId_PrevAndNext(
		Session session, PharmaApplicationStages pharmaApplicationStages,
		String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPS_CASEID_CASEID_2);
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
			sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						pharmaApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPS_CaseId(String caseId) {
		for (PharmaApplicationStages pharmaApplicationStages :
				findBygetPS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationStages);
		}
	}

	/**
	 * Returns the number of pharma application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETPS_CASEID_CASEID_2 =
		"pharmaApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETPS_CASEID_CASEID_3 =
		"(pharmaApplicationStages.caseId IS NULL OR pharmaApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetPS_ByCaseIdStageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPS_ByCaseIdStageStatus;
	private FinderPath _finderPathCountBygetPS_ByCaseIdStageStatus;

	/**
	 * Returns all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId) {

		return findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId, int start,
		int end) {

		return findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId, int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPS_ByCaseIdStageStatus;
				finderArgs = new Object[] {stageName, stageStatus, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetPS_ByCaseIdStageStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, caseId, start, end, orderByComparator
			};
		}

		List<PharmaApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationStages pharmaApplicationStages : list) {
					if (!stageName.equals(
							pharmaApplicationStages.getStageName()) ||
						!stageStatus.equals(
							pharmaApplicationStages.getStageStatus()) ||
						!caseId.equals(pharmaApplicationStages.getCaseId())) {

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
					5 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(5);
			}

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<PharmaApplicationStages>)QueryUtil.list(
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
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_ByCaseIdStageStatus_First(
			String stageName, String stageStatus, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_ByCaseIdStageStatus_First(
				stageName, stageStatus, caseId, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_ByCaseIdStageStatus_First(
		String stageName, String stageStatus, String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		List<PharmaApplicationStages> list = findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_ByCaseIdStageStatus_Last(
			String stageName, String stageStatus, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_ByCaseIdStageStatus_Last(
				stageName, stageStatus, caseId, orderByComparator);

		if (pharmaApplicationStages != null) {
			return pharmaApplicationStages;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_ByCaseIdStageStatus_Last(
		String stageName, String stageStatus, String caseId,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		int count = countBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationStages> list = findBygetPS_ByCaseIdStageStatus(
			stageName, stageStatus, caseId, count - 1, count,
			orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application stageses before and after the current pharma application stages in the ordered set where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param pharmaApplicationstageId the primary key of the current pharma application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages[]
			findBygetPS_ByCaseIdStageStatus_PrevAndNext(
				long pharmaApplicationstageId, String stageName,
				String stageStatus, String caseId,
				OrderByComparator<PharmaApplicationStages> orderByComparator)
		throws NoSuchPharmaApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");
		caseId = Objects.toString(caseId, "");

		PharmaApplicationStages pharmaApplicationStages = findByPrimaryKey(
			pharmaApplicationstageId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationStages[] array =
				new PharmaApplicationStagesImpl[3];

			array[0] = getBygetPS_ByCaseIdStageStatus_PrevAndNext(
				session, pharmaApplicationStages, stageName, stageStatus,
				caseId, orderByComparator, true);

			array[1] = pharmaApplicationStages;

			array[2] = getBygetPS_ByCaseIdStageStatus_PrevAndNext(
				session, pharmaApplicationStages, stageName, stageStatus,
				caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PharmaApplicationStages
		getBygetPS_ByCaseIdStageStatus_PrevAndNext(
			Session session, PharmaApplicationStages pharmaApplicationStages,
			String stageName, String stageStatus, String caseId,
			OrderByComparator<PharmaApplicationStages> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_2);
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
			sb.append(PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
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

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId) {

		for (PharmaApplicationStages pharmaApplicationStages :
				findBygetPS_ByCaseIdStageStatus(
					stageName, stageStatus, caseId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationStages);
		}
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_ByCaseIdStageStatus(
		String stageName, String stageStatus, String caseId) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPS_ByCaseIdStageStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_2 =
			"pharmaApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGENAME_3 =
			"(pharmaApplicationStages.stageName IS NULL OR pharmaApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_2 =
			"pharmaApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(pharmaApplicationStages.stageStatus IS NULL OR pharmaApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_2 =
			"pharmaApplicationStages.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEIDSTAGESTATUS_CASEID_3 =
			"(pharmaApplicationStages.caseId IS NULL OR pharmaApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetPS_ByCaseId_SS_SN;
	private FinderPath _finderPathCountBygetPS_ByCaseId_SS_SN;

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages findBygetPS_ByCaseId_SS_SN(
			String stageName, String stageStatus, String caseId)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			fetchBygetPS_ByCaseId_SS_SN(stageName, stageStatus, caseId);

		if (pharmaApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append(", caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationStagesException(sb.toString());
		}

		return pharmaApplicationStages;
	}

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId) {

		return fetchBygetPS_ByCaseId_SS_SN(
			stageName, stageStatus, caseId, true);
	}

	/**
	 * Returns the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application stages, or <code>null</code> if a matching pharma application stages could not be found
	 */
	@Override
	public PharmaApplicationStages fetchBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");
		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {stageName, stageStatus, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPS_ByCaseId_SS_SN, finderArgs,this);
		}

		if (result instanceof PharmaApplicationStages) {
			PharmaApplicationStages pharmaApplicationStages =
				(PharmaApplicationStages)result;

			if (!Objects.equals(
					stageName, pharmaApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, pharmaApplicationStages.getStageStatus()) ||
				!Objects.equals(caseId, pharmaApplicationStages.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGESTATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_CASEID_2);
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

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<PharmaApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPS_ByCaseId_SS_SN, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									stageName, stageStatus, caseId
								};
							}

							_log.warn(
								"PharmaApplicationStagesPersistenceImpl.fetchBygetPS_ByCaseId_SS_SN(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationStages pharmaApplicationStages = list.get(
						0);

					result = pharmaApplicationStages;

					cacheResult(pharmaApplicationStages);
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
			return (PharmaApplicationStages)result;
		}
	}

	/**
	 * Removes the pharma application stages where stageName = &#63; and stageStatus = &#63; and caseId = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the pharma application stages that was removed
	 */
	@Override
	public PharmaApplicationStages removeBygetPS_ByCaseId_SS_SN(
			String stageName, String stageStatus, String caseId)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages =
			findBygetPS_ByCaseId_SS_SN(stageName, stageStatus, caseId);

		return remove(pharmaApplicationStages);
	}

	/**
	 * Returns the number of pharma application stageses where stageName = &#63; and stageStatus = &#63; and caseId = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param caseId the case ID
	 * @return the number of matching pharma application stageses
	 */
	@Override
	public int countBygetPS_ByCaseId_SS_SN(
		String stageName, String stageStatus, String caseId) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPS_ByCaseId_SS_SN;

		Object[] finderArgs = new Object[] {stageName, stageStatus, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGESTATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGENAME_2 =
			"pharmaApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGENAME_3 =
			"(pharmaApplicationStages.stageName IS NULL OR pharmaApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGESTATUS_2 =
			"pharmaApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPS_BYCASEID_SS_SN_STAGESTATUS_3 =
			"(pharmaApplicationStages.stageStatus IS NULL OR pharmaApplicationStages.stageStatus = '') AND ";

	private static final String _FINDER_COLUMN_GETPS_BYCASEID_SS_SN_CASEID_2 =
		"pharmaApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETPS_BYCASEID_SS_SN_CASEID_3 =
		"(pharmaApplicationStages.caseId IS NULL OR pharmaApplicationStages.caseId = '')";

	public PharmaApplicationStagesPersistenceImpl() {
		setModelClass(PharmaApplicationStages.class);

		setModelImplClass(PharmaApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the pharma application stages in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationStages the pharma application stages
	 */
	@Override
	public void cacheResult(PharmaApplicationStages pharmaApplicationStages) {
		entityCache.putResult(
			PharmaApplicationStagesImpl.class,
			pharmaApplicationStages.getPrimaryKey(), pharmaApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetPS_CAI,
			new Object[] {pharmaApplicationStages.getPharmaApplicationId()},
			pharmaApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetPS_CaseIdStageName,
			new Object[] {
				pharmaApplicationStages.getCaseId(),
				pharmaApplicationStages.getStageName()
			},
			pharmaApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetPS_CaseIdAndStatus,
			new Object[] {
				pharmaApplicationStages.getCaseId(),
				pharmaApplicationStages.getStageStatus()
			},
			pharmaApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetPS_ByCaseId_SS_SN,
			new Object[] {
				pharmaApplicationStages.getStageName(),
				pharmaApplicationStages.getStageStatus(),
				pharmaApplicationStages.getCaseId()
			},
			pharmaApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma application stageses in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationStageses the pharma application stageses
	 */
	@Override
	public void cacheResult(
		List<PharmaApplicationStages> pharmaApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaApplicationStages pharmaApplicationStages :
				pharmaApplicationStageses) {

			if (entityCache.getResult(
					PharmaApplicationStagesImpl.class,
					pharmaApplicationStages.getPrimaryKey()) == null) {

				cacheResult(pharmaApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all pharma application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaApplicationStagesImpl.class);

		finderCache.clearCache(PharmaApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the pharma application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaApplicationStages pharmaApplicationStages) {
		entityCache.removeResult(
			PharmaApplicationStagesImpl.class, pharmaApplicationStages);
	}

	@Override
	public void clearCache(
		List<PharmaApplicationStages> pharmaApplicationStageses) {

		for (PharmaApplicationStages pharmaApplicationStages :
				pharmaApplicationStageses) {

			entityCache.removeResult(
				PharmaApplicationStagesImpl.class, pharmaApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaApplicationStagesModelImpl pharmaApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			pharmaApplicationStagesModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPS_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPS_CAI, args,
			pharmaApplicationStagesModelImpl);

		args = new Object[] {
			pharmaApplicationStagesModelImpl.getCaseId(),
			pharmaApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetPS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPS_CaseIdStageName, args,
			pharmaApplicationStagesModelImpl);

		args = new Object[] {
			pharmaApplicationStagesModelImpl.getCaseId(),
			pharmaApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetPS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPS_CaseIdAndStatus, args,
			pharmaApplicationStagesModelImpl);

		args = new Object[] {
			pharmaApplicationStagesModelImpl.getStageName(),
			pharmaApplicationStagesModelImpl.getStageStatus(),
			pharmaApplicationStagesModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetPS_ByCaseId_SS_SN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPS_ByCaseId_SS_SN, args,
			pharmaApplicationStagesModelImpl);
	}

	/**
	 * Creates a new pharma application stages with the primary key. Does not add the pharma application stages to the database.
	 *
	 * @param pharmaApplicationstageId the primary key for the new pharma application stages
	 * @return the new pharma application stages
	 */
	@Override
	public PharmaApplicationStages create(long pharmaApplicationstageId) {
		PharmaApplicationStages pharmaApplicationStages =
			new PharmaApplicationStagesImpl();

		pharmaApplicationStages.setNew(true);
		pharmaApplicationStages.setPrimaryKey(pharmaApplicationstageId);

		pharmaApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaApplicationStages;
	}

	/**
	 * Removes the pharma application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages that was removed
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages remove(long pharmaApplicationstageId)
		throws NoSuchPharmaApplicationStagesException {

		return remove((Serializable)pharmaApplicationstageId);
	}

	/**
	 * Removes the pharma application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma application stages
	 * @return the pharma application stages that was removed
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages remove(Serializable primaryKey)
		throws NoSuchPharmaApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationStages pharmaApplicationStages =
				(PharmaApplicationStages)session.get(
					PharmaApplicationStagesImpl.class, primaryKey);

			if (pharmaApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaApplicationStages);
		}
		catch (NoSuchPharmaApplicationStagesException noSuchEntityException) {
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
	protected PharmaApplicationStages removeImpl(
		PharmaApplicationStages pharmaApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaApplicationStages)) {
				pharmaApplicationStages = (PharmaApplicationStages)session.get(
					PharmaApplicationStagesImpl.class,
					pharmaApplicationStages.getPrimaryKeyObj());
			}

			if (pharmaApplicationStages != null) {
				session.delete(pharmaApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaApplicationStages != null) {
			clearCache(pharmaApplicationStages);
		}

		return pharmaApplicationStages;
	}

	@Override
	public PharmaApplicationStages updateImpl(
		PharmaApplicationStages pharmaApplicationStages) {

		boolean isNew = pharmaApplicationStages.isNew();

		if (!(pharmaApplicationStages instanceof
				PharmaApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaApplicationStages implementation " +
					pharmaApplicationStages.getClass());
		}

		PharmaApplicationStagesModelImpl pharmaApplicationStagesModelImpl =
			(PharmaApplicationStagesModelImpl)pharmaApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaApplicationStages.setCreateDate(date);
			}
			else {
				pharmaApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaApplicationStages.setModifiedDate(date);
			}
			else {
				pharmaApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaApplicationStages);
			}
			else {
				pharmaApplicationStages =
					(PharmaApplicationStages)session.merge(
						pharmaApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaApplicationStagesImpl.class, pharmaApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(pharmaApplicationStagesModelImpl);

		if (isNew) {
			pharmaApplicationStages.setNew(false);
		}

		pharmaApplicationStages.resetOriginalValues();

		return pharmaApplicationStages;
	}

	/**
	 * Returns the pharma application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma application stages
	 * @return the pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaApplicationStagesException {

		PharmaApplicationStages pharmaApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (pharmaApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaApplicationStages;
	}

	/**
	 * Returns the pharma application stages with the primary key or throws a <code>NoSuchPharmaApplicationStagesException</code> if it could not be found.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages
	 * @throws NoSuchPharmaApplicationStagesException if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages findByPrimaryKey(
			long pharmaApplicationstageId)
		throws NoSuchPharmaApplicationStagesException {

		return findByPrimaryKey((Serializable)pharmaApplicationstageId);
	}

	/**
	 * Returns the pharma application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationstageId the primary key of the pharma application stages
	 * @return the pharma application stages, or <code>null</code> if a pharma application stages with the primary key could not be found
	 */
	@Override
	public PharmaApplicationStages fetchByPrimaryKey(
		long pharmaApplicationstageId) {

		return fetchByPrimaryKey((Serializable)pharmaApplicationstageId);
	}

	/**
	 * Returns all the pharma application stageses.
	 *
	 * @return the pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @return the range of pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application stageses
	 * @param end the upper bound of the range of pharma application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application stageses
	 */
	@Override
	public List<PharmaApplicationStages> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationStages> orderByComparator,
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

		List<PharmaApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAAPPLICATIONSTAGES;

				sql = sql.concat(
					PharmaApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaApplicationStages>)QueryUtil.list(
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
	 * Removes all the pharma application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaApplicationStages pharmaApplicationStages : findAll()) {
			remove(pharmaApplicationStages);
		}
	}

	/**
	 * Returns the number of pharma application stageses.
	 *
	 * @return the number of pharma application stageses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_PHARMAAPPLICATIONSTAGES);

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
		return "pharmaApplicationstageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma application stages persistence.
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

		_finderPathFetchBygetPS_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPS_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		_finderPathFetchBygetPS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetPS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetPS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetPS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetPS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetPS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathWithPaginationFindBygetPS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetPS_StageName_StageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetPS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPS_StageName_StageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetPS_StageName_StageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPS_StageName_StageStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathFetchBygetPS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetPS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetPS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetPS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetPS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetPS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetPS_ByCaseIdStageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetPS_ByCaseIdStageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"stageName", "stageStatus", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetPS_ByCaseIdStageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPS_ByCaseIdStageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					String.class.getName()
				},
				new String[] {"stageName", "stageStatus", "caseId"}, true);

		_finderPathCountBygetPS_ByCaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPS_ByCaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"stageName", "stageStatus", "caseId"}, false);

		_finderPathFetchBygetPS_ByCaseId_SS_SN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPS_ByCaseId_SS_SN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"stageName", "stageStatus", "caseId"}, true);

		_finderPathCountBygetPS_ByCaseId_SS_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPS_ByCaseId_SS_SN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"stageName", "stageStatus", "caseId"}, false);

		_setPharmaApplicationStagesUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setPharmaApplicationStagesUtilPersistence(null);

		entityCache.removeCache(PharmaApplicationStagesImpl.class.getName());
	}

	private void _setPharmaApplicationStagesUtilPersistence(
		PharmaApplicationStagesPersistence pharmaApplicationStagesPersistence) {

		try {
			Field field = PharmaApplicationStagesUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, pharmaApplicationStagesPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMA_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMAAPPLICATIONSTAGES =
		"SELECT pharmaApplicationStages FROM PharmaApplicationStages pharmaApplicationStages";

	private static final String _SQL_SELECT_PHARMAAPPLICATIONSTAGES_WHERE =
		"SELECT pharmaApplicationStages FROM PharmaApplicationStages pharmaApplicationStages WHERE ";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONSTAGES =
		"SELECT COUNT(pharmaApplicationStages) FROM PharmaApplicationStages pharmaApplicationStages";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(pharmaApplicationStages) FROM PharmaApplicationStages pharmaApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private PharmaApplicationStagesModelArgumentsResolver
		_pharmaApplicationStagesModelArgumentsResolver;

}