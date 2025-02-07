/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service.persistence.impl;

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

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoriesCerticateOfRegisException;
import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegis;
import com.nbp.factories.registration.stage.services.model.FactoriesCerticateOfRegisTable;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisImpl;
import com.nbp.factories.registration.stage.services.model.impl.FactoriesCerticateOfRegisModelImpl;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesCerticateOfRegisPersistence;
import com.nbp.factories.registration.stage.services.service.persistence.FactoriesCerticateOfRegisUtil;
import com.nbp.factories.registration.stage.services.service.persistence.impl.constants.FACTORIES_REGISTRATIONPersistenceConstants;

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
 * The persistence implementation for the factories certicate of regis service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesCerticateOfRegisPersistence.class)
public class FactoriesCerticateOfRegisPersistenceImpl
	extends BasePersistenceImpl<FactoriesCerticateOfRegis>
	implements FactoriesCerticateOfRegisPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesCerticateOfRegisUtil</code> to access the factories certicate of regis persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesCerticateOfRegisImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFactoryCertifiResgiBy_CI;
	private FinderPath _finderPathCountBygetFactoryCertifiResgiBy_CI;

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or throws a <code>NoSuchFactoriesCerticateOfRegisException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis findBygetFactoryCertifiResgiBy_CI(
			String caseId)
		throws NoSuchFactoriesCerticateOfRegisException {

		FactoriesCerticateOfRegis factoriesCerticateOfRegis =
			fetchBygetFactoryCertifiResgiBy_CI(caseId);

		if (factoriesCerticateOfRegis == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesCerticateOfRegisException(sb.toString());
		}

		return factoriesCerticateOfRegis;
	}

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgiBy_CI(
		String caseId) {

		return fetchBygetFactoryCertifiResgiBy_CI(caseId, true);
	}

	/**
	 * Returns the factories certicate of regis where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgiBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoryCertifiResgiBy_CI, finderArgs,
				this);
		}

		if (result instanceof FactoriesCerticateOfRegis) {
			FactoriesCerticateOfRegis factoriesCerticateOfRegis =
				(FactoriesCerticateOfRegis)result;

			if (!Objects.equals(
					caseId, factoriesCerticateOfRegis.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESCERTICATEOFREGIS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGIBY_CI_CASEID_2);
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

				List<FactoriesCerticateOfRegis> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoryCertifiResgiBy_CI,
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
								"FactoriesCerticateOfRegisPersistenceImpl.fetchBygetFactoryCertifiResgiBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesCerticateOfRegis factoriesCerticateOfRegis =
						list.get(0);

					result = factoriesCerticateOfRegis;

					cacheResult(factoriesCerticateOfRegis);
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
			return (FactoriesCerticateOfRegis)result;
		}
	}

	/**
	 * Removes the factories certicate of regis where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factories certicate of regis that was removed
	 */
	@Override
	public FactoriesCerticateOfRegis removeBygetFactoryCertifiResgiBy_CI(
			String caseId)
		throws NoSuchFactoriesCerticateOfRegisException {

		FactoriesCerticateOfRegis factoriesCerticateOfRegis =
			findBygetFactoryCertifiResgiBy_CI(caseId);

		return remove(factoriesCerticateOfRegis);
	}

	/**
	 * Returns the number of factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories certicate of regises
	 */
	@Override
	public int countBygetFactoryCertifiResgiBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactoryCertifiResgiBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESCERTICATEOFREGIS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGIBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETFACTORYCERTIFIRESGIBY_CI_CASEID_2 =
			"factoriesCerticateOfRegis.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORYCERTIFIRESGIBY_CI_CASEID_3 =
			"(factoriesCerticateOfRegis.caseId IS NULL OR factoriesCerticateOfRegis.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetFactoryCertifiResgisBy_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFactoryCertifiResgisBy_CI;
	private FinderPath _finderPathCountBygetFactoryCertifiResgisBy_CI;

	/**
	 * Returns all the factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findBygetFactoryCertifiResgisBy_CI(
		String caseId) {

		return findBygetFactoryCertifiResgisBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of matching factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findBygetFactoryCertifiResgisBy_CI(
		String caseId, int start, int end) {

		return findBygetFactoryCertifiResgisBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findBygetFactoryCertifiResgisBy_CI(
		String caseId, int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return findBygetFactoryCertifiResgisBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findBygetFactoryCertifiResgisBy_CI(
		String caseId, int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFactoryCertifiResgisBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFactoryCertifiResgisBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FactoriesCerticateOfRegis> list = null;

		if (useFinderCache) {
			list = (List<FactoriesCerticateOfRegis>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoriesCerticateOfRegis factoriesCerticateOfRegis :
						list) {

					if (!caseId.equals(factoriesCerticateOfRegis.getCaseId())) {
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

			sb.append(_SQL_SELECT_FACTORIESCERTICATEOFREGIS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoriesCerticateOfRegisModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoriesCerticateOfRegis>)QueryUtil.list(
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
	 * Returns the first factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis findBygetFactoryCertifiResgisBy_CI_First(
			String caseId,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator)
		throws NoSuchFactoriesCerticateOfRegisException {

		FactoriesCerticateOfRegis factoriesCerticateOfRegis =
			fetchBygetFactoryCertifiResgisBy_CI_First(
				caseId, orderByComparator);

		if (factoriesCerticateOfRegis != null) {
			return factoriesCerticateOfRegis;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesCerticateOfRegisException(sb.toString());
	}

	/**
	 * Returns the first factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgisBy_CI_First(
		String caseId,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		List<FactoriesCerticateOfRegis> list =
			findBygetFactoryCertifiResgisBy_CI(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis findBygetFactoryCertifiResgisBy_CI_Last(
			String caseId,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator)
		throws NoSuchFactoriesCerticateOfRegisException {

		FactoriesCerticateOfRegis factoriesCerticateOfRegis =
			fetchBygetFactoryCertifiResgisBy_CI_Last(caseId, orderByComparator);

		if (factoriesCerticateOfRegis != null) {
			return factoriesCerticateOfRegis;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoriesCerticateOfRegisException(sb.toString());
	}

	/**
	 * Returns the last factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factories certicate of regis, or <code>null</code> if a matching factories certicate of regis could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis fetchBygetFactoryCertifiResgisBy_CI_Last(
		String caseId,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		int count = countBygetFactoryCertifiResgisBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<FactoriesCerticateOfRegis> list =
			findBygetFactoryCertifiResgisBy_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factories certicate of regises before and after the current factories certicate of regis in the ordered set where caseId = &#63;.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the current factories certicate of regis
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis[]
			findBygetFactoryCertifiResgisBy_CI_PrevAndNext(
				long factoriesCerticateOfRegisId, String caseId,
				OrderByComparator<FactoriesCerticateOfRegis> orderByComparator)
		throws NoSuchFactoriesCerticateOfRegisException {

		caseId = Objects.toString(caseId, "");

		FactoriesCerticateOfRegis factoriesCerticateOfRegis = findByPrimaryKey(
			factoriesCerticateOfRegisId);

		Session session = null;

		try {
			session = openSession();

			FactoriesCerticateOfRegis[] array =
				new FactoriesCerticateOfRegisImpl[3];

			array[0] = getBygetFactoryCertifiResgisBy_CI_PrevAndNext(
				session, factoriesCerticateOfRegis, caseId, orderByComparator,
				true);

			array[1] = factoriesCerticateOfRegis;

			array[2] = getBygetFactoryCertifiResgisBy_CI_PrevAndNext(
				session, factoriesCerticateOfRegis, caseId, orderByComparator,
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

	protected FactoriesCerticateOfRegis
		getBygetFactoryCertifiResgisBy_CI_PrevAndNext(
			Session session,
			FactoriesCerticateOfRegis factoriesCerticateOfRegis, String caseId,
			OrderByComparator<FactoriesCerticateOfRegis> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORIESCERTICATEOFREGIS_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_2);
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
			sb.append(FactoriesCerticateOfRegisModelImpl.ORDER_BY_JPQL);
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
						factoriesCerticateOfRegis)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoriesCerticateOfRegis> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factories certicate of regises where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFactoryCertifiResgisBy_CI(String caseId) {
		for (FactoriesCerticateOfRegis factoriesCerticateOfRegis :
				findBygetFactoryCertifiResgisBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoriesCerticateOfRegis);
		}
	}

	/**
	 * Returns the number of factories certicate of regises where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factories certicate of regises
	 */
	@Override
	public int countBygetFactoryCertifiResgisBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactoryCertifiResgisBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESCERTICATEOFREGIS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_2 =
			"factoriesCerticateOfRegis.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORYCERTIFIRESGISBY_CI_CASEID_3 =
			"(factoriesCerticateOfRegis.caseId IS NULL OR factoriesCerticateOfRegis.caseId = '')";

	public FactoriesCerticateOfRegisPersistenceImpl() {
		setModelClass(FactoriesCerticateOfRegis.class);

		setModelImplClass(FactoriesCerticateOfRegisImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesCerticateOfRegisTable.INSTANCE);
	}

	/**
	 * Caches the factories certicate of regis in the entity cache if it is enabled.
	 *
	 * @param factoriesCerticateOfRegis the factories certicate of regis
	 */
	@Override
	public void cacheResult(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		entityCache.putResult(
			FactoriesCerticateOfRegisImpl.class,
			factoriesCerticateOfRegis.getPrimaryKey(),
			factoriesCerticateOfRegis);

		finderCache.putResult(
			_finderPathFetchBygetFactoryCertifiResgiBy_CI,
			new Object[] {factoriesCerticateOfRegis.getCaseId()},
			factoriesCerticateOfRegis);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories certicate of regises in the entity cache if it is enabled.
	 *
	 * @param factoriesCerticateOfRegises the factories certicate of regises
	 */
	@Override
	public void cacheResult(
		List<FactoriesCerticateOfRegis> factoriesCerticateOfRegises) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesCerticateOfRegises.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesCerticateOfRegis factoriesCerticateOfRegis :
				factoriesCerticateOfRegises) {

			if (entityCache.getResult(
					FactoriesCerticateOfRegisImpl.class,
					factoriesCerticateOfRegis.getPrimaryKey()) == null) {

				cacheResult(factoriesCerticateOfRegis);
			}
		}
	}

	/**
	 * Clears the cache for all factories certicate of regises.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesCerticateOfRegisImpl.class);

		finderCache.clearCache(FactoriesCerticateOfRegisImpl.class);
	}

	/**
	 * Clears the cache for the factories certicate of regis.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		entityCache.removeResult(
			FactoriesCerticateOfRegisImpl.class, factoriesCerticateOfRegis);
	}

	@Override
	public void clearCache(
		List<FactoriesCerticateOfRegis> factoriesCerticateOfRegises) {

		for (FactoriesCerticateOfRegis factoriesCerticateOfRegis :
				factoriesCerticateOfRegises) {

			entityCache.removeResult(
				FactoriesCerticateOfRegisImpl.class, factoriesCerticateOfRegis);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesCerticateOfRegisImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesCerticateOfRegisImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesCerticateOfRegisModelImpl factoriesCerticateOfRegisModelImpl) {

		Object[] args = new Object[] {
			factoriesCerticateOfRegisModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoryCertifiResgiBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoryCertifiResgiBy_CI, args,
			factoriesCerticateOfRegisModelImpl);
	}

	/**
	 * Creates a new factories certicate of regis with the primary key. Does not add the factories certicate of regis to the database.
	 *
	 * @param factoriesCerticateOfRegisId the primary key for the new factories certicate of regis
	 * @return the new factories certicate of regis
	 */
	@Override
	public FactoriesCerticateOfRegis create(long factoriesCerticateOfRegisId) {
		FactoriesCerticateOfRegis factoriesCerticateOfRegis =
			new FactoriesCerticateOfRegisImpl();

		factoriesCerticateOfRegis.setNew(true);
		factoriesCerticateOfRegis.setPrimaryKey(factoriesCerticateOfRegisId);

		factoriesCerticateOfRegis.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesCerticateOfRegis;
	}

	/**
	 * Removes the factories certicate of regis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis remove(long factoriesCerticateOfRegisId)
		throws NoSuchFactoriesCerticateOfRegisException {

		return remove((Serializable)factoriesCerticateOfRegisId);
	}

	/**
	 * Removes the factories certicate of regis with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories certicate of regis
	 * @return the factories certicate of regis that was removed
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis remove(Serializable primaryKey)
		throws NoSuchFactoriesCerticateOfRegisException {

		Session session = null;

		try {
			session = openSession();

			FactoriesCerticateOfRegis factoriesCerticateOfRegis =
				(FactoriesCerticateOfRegis)session.get(
					FactoriesCerticateOfRegisImpl.class, primaryKey);

			if (factoriesCerticateOfRegis == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesCerticateOfRegisException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesCerticateOfRegis);
		}
		catch (NoSuchFactoriesCerticateOfRegisException noSuchEntityException) {
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
	protected FactoriesCerticateOfRegis removeImpl(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesCerticateOfRegis)) {
				factoriesCerticateOfRegis =
					(FactoriesCerticateOfRegis)session.get(
						FactoriesCerticateOfRegisImpl.class,
						factoriesCerticateOfRegis.getPrimaryKeyObj());
			}

			if (factoriesCerticateOfRegis != null) {
				session.delete(factoriesCerticateOfRegis);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesCerticateOfRegis != null) {
			clearCache(factoriesCerticateOfRegis);
		}

		return factoriesCerticateOfRegis;
	}

	@Override
	public FactoriesCerticateOfRegis updateImpl(
		FactoriesCerticateOfRegis factoriesCerticateOfRegis) {

		boolean isNew = factoriesCerticateOfRegis.isNew();

		if (!(factoriesCerticateOfRegis instanceof
				FactoriesCerticateOfRegisModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesCerticateOfRegis.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesCerticateOfRegis);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesCerticateOfRegis proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesCerticateOfRegis implementation " +
					factoriesCerticateOfRegis.getClass());
		}

		FactoriesCerticateOfRegisModelImpl factoriesCerticateOfRegisModelImpl =
			(FactoriesCerticateOfRegisModelImpl)factoriesCerticateOfRegis;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesCerticateOfRegis.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesCerticateOfRegis.setCreateDate(date);
			}
			else {
				factoriesCerticateOfRegis.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesCerticateOfRegisModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesCerticateOfRegis.setModifiedDate(date);
			}
			else {
				factoriesCerticateOfRegis.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesCerticateOfRegis);
			}
			else {
				factoriesCerticateOfRegis =
					(FactoriesCerticateOfRegis)session.merge(
						factoriesCerticateOfRegis);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesCerticateOfRegisImpl.class,
			factoriesCerticateOfRegisModelImpl, false, true);

		cacheUniqueFindersCache(factoriesCerticateOfRegisModelImpl);

		if (isNew) {
			factoriesCerticateOfRegis.setNew(false);
		}

		factoriesCerticateOfRegis.resetOriginalValues();

		return factoriesCerticateOfRegis;
	}

	/**
	 * Returns the factories certicate of regis with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories certicate of regis
	 * @return the factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesCerticateOfRegisException {

		FactoriesCerticateOfRegis factoriesCerticateOfRegis = fetchByPrimaryKey(
			primaryKey);

		if (factoriesCerticateOfRegis == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesCerticateOfRegisException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesCerticateOfRegis;
	}

	/**
	 * Returns the factories certicate of regis with the primary key or throws a <code>NoSuchFactoriesCerticateOfRegisException</code> if it could not be found.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis
	 * @throws NoSuchFactoriesCerticateOfRegisException if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis findByPrimaryKey(
			long factoriesCerticateOfRegisId)
		throws NoSuchFactoriesCerticateOfRegisException {

		return findByPrimaryKey((Serializable)factoriesCerticateOfRegisId);
	}

	/**
	 * Returns the factories certicate of regis with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesCerticateOfRegisId the primary key of the factories certicate of regis
	 * @return the factories certicate of regis, or <code>null</code> if a factories certicate of regis with the primary key could not be found
	 */
	@Override
	public FactoriesCerticateOfRegis fetchByPrimaryKey(
		long factoriesCerticateOfRegisId) {

		return fetchByPrimaryKey((Serializable)factoriesCerticateOfRegisId);
	}

	/**
	 * Returns all the factories certicate of regises.
	 *
	 * @return the factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @return the range of factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findAll(
		int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories certicate of regises.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesCerticateOfRegisModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories certicate of regises
	 * @param end the upper bound of the range of factories certicate of regises (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories certicate of regises
	 */
	@Override
	public List<FactoriesCerticateOfRegis> findAll(
		int start, int end,
		OrderByComparator<FactoriesCerticateOfRegis> orderByComparator,
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

		List<FactoriesCerticateOfRegis> list = null;

		if (useFinderCache) {
			list = (List<FactoriesCerticateOfRegis>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESCERTICATEOFREGIS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESCERTICATEOFREGIS;

				sql = sql.concat(
					FactoriesCerticateOfRegisModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesCerticateOfRegis>)QueryUtil.list(
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
	 * Removes all the factories certicate of regises from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesCerticateOfRegis factoriesCerticateOfRegis : findAll()) {
			remove(factoriesCerticateOfRegis);
		}
	}

	/**
	 * Returns the number of factories certicate of regises.
	 *
	 * @return the number of factories certicate of regises
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
					_SQL_COUNT_FACTORIESCERTICATEOFREGIS);

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
		return "factoriesCerticateOfRegisId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESCERTICATEOFREGIS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesCerticateOfRegisModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories certicate of regis persistence.
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

		_finderPathFetchBygetFactoryCertifiResgiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoryCertifiResgiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFactoryCertifiResgiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoryCertifiResgiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFactoryCertifiResgisBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFactoryCertifiResgisBy_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFactoryCertifiResgisBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFactoryCertifiResgisBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetFactoryCertifiResgisBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoryCertifiResgisBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		FactoriesCerticateOfRegisUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesCerticateOfRegisUtil.setPersistence(null);

		entityCache.removeCache(FactoriesCerticateOfRegisImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIES_REGISTRATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESCERTICATEOFREGIS =
		"SELECT factoriesCerticateOfRegis FROM FactoriesCerticateOfRegis factoriesCerticateOfRegis";

	private static final String _SQL_SELECT_FACTORIESCERTICATEOFREGIS_WHERE =
		"SELECT factoriesCerticateOfRegis FROM FactoriesCerticateOfRegis factoriesCerticateOfRegis WHERE ";

	private static final String _SQL_COUNT_FACTORIESCERTICATEOFREGIS =
		"SELECT COUNT(factoriesCerticateOfRegis) FROM FactoriesCerticateOfRegis factoriesCerticateOfRegis";

	private static final String _SQL_COUNT_FACTORIESCERTICATEOFREGIS_WHERE =
		"SELECT COUNT(factoriesCerticateOfRegis) FROM FactoriesCerticateOfRegis factoriesCerticateOfRegis WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesCerticateOfRegis.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesCerticateOfRegis exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesCerticateOfRegis exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesCerticateOfRegisPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}