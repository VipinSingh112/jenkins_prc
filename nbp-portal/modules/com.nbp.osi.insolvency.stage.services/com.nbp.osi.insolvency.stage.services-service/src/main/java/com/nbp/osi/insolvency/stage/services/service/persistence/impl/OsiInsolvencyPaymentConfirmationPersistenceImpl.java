/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.stage.services.exception.NoSuchOsiInsolvencyPaymentConfirmationException;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;
import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmationTable;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationImpl;
import com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolvencyPaymentConfirmationPersistence;
import com.nbp.osi.insolvency.stage.services.service.persistence.OsiInsolvencyPaymentConfirmationUtil;
import com.nbp.osi.insolvency.stage.services.service.persistence.impl.constants.OSI_INSOLVENCY_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi insolvency payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInsolvencyPaymentConfirmationPersistence.class)
public class OsiInsolvencyPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<OsiInsolvencyPaymentConfirmation>
	implements OsiInsolvencyPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInsolvencyPaymentConfirmationUtil</code> to access the osi insolvency payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInsolvencyPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOSIIRPaymentConfirmationBy_CI;
	private FinderPath _finderPathCountBygetOSIIRPaymentConfirmationBy_CI;

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or throws a <code>NoSuchOsiInsolvencyPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmationBy_CI(String caseId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			fetchBygetOSIIRPaymentConfirmationBy_CI(caseId);

		if (osiInsolvencyPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInsolvencyPaymentConfirmationException(
				sb.toString());
		}

		return osiInsolvencyPaymentConfirmation;
	}

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmationBy_CI(String caseId) {

		return fetchBygetOSIIRPaymentConfirmationBy_CI(caseId, true);
	}

	/**
	 * Returns the osi insolvency payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmationBy_CI(
			String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIIRPaymentConfirmationBy_CI, finderArgs,
				this);
		}

		if (result instanceof OsiInsolvencyPaymentConfirmation) {
			OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
				(OsiInsolvencyPaymentConfirmation)result;

			if (!Objects.equals(
					caseId, osiInsolvencyPaymentConfirmation.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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

				List<OsiInsolvencyPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIIRPaymentConfirmationBy_CI,
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
								"OsiInsolvencyPaymentConfirmationPersistenceImpl.fetchBygetOSIIRPaymentConfirmationBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInsolvencyPaymentConfirmation
						osiInsolvencyPaymentConfirmation = list.get(0);

					result = osiInsolvencyPaymentConfirmation;

					cacheResult(osiInsolvencyPaymentConfirmation);
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
			return (OsiInsolvencyPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the osi insolvency payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi insolvency payment confirmation that was removed
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
			removeBygetOSIIRPaymentConfirmationBy_CI(String caseId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			findBygetOSIIRPaymentConfirmationBy_CI(caseId);

		return remove(osiInsolvencyPaymentConfirmation);
	}

	/**
	 * Returns the number of osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency payment confirmations
	 */
	@Override
	public int countBygetOSIIRPaymentConfirmationBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetOSIIRPaymentConfirmationBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONBY_CI_CASEID_2 =
			"osiInsolvencyPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONBY_CI_CASEID_3 =
			"(osiInsolvencyPaymentConfirmation.caseId IS NULL OR osiInsolvencyPaymentConfirmation.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetOSIIRPaymentConfirmations_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOSIIRPaymentConfirmations_By_CI;
	private FinderPath _finderPathCountBygetOSIIRPaymentConfirmations_By_CI;

	/**
	 * Returns all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(String caseId) {

		return findBygetOSIIRPaymentConfirmations_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of matching osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end) {

		return findBygetOSIIRPaymentConfirmations_By_CI(
			caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator) {

		return findBygetOSIIRPaymentConfirmations_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation>
		findBygetOSIIRPaymentConfirmations_By_CI(
			String caseId, int start, int end,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator,
			boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSIIRPaymentConfirmations_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOSIIRPaymentConfirmations_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<OsiInsolvencyPaymentConfirmation> list = null;

		if (useFinderCache) {
			list =
				(List<OsiInsolvencyPaymentConfirmation>)finderCache.getResult(
					finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInsolvencyPaymentConfirmation
						osiInsolvencyPaymentConfirmation : list) {

					if (!caseId.equals(
							osiInsolvencyPaymentConfirmation.getCaseId())) {

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

			sb.append(_SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					OsiInsolvencyPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInsolvencyPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmations_By_CI_First(
				String caseId,
				OrderByComparator<OsiInsolvencyPaymentConfirmation>
					orderByComparator)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			fetchBygetOSIIRPaymentConfirmations_By_CI_First(
				caseId, orderByComparator);

		if (osiInsolvencyPaymentConfirmation != null) {
			return osiInsolvencyPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInsolvencyPaymentConfirmationException(
			sb.toString());
	}

	/**
	 * Returns the first osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmations_By_CI_First(
			String caseId,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator) {

		List<OsiInsolvencyPaymentConfirmation> list =
			findBygetOSIIRPaymentConfirmations_By_CI(
				caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
			findBygetOSIIRPaymentConfirmations_By_CI_Last(
				String caseId,
				OrderByComparator<OsiInsolvencyPaymentConfirmation>
					orderByComparator)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			fetchBygetOSIIRPaymentConfirmations_By_CI_Last(
				caseId, orderByComparator);

		if (osiInsolvencyPaymentConfirmation != null) {
			return osiInsolvencyPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInsolvencyPaymentConfirmationException(
			sb.toString());
	}

	/**
	 * Returns the last osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolvency payment confirmation, or <code>null</code> if a matching osi insolvency payment confirmation could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation
		fetchBygetOSIIRPaymentConfirmations_By_CI_Last(
			String caseId,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator) {

		int count = countBygetOSIIRPaymentConfirmations_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<OsiInsolvencyPaymentConfirmation> list =
			findBygetOSIIRPaymentConfirmations_By_CI(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi insolvency payment confirmations before and after the current osi insolvency payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param osiIRPaymentId the primary key of the current osi insolvency payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation[]
			findBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
				long osiIRPaymentId, String caseId,
				OrderByComparator<OsiInsolvencyPaymentConfirmation>
					orderByComparator)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			findByPrimaryKey(osiIRPaymentId);

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyPaymentConfirmation[] array =
				new OsiInsolvencyPaymentConfirmationImpl[3];

			array[0] = getBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
				session, osiInsolvencyPaymentConfirmation, caseId,
				orderByComparator, true);

			array[1] = osiInsolvencyPaymentConfirmation;

			array[2] = getBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
				session, osiInsolvencyPaymentConfirmation, caseId,
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

	protected OsiInsolvencyPaymentConfirmation
		getBygetOSIIRPaymentConfirmations_By_CI_PrevAndNext(
			Session session,
			OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation,
			String caseId,
			OrderByComparator<OsiInsolvencyPaymentConfirmation>
				orderByComparator,
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

		sb.append(_SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(
				_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
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
			sb.append(OsiInsolvencyPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						osiInsolvencyPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInsolvencyPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi insolvency payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOSIIRPaymentConfirmations_By_CI(String caseId) {
		for (OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation :
				findBygetOSIIRPaymentConfirmations_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInsolvencyPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of osi insolvency payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi insolvency payment confirmations
	 */
	@Override
	public int countBygetOSIIRPaymentConfirmations_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath =
			_finderPathCountBygetOSIIRPaymentConfirmations_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_2 =
			"osiInsolvencyPaymentConfirmation.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSIIRPAYMENTCONFIRMATIONS_BY_CI_CASEID_3 =
			"(osiInsolvencyPaymentConfirmation.caseId IS NULL OR osiInsolvencyPaymentConfirmation.caseId = '')";

	public OsiInsolvencyPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiInsolvencyPaymentConfirmation.class);

		setModelImplClass(OsiInsolvencyPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInsolvencyPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the osi insolvency payment confirmation in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 */
	@Override
	public void cacheResult(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		entityCache.putResult(
			OsiInsolvencyPaymentConfirmationImpl.class,
			osiInsolvencyPaymentConfirmation.getPrimaryKey(),
			osiInsolvencyPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetOSIIRPaymentConfirmationBy_CI,
			new Object[] {osiInsolvencyPaymentConfirmation.getCaseId()},
			osiInsolvencyPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi insolvency payment confirmations in the entity cache if it is enabled.
	 *
	 * @param osiInsolvencyPaymentConfirmations the osi insolvency payment confirmations
	 */
	@Override
	public void cacheResult(
		List<OsiInsolvencyPaymentConfirmation>
			osiInsolvencyPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInsolvencyPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation :
				osiInsolvencyPaymentConfirmations) {

			if (entityCache.getResult(
					OsiInsolvencyPaymentConfirmationImpl.class,
					osiInsolvencyPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(osiInsolvencyPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all osi insolvency payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInsolvencyPaymentConfirmationImpl.class);

		finderCache.clearCache(OsiInsolvencyPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the osi insolvency payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		entityCache.removeResult(
			OsiInsolvencyPaymentConfirmationImpl.class,
			osiInsolvencyPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<OsiInsolvencyPaymentConfirmation>
			osiInsolvencyPaymentConfirmations) {

		for (OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation :
				osiInsolvencyPaymentConfirmations) {

			entityCache.removeResult(
				OsiInsolvencyPaymentConfirmationImpl.class,
				osiInsolvencyPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInsolvencyPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiInsolvencyPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInsolvencyPaymentConfirmationModelImpl
			osiInsolvencyPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			osiInsolvencyPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIIRPaymentConfirmationBy_CI, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIIRPaymentConfirmationBy_CI, args,
			osiInsolvencyPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new osi insolvency payment confirmation with the primary key. Does not add the osi insolvency payment confirmation to the database.
	 *
	 * @param osiIRPaymentId the primary key for the new osi insolvency payment confirmation
	 * @return the new osi insolvency payment confirmation
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation create(long osiIRPaymentId) {
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			new OsiInsolvencyPaymentConfirmationImpl();

		osiInsolvencyPaymentConfirmation.setNew(true);
		osiInsolvencyPaymentConfirmation.setPrimaryKey(osiIRPaymentId);

		osiInsolvencyPaymentConfirmation.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return osiInsolvencyPaymentConfirmation;
	}

	/**
	 * Removes the osi insolvency payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation remove(long osiIRPaymentId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		return remove((Serializable)osiIRPaymentId);
	}

	/**
	 * Removes the osi insolvency payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
				(OsiInsolvencyPaymentConfirmation)session.get(
					OsiInsolvencyPaymentConfirmationImpl.class, primaryKey);

			if (osiInsolvencyPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInsolvencyPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInsolvencyPaymentConfirmation);
		}
		catch (NoSuchOsiInsolvencyPaymentConfirmationException
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
	protected OsiInsolvencyPaymentConfirmation removeImpl(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInsolvencyPaymentConfirmation)) {
				osiInsolvencyPaymentConfirmation =
					(OsiInsolvencyPaymentConfirmation)session.get(
						OsiInsolvencyPaymentConfirmationImpl.class,
						osiInsolvencyPaymentConfirmation.getPrimaryKeyObj());
			}

			if (osiInsolvencyPaymentConfirmation != null) {
				session.delete(osiInsolvencyPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInsolvencyPaymentConfirmation != null) {
			clearCache(osiInsolvencyPaymentConfirmation);
		}

		return osiInsolvencyPaymentConfirmation;
	}

	@Override
	public OsiInsolvencyPaymentConfirmation updateImpl(
		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		boolean isNew = osiInsolvencyPaymentConfirmation.isNew();

		if (!(osiInsolvencyPaymentConfirmation instanceof
				OsiInsolvencyPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					osiInsolvencyPaymentConfirmation.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInsolvencyPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInsolvencyPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInsolvencyPaymentConfirmation implementation " +
					osiInsolvencyPaymentConfirmation.getClass());
		}

		OsiInsolvencyPaymentConfirmationModelImpl
			osiInsolvencyPaymentConfirmationModelImpl =
				(OsiInsolvencyPaymentConfirmationModelImpl)
					osiInsolvencyPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(osiInsolvencyPaymentConfirmation.getCreateDate() == null)) {

			if (serviceContext == null) {
				osiInsolvencyPaymentConfirmation.setCreateDate(date);
			}
			else {
				osiInsolvencyPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiInsolvencyPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInsolvencyPaymentConfirmation.setModifiedDate(date);
			}
			else {
				osiInsolvencyPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInsolvencyPaymentConfirmation);
			}
			else {
				osiInsolvencyPaymentConfirmation =
					(OsiInsolvencyPaymentConfirmation)session.merge(
						osiInsolvencyPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInsolvencyPaymentConfirmationImpl.class,
			osiInsolvencyPaymentConfirmationModelImpl, false, true);

		cacheUniqueFindersCache(osiInsolvencyPaymentConfirmationModelImpl);

		if (isNew) {
			osiInsolvencyPaymentConfirmation.setNew(false);
		}

		osiInsolvencyPaymentConfirmation.resetOriginalValues();

		return osiInsolvencyPaymentConfirmation;
	}

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation =
			fetchByPrimaryKey(primaryKey);

		if (osiInsolvencyPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInsolvencyPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInsolvencyPaymentConfirmation;
	}

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or throws a <code>NoSuchOsiInsolvencyPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation
	 * @throws NoSuchOsiInsolvencyPaymentConfirmationException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation findByPrimaryKey(
			long osiIRPaymentId)
		throws NoSuchOsiInsolvencyPaymentConfirmationException {

		return findByPrimaryKey((Serializable)osiIRPaymentId);
	}

	/**
	 * Returns the osi insolvency payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation, or <code>null</code> if a osi insolvency payment confirmation with the primary key could not be found
	 */
	@Override
	public OsiInsolvencyPaymentConfirmation fetchByPrimaryKey(
		long osiIRPaymentId) {

		return fetchByPrimaryKey((Serializable)osiIRPaymentId);
	}

	/**
	 * Returns all the osi insolvency payment confirmations.
	 *
	 * @return the osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolvency payment confirmations
	 */
	@Override
	public List<OsiInsolvencyPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<OsiInsolvencyPaymentConfirmation> orderByComparator,
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

		List<OsiInsolvencyPaymentConfirmation> list = null;

		if (useFinderCache) {
			list =
				(List<OsiInsolvencyPaymentConfirmation>)finderCache.getResult(
					finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION;

				sql = sql.concat(
					OsiInsolvencyPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInsolvencyPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the osi insolvency payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation :
				findAll()) {

			remove(osiInsolvencyPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of osi insolvency payment confirmations.
	 *
	 * @return the number of osi insolvency payment confirmations
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
					_SQL_COUNT_OSIINSOLVENCYPAYMENTCONFIRMATION);

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
		return "osiIRPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInsolvencyPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi insolvency payment confirmation persistence.
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

		_finderPathFetchBygetOSIIRPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIIRPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSIIRPaymentConfirmationBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIIRPaymentConfirmationBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetOSIIRPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOSIIRPaymentConfirmations_By_CI",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetOSIIRPaymentConfirmations_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSIIRPaymentConfirmations_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetOSIIRPaymentConfirmations_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIIRPaymentConfirmations_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OsiInsolvencyPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInsolvencyPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(
			OsiInsolvencyPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCY_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION =
		"SELECT osiInsolvencyPaymentConfirmation FROM OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation";

	private static final String
		_SQL_SELECT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE =
			"SELECT osiInsolvencyPaymentConfirmation FROM OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_OSIINSOLVENCYPAYMENTCONFIRMATION =
		"SELECT COUNT(osiInsolvencyPaymentConfirmation) FROM OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation";

	private static final String
		_SQL_COUNT_OSIINSOLVENCYPAYMENTCONFIRMATION_WHERE =
			"SELECT COUNT(osiInsolvencyPaymentConfirmation) FROM OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiInsolvencyPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInsolvencyPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInsolvencyPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInsolvencyPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}