/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.healthcare.stage.service.exception.NoSuchHealthCareDueDiligenceException;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligence;
import com.nbp.healthcare.stage.service.model.HealthCareDueDiligenceTable;
import com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceImpl;
import com.nbp.healthcare.stage.service.model.impl.HealthCareDueDiligenceModelImpl;
import com.nbp.healthcare.stage.service.service.persistence.HealthCareDueDiligencePersistence;
import com.nbp.healthcare.stage.service.service.persistence.HealthCareDueDiligenceUtil;
import com.nbp.healthcare.stage.service.service.persistence.impl.constants.HEALTH_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the health care due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareDueDiligencePersistence.class)
public class HealthCareDueDiligencePersistenceImpl
	extends BasePersistenceImpl<HealthCareDueDiligence>
	implements HealthCareDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareDueDiligenceUtil</code> to access the health care due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareDueDiligenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHealthCareBY_CI;
	private FinderPath _finderPathCountBygetHealthCareBY_CI;

	/**
	 * Returns the health care due diligence where caseId = &#63; or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a matching health care due diligence could not be found
	 */
	@Override
	public HealthCareDueDiligence findBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCareDueDiligenceException {

		HealthCareDueDiligence healthCareDueDiligence =
			fetchBygetHealthCareBY_CI(caseId);

		if (healthCareDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareDueDiligenceException(sb.toString());
		}

		return healthCareDueDiligence;
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	@Override
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI(String caseId) {
		return fetchBygetHealthCareBY_CI(caseId, true);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	@Override
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareBY_CI, finderArgs, this);
		}

		if (result instanceof HealthCareDueDiligence) {
			HealthCareDueDiligence healthCareDueDiligence =
				(HealthCareDueDiligence)result;

			if (!Objects.equals(caseId, healthCareDueDiligence.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_2);
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

				List<HealthCareDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareBY_CI, finderArgs,
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
								"HealthCareDueDiligencePersistenceImpl.fetchBygetHealthCareBY_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareDueDiligence healthCareDueDiligence = list.get(0);

					result = healthCareDueDiligence;

					cacheResult(healthCareDueDiligence);
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
			return (HealthCareDueDiligence)result;
		}
	}

	/**
	 * Removes the health care due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care due diligence that was removed
	 */
	@Override
	public HealthCareDueDiligence removeBygetHealthCareBY_CI(String caseId)
		throws NoSuchHealthCareDueDiligenceException {

		HealthCareDueDiligence healthCareDueDiligence =
			findBygetHealthCareBY_CI(caseId);

		return remove(healthCareDueDiligence);
	}

	/**
	 * Returns the number of health care due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care due diligences
	 */
	@Override
	public int countBygetHealthCareBY_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHealthCareBY_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_2 =
		"healthCareDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETHEALTHCAREBY_CI_CASEID_3 =
		"(healthCareDueDiligence.caseId IS NULL OR healthCareDueDiligence.caseId = '')";

	private FinderPath _finderPathFetchBygetHealthCareBY_CI_AN;
	private FinderPath _finderPathCountBygetHealthCareBY_CI_AN;

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the matching health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a matching health care due diligence could not be found
	 */
	@Override
	public HealthCareDueDiligence findBygetHealthCareBY_CI_AN(
			String caseId, String nameofAgency)
		throws NoSuchHealthCareDueDiligenceException {

		HealthCareDueDiligence healthCareDueDiligence =
			fetchBygetHealthCareBY_CI_AN(caseId, nameofAgency);

		if (healthCareDueDiligence == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", nameofAgency=");
			sb.append(nameofAgency);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareDueDiligenceException(sb.toString());
		}

		return healthCareDueDiligence;
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	@Override
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency) {

		return fetchBygetHealthCareBY_CI_AN(caseId, nameofAgency, true);
	}

	/**
	 * Returns the health care due diligence where caseId = &#63; and nameofAgency = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care due diligence, or <code>null</code> if a matching health care due diligence could not be found
	 */
	@Override
	public HealthCareDueDiligence fetchBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		nameofAgency = Objects.toString(nameofAgency, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, nameofAgency};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareBY_CI_AN, finderArgs, this);
		}

		if (result instanceof HealthCareDueDiligence) {
			HealthCareDueDiligence healthCareDueDiligence =
				(HealthCareDueDiligence)result;

			if (!Objects.equals(caseId, healthCareDueDiligence.getCaseId()) ||
				!Objects.equals(
					nameofAgency, healthCareDueDiligence.getNameofAgency())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HEALTHCAREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_CASEID_2);
			}

			boolean bindNameofAgency = false;

			if (nameofAgency.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_NAMEOFAGENCY_3);
			}
			else {
				bindNameofAgency = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_NAMEOFAGENCY_2);
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

				if (bindNameofAgency) {
					queryPos.add(nameofAgency);
				}

				List<HealthCareDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareBY_CI_AN, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, nameofAgency
								};
							}

							_log.warn(
								"HealthCareDueDiligencePersistenceImpl.fetchBygetHealthCareBY_CI_AN(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareDueDiligence healthCareDueDiligence = list.get(0);

					result = healthCareDueDiligence;

					cacheResult(healthCareDueDiligence);
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
			return (HealthCareDueDiligence)result;
		}
	}

	/**
	 * Removes the health care due diligence where caseId = &#63; and nameofAgency = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the health care due diligence that was removed
	 */
	@Override
	public HealthCareDueDiligence removeBygetHealthCareBY_CI_AN(
			String caseId, String nameofAgency)
		throws NoSuchHealthCareDueDiligenceException {

		HealthCareDueDiligence healthCareDueDiligence =
			findBygetHealthCareBY_CI_AN(caseId, nameofAgency);

		return remove(healthCareDueDiligence);
	}

	/**
	 * Returns the number of health care due diligences where caseId = &#63; and nameofAgency = &#63;.
	 *
	 * @param caseId the case ID
	 * @param nameofAgency the nameof agency
	 * @return the number of matching health care due diligences
	 */
	@Override
	public int countBygetHealthCareBY_CI_AN(
		String caseId, String nameofAgency) {

		caseId = Objects.toString(caseId, "");
		nameofAgency = Objects.toString(nameofAgency, "");

		FinderPath finderPath = _finderPathCountBygetHealthCareBY_CI_AN;

		Object[] finderArgs = new Object[] {caseId, nameofAgency};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHCAREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_CASEID_2);
			}

			boolean bindNameofAgency = false;

			if (nameofAgency.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_NAMEOFAGENCY_3);
			}
			else {
				bindNameofAgency = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_NAMEOFAGENCY_2);
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

				if (bindNameofAgency) {
					queryPos.add(nameofAgency);
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

	private static final String _FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_CASEID_2 =
		"healthCareDueDiligence.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_CASEID_3 =
		"(healthCareDueDiligence.caseId IS NULL OR healthCareDueDiligence.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_NAMEOFAGENCY_2 =
			"healthCareDueDiligence.nameofAgency = ?";

	private static final String
		_FINDER_COLUMN_GETHEALTHCAREBY_CI_AN_NAMEOFAGENCY_3 =
			"(healthCareDueDiligence.nameofAgency IS NULL OR healthCareDueDiligence.nameofAgency = '')";

	public HealthCareDueDiligencePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("date", "date_");

		setDBColumnNames(dbColumnNames);

		setModelClass(HealthCareDueDiligence.class);

		setModelImplClass(HealthCareDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the health care due diligence in the entity cache if it is enabled.
	 *
	 * @param healthCareDueDiligence the health care due diligence
	 */
	@Override
	public void cacheResult(HealthCareDueDiligence healthCareDueDiligence) {
		entityCache.putResult(
			HealthCareDueDiligenceImpl.class,
			healthCareDueDiligence.getPrimaryKey(), healthCareDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareBY_CI,
			new Object[] {healthCareDueDiligence.getCaseId()},
			healthCareDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareBY_CI_AN,
			new Object[] {
				healthCareDueDiligence.getCaseId(),
				healthCareDueDiligence.getNameofAgency()
			},
			healthCareDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care due diligences in the entity cache if it is enabled.
	 *
	 * @param healthCareDueDiligences the health care due diligences
	 */
	@Override
	public void cacheResult(
		List<HealthCareDueDiligence> healthCareDueDiligences) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareDueDiligence healthCareDueDiligence :
				healthCareDueDiligences) {

			if (entityCache.getResult(
					HealthCareDueDiligenceImpl.class,
					healthCareDueDiligence.getPrimaryKey()) == null) {

				cacheResult(healthCareDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all health care due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareDueDiligenceImpl.class);

		finderCache.clearCache(HealthCareDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the health care due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCareDueDiligence healthCareDueDiligence) {
		entityCache.removeResult(
			HealthCareDueDiligenceImpl.class, healthCareDueDiligence);
	}

	@Override
	public void clearCache(
		List<HealthCareDueDiligence> healthCareDueDiligences) {

		for (HealthCareDueDiligence healthCareDueDiligence :
				healthCareDueDiligences) {

			entityCache.removeResult(
				HealthCareDueDiligenceImpl.class, healthCareDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareDueDiligenceModelImpl healthCareDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			healthCareDueDiligenceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareBY_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareBY_CI, args,
			healthCareDueDiligenceModelImpl);

		args = new Object[] {
			healthCareDueDiligenceModelImpl.getCaseId(),
			healthCareDueDiligenceModelImpl.getNameofAgency()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareBY_CI_AN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareBY_CI_AN, args,
			healthCareDueDiligenceModelImpl);
	}

	/**
	 * Creates a new health care due diligence with the primary key. Does not add the health care due diligence to the database.
	 *
	 * @param healthDDId the primary key for the new health care due diligence
	 * @return the new health care due diligence
	 */
	@Override
	public HealthCareDueDiligence create(long healthDDId) {
		HealthCareDueDiligence healthCareDueDiligence =
			new HealthCareDueDiligenceImpl();

		healthCareDueDiligence.setNew(true);
		healthCareDueDiligence.setPrimaryKey(healthDDId);

		healthCareDueDiligence.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCareDueDiligence;
	}

	/**
	 * Removes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	@Override
	public HealthCareDueDiligence remove(long healthDDId)
		throws NoSuchHealthCareDueDiligenceException {

		return remove((Serializable)healthDDId);
	}

	/**
	 * Removes the health care due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care due diligence
	 * @return the health care due diligence that was removed
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	@Override
	public HealthCareDueDiligence remove(Serializable primaryKey)
		throws NoSuchHealthCareDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			HealthCareDueDiligence healthCareDueDiligence =
				(HealthCareDueDiligence)session.get(
					HealthCareDueDiligenceImpl.class, primaryKey);

			if (healthCareDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareDueDiligence);
		}
		catch (NoSuchHealthCareDueDiligenceException noSuchEntityException) {
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
	protected HealthCareDueDiligence removeImpl(
		HealthCareDueDiligence healthCareDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareDueDiligence)) {
				healthCareDueDiligence = (HealthCareDueDiligence)session.get(
					HealthCareDueDiligenceImpl.class,
					healthCareDueDiligence.getPrimaryKeyObj());
			}

			if (healthCareDueDiligence != null) {
				session.delete(healthCareDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareDueDiligence != null) {
			clearCache(healthCareDueDiligence);
		}

		return healthCareDueDiligence;
	}

	@Override
	public HealthCareDueDiligence updateImpl(
		HealthCareDueDiligence healthCareDueDiligence) {

		boolean isNew = healthCareDueDiligence.isNew();

		if (!(healthCareDueDiligence instanceof
				HealthCareDueDiligenceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareDueDiligence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareDueDiligence implementation " +
					healthCareDueDiligence.getClass());
		}

		HealthCareDueDiligenceModelImpl healthCareDueDiligenceModelImpl =
			(HealthCareDueDiligenceModelImpl)healthCareDueDiligence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareDueDiligence.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareDueDiligence.setCreateDate(date);
			}
			else {
				healthCareDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareDueDiligence.setModifiedDate(date);
			}
			else {
				healthCareDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareDueDiligence);
			}
			else {
				healthCareDueDiligence = (HealthCareDueDiligence)session.merge(
					healthCareDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareDueDiligenceImpl.class, healthCareDueDiligenceModelImpl,
			false, true);

		cacheUniqueFindersCache(healthCareDueDiligenceModelImpl);

		if (isNew) {
			healthCareDueDiligence.setNew(false);
		}

		healthCareDueDiligence.resetOriginalValues();

		return healthCareDueDiligence;
	}

	/**
	 * Returns the health care due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	@Override
	public HealthCareDueDiligence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareDueDiligenceException {

		HealthCareDueDiligence healthCareDueDiligence = fetchByPrimaryKey(
			primaryKey);

		if (healthCareDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareDueDiligence;
	}

	/**
	 * Returns the health care due diligence with the primary key or throws a <code>NoSuchHealthCareDueDiligenceException</code> if it could not be found.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence
	 * @throws NoSuchHealthCareDueDiligenceException if a health care due diligence with the primary key could not be found
	 */
	@Override
	public HealthCareDueDiligence findByPrimaryKey(long healthDDId)
		throws NoSuchHealthCareDueDiligenceException {

		return findByPrimaryKey((Serializable)healthDDId);
	}

	/**
	 * Returns the health care due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthDDId the primary key of the health care due diligence
	 * @return the health care due diligence, or <code>null</code> if a health care due diligence with the primary key could not be found
	 */
	@Override
	public HealthCareDueDiligence fetchByPrimaryKey(long healthDDId) {
		return fetchByPrimaryKey((Serializable)healthDDId);
	}

	/**
	 * Returns all the health care due diligences.
	 *
	 * @return the health care due diligences
	 */
	@Override
	public List<HealthCareDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @return the range of health care due diligences
	 */
	@Override
	public List<HealthCareDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care due diligences
	 */
	@Override
	public List<HealthCareDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HealthCareDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care due diligences
	 * @param end the upper bound of the range of health care due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care due diligences
	 */
	@Override
	public List<HealthCareDueDiligence> findAll(
		int start, int end,
		OrderByComparator<HealthCareDueDiligence> orderByComparator,
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

		List<HealthCareDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<HealthCareDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREDUEDILIGENCE;

				sql = sql.concat(HealthCareDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareDueDiligence>)QueryUtil.list(
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
	 * Removes all the health care due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareDueDiligence healthCareDueDiligence : findAll()) {
			remove(healthCareDueDiligence);
		}
	}

	/**
	 * Returns the number of health care due diligences.
	 *
	 * @return the number of health care due diligences
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
					_SQL_COUNT_HEALTHCAREDUEDILIGENCE);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "healthDDId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care due diligence persistence.
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

		_finderPathFetchBygetHealthCareBY_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareBY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHealthCareBY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareBY_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetHealthCareBY_CI_AN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareBY_CI_AN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "nameofAgency"}, true);

		_finderPathCountBygetHealthCareBY_CI_AN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareBY_CI_AN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "nameofAgency"}, false);

		HealthCareDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(HealthCareDueDiligenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCAREDUEDILIGENCE =
		"SELECT healthCareDueDiligence FROM HealthCareDueDiligence healthCareDueDiligence";

	private static final String _SQL_SELECT_HEALTHCAREDUEDILIGENCE_WHERE =
		"SELECT healthCareDueDiligence FROM HealthCareDueDiligence healthCareDueDiligence WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREDUEDILIGENCE =
		"SELECT COUNT(healthCareDueDiligence) FROM HealthCareDueDiligence healthCareDueDiligence";

	private static final String _SQL_COUNT_HEALTHCAREDUEDILIGENCE_WHERE =
		"SELECT COUNT(healthCareDueDiligence) FROM HealthCareDueDiligence healthCareDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareDueDiligencePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"date"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}