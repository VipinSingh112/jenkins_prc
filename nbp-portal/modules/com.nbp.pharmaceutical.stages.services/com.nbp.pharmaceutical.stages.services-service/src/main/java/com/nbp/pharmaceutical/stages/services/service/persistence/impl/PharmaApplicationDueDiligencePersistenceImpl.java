/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.pharmaceutical.stages.services.exception.NoSuchPharmaApplicationDueDiligenceException;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligence;
import com.nbp.pharmaceutical.stages.services.model.PharmaApplicationDueDiligenceTable;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceImpl;
import com.nbp.pharmaceutical.stages.services.model.impl.PharmaApplicationDueDiligenceModelImpl;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationDueDiligencePersistence;
import com.nbp.pharmaceutical.stages.services.service.persistence.PharmaApplicationDueDiligenceUtil;
import com.nbp.pharmaceutical.stages.services.service.persistence.impl.constants.PHARMA_STAGESPersistenceConstants;

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
 * The persistence implementation for the pharma application due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaApplicationDueDiligencePersistence.class)
public class PharmaApplicationDueDiligencePersistenceImpl
	extends BasePersistenceImpl<PharmaApplicationDueDiligence>
	implements PharmaApplicationDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaApplicationDueDiligenceUtil</code> to access the pharma application due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaApplicationDueDiligenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPHARMADD_CAI;
	private FinderPath _finderPathCountBygetPHARMADD_CAI;

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findBygetPHARMADD_CAI(
			long pharmaApplicationId)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchBygetPHARMADD_CAI(pharmaApplicationId);

		if (pharmaApplicationDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationDueDiligenceException(
				sb.toString());
		}

		return pharmaApplicationDueDiligence;
	}

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CAI(
		long pharmaApplicationId) {

		return fetchBygetPHARMADD_CAI(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma application due diligence where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CAI(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPHARMADD_CAI, finderArgs, this);
		}

		if (result instanceof PharmaApplicationDueDiligence) {
			PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
				(PharmaApplicationDueDiligence)result;

			if (pharmaApplicationId !=
					pharmaApplicationDueDiligence.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMADD_CAI_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPHARMADD_CAI, finderArgs,
							list);
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
								"PharmaApplicationDueDiligencePersistenceImpl.fetchBygetPHARMADD_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence = list.get(0);

					result = pharmaApplicationDueDiligence;

					cacheResult(pharmaApplicationDueDiligence);
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
			return (PharmaApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the pharma application due diligence where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application due diligence that was removed
	 */
	@Override
	public PharmaApplicationDueDiligence removeBygetPHARMADD_CAI(
			long pharmaApplicationId)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			findBygetPHARMADD_CAI(pharmaApplicationId);

		return remove(pharmaApplicationDueDiligence);
	}

	/**
	 * Returns the number of pharma application due diligences where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma application due diligences
	 */
	@Override
	public int countBygetPHARMADD_CAI(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPHARMADD_CAI;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMADD_CAI_PHARMAAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETPHARMADD_CAI_PHARMAAPPLICATIONID_2 =
			"pharmaApplicationDueDiligence.pharmaApplicationId = ?";

	private FinderPath _finderPathFetchBygetPHARMADD_CaseIdAgnecyName;
	private FinderPath _finderPathCountBygetPHARMADD_CaseIdAgnecyName;

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findBygetPHARMADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchBygetPHARMADD_CaseIdAgnecyName(caseId, agencyName);

		if (pharmaApplicationDueDiligence == null) {
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

			throw new NoSuchPharmaApplicationDueDiligenceException(
				sb.toString());
		}

		return pharmaApplicationDueDiligence;
	}

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		return fetchBygetPHARMADD_CaseIdAgnecyName(caseId, agencyName, true);
	}

	/**
	 * Returns the pharma application due diligence where caseId = &#63; and agencyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseIdAgnecyName(
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
				_finderPathFetchBygetPHARMADD_CaseIdAgnecyName, finderArgs,
				this);
		}

		if (result instanceof PharmaApplicationDueDiligence) {
			PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
				(PharmaApplicationDueDiligence)result;

			if (!Objects.equals(
					caseId, pharmaApplicationDueDiligence.getCaseId()) ||
				!Objects.equals(
					agencyName,
					pharmaApplicationDueDiligence.getAgencyName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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

				List<PharmaApplicationDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPHARMADD_CaseIdAgnecyName,
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
								"PharmaApplicationDueDiligencePersistenceImpl.fetchBygetPHARMADD_CaseIdAgnecyName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence = list.get(0);

					result = pharmaApplicationDueDiligence;

					cacheResult(pharmaApplicationDueDiligence);
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
			return (PharmaApplicationDueDiligence)result;
		}
	}

	/**
	 * Removes the pharma application due diligence where caseId = &#63; and agencyName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the pharma application due diligence that was removed
	 */
	@Override
	public PharmaApplicationDueDiligence removeBygetPHARMADD_CaseIdAgnecyName(
			String caseId, String agencyName)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			findBygetPHARMADD_CaseIdAgnecyName(caseId, agencyName);

		return remove(pharmaApplicationDueDiligence);
	}

	/**
	 * Returns the number of pharma application due diligences where caseId = &#63; and agencyName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param agencyName the agency name
	 * @return the number of matching pharma application due diligences
	 */
	@Override
	public int countBygetPHARMADD_CaseIdAgnecyName(
		String caseId, String agencyName) {

		caseId = Objects.toString(caseId, "");
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetPHARMADD_CaseIdAgnecyName;

		Object[] finderArgs = new Object[] {caseId, agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_CASEID_2);
			}

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_AGENCYNAME_2);
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
		_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_CASEID_2 =
			"pharmaApplicationDueDiligence.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_CASEID_3 =
			"(pharmaApplicationDueDiligence.caseId IS NULL OR pharmaApplicationDueDiligence.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_AGENCYNAME_2 =
			"pharmaApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMADD_CASEIDAGNECYNAME_AGENCYNAME_3 =
			"(pharmaApplicationDueDiligence.agencyName IS NULL OR pharmaApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetPHARMADD_AgnecyName;
	private FinderPath _finderPathWithoutPaginationFindBygetPHARMADD_AgnecyName;
	private FinderPath _finderPathCountBygetPHARMADD_AgnecyName;

	/**
	 * Returns all the pharma application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_AgnecyName(
		String agencyName) {

		return findBygetPHARMADD_AgnecyName(
			agencyName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_AgnecyName(
		String agencyName, int start, int end) {

		return findBygetPHARMADD_AgnecyName(agencyName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return findBygetPHARMADD_AgnecyName(
			agencyName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where agencyName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param agencyName the agency name
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_AgnecyName(
		String agencyName, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
		boolean useFinderCache) {

		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPHARMADD_AgnecyName;
				finderArgs = new Object[] {agencyName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPHARMADD_AgnecyName;
			finderArgs = new Object[] {
				agencyName, start, end, orderByComparator
			};
		}

		List<PharmaApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence : list) {

					if (!agencyName.equals(
							pharmaApplicationDueDiligence.getAgencyName())) {

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

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<PharmaApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findBygetPHARMADD_AgnecyName_First(
			String agencyName,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchBygetPHARMADD_AgnecyName_First(agencyName, orderByComparator);

		if (pharmaApplicationDueDiligence != null) {
			return pharmaApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agencyName=");
		sb.append(agencyName);

		sb.append("}");

		throw new NoSuchPharmaApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_AgnecyName_First(
		String agencyName,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		List<PharmaApplicationDueDiligence> list = findBygetPHARMADD_AgnecyName(
			agencyName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findBygetPHARMADD_AgnecyName_Last(
			String agencyName,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchBygetPHARMADD_AgnecyName_Last(agencyName, orderByComparator);

		if (pharmaApplicationDueDiligence != null) {
			return pharmaApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agencyName=");
		sb.append(agencyName);

		sb.append("}");

		throw new NoSuchPharmaApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_AgnecyName_Last(
		String agencyName,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		int count = countBygetPHARMADD_AgnecyName(agencyName);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationDueDiligence> list = findBygetPHARMADD_AgnecyName(
			agencyName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application due diligences before and after the current pharma application due diligence in the ordered set where agencyName = &#63;.
	 *
	 * @param pharmaAppDDId the primary key of the current pharma application due diligence
	 * @param agencyName the agency name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence[]
			findBygetPHARMADD_AgnecyName_PrevAndNext(
				long pharmaAppDDId, String agencyName,
				OrderByComparator<PharmaApplicationDueDiligence>
					orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException {

		agencyName = Objects.toString(agencyName, "");

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			findByPrimaryKey(pharmaAppDDId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationDueDiligence[] array =
				new PharmaApplicationDueDiligenceImpl[3];

			array[0] = getBygetPHARMADD_AgnecyName_PrevAndNext(
				session, pharmaApplicationDueDiligence, agencyName,
				orderByComparator, true);

			array[1] = pharmaApplicationDueDiligence;

			array[2] = getBygetPHARMADD_AgnecyName_PrevAndNext(
				session, pharmaApplicationDueDiligence, agencyName,
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

	protected PharmaApplicationDueDiligence
		getBygetPHARMADD_AgnecyName_PrevAndNext(
			Session session,
			PharmaApplicationDueDiligence pharmaApplicationDueDiligence,
			String agencyName,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

		boolean bindAgencyName = false;

		if (agencyName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_3);
		}
		else {
			bindAgencyName = true;

			sb.append(_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_2);
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
			sb.append(PharmaApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						pharmaApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application due diligences where agencyName = &#63; from the database.
	 *
	 * @param agencyName the agency name
	 */
	@Override
	public void removeBygetPHARMADD_AgnecyName(String agencyName) {
		for (PharmaApplicationDueDiligence pharmaApplicationDueDiligence :
				findBygetPHARMADD_AgnecyName(
					agencyName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of pharma application due diligences where agencyName = &#63;.
	 *
	 * @param agencyName the agency name
	 * @return the number of matching pharma application due diligences
	 */
	@Override
	public int countBygetPHARMADD_AgnecyName(String agencyName) {
		agencyName = Objects.toString(agencyName, "");

		FinderPath finderPath = _finderPathCountBygetPHARMADD_AgnecyName;

		Object[] finderArgs = new Object[] {agencyName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

			boolean bindAgencyName = false;

			if (agencyName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_3);
			}
			else {
				bindAgencyName = true;

				sb.append(_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_2);
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
		_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_2 =
			"pharmaApplicationDueDiligence.agencyName = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMADD_AGNECYNAME_AGENCYNAME_3 =
			"(pharmaApplicationDueDiligence.agencyName IS NULL OR pharmaApplicationDueDiligence.agencyName = '')";

	private FinderPath _finderPathWithPaginationFindBygetPHARMADD_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetPHARMADD_CaseId;
	private FinderPath _finderPathCountBygetPHARMADD_CaseId;

	/**
	 * Returns all the pharma application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId) {

		return findBygetPHARMADD_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end) {

		return findBygetPHARMADD_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return findBygetPHARMADD_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findBygetPHARMADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
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

		List<PharmaApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplicationDueDiligence
						pharmaApplicationDueDiligence : list) {

					if (!caseId.equals(
							pharmaApplicationDueDiligence.getCaseId())) {

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

			sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

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
				sb.append(PharmaApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<PharmaApplicationDueDiligence>)QueryUtil.list(
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
	 * Returns the first pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findBygetPHARMADD_CaseId_First(
			String caseId,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchBygetPHARMADD_CaseId_First(caseId, orderByComparator);

		if (pharmaApplicationDueDiligence != null) {
			return pharmaApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseId_First(
		String caseId,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		List<PharmaApplicationDueDiligence> list = findBygetPHARMADD_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findBygetPHARMADD_CaseId_Last(
			String caseId,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchBygetPHARMADD_CaseId_Last(caseId, orderByComparator);

		if (pharmaApplicationDueDiligence != null) {
			return pharmaApplicationDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchPharmaApplicationDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application due diligence, or <code>null</code> if a matching pharma application due diligence could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchBygetPHARMADD_CaseId_Last(
		String caseId,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		int count = countBygetPHARMADD_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<PharmaApplicationDueDiligence> list = findBygetPHARMADD_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma application due diligences before and after the current pharma application due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param pharmaAppDDId the primary key of the current pharma application due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence[] findBygetPHARMADD_CaseId_PrevAndNext(
			long pharmaAppDDId, String caseId,
			OrderByComparator<PharmaApplicationDueDiligence> orderByComparator)
		throws NoSuchPharmaApplicationDueDiligenceException {

		caseId = Objects.toString(caseId, "");

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			findByPrimaryKey(pharmaAppDDId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationDueDiligence[] array =
				new PharmaApplicationDueDiligenceImpl[3];

			array[0] = getBygetPHARMADD_CaseId_PrevAndNext(
				session, pharmaApplicationDueDiligence, caseId,
				orderByComparator, true);

			array[1] = pharmaApplicationDueDiligence;

			array[2] = getBygetPHARMADD_CaseId_PrevAndNext(
				session, pharmaApplicationDueDiligence, caseId,
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

	protected PharmaApplicationDueDiligence getBygetPHARMADD_CaseId_PrevAndNext(
		Session session,
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence,
		String caseId,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

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
			sb.append(PharmaApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						pharmaApplicationDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplicationDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma application due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetPHARMADD_CaseId(String caseId) {
		for (PharmaApplicationDueDiligence pharmaApplicationDueDiligence :
				findBygetPHARMADD_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of pharma application due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching pharma application due diligences
	 */
	@Override
	public int countBygetPHARMADD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetPHARMADD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE);

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
		"pharmaApplicationDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETPHARMADD_CASEID_CASEID_3 =
		"(pharmaApplicationDueDiligence.caseId IS NULL OR pharmaApplicationDueDiligence.caseId = '')";

	public PharmaApplicationDueDiligencePersistenceImpl() {
		setModelClass(PharmaApplicationDueDiligence.class);

		setModelImplClass(PharmaApplicationDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaApplicationDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the pharma application due diligence in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationDueDiligence the pharma application due diligence
	 */
	@Override
	public void cacheResult(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		entityCache.putResult(
			PharmaApplicationDueDiligenceImpl.class,
			pharmaApplicationDueDiligence.getPrimaryKey(),
			pharmaApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetPHARMADD_CAI,
			new Object[] {
				pharmaApplicationDueDiligence.getPharmaApplicationId()
			},
			pharmaApplicationDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetPHARMADD_CaseIdAgnecyName,
			new Object[] {
				pharmaApplicationDueDiligence.getCaseId(),
				pharmaApplicationDueDiligence.getAgencyName()
			},
			pharmaApplicationDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma application due diligences in the entity cache if it is enabled.
	 *
	 * @param pharmaApplicationDueDiligences the pharma application due diligences
	 */
	@Override
	public void cacheResult(
		List<PharmaApplicationDueDiligence> pharmaApplicationDueDiligences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaApplicationDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaApplicationDueDiligence pharmaApplicationDueDiligence :
				pharmaApplicationDueDiligences) {

			if (entityCache.getResult(
					PharmaApplicationDueDiligenceImpl.class,
					pharmaApplicationDueDiligence.getPrimaryKey()) == null) {

				cacheResult(pharmaApplicationDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all pharma application due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaApplicationDueDiligenceImpl.class);

		finderCache.clearCache(PharmaApplicationDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the pharma application due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		entityCache.removeResult(
			PharmaApplicationDueDiligenceImpl.class,
			pharmaApplicationDueDiligence);
	}

	@Override
	public void clearCache(
		List<PharmaApplicationDueDiligence> pharmaApplicationDueDiligences) {

		for (PharmaApplicationDueDiligence pharmaApplicationDueDiligence :
				pharmaApplicationDueDiligences) {

			entityCache.removeResult(
				PharmaApplicationDueDiligenceImpl.class,
				pharmaApplicationDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaApplicationDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				PharmaApplicationDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaApplicationDueDiligenceModelImpl
			pharmaApplicationDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			pharmaApplicationDueDiligenceModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPHARMADD_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPHARMADD_CAI, args,
			pharmaApplicationDueDiligenceModelImpl);

		args = new Object[] {
			pharmaApplicationDueDiligenceModelImpl.getCaseId(),
			pharmaApplicationDueDiligenceModelImpl.getAgencyName()
		};

		finderCache.putResult(
			_finderPathCountBygetPHARMADD_CaseIdAgnecyName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPHARMADD_CaseIdAgnecyName, args,
			pharmaApplicationDueDiligenceModelImpl);
	}

	/**
	 * Creates a new pharma application due diligence with the primary key. Does not add the pharma application due diligence to the database.
	 *
	 * @param pharmaAppDDId the primary key for the new pharma application due diligence
	 * @return the new pharma application due diligence
	 */
	@Override
	public PharmaApplicationDueDiligence create(long pharmaAppDDId) {
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			new PharmaApplicationDueDiligenceImpl();

		pharmaApplicationDueDiligence.setNew(true);
		pharmaApplicationDueDiligence.setPrimaryKey(pharmaAppDDId);

		pharmaApplicationDueDiligence.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return pharmaApplicationDueDiligence;
	}

	/**
	 * Removes the pharma application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence remove(long pharmaAppDDId)
		throws NoSuchPharmaApplicationDueDiligenceException {

		return remove((Serializable)pharmaAppDDId);
	}

	/**
	 * Removes the pharma application due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma application due diligence
	 * @return the pharma application due diligence that was removed
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence remove(Serializable primaryKey)
		throws NoSuchPharmaApplicationDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
				(PharmaApplicationDueDiligence)session.get(
					PharmaApplicationDueDiligenceImpl.class, primaryKey);

			if (pharmaApplicationDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaApplicationDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaApplicationDueDiligence);
		}
		catch (NoSuchPharmaApplicationDueDiligenceException
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
	protected PharmaApplicationDueDiligence removeImpl(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaApplicationDueDiligence)) {
				pharmaApplicationDueDiligence =
					(PharmaApplicationDueDiligence)session.get(
						PharmaApplicationDueDiligenceImpl.class,
						pharmaApplicationDueDiligence.getPrimaryKeyObj());
			}

			if (pharmaApplicationDueDiligence != null) {
				session.delete(pharmaApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaApplicationDueDiligence != null) {
			clearCache(pharmaApplicationDueDiligence);
		}

		return pharmaApplicationDueDiligence;
	}

	@Override
	public PharmaApplicationDueDiligence updateImpl(
		PharmaApplicationDueDiligence pharmaApplicationDueDiligence) {

		boolean isNew = pharmaApplicationDueDiligence.isNew();

		if (!(pharmaApplicationDueDiligence instanceof
				PharmaApplicationDueDiligenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					pharmaApplicationDueDiligence.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaApplicationDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaApplicationDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaApplicationDueDiligence implementation " +
					pharmaApplicationDueDiligence.getClass());
		}

		PharmaApplicationDueDiligenceModelImpl
			pharmaApplicationDueDiligenceModelImpl =
				(PharmaApplicationDueDiligenceModelImpl)
					pharmaApplicationDueDiligence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaApplicationDueDiligence.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaApplicationDueDiligence.setCreateDate(date);
			}
			else {
				pharmaApplicationDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaApplicationDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaApplicationDueDiligence.setModifiedDate(date);
			}
			else {
				pharmaApplicationDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaApplicationDueDiligence);
			}
			else {
				pharmaApplicationDueDiligence =
					(PharmaApplicationDueDiligence)session.merge(
						pharmaApplicationDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaApplicationDueDiligenceImpl.class,
			pharmaApplicationDueDiligenceModelImpl, false, true);

		cacheUniqueFindersCache(pharmaApplicationDueDiligenceModelImpl);

		if (isNew) {
			pharmaApplicationDueDiligence.setNew(false);
		}

		pharmaApplicationDueDiligence.resetOriginalValues();

		return pharmaApplicationDueDiligence;
	}

	/**
	 * Returns the pharma application due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma application due diligence
	 * @return the pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchPharmaApplicationDueDiligenceException {

		PharmaApplicationDueDiligence pharmaApplicationDueDiligence =
			fetchByPrimaryKey(primaryKey);

		if (pharmaApplicationDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaApplicationDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaApplicationDueDiligence;
	}

	/**
	 * Returns the pharma application due diligence with the primary key or throws a <code>NoSuchPharmaApplicationDueDiligenceException</code> if it could not be found.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence
	 * @throws NoSuchPharmaApplicationDueDiligenceException if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence findByPrimaryKey(long pharmaAppDDId)
		throws NoSuchPharmaApplicationDueDiligenceException {

		return findByPrimaryKey((Serializable)pharmaAppDDId);
	}

	/**
	 * Returns the pharma application due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaAppDDId the primary key of the pharma application due diligence
	 * @return the pharma application due diligence, or <code>null</code> if a pharma application due diligence with the primary key could not be found
	 */
	@Override
	public PharmaApplicationDueDiligence fetchByPrimaryKey(long pharmaAppDDId) {
		return fetchByPrimaryKey((Serializable)pharmaAppDDId);
	}

	/**
	 * Returns all the pharma application due diligences.
	 *
	 * @return the pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @return the range of pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma application due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma application due diligences
	 * @param end the upper bound of the range of pharma application due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma application due diligences
	 */
	@Override
	public List<PharmaApplicationDueDiligence> findAll(
		int start, int end,
		OrderByComparator<PharmaApplicationDueDiligence> orderByComparator,
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

		List<PharmaApplicationDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplicationDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE;

				sql = sql.concat(
					PharmaApplicationDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaApplicationDueDiligence>)QueryUtil.list(
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
	 * Removes all the pharma application due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaApplicationDueDiligence pharmaApplicationDueDiligence :
				findAll()) {

			remove(pharmaApplicationDueDiligence);
		}
	}

	/**
	 * Returns the number of pharma application due diligences.
	 *
	 * @return the number of pharma application due diligences
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
					_SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE);

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
		return "pharmaAppDDId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaApplicationDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma application due diligence persistence.
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

		_finderPathFetchBygetPHARMADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPHARMADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPHARMADD_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetPHARMADD_CAI",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		_finderPathFetchBygetPHARMADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPHARMADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, true);

		_finderPathCountBygetPHARMADD_CaseIdAgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPHARMADD_CaseIdAgnecyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "agencyName"}, false);

		_finderPathWithPaginationFindBygetPHARMADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetPHARMADD_AgnecyName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agencyName"}, true);

		_finderPathWithoutPaginationFindBygetPHARMADD_AgnecyName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPHARMADD_AgnecyName",
				new String[] {String.class.getName()},
				new String[] {"agencyName"}, true);

		_finderPathCountBygetPHARMADD_AgnecyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPHARMADD_AgnecyName",
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

		PharmaApplicationDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaApplicationDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(
			PharmaApplicationDueDiligenceImpl.class.getName());
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

	private static final String _SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE =
		"SELECT pharmaApplicationDueDiligence FROM PharmaApplicationDueDiligence pharmaApplicationDueDiligence";

	private static final String
		_SQL_SELECT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE =
			"SELECT pharmaApplicationDueDiligence FROM PharmaApplicationDueDiligence pharmaApplicationDueDiligence WHERE ";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE =
		"SELECT COUNT(pharmaApplicationDueDiligence) FROM PharmaApplicationDueDiligence pharmaApplicationDueDiligence";

	private static final String _SQL_COUNT_PHARMAAPPLICATIONDUEDILIGENCE_WHERE =
		"SELECT COUNT(pharmaApplicationDueDiligence) FROM PharmaApplicationDueDiligence pharmaApplicationDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"pharmaApplicationDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaApplicationDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaApplicationDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaApplicationDueDiligencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}