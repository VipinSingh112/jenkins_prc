/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence.impl;

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

import com.nbp.quarry.stage.service.exception.NoSuchQueryLicenceCertificateException;
import com.nbp.quarry.stage.service.model.QueryLicenceCertificate;
import com.nbp.quarry.stage.service.model.QueryLicenceCertificateTable;
import com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateImpl;
import com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl;
import com.nbp.quarry.stage.service.service.persistence.QueryLicenceCertificatePersistence;
import com.nbp.quarry.stage.service.service.persistence.QueryLicenceCertificateUtil;
import com.nbp.quarry.stage.service.service.persistence.impl.constants.QUARRY_STAGEPersistenceConstants;

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
 * The persistence implementation for the query licence certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QueryLicenceCertificatePersistence.class)
public class QueryLicenceCertificatePersistenceImpl
	extends BasePersistenceImpl<QueryLicenceCertificate>
	implements QueryLicenceCertificatePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QueryLicenceCertificateUtil</code> to access the query licence certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QueryLicenceCertificateImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetQueryLicenceCertificateBy_CI;
	private FinderPath _finderPathCountBygetQueryLicenceCertificateBy_CI;

	/**
	 * Returns the query licence certificate where caseId = &#63; or throws a <code>NoSuchQueryLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate findBygetQueryLicenceCertificateBy_CI(
			String caseId)
		throws NoSuchQueryLicenceCertificateException {

		QueryLicenceCertificate queryLicenceCertificate =
			fetchBygetQueryLicenceCertificateBy_CI(caseId);

		if (queryLicenceCertificate == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQueryLicenceCertificateException(sb.toString());
		}

		return queryLicenceCertificate;
	}

	/**
	 * Returns the query licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificateBy_CI(
		String caseId) {

		return fetchBygetQueryLicenceCertificateBy_CI(caseId, true);
	}

	/**
	 * Returns the query licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificateBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQueryLicenceCertificateBy_CI, finderArgs,
				this);
		}

		if (result instanceof QueryLicenceCertificate) {
			QueryLicenceCertificate queryLicenceCertificate =
				(QueryLicenceCertificate)result;

			if (!Objects.equals(caseId, queryLicenceCertificate.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUERYLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATEBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATEBY_CI_CASEID_2);
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

				List<QueryLicenceCertificate> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQueryLicenceCertificateBy_CI,
							finderArgs, list);
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
								"QueryLicenceCertificatePersistenceImpl.fetchBygetQueryLicenceCertificateBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QueryLicenceCertificate queryLicenceCertificate = list.get(
						0);

					result = queryLicenceCertificate;

					cacheResult(queryLicenceCertificate);
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
			return (QueryLicenceCertificate)result;
		}
	}

	/**
	 * Removes the query licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the query licence certificate that was removed
	 */
	@Override
	public QueryLicenceCertificate removeBygetQueryLicenceCertificateBy_CI(
			String caseId)
		throws NoSuchQueryLicenceCertificateException {

		QueryLicenceCertificate queryLicenceCertificate =
			findBygetQueryLicenceCertificateBy_CI(caseId);

		return remove(queryLicenceCertificate);
	}

	/**
	 * Returns the number of query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching query licence certificates
	 */
	@Override
	public int countBygetQueryLicenceCertificateBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetQueryLicenceCertificateBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERYLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATEBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATEBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETQUERYLICENCECERTIFICATEBY_CI_CASEID_2 =
			"queryLicenceCertificate.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETQUERYLICENCECERTIFICATEBY_CI_CASEID_3 =
			"(queryLicenceCertificate.caseId IS NULL OR queryLicenceCertificate.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetQueryLicenceCertificatBy_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetQueryLicenceCertificatBy_CI;
	private FinderPath _finderPathCountBygetQueryLicenceCertificatBy_CI;

	/**
	 * Returns all the query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findBygetQueryLicenceCertificatBy_CI(
		String caseId) {

		return findBygetQueryLicenceCertificatBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of matching query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findBygetQueryLicenceCertificatBy_CI(
		String caseId, int start, int end) {

		return findBygetQueryLicenceCertificatBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findBygetQueryLicenceCertificatBy_CI(
		String caseId, int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return findBygetQueryLicenceCertificatBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findBygetQueryLicenceCertificatBy_CI(
		String caseId, int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQueryLicenceCertificatBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetQueryLicenceCertificatBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<QueryLicenceCertificate> list = null;

		if (useFinderCache) {
			list = (List<QueryLicenceCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QueryLicenceCertificate queryLicenceCertificate : list) {
					if (!caseId.equals(queryLicenceCertificate.getCaseId())) {
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

			sb.append(_SQL_SELECT_QUERYLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QueryLicenceCertificateModelImpl.ORDER_BY_JPQL);
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

				list = (List<QueryLicenceCertificate>)QueryUtil.list(
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
	 * Returns the first query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate findBygetQueryLicenceCertificatBy_CI_First(
			String caseId,
			OrderByComparator<QueryLicenceCertificate> orderByComparator)
		throws NoSuchQueryLicenceCertificateException {

		QueryLicenceCertificate queryLicenceCertificate =
			fetchBygetQueryLicenceCertificatBy_CI_First(
				caseId, orderByComparator);

		if (queryLicenceCertificate != null) {
			return queryLicenceCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQueryLicenceCertificateException(sb.toString());
	}

	/**
	 * Returns the first query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificatBy_CI_First(
		String caseId,
		OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		List<QueryLicenceCertificate> list =
			findBygetQueryLicenceCertificatBy_CI(
				caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate findBygetQueryLicenceCertificatBy_CI_Last(
			String caseId,
			OrderByComparator<QueryLicenceCertificate> orderByComparator)
		throws NoSuchQueryLicenceCertificateException {

		QueryLicenceCertificate queryLicenceCertificate =
			fetchBygetQueryLicenceCertificatBy_CI_Last(
				caseId, orderByComparator);

		if (queryLicenceCertificate != null) {
			return queryLicenceCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchQueryLicenceCertificateException(sb.toString());
	}

	/**
	 * Returns the last query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	@Override
	public QueryLicenceCertificate fetchBygetQueryLicenceCertificatBy_CI_Last(
		String caseId,
		OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		int count = countBygetQueryLicenceCertificatBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<QueryLicenceCertificate> list =
			findBygetQueryLicenceCertificatBy_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the query licence certificates before and after the current query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param queryLicenceCertificateId the primary key of the current query licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public QueryLicenceCertificate[]
			findBygetQueryLicenceCertificatBy_CI_PrevAndNext(
				long queryLicenceCertificateId, String caseId,
				OrderByComparator<QueryLicenceCertificate> orderByComparator)
		throws NoSuchQueryLicenceCertificateException {

		caseId = Objects.toString(caseId, "");

		QueryLicenceCertificate queryLicenceCertificate = findByPrimaryKey(
			queryLicenceCertificateId);

		Session session = null;

		try {
			session = openSession();

			QueryLicenceCertificate[] array =
				new QueryLicenceCertificateImpl[3];

			array[0] = getBygetQueryLicenceCertificatBy_CI_PrevAndNext(
				session, queryLicenceCertificate, caseId, orderByComparator,
				true);

			array[1] = queryLicenceCertificate;

			array[2] = getBygetQueryLicenceCertificatBy_CI_PrevAndNext(
				session, queryLicenceCertificate, caseId, orderByComparator,
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

	protected QueryLicenceCertificate
		getBygetQueryLicenceCertificatBy_CI_PrevAndNext(
			Session session, QueryLicenceCertificate queryLicenceCertificate,
			String caseId,
			OrderByComparator<QueryLicenceCertificate> orderByComparator,
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

		sb.append(_SQL_SELECT_QUERYLICENCECERTIFICATE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_2);
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
			sb.append(QueryLicenceCertificateModelImpl.ORDER_BY_JPQL);
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
						queryLicenceCertificate)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QueryLicenceCertificate> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the query licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetQueryLicenceCertificatBy_CI(String caseId) {
		for (QueryLicenceCertificate queryLicenceCertificate :
				findBygetQueryLicenceCertificatBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(queryLicenceCertificate);
		}
	}

	/**
	 * Returns the number of query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching query licence certificates
	 */
	@Override
	public int countBygetQueryLicenceCertificatBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetQueryLicenceCertificatBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUERYLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_2 =
			"queryLicenceCertificate.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETQUERYLICENCECERTIFICATBY_CI_CASEID_3 =
			"(queryLicenceCertificate.caseId IS NULL OR queryLicenceCertificate.caseId = '')";

	public QueryLicenceCertificatePersistenceImpl() {
		setModelClass(QueryLicenceCertificate.class);

		setModelImplClass(QueryLicenceCertificateImpl.class);
		setModelPKClass(long.class);

		setTable(QueryLicenceCertificateTable.INSTANCE);
	}

	/**
	 * Caches the query licence certificate in the entity cache if it is enabled.
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 */
	@Override
	public void cacheResult(QueryLicenceCertificate queryLicenceCertificate) {
		entityCache.putResult(
			QueryLicenceCertificateImpl.class,
			queryLicenceCertificate.getPrimaryKey(), queryLicenceCertificate);

		finderCache.putResult(
			_finderPathFetchBygetQueryLicenceCertificateBy_CI,
			new Object[] {queryLicenceCertificate.getCaseId()},
			queryLicenceCertificate);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the query licence certificates in the entity cache if it is enabled.
	 *
	 * @param queryLicenceCertificates the query licence certificates
	 */
	@Override
	public void cacheResult(
		List<QueryLicenceCertificate> queryLicenceCertificates) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (queryLicenceCertificates.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QueryLicenceCertificate queryLicenceCertificate :
				queryLicenceCertificates) {

			if (entityCache.getResult(
					QueryLicenceCertificateImpl.class,
					queryLicenceCertificate.getPrimaryKey()) == null) {

				cacheResult(queryLicenceCertificate);
			}
		}
	}

	/**
	 * Clears the cache for all query licence certificates.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QueryLicenceCertificateImpl.class);

		finderCache.clearCache(QueryLicenceCertificateImpl.class);
	}

	/**
	 * Clears the cache for the query licence certificate.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QueryLicenceCertificate queryLicenceCertificate) {
		entityCache.removeResult(
			QueryLicenceCertificateImpl.class, queryLicenceCertificate);
	}

	@Override
	public void clearCache(
		List<QueryLicenceCertificate> queryLicenceCertificates) {

		for (QueryLicenceCertificate queryLicenceCertificate :
				queryLicenceCertificates) {

			entityCache.removeResult(
				QueryLicenceCertificateImpl.class, queryLicenceCertificate);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QueryLicenceCertificateImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				QueryLicenceCertificateImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QueryLicenceCertificateModelImpl queryLicenceCertificateModelImpl) {

		Object[] args = new Object[] {
			queryLicenceCertificateModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetQueryLicenceCertificateBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQueryLicenceCertificateBy_CI, args,
			queryLicenceCertificateModelImpl);
	}

	/**
	 * Creates a new query licence certificate with the primary key. Does not add the query licence certificate to the database.
	 *
	 * @param queryLicenceCertificateId the primary key for the new query licence certificate
	 * @return the new query licence certificate
	 */
	@Override
	public QueryLicenceCertificate create(long queryLicenceCertificateId) {
		QueryLicenceCertificate queryLicenceCertificate =
			new QueryLicenceCertificateImpl();

		queryLicenceCertificate.setNew(true);
		queryLicenceCertificate.setPrimaryKey(queryLicenceCertificateId);

		queryLicenceCertificate.setCompanyId(CompanyThreadLocal.getCompanyId());

		return queryLicenceCertificate;
	}

	/**
	 * Removes the query licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate that was removed
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public QueryLicenceCertificate remove(long queryLicenceCertificateId)
		throws NoSuchQueryLicenceCertificateException {

		return remove((Serializable)queryLicenceCertificateId);
	}

	/**
	 * Removes the query licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the query licence certificate
	 * @return the query licence certificate that was removed
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public QueryLicenceCertificate remove(Serializable primaryKey)
		throws NoSuchQueryLicenceCertificateException {

		Session session = null;

		try {
			session = openSession();

			QueryLicenceCertificate queryLicenceCertificate =
				(QueryLicenceCertificate)session.get(
					QueryLicenceCertificateImpl.class, primaryKey);

			if (queryLicenceCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQueryLicenceCertificateException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(queryLicenceCertificate);
		}
		catch (NoSuchQueryLicenceCertificateException noSuchEntityException) {
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
	protected QueryLicenceCertificate removeImpl(
		QueryLicenceCertificate queryLicenceCertificate) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(queryLicenceCertificate)) {
				queryLicenceCertificate = (QueryLicenceCertificate)session.get(
					QueryLicenceCertificateImpl.class,
					queryLicenceCertificate.getPrimaryKeyObj());
			}

			if (queryLicenceCertificate != null) {
				session.delete(queryLicenceCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (queryLicenceCertificate != null) {
			clearCache(queryLicenceCertificate);
		}

		return queryLicenceCertificate;
	}

	@Override
	public QueryLicenceCertificate updateImpl(
		QueryLicenceCertificate queryLicenceCertificate) {

		boolean isNew = queryLicenceCertificate.isNew();

		if (!(queryLicenceCertificate instanceof
				QueryLicenceCertificateModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(queryLicenceCertificate.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					queryLicenceCertificate);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in queryLicenceCertificate proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QueryLicenceCertificate implementation " +
					queryLicenceCertificate.getClass());
		}

		QueryLicenceCertificateModelImpl queryLicenceCertificateModelImpl =
			(QueryLicenceCertificateModelImpl)queryLicenceCertificate;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (queryLicenceCertificate.getCreateDate() == null)) {
			if (serviceContext == null) {
				queryLicenceCertificate.setCreateDate(date);
			}
			else {
				queryLicenceCertificate.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!queryLicenceCertificateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				queryLicenceCertificate.setModifiedDate(date);
			}
			else {
				queryLicenceCertificate.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(queryLicenceCertificate);
			}
			else {
				queryLicenceCertificate =
					(QueryLicenceCertificate)session.merge(
						queryLicenceCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QueryLicenceCertificateImpl.class, queryLicenceCertificateModelImpl,
			false, true);

		cacheUniqueFindersCache(queryLicenceCertificateModelImpl);

		if (isNew) {
			queryLicenceCertificate.setNew(false);
		}

		queryLicenceCertificate.resetOriginalValues();

		return queryLicenceCertificate;
	}

	/**
	 * Returns the query licence certificate with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the query licence certificate
	 * @return the query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public QueryLicenceCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQueryLicenceCertificateException {

		QueryLicenceCertificate queryLicenceCertificate = fetchByPrimaryKey(
			primaryKey);

		if (queryLicenceCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQueryLicenceCertificateException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return queryLicenceCertificate;
	}

	/**
	 * Returns the query licence certificate with the primary key or throws a <code>NoSuchQueryLicenceCertificateException</code> if it could not be found.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	@Override
	public QueryLicenceCertificate findByPrimaryKey(
			long queryLicenceCertificateId)
		throws NoSuchQueryLicenceCertificateException {

		return findByPrimaryKey((Serializable)queryLicenceCertificateId);
	}

	/**
	 * Returns the query licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate, or <code>null</code> if a query licence certificate with the primary key could not be found
	 */
	@Override
	public QueryLicenceCertificate fetchByPrimaryKey(
		long queryLicenceCertificateId) {

		return fetchByPrimaryKey((Serializable)queryLicenceCertificateId);
	}

	/**
	 * Returns all the query licence certificates.
	 *
	 * @return the query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of query licence certificates
	 */
	@Override
	public List<QueryLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator,
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

		List<QueryLicenceCertificate> list = null;

		if (useFinderCache) {
			list = (List<QueryLicenceCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUERYLICENCECERTIFICATE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUERYLICENCECERTIFICATE;

				sql = sql.concat(
					QueryLicenceCertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QueryLicenceCertificate>)QueryUtil.list(
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
	 * Removes all the query licence certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QueryLicenceCertificate queryLicenceCertificate : findAll()) {
			remove(queryLicenceCertificate);
		}
	}

	/**
	 * Returns the number of query licence certificates.
	 *
	 * @return the number of query licence certificates
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
					_SQL_COUNT_QUERYLICENCECERTIFICATE);

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
		return "queryLicenceCertificateId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUERYLICENCECERTIFICATE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QueryLicenceCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the query licence certificate persistence.
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

		_finderPathFetchBygetQueryLicenceCertificateBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQueryLicenceCertificateBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQueryLicenceCertificateBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQueryLicenceCertificateBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetQueryLicenceCertificatBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetQueryLicenceCertificatBy_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetQueryLicenceCertificatBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQueryLicenceCertificatBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetQueryLicenceCertificatBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQueryLicenceCertificatBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		QueryLicenceCertificateUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QueryLicenceCertificateUtil.setPersistence(null);

		entityCache.removeCache(QueryLicenceCertificateImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUERYLICENCECERTIFICATE =
		"SELECT queryLicenceCertificate FROM QueryLicenceCertificate queryLicenceCertificate";

	private static final String _SQL_SELECT_QUERYLICENCECERTIFICATE_WHERE =
		"SELECT queryLicenceCertificate FROM QueryLicenceCertificate queryLicenceCertificate WHERE ";

	private static final String _SQL_COUNT_QUERYLICENCECERTIFICATE =
		"SELECT COUNT(queryLicenceCertificate) FROM QueryLicenceCertificate queryLicenceCertificate";

	private static final String _SQL_COUNT_QUERYLICENCECERTIFICATE_WHERE =
		"SELECT COUNT(queryLicenceCertificate) FROM QueryLicenceCertificate queryLicenceCertificate WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"queryLicenceCertificate.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QueryLicenceCertificate exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QueryLicenceCertificate exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QueryLicenceCertificatePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}