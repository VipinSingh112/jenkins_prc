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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.factories.registration.stage.services.exception.NoSuchFactoryPaymentVerificationException;
import com.nbp.factories.registration.stage.services.model.FactoryPaymentVerification;
import com.nbp.factories.registration.stage.services.model.FactoryPaymentVerificationTable;
import com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationImpl;
import com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl;
import com.nbp.factories.registration.stage.services.service.persistence.FactoryPaymentVerificationPersistence;
import com.nbp.factories.registration.stage.services.service.persistence.FactoryPaymentVerificationUtil;
import com.nbp.factories.registration.stage.services.service.persistence.impl.constants.FACTORIES_REGISTRATIONPersistenceConstants;

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
 * The persistence implementation for the factory payment verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoryPaymentVerificationPersistence.class)
public class FactoryPaymentVerificationPersistenceImpl
	extends BasePersistenceImpl<FactoryPaymentVerification>
	implements FactoryPaymentVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoryPaymentVerificationUtil</code> to access the factory payment verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoryPaymentVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFactoryPaymentConfBy_CI;
	private FinderPath _finderPathCountBygetFactoryPaymentConfBy_CI;

	/**
	 * Returns the factory payment verification where caseId = &#63; or throws a <code>NoSuchFactoryPaymentVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification findBygetFactoryPaymentConfBy_CI(
			String caseId)
		throws NoSuchFactoryPaymentVerificationException {

		FactoryPaymentVerification factoryPaymentVerification =
			fetchBygetFactoryPaymentConfBy_CI(caseId);

		if (factoryPaymentVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoryPaymentVerificationException(sb.toString());
		}

		return factoryPaymentVerification;
	}

	/**
	 * Returns the factory payment verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification fetchBygetFactoryPaymentConfBy_CI(
		String caseId) {

		return fetchBygetFactoryPaymentConfBy_CI(caseId, true);
	}

	/**
	 * Returns the factory payment verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification fetchBygetFactoryPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoryPaymentConfBy_CI, finderArgs, this);
		}

		if (result instanceof FactoryPaymentVerification) {
			FactoryPaymentVerification factoryPaymentVerification =
				(FactoryPaymentVerification)result;

			if (!Objects.equals(
					caseId, factoryPaymentVerification.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORYPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYPAYMENTCONFBY_CI_CASEID_2);
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

				List<FactoryPaymentVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoryPaymentConfBy_CI,
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
								"FactoryPaymentVerificationPersistenceImpl.fetchBygetFactoryPaymentConfBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoryPaymentVerification factoryPaymentVerification =
						list.get(0);

					result = factoryPaymentVerification;

					cacheResult(factoryPaymentVerification);
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
			return (FactoryPaymentVerification)result;
		}
	}

	/**
	 * Removes the factory payment verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the factory payment verification that was removed
	 */
	@Override
	public FactoryPaymentVerification removeBygetFactoryPaymentConfBy_CI(
			String caseId)
		throws NoSuchFactoryPaymentVerificationException {

		FactoryPaymentVerification factoryPaymentVerification =
			findBygetFactoryPaymentConfBy_CI(caseId);

		return remove(factoryPaymentVerification);
	}

	/**
	 * Returns the number of factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factory payment verifications
	 */
	@Override
	public int countBygetFactoryPaymentConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactoryPaymentConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORYPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYPAYMENTCONFBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETFACTORYPAYMENTCONFBY_CI_CASEID_2 =
			"factoryPaymentVerification.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFACTORYPAYMENTCONFBY_CI_CASEID_3 =
			"(factoryPaymentVerification.caseId IS NULL OR factoryPaymentVerification.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFactoryPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetFactoryPayConfBy_CI;
	private FinderPath _finderPathCountBygetFactoryPayConfBy_CI;

	/**
	 * Returns all the factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId) {

		return findBygetFactoryPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of matching factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetFactoryPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return findBygetFactoryPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findBygetFactoryPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFactoryPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFactoryPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FactoryPaymentVerification> list = null;

		if (useFinderCache) {
			list = (List<FactoryPaymentVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FactoryPaymentVerification factoryPaymentVerification :
						list) {

					if (!caseId.equals(
							factoryPaymentVerification.getCaseId())) {

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

			sb.append(_SQL_SELECT_FACTORYPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FactoryPaymentVerificationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FactoryPaymentVerification>)QueryUtil.list(
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
	 * Returns the first factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification findBygetFactoryPayConfBy_CI_First(
			String caseId,
			OrderByComparator<FactoryPaymentVerification> orderByComparator)
		throws NoSuchFactoryPaymentVerificationException {

		FactoryPaymentVerification factoryPaymentVerification =
			fetchBygetFactoryPayConfBy_CI_First(caseId, orderByComparator);

		if (factoryPaymentVerification != null) {
			return factoryPaymentVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoryPaymentVerificationException(sb.toString());
	}

	/**
	 * Returns the first factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification fetchBygetFactoryPayConfBy_CI_First(
		String caseId,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		List<FactoryPaymentVerification> list = findBygetFactoryPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification findBygetFactoryPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<FactoryPaymentVerification> orderByComparator)
		throws NoSuchFactoryPaymentVerificationException {

		FactoryPaymentVerification factoryPaymentVerification =
			fetchBygetFactoryPayConfBy_CI_Last(caseId, orderByComparator);

		if (factoryPaymentVerification != null) {
			return factoryPaymentVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFactoryPaymentVerificationException(sb.toString());
	}

	/**
	 * Returns the last factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching factory payment verification, or <code>null</code> if a matching factory payment verification could not be found
	 */
	@Override
	public FactoryPaymentVerification fetchBygetFactoryPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		int count = countBygetFactoryPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<FactoryPaymentVerification> list = findBygetFactoryPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the factory payment verifications before and after the current factory payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param factoryPaymentVerificationId the primary key of the current factory payment verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public FactoryPaymentVerification[]
			findBygetFactoryPayConfBy_CI_PrevAndNext(
				long factoryPaymentVerificationId, String caseId,
				OrderByComparator<FactoryPaymentVerification> orderByComparator)
		throws NoSuchFactoryPaymentVerificationException {

		caseId = Objects.toString(caseId, "");

		FactoryPaymentVerification factoryPaymentVerification =
			findByPrimaryKey(factoryPaymentVerificationId);

		Session session = null;

		try {
			session = openSession();

			FactoryPaymentVerification[] array =
				new FactoryPaymentVerificationImpl[3];

			array[0] = getBygetFactoryPayConfBy_CI_PrevAndNext(
				session, factoryPaymentVerification, caseId, orderByComparator,
				true);

			array[1] = factoryPaymentVerification;

			array[2] = getBygetFactoryPayConfBy_CI_PrevAndNext(
				session, factoryPaymentVerification, caseId, orderByComparator,
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

	protected FactoryPaymentVerification
		getBygetFactoryPayConfBy_CI_PrevAndNext(
			Session session,
			FactoryPaymentVerification factoryPaymentVerification,
			String caseId,
			OrderByComparator<FactoryPaymentVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_FACTORYPAYMENTVERIFICATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_2);
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
			sb.append(FactoryPaymentVerificationModelImpl.ORDER_BY_JPQL);
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
						factoryPaymentVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FactoryPaymentVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the factory payment verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetFactoryPayConfBy_CI(String caseId) {
		for (FactoryPaymentVerification factoryPaymentVerification :
				findBygetFactoryPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(factoryPaymentVerification);
		}
	}

	/**
	 * Returns the number of factory payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching factory payment verifications
	 */
	@Override
	public int countBygetFactoryPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFactoryPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORYPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_2 =
		"factoryPaymentVerification.caseId = ?";

	private static final String _FINDER_COLUMN_GETFACTORYPAYCONFBY_CI_CASEID_3 =
		"(factoryPaymentVerification.caseId IS NULL OR factoryPaymentVerification.caseId = '')";

	public FactoryPaymentVerificationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FactoryPaymentVerification.class);

		setModelImplClass(FactoryPaymentVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(FactoryPaymentVerificationTable.INSTANCE);
	}

	/**
	 * Caches the factory payment verification in the entity cache if it is enabled.
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 */
	@Override
	public void cacheResult(
		FactoryPaymentVerification factoryPaymentVerification) {

		entityCache.putResult(
			FactoryPaymentVerificationImpl.class,
			factoryPaymentVerification.getPrimaryKey(),
			factoryPaymentVerification);

		finderCache.putResult(
			_finderPathFetchBygetFactoryPaymentConfBy_CI,
			new Object[] {factoryPaymentVerification.getCaseId()},
			factoryPaymentVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factory payment verifications in the entity cache if it is enabled.
	 *
	 * @param factoryPaymentVerifications the factory payment verifications
	 */
	@Override
	public void cacheResult(
		List<FactoryPaymentVerification> factoryPaymentVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoryPaymentVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoryPaymentVerification factoryPaymentVerification :
				factoryPaymentVerifications) {

			if (entityCache.getResult(
					FactoryPaymentVerificationImpl.class,
					factoryPaymentVerification.getPrimaryKey()) == null) {

				cacheResult(factoryPaymentVerification);
			}
		}
	}

	/**
	 * Clears the cache for all factory payment verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoryPaymentVerificationImpl.class);

		finderCache.clearCache(FactoryPaymentVerificationImpl.class);
	}

	/**
	 * Clears the cache for the factory payment verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoryPaymentVerification factoryPaymentVerification) {

		entityCache.removeResult(
			FactoryPaymentVerificationImpl.class, factoryPaymentVerification);
	}

	@Override
	public void clearCache(
		List<FactoryPaymentVerification> factoryPaymentVerifications) {

		for (FactoryPaymentVerification factoryPaymentVerification :
				factoryPaymentVerifications) {

			entityCache.removeResult(
				FactoryPaymentVerificationImpl.class,
				factoryPaymentVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoryPaymentVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoryPaymentVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoryPaymentVerificationModelImpl
			factoryPaymentVerificationModelImpl) {

		Object[] args = new Object[] {
			factoryPaymentVerificationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoryPaymentConfBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoryPaymentConfBy_CI, args,
			factoryPaymentVerificationModelImpl);
	}

	/**
	 * Creates a new factory payment verification with the primary key. Does not add the factory payment verification to the database.
	 *
	 * @param factoryPaymentVerificationId the primary key for the new factory payment verification
	 * @return the new factory payment verification
	 */
	@Override
	public FactoryPaymentVerification create(
		long factoryPaymentVerificationId) {

		FactoryPaymentVerification factoryPaymentVerification =
			new FactoryPaymentVerificationImpl();

		factoryPaymentVerification.setNew(true);
		factoryPaymentVerification.setPrimaryKey(factoryPaymentVerificationId);

		factoryPaymentVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoryPaymentVerification;
	}

	/**
	 * Removes the factory payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification that was removed
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public FactoryPaymentVerification remove(long factoryPaymentVerificationId)
		throws NoSuchFactoryPaymentVerificationException {

		return remove((Serializable)factoryPaymentVerificationId);
	}

	/**
	 * Removes the factory payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factory payment verification
	 * @return the factory payment verification that was removed
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public FactoryPaymentVerification remove(Serializable primaryKey)
		throws NoSuchFactoryPaymentVerificationException {

		Session session = null;

		try {
			session = openSession();

			FactoryPaymentVerification factoryPaymentVerification =
				(FactoryPaymentVerification)session.get(
					FactoryPaymentVerificationImpl.class, primaryKey);

			if (factoryPaymentVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoryPaymentVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoryPaymentVerification);
		}
		catch (NoSuchFactoryPaymentVerificationException
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
	protected FactoryPaymentVerification removeImpl(
		FactoryPaymentVerification factoryPaymentVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoryPaymentVerification)) {
				factoryPaymentVerification =
					(FactoryPaymentVerification)session.get(
						FactoryPaymentVerificationImpl.class,
						factoryPaymentVerification.getPrimaryKeyObj());
			}

			if (factoryPaymentVerification != null) {
				session.delete(factoryPaymentVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoryPaymentVerification != null) {
			clearCache(factoryPaymentVerification);
		}

		return factoryPaymentVerification;
	}

	@Override
	public FactoryPaymentVerification updateImpl(
		FactoryPaymentVerification factoryPaymentVerification) {

		boolean isNew = factoryPaymentVerification.isNew();

		if (!(factoryPaymentVerification instanceof
				FactoryPaymentVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoryPaymentVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoryPaymentVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoryPaymentVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoryPaymentVerification implementation " +
					factoryPaymentVerification.getClass());
		}

		FactoryPaymentVerificationModelImpl
			factoryPaymentVerificationModelImpl =
				(FactoryPaymentVerificationModelImpl)factoryPaymentVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoryPaymentVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoryPaymentVerification.setCreateDate(date);
			}
			else {
				factoryPaymentVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoryPaymentVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoryPaymentVerification.setModifiedDate(date);
			}
			else {
				factoryPaymentVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoryPaymentVerification);
			}
			else {
				factoryPaymentVerification =
					(FactoryPaymentVerification)session.merge(
						factoryPaymentVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoryPaymentVerificationImpl.class,
			factoryPaymentVerificationModelImpl, false, true);

		cacheUniqueFindersCache(factoryPaymentVerificationModelImpl);

		if (isNew) {
			factoryPaymentVerification.setNew(false);
		}

		factoryPaymentVerification.resetOriginalValues();

		return factoryPaymentVerification;
	}

	/**
	 * Returns the factory payment verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factory payment verification
	 * @return the factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public FactoryPaymentVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoryPaymentVerificationException {

		FactoryPaymentVerification factoryPaymentVerification =
			fetchByPrimaryKey(primaryKey);

		if (factoryPaymentVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoryPaymentVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoryPaymentVerification;
	}

	/**
	 * Returns the factory payment verification with the primary key or throws a <code>NoSuchFactoryPaymentVerificationException</code> if it could not be found.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification
	 * @throws NoSuchFactoryPaymentVerificationException if a factory payment verification with the primary key could not be found
	 */
	@Override
	public FactoryPaymentVerification findByPrimaryKey(
			long factoryPaymentVerificationId)
		throws NoSuchFactoryPaymentVerificationException {

		return findByPrimaryKey((Serializable)factoryPaymentVerificationId);
	}

	/**
	 * Returns the factory payment verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification, or <code>null</code> if a factory payment verification with the primary key could not be found
	 */
	@Override
	public FactoryPaymentVerification fetchByPrimaryKey(
		long factoryPaymentVerificationId) {

		return fetchByPrimaryKey((Serializable)factoryPaymentVerificationId);
	}

	/**
	 * Returns all the factory payment verifications.
	 *
	 * @return the factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factory payment verifications
	 */
	@Override
	public List<FactoryPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<FactoryPaymentVerification> orderByComparator,
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

		List<FactoryPaymentVerification> list = null;

		if (useFinderCache) {
			list = (List<FactoryPaymentVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORYPAYMENTVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORYPAYMENTVERIFICATION;

				sql = sql.concat(
					FactoryPaymentVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoryPaymentVerification>)QueryUtil.list(
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
	 * Removes all the factory payment verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoryPaymentVerification factoryPaymentVerification :
				findAll()) {

			remove(factoryPaymentVerification);
		}
	}

	/**
	 * Returns the number of factory payment verifications.
	 *
	 * @return the number of factory payment verifications
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
					_SQL_COUNT_FACTORYPAYMENTVERIFICATION);

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
		return "factoryPaymentVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORYPAYMENTVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoryPaymentVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factory payment verification persistence.
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

		_finderPathFetchBygetFactoryPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoryPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFactoryPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoryPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFactoryPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetFactoryPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetFactoryPayConfBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFactoryPayConfBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetFactoryPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoryPayConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		FactoryPaymentVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoryPaymentVerificationUtil.setPersistence(null);

		entityCache.removeCache(FactoryPaymentVerificationImpl.class.getName());
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

	private static final String _SQL_SELECT_FACTORYPAYMENTVERIFICATION =
		"SELECT factoryPaymentVerification FROM FactoryPaymentVerification factoryPaymentVerification";

	private static final String _SQL_SELECT_FACTORYPAYMENTVERIFICATION_WHERE =
		"SELECT factoryPaymentVerification FROM FactoryPaymentVerification factoryPaymentVerification WHERE ";

	private static final String _SQL_COUNT_FACTORYPAYMENTVERIFICATION =
		"SELECT COUNT(factoryPaymentVerification) FROM FactoryPaymentVerification factoryPaymentVerification";

	private static final String _SQL_COUNT_FACTORYPAYMENTVERIFICATION_WHERE =
		"SELECT COUNT(factoryPaymentVerification) FROM FactoryPaymentVerification factoryPaymentVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoryPaymentVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoryPaymentVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoryPaymentVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoryPaymentVerificationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}