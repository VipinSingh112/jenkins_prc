/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence.impl;

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

import com.nbp.janaac.stages.services.exception.NoSuchJanaacReportException;
import com.nbp.janaac.stages.services.model.JanaacReport;
import com.nbp.janaac.stages.services.model.JanaacReportTable;
import com.nbp.janaac.stages.services.model.impl.JanaacReportImpl;
import com.nbp.janaac.stages.services.model.impl.JanaacReportModelImpl;
import com.nbp.janaac.stages.services.service.persistence.JanaacReportPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacReportUtil;
import com.nbp.janaac.stages.services.service.persistence.impl.constants.JANAAC_STAGESPersistenceConstants;

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
 * The persistence implementation for the janaac report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacReportPersistence.class)
public class JanaacReportPersistenceImpl
	extends BasePersistenceImpl<JanaacReport>
	implements JanaacReportPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacReportUtil</code> to access the janaac report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacReportImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJanaac_by_caseId;
	private FinderPath _finderPathCountBygetJanaac_by_caseId;

	/**
	 * Returns the janaac report where caseId = &#63; or throws a <code>NoSuchJanaacReportException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac report
	 * @throws NoSuchJanaacReportException if a matching janaac report could not be found
	 */
	@Override
	public JanaacReport findBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacReportException {

		JanaacReport janaacReport = fetchBygetJanaac_by_caseId(caseId);

		if (janaacReport == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacReportException(sb.toString());
		}

		return janaacReport;
	}

	/**
	 * Returns the janaac report where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac report, or <code>null</code> if a matching janaac report could not be found
	 */
	@Override
	public JanaacReport fetchBygetJanaac_by_caseId(String caseId) {
		return fetchBygetJanaac_by_caseId(caseId, true);
	}

	/**
	 * Returns the janaac report where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac report, or <code>null</code> if a matching janaac report could not be found
	 */
	@Override
	public JanaacReport fetchBygetJanaac_by_caseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaac_by_caseId, finderArgs, this);
		}

		if (result instanceof JanaacReport) {
			JanaacReport janaacReport = (JanaacReport)result;

			if (!Objects.equals(caseId, janaacReport.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACREPORT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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

				List<JanaacReport> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaac_by_caseId, finderArgs,
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
								"JanaacReportPersistenceImpl.fetchBygetJanaac_by_caseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacReport janaacReport = list.get(0);

					result = janaacReport;

					cacheResult(janaacReport);
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
			return (JanaacReport)result;
		}
	}

	/**
	 * Removes the janaac report where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac report that was removed
	 */
	@Override
	public JanaacReport removeBygetJanaac_by_caseId(String caseId)
		throws NoSuchJanaacReportException {

		JanaacReport janaacReport = findBygetJanaac_by_caseId(caseId);

		return remove(janaacReport);
	}

	/**
	 * Returns the number of janaac reports where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac reports
	 */
	@Override
	public int countBygetJanaac_by_caseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_by_caseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACREPORT_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2 =
		"janaacReport.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3 =
		"(janaacReport.caseId IS NULL OR janaacReport.caseId = '')";

	public JanaacReportPersistenceImpl() {
		setModelClass(JanaacReport.class);

		setModelImplClass(JanaacReportImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacReportTable.INSTANCE);
	}

	/**
	 * Caches the janaac report in the entity cache if it is enabled.
	 *
	 * @param janaacReport the janaac report
	 */
	@Override
	public void cacheResult(JanaacReport janaacReport) {
		entityCache.putResult(
			JanaacReportImpl.class, janaacReport.getPrimaryKey(), janaacReport);

		finderCache.putResult(
			_finderPathFetchBygetJanaac_by_caseId,
			new Object[] {janaacReport.getCaseId()}, janaacReport);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac reports in the entity cache if it is enabled.
	 *
	 * @param janaacReports the janaac reports
	 */
	@Override
	public void cacheResult(List<JanaacReport> janaacReports) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacReports.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacReport janaacReport : janaacReports) {
			if (entityCache.getResult(
					JanaacReportImpl.class, janaacReport.getPrimaryKey()) ==
						null) {

				cacheResult(janaacReport);
			}
		}
	}

	/**
	 * Clears the cache for all janaac reports.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacReportImpl.class);

		finderCache.clearCache(JanaacReportImpl.class);
	}

	/**
	 * Clears the cache for the janaac report.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacReport janaacReport) {
		entityCache.removeResult(JanaacReportImpl.class, janaacReport);
	}

	@Override
	public void clearCache(List<JanaacReport> janaacReports) {
		for (JanaacReport janaacReport : janaacReports) {
			entityCache.removeResult(JanaacReportImpl.class, janaacReport);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacReportImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JanaacReportImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacReportModelImpl janaacReportModelImpl) {

		Object[] args = new Object[] {janaacReportModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJanaac_by_caseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaac_by_caseId, args, janaacReportModelImpl);
	}

	/**
	 * Creates a new janaac report with the primary key. Does not add the janaac report to the database.
	 *
	 * @param janaacReportId the primary key for the new janaac report
	 * @return the new janaac report
	 */
	@Override
	public JanaacReport create(long janaacReportId) {
		JanaacReport janaacReport = new JanaacReportImpl();

		janaacReport.setNew(true);
		janaacReport.setPrimaryKey(janaacReportId);

		janaacReport.setCompanyId(CompanyThreadLocal.getCompanyId());

		return janaacReport;
	}

	/**
	 * Removes the janaac report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report that was removed
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	@Override
	public JanaacReport remove(long janaacReportId)
		throws NoSuchJanaacReportException {

		return remove((Serializable)janaacReportId);
	}

	/**
	 * Removes the janaac report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac report
	 * @return the janaac report that was removed
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	@Override
	public JanaacReport remove(Serializable primaryKey)
		throws NoSuchJanaacReportException {

		Session session = null;

		try {
			session = openSession();

			JanaacReport janaacReport = (JanaacReport)session.get(
				JanaacReportImpl.class, primaryKey);

			if (janaacReport == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacReportException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacReport);
		}
		catch (NoSuchJanaacReportException noSuchEntityException) {
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
	protected JanaacReport removeImpl(JanaacReport janaacReport) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacReport)) {
				janaacReport = (JanaacReport)session.get(
					JanaacReportImpl.class, janaacReport.getPrimaryKeyObj());
			}

			if (janaacReport != null) {
				session.delete(janaacReport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacReport != null) {
			clearCache(janaacReport);
		}

		return janaacReport;
	}

	@Override
	public JanaacReport updateImpl(JanaacReport janaacReport) {
		boolean isNew = janaacReport.isNew();

		if (!(janaacReport instanceof JanaacReportModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacReport.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacReport);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacReport proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacReport implementation " +
					janaacReport.getClass());
		}

		JanaacReportModelImpl janaacReportModelImpl =
			(JanaacReportModelImpl)janaacReport;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacReport.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacReport.setCreateDate(date);
			}
			else {
				janaacReport.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!janaacReportModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacReport.setModifiedDate(date);
			}
			else {
				janaacReport.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacReport);
			}
			else {
				janaacReport = (JanaacReport)session.merge(janaacReport);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacReportImpl.class, janaacReportModelImpl, false, true);

		cacheUniqueFindersCache(janaacReportModelImpl);

		if (isNew) {
			janaacReport.setNew(false);
		}

		janaacReport.resetOriginalValues();

		return janaacReport;
	}

	/**
	 * Returns the janaac report with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac report
	 * @return the janaac report
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	@Override
	public JanaacReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacReportException {

		JanaacReport janaacReport = fetchByPrimaryKey(primaryKey);

		if (janaacReport == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacReportException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacReport;
	}

	/**
	 * Returns the janaac report with the primary key or throws a <code>NoSuchJanaacReportException</code> if it could not be found.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report
	 * @throws NoSuchJanaacReportException if a janaac report with the primary key could not be found
	 */
	@Override
	public JanaacReport findByPrimaryKey(long janaacReportId)
		throws NoSuchJanaacReportException {

		return findByPrimaryKey((Serializable)janaacReportId);
	}

	/**
	 * Returns the janaac report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacReportId the primary key of the janaac report
	 * @return the janaac report, or <code>null</code> if a janaac report with the primary key could not be found
	 */
	@Override
	public JanaacReport fetchByPrimaryKey(long janaacReportId) {
		return fetchByPrimaryKey((Serializable)janaacReportId);
	}

	/**
	 * Returns all the janaac reports.
	 *
	 * @return the janaac reports
	 */
	@Override
	public List<JanaacReport> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @return the range of janaac reports
	 */
	@Override
	public List<JanaacReport> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac reports
	 */
	@Override
	public List<JanaacReport> findAll(
		int start, int end, OrderByComparator<JanaacReport> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacReportModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac reports
	 * @param end the upper bound of the range of janaac reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac reports
	 */
	@Override
	public List<JanaacReport> findAll(
		int start, int end, OrderByComparator<JanaacReport> orderByComparator,
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

		List<JanaacReport> list = null;

		if (useFinderCache) {
			list = (List<JanaacReport>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACREPORT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACREPORT;

				sql = sql.concat(JanaacReportModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacReport>)QueryUtil.list(
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
	 * Removes all the janaac reports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacReport janaacReport : findAll()) {
			remove(janaacReport);
		}
	}

	/**
	 * Returns the number of janaac reports.
	 *
	 * @return the number of janaac reports
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JANAACREPORT);

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
		return "janaacReportId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACREPORT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacReportModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac report persistence.
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

		_finderPathFetchBygetJanaac_by_caseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaac_by_caseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJanaac_by_caseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_by_caseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		JanaacReportUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacReportUtil.setPersistence(null);

		entityCache.removeCache(JanaacReportImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACREPORT =
		"SELECT janaacReport FROM JanaacReport janaacReport";

	private static final String _SQL_SELECT_JANAACREPORT_WHERE =
		"SELECT janaacReport FROM JanaacReport janaacReport WHERE ";

	private static final String _SQL_COUNT_JANAACREPORT =
		"SELECT COUNT(janaacReport) FROM JanaacReport janaacReport";

	private static final String _SQL_COUNT_JANAACREPORT_WHERE =
		"SELECT COUNT(janaacReport) FROM JanaacReport janaacReport WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "janaacReport.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacReport exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacReport exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacReportPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}