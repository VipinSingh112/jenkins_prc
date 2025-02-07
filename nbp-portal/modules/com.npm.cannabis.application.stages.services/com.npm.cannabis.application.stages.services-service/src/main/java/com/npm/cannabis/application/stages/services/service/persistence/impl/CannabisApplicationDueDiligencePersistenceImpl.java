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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisApplicationDueDiligenceException;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligence;
import com.npm.cannabis.application.stages.services.model.CannabisApplicationDueDiligenceTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDueDiligenceModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDueDiligencePersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisApplicationDueDiligenceUtil;
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
 * The persistence implementation for the cannabis application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationDueDiligencePersistence.class)
public class CannabisApplicationDueDiligencePersistenceImpl
	extends BasePersistenceImpl<CannabisApplicationDueDiligence>
	implements CannabisApplicationDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationDueDiligenceUtil</code> to access the cannabis application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationDueDiligenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetCADD_CAI;
	private FinderPath _finderPathCountBygetCADD_CAI;

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findBygetCADD_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchBygetCADD_CAI(cannabisApplicationId);

		if (cannabisApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("cannabisApplicationId=");
			sb.append(cannabisApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationDueDiligenceException(
				sb.toString());
		}

		return cannabisApplicationDueDiligence;
	}

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_CAI(
		long cannabisApplicationId) {

		return fetchBygetCADD_CAI(cannabisApplicationId, true);
	}

	/**
	 * Returns the cannabis application due diligence where cannabisApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_CAI(
		long cannabisApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {cannabisApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCADD_CAI, finderArgs, this);
		}

		if (result instanceof CannabisApplicationDueDiligence) {
			CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
				(CannabisApplicationDueDiligence)result;

			if (cannabisApplicationId !=
					cannabisApplicationDueDiligence.
						getCannabisApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETCADD_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				List<CannabisApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCADD_CAI, finderArgs, list);
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
								"CannabisApplicationDueDiligencePersistenceImpl.fetchBygetCADD_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationDueDiligence
						cannabisApplicationDueDiligence = list.get(0);

					result = cannabisApplicationDueDiligence;

					cacheResult(cannabisApplicationDueDiligence);
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
			return (CannabisApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the cannabis application due diligence where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the cannabis application due diligence that was removed
	 */
	@Override
	public CannabisApplicationDueDiligence removeBygetCADD_CAI(
			long cannabisApplicationId)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			findBygetCADD_CAI(cannabisApplicationId);

		return remove(cannabisApplicationDueDiligence);
	}

	/**
	 * Returns the number of cannabis application due diligences where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis application due diligences
	 */
	@Override
	public int countBygetCADD_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCADD_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETCADD_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCADD_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisApplicationDueDiligence.cannabisApplicationId = ?";

	private FinderPath _finderPathFetchBygetCADD_CaseIdAgnecyName;
	private FinderPath _finderPathCountBygetCADD_CaseIdAgnecyName;

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findBygetCADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchBygetCADD_CaseIdAgnecyName(caseId, agencyName);

		if (cannabisApplicationDueDiligence == null) {
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

			throw new NoSuchCannabisApplicationDueDiligenceException(
				sb.toString());
		}

		return cannabisApplicationDueDiligence;
	}

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return fetchBygetCADD_CaseIdAgnecyName(caseId, agencyName, true);
	}

	/**
	 * Returns the cannabis application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseIdAgnecyName(
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
				_finderPathFetchBygetCADD_CaseIdAgnecyName, finderArgs, this);
		}

		if (result instanceof CannabisApplicationDueDiligence) {
			CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
				(CannabisApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, cannabisApplicationDueDiligence.getCaseId()) ||
				!Objects.equals(
					agencyName,
					cannabisApplicationDueDiligence.getAgencyName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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

				List<CannabisApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCADD_CaseIdAgnecyName,
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
								"CannabisApplicationDueDiligencePersistenceImpl.fetchBygetCADD_CaseIdAgnecyName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplicationDueDiligence
						cannabisApplicationDueDiligence = list.get(0);

					result = cannabisApplicationDueDiligence;

					cacheResult(cannabisApplicationDueDiligence);
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
			return (CannabisApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the cannabis application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the cannabis application due diligence that was removed
	 */
	@Override
	public CannabisApplicationDueDiligence removeBygetCADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			findBygetCADD_CaseIdAgnecyName(caseId, agencyName);

		return remove(cannabisApplicationDueDiligence);
	}

	/**
	 * Returns the number of cannabis application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching cannabis application due diligences
	 */
	@Override
	public int countBygetCADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		caseId = Objects.toString(caseId, "");
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetCADD_CaseIdAgnecyName;

		Object[] finderArgs = new Object[] {caseId, agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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
		_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_CASEID_2 =
			"cannabisApplicationDueDiligence.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_CASEID_3 =
			"(cannabisApplicationDueDiligence.caseId IS NULL OR cannabisApplicationDueDiligence.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_AGENCYNAME_2 =
			"cannabisApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETCADD_CASEIDAGNECYNAME_AGENCYNAME_3 =
			"(cannabisApplicationDueDiligence.agencyName IS NULL OR cannabisApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetCADD_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCADD_CaseId;
	private FinderPath _finderPathCountBygetCADD_CaseId;

	/**
	 * Returns all the cannabis application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId) {

		return findBygetCADD_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end) {

		return findBygetCADD_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return findBygetCADD_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCADD_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCADD_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationDueDiligence
						cannabisApplicationDueDiligence : list) {

					if (!caseId.equals(
							cannabisApplicationDueDiligence.getCaseId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findBygetCADD_CaseId_First(
			String caseId,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchBygetCADD_CaseId_First(caseId, orderByComparator);

		if (cannabisApplicationDueDiligence != null) {
			return cannabisApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseId_First(
		String caseId,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		List<CannabisApplicationDueDiligence> list = findBygetCADD_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findBygetCADD_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchBygetCADD_CaseId_Last(caseId, orderByComparator);

		if (cannabisApplicationDueDiligence != null) {
			return cannabisApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		int count = countBygetCADD_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationDueDiligence> list = findBygetCADD_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application due diligences before and after the current cannabis application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisAppDDId the primary key of the current cannabis application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence[] findBygetCADD_CaseId_PrevAndNext(
			long cannabisAppDDId, String caseId,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException {

		caseId = Objects.toString(caseId, "");

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			findByPrimaryKey(cannabisAppDDId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationDueDiligence[] array =
				new CannabisApplicationDueDiligenceImpl[3];

			array[0] = getBygetCADD_CaseId_PrevAndNext(
				session, cannabisApplicationDueDiligence, caseId,
				orderByComparator, true);

			array[1] = cannabisApplicationDueDiligence;

			array[2] = getBygetCADD_CaseId_PrevAndNext(
				session, cannabisApplicationDueDiligence, caseId,
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

	protected CannabisApplicationDueDiligence getBygetCADD_CaseId_PrevAndNext(
		Session session,
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence,
		String caseId,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_2);
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
			sb.append(CannabisApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						cannabisApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCADD_CaseId(String caseId) {
		for (CannabisApplicationDueDiligence cannabisApplicationDueDiligence :
				findBygetCADD_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of cannabis application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis application due diligences
	 */
	@Override
	public int countBygetCADD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCADD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCADD_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCADD_CASEID_CASEID_2 =
		"cannabisApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETCADD_CASEID_CASEID_3 =
		"(cannabisApplicationDueDiligence.caseId IS NULL OR cannabisApplicationDueDiligence.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCADD_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetCADD_Status;
	private FinderPath _finderPathCountBygetCADD_Status;

	/**
	 * Returns all the cannabis application due diligences where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status) {

		return findBygetCADD_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end) {

		return findBygetCADD_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return findBygetCADD_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findBygetCADD_Status(
		String status, int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCADD_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCADD_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CannabisApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplicationDueDiligence
						cannabisApplicationDueDiligence : list) {

					if (!status.equals(
							cannabisApplicationDueDiligence.getStatus())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCADD_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<CannabisApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findBygetCADD_Status_First(
			String status,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchBygetCADD_Status_First(status, orderByComparator);

		if (cannabisApplicationDueDiligence != null) {
			return cannabisApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_Status_First(
		String status,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		List<CannabisApplicationDueDiligence> list = findBygetCADD_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findBygetCADD_Status_Last(
			String status,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchBygetCADD_Status_Last(status, orderByComparator);

		if (cannabisApplicationDueDiligence != null) {
			return cannabisApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis application due diligence, or <code>null</code> if a matching cannabis application due diligence could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchBygetCADD_Status_Last(
		String status,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		int count = countBygetCADD_Status(status);

		if (count == 0) {
			return null;
		}

		List<CannabisApplicationDueDiligence> list = findBygetCADD_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis application due diligences before and after the current cannabis application due diligence in the ordered set where status = &#63;.
	 *
	 * @param cannabisAppDDId the primary key of the current cannabis application due diligence
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence[] findBygetCADD_Status_PrevAndNext(
			long cannabisAppDDId, String status,
			OrderByComparator<CannabisApplicationDueDiligence>
				orderByComparator)
		throws NoSuchCannabisApplicationDueDiligenceException {

		status = Objects.toString(status, "");

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			findByPrimaryKey(cannabisAppDDId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationDueDiligence[] array =
				new CannabisApplicationDueDiligenceImpl[3];

			array[0] = getBygetCADD_Status_PrevAndNext(
				session, cannabisApplicationDueDiligence, status,
				orderByComparator, true);

			array[1] = cannabisApplicationDueDiligence;

			array[2] = getBygetCADD_Status_PrevAndNext(
				session, cannabisApplicationDueDiligence, status,
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

	protected CannabisApplicationDueDiligence getBygetCADD_Status_PrevAndNext(
		Session session,
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence,
		String status,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCADD_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCADD_STATUS_STATUS_2);
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
			sb.append(CannabisApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis application due diligences where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCADD_Status(String status) {
		for (CannabisApplicationDueDiligence cannabisApplicationDueDiligence :
				findBygetCADD_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of cannabis application due diligences where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis application due diligences
	 */
	@Override
	public int countBygetCADD_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCADD_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCADD_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCADD_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
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

	private static final String _FINDER_COLUMN_GETCADD_STATUS_STATUS_2 =
		"cannabisApplicationDueDiligence.status = ?";

	private static final String _FINDER_COLUMN_GETCADD_STATUS_STATUS_3 =
		"(cannabisApplicationDueDiligence.status IS NULL OR cannabisApplicationDueDiligence.status = '')";

	public CannabisApplicationDueDiligencePersistenceImpl() {
		setModelClass(CannabisApplicationDueDiligence.class);

		setModelImplClass(CannabisApplicationDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the cannabis application due diligence in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDueDiligence the cannabis application due diligence
	 */
	@Override
	public void cacheResult(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		entityCache.putResult(
			CannabisApplicationDueDiligenceImpl.class,
			cannabisApplicationDueDiligence.getPrimaryKey(),
			cannabisApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetCADD_CAI,
			new Object[] {
				cannabisApplicationDueDiligence.getCannabisApplicationId()
			},
			cannabisApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetCADD_CaseIdAgnecyName,
			new Object[] {
				cannabisApplicationDueDiligence.getCaseId(),
				cannabisApplicationDueDiligence.getAgencyName()
			},
			cannabisApplicationDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis application due diligences in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationDueDiligences the cannabis application due diligences
	 */
	@Override
	public void cacheResult(
		List<CannabisApplicationDueDiligence>
			cannabisApplicationDueDiligences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplicationDueDiligence cannabisApplicationDueDiligence :
				cannabisApplicationDueDiligences) {

			if (entityCache.getResult(
					CannabisApplicationDueDiligenceImpl.class,
					cannabisApplicationDueDiligence.getPrimaryKey()) == null) {

				cacheResult(cannabisApplicationDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis application due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationDueDiligenceImpl.class);

		finderCache.clearCache(CannabisApplicationDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the cannabis application due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		entityCache.removeResult(
			CannabisApplicationDueDiligenceImpl.class,
			cannabisApplicationDueDiligence);
	}

	@Override
	public void clearCache(
		List<CannabisApplicationDueDiligence>
			cannabisApplicationDueDiligences) {

		for (CannabisApplicationDueDiligence cannabisApplicationDueDiligence :
				cannabisApplicationDueDiligences) {

			entityCache.removeResult(
				CannabisApplicationDueDiligenceImpl.class,
				cannabisApplicationDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationDueDiligenceModelImpl
			cannabisApplicationDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationDueDiligenceModelImpl.getCannabisApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCADD_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCADD_CAI, args,
			cannabisApplicationDueDiligenceModelImpl);

		args = new Object[] {
			cannabisApplicationDueDiligenceModelImpl.getCaseId(),
			cannabisApplicationDueDiligenceModelImpl.getAgencyName()
		};

		finderCache.putResult(
			_finderPathCountBygetCADD_CaseIdAgnecyName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCADD_CaseIdAgnecyName, args,
			cannabisApplicationDueDiligenceModelImpl);
	}

	/**
	 * Creates a new cannabis application due diligence with the primary key. Does not add the cannabis application due diligence to the database.
	 *
	 * @param cannabisAppDDId the primary key for the new cannabis application due diligence
	 * @return the new cannabis application due diligence
	 */
	@Override
	public CannabisApplicationDueDiligence create(long cannabisAppDDId) {
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			new CannabisApplicationDueDiligenceImpl();

		cannabisApplicationDueDiligence.setNew(true);
		cannabisApplicationDueDiligence.setPrimaryKey(cannabisAppDDId);

		cannabisApplicationDueDiligence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisApplicationDueDiligence;
	}

	/**
	 * Removes the cannabis application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence remove(long cannabisAppDDId)
		throws NoSuchCannabisApplicationDueDiligenceException {

		return remove((Serializable)cannabisAppDDId);
	}

	/**
	 * Removes the cannabis application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence that was removed
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
				(CannabisApplicationDueDiligence)session.get(
					CannabisApplicationDueDiligenceImpl.class, primaryKey);

			if (cannabisApplicationDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplicationDueDiligence);
		}
		catch (NoSuchCannabisApplicationDueDiligenceException
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
	protected CannabisApplicationDueDiligence removeImpl(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplicationDueDiligence)) {
				cannabisApplicationDueDiligence =
					(CannabisApplicationDueDiligence)session.get(
						CannabisApplicationDueDiligenceImpl.class,
						cannabisApplicationDueDiligence.getPrimaryKeyObj());
			}

			if (cannabisApplicationDueDiligence != null) {
				session.delete(cannabisApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplicationDueDiligence != null) {
			clearCache(cannabisApplicationDueDiligence);
		}

		return cannabisApplicationDueDiligence;
	}

	@Override
	public CannabisApplicationDueDiligence updateImpl(
		CannabisApplicationDueDiligence cannabisApplicationDueDiligence) {

		boolean isNew = cannabisApplicationDueDiligence.isNew();

		if (!(cannabisApplicationDueDiligence instanceof
				CannabisApplicationDueDiligenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisApplicationDueDiligence.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplicationDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplicationDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplicationDueDiligence implementation " +
					cannabisApplicationDueDiligence.getClass());
		}

		CannabisApplicationDueDiligenceModelImpl
			cannabisApplicationDueDiligenceModelImpl =
				(CannabisApplicationDueDiligenceModelImpl)
					cannabisApplicationDueDiligence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisApplicationDueDiligence.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisApplicationDueDiligence.setCreateDate(date);
			}
			else {
				cannabisApplicationDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplicationDueDiligence.setModifiedDate(date);
			}
			else {
				cannabisApplicationDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplicationDueDiligence);
			}
			else {
				cannabisApplicationDueDiligence =
					(CannabisApplicationDueDiligence)session.merge(
						cannabisApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationDueDiligenceImpl.class,
			cannabisApplicationDueDiligenceModelImpl, false, true);

		cacheUniqueFindersCache(cannabisApplicationDueDiligenceModelImpl);

		if (isNew) {
			cannabisApplicationDueDiligence.setNew(false);
		}

		cannabisApplicationDueDiligence.resetOriginalValues();

		return cannabisApplicationDueDiligence;
	}

	/**
	 * Returns the cannabis application due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisApplicationDueDiligenceException {

		CannabisApplicationDueDiligence cannabisApplicationDueDiligence =
			fetchByPrimaryKey(primaryKey);

		if (cannabisApplicationDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplicationDueDiligence;
	}

	/**
	 * Returns the cannabis application due diligence with the primary key or throws a <code>NoSuchCannabisApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence
	 * @throws NoSuchCannabisApplicationDueDiligenceException if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence findByPrimaryKey(
			long cannabisAppDDId)
		throws NoSuchCannabisApplicationDueDiligenceException {

		return findByPrimaryKey((Serializable)cannabisAppDDId);
	}

	/**
	 * Returns the cannabis application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisAppDDId the primary key of the cannabis application due diligence
	 * @return the cannabis application due diligence, or <code>null</code> if a cannabis application due diligence with the primary key could not be found
	 */
	@Override
	public CannabisApplicationDueDiligence fetchByPrimaryKey(
		long cannabisAppDDId) {

		return fetchByPrimaryKey((Serializable)cannabisAppDDId);
	}

	/**
	 * Returns all the cannabis application due diligences.
	 *
	 * @return the cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @return the range of cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application due diligences
	 * @param end the upper bound of the range of cannabis application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis application due diligences
	 */
	@Override
	public List<CannabisApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<CannabisApplicationDueDiligence> orderByComparator,
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

		List<CannabisApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE;

				sql = sql.concat(
					CannabisApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplicationDueDiligence>)QueryUtil.list(
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
	 * Removes all the cannabis application due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplicationDueDiligence cannabisApplicationDueDiligence :
				findAll()) {

			remove(cannabisApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of cannabis application due diligences.
	 *
	 * @return the number of cannabis application due diligences
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
					_SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE);

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
		return "cannabisAppDDId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis application due diligence persistence.
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

		_finderPathFetchBygetCADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathFetchBygetCADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, true);

		_finderPathCountBygetCADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, false);

		_finderPathWithPaginationFindBygetCADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCADD_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCADD_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCADD_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetCADD_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCADD_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetCADD_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCADD_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		CannabisApplicationDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(
			CannabisApplicationDueDiligenceImpl.class.getName());
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

	private static final String _SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE =
		"SELECT cannabisApplicationDueDiligence FROM CannabisApplicationDueDiligence cannabisApplicationDueDiligence";

	private static final String
		_SQL_SELECT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE =
			"SELECT cannabisApplicationDueDiligence FROM CannabisApplicationDueDiligence cannabisApplicationDueDiligence WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE =
		"SELECT COUNT(cannabisApplicationDueDiligence) FROM CannabisApplicationDueDiligence cannabisApplicationDueDiligence";

	private static final String
		_SQL_COUNT_CANNABISAPPLICATIONDUEDILIGENCE_WHERE =
			"SELECT COUNT(cannabisApplicationDueDiligence) FROM CannabisApplicationDueDiligence cannabisApplicationDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplicationDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplicationDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplicationDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationDueDiligencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}