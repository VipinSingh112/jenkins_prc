/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service.persistence.impl;

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

import com.nbp.acquire.stages.service.exception.NoSuchAcquireDueDiligenceException;
import com.nbp.acquire.stages.service.model.AcquireDueDiligence;
import com.nbp.acquire.stages.service.model.AcquireDueDiligenceTable;
import com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceImpl;
import com.nbp.acquire.stages.service.model.impl.AcquireDueDiligenceModelImpl;
import com.nbp.acquire.stages.service.service.persistence.AcquireDueDiligencePersistence;
import com.nbp.acquire.stages.service.service.persistence.AcquireDueDiligenceUtil;
import com.nbp.acquire.stages.service.service.persistence.impl.constants.NBP_ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire due diligence service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireDueDiligencePersistence.class)
public class AcquireDueDiligencePersistenceImpl
	extends BasePersistenceImpl<AcquireDueDiligence>
	implements AcquireDueDiligencePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireDueDiligenceUtil</code> to access the acquire due diligence persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireDueDiligenceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetADD_AAI;
	private FinderPath _finderPathCountBygetADD_AAI;

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence findBygetADD_AAI(long acquireApplicationId)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = fetchBygetADD_AAI(
			acquireApplicationId);

		if (acquireDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireDueDiligenceException(sb.toString());
		}

		return acquireDueDiligence;
	}

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_AAI(long acquireApplicationId) {
		return fetchBygetADD_AAI(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire due diligence where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_AAI(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetADD_AAI, finderArgs, this);
		}

		if (result instanceof AcquireDueDiligence) {
			AcquireDueDiligence acquireDueDiligence =
				(AcquireDueDiligence)result;

			if (acquireApplicationId !=
					acquireDueDiligence.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETADD_AAI_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetADD_AAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireDueDiligencePersistenceImpl.fetchBygetADD_AAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireDueDiligence acquireDueDiligence = list.get(0);

					result = acquireDueDiligence;

					cacheResult(acquireDueDiligence);
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
			return (AcquireDueDiligence)result;
		}
	}

	/**
	 * Removes the acquire due diligence where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire due diligence that was removed
	 */
	@Override
	public AcquireDueDiligence removeBygetADD_AAI(long acquireApplicationId)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = findBygetADD_AAI(
			acquireApplicationId);

		return remove(acquireDueDiligence);
	}

	/**
	 * Returns the number of acquire due diligences where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire due diligences
	 */
	@Override
	public int countBygetADD_AAI(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetADD_AAI;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREDUEDILIGENCE_WHERE);

			sb.append(_FINDER_COLUMN_GETADD_AAI_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETADD_AAI_ACQUIREAPPLICATIONID_2 =
			"acquireDueDiligence.acquireApplicationId = ?";

	private FinderPath _finderPathFetchBygetADD_CaseId_AgencyName;
	private FinderPath _finderPathCountBygetADD_CaseId_AgencyName;

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence findBygetADD_CaseId_AgencyName(
			String caseId, String nameOfAgency)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence =
			fetchBygetADD_CaseId_AgencyName(caseId, nameOfAgency);

		if (acquireDueDiligence == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", nameOfAgency=");
			sb.append(nameOfAgency);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireDueDiligenceException(sb.toString());
		}

		return acquireDueDiligence;
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency) {

		return fetchBygetADD_CaseId_AgencyName(caseId, nameOfAgency, true);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		nameOfAgency = Objects.toString(nameOfAgency, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, nameOfAgency};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetADD_CaseId_AgencyName, finderArgs, this);
		}

		if (result instanceof AcquireDueDiligence) {
			AcquireDueDiligence acquireDueDiligence =
				(AcquireDueDiligence)result;

			if (!Objects.equals(caseId, acquireDueDiligence.getCaseId()) ||
				!Objects.equals(
					nameOfAgency, acquireDueDiligence.getNameOfAgency())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACQUIREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_CASEID_2);
			}

			boolean bindNameOfAgency = false;

			if (nameOfAgency.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_NAMEOFAGENCY_3);
			}
			else {
				bindNameOfAgency = true;

				sb.append(
					_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_NAMEOFAGENCY_2);
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

				if (bindNameOfAgency) {
					queryPos.add(nameOfAgency);
				}

				List<AcquireDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetADD_CaseId_AgencyName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, nameOfAgency
								};
							}

							_log.warn(
								"AcquireDueDiligencePersistenceImpl.fetchBygetADD_CaseId_AgencyName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireDueDiligence acquireDueDiligence = list.get(0);

					result = acquireDueDiligence;

					cacheResult(acquireDueDiligence);
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
			return (AcquireDueDiligence)result;
		}
	}

	/**
	 * Removes the acquire due diligence where caseId = &#63; and nameOfAgency = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the acquire due diligence that was removed
	 */
	@Override
	public AcquireDueDiligence removeBygetADD_CaseId_AgencyName(
			String caseId, String nameOfAgency)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence =
			findBygetADD_CaseId_AgencyName(caseId, nameOfAgency);

		return remove(acquireDueDiligence);
	}

	/**
	 * Returns the number of acquire due diligences where caseId = &#63; and nameOfAgency = &#63;.
	 *
	 * @param caseId the case ID
	 * @param nameOfAgency the name of agency
	 * @return the number of matching acquire due diligences
	 */
	@Override
	public int countBygetADD_CaseId_AgencyName(
		String caseId, String nameOfAgency) {

		caseId = Objects.toString(caseId, "");
		nameOfAgency = Objects.toString(nameOfAgency, "");

		FinderPath finderPath = _finderPathCountBygetADD_CaseId_AgencyName;

		Object[] finderArgs = new Object[] {caseId, nameOfAgency};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_CASEID_2);
			}

			boolean bindNameOfAgency = false;

			if (nameOfAgency.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_NAMEOFAGENCY_3);
			}
			else {
				bindNameOfAgency = true;

				sb.append(
					_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_NAMEOFAGENCY_2);
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

				if (bindNameOfAgency) {
					queryPos.add(nameOfAgency);
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
		_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_CASEID_2 =
			"acquireDueDiligence.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_CASEID_3 =
			"(acquireDueDiligence.caseId IS NULL OR acquireDueDiligence.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_NAMEOFAGENCY_2 =
			"acquireDueDiligence.nameOfAgency = ?";

	private static final String
		_FINDER_COLUMN_GETADD_CASEID_AGENCYNAME_NAMEOFAGENCY_3 =
			"(acquireDueDiligence.nameOfAgency IS NULL OR acquireDueDiligence.nameOfAgency = '')";

	private FinderPath _finderPathWithPaginationFindBygetADD_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetADD_CaseId;
	private FinderPath _finderPathCountBygetADD_CaseId;

	/**
	 * Returns all the acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findBygetADD_CaseId(String caseId) {
		return findBygetADD_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of matching acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end) {

		return findBygetADD_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return findBygetADD_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findBygetADD_CaseId(
		String caseId, int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetADD_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetADD_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<AcquireDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<AcquireDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireDueDiligence acquireDueDiligence : list) {
					if (!caseId.equals(acquireDueDiligence.getCaseId())) {
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

			sb.append(_SQL_SELECT_ACQUIREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETADD_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireDueDiligenceModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcquireDueDiligence>)QueryUtil.list(
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
	 * Returns the first acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence findBygetADD_CaseId_First(
			String caseId,
			OrderByComparator<AcquireDueDiligence> orderByComparator)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = fetchBygetADD_CaseId_First(
			caseId, orderByComparator);

		if (acquireDueDiligence != null) {
			return acquireDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquireDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the first acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_CaseId_First(
		String caseId,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		List<AcquireDueDiligence> list = findBygetADD_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence findBygetADD_CaseId_Last(
			String caseId,
			OrderByComparator<AcquireDueDiligence> orderByComparator)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = fetchBygetADD_CaseId_Last(
			caseId, orderByComparator);

		if (acquireDueDiligence != null) {
			return acquireDueDiligence;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchAcquireDueDiligenceException(sb.toString());
	}

	/**
	 * Returns the last acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_CaseId_Last(
		String caseId,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		int count = countBygetADD_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<AcquireDueDiligence> list = findBygetADD_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire due diligences before and after the current acquire due diligence in the ordered set where caseId = &#63;.
	 *
	 * @param sampleId the primary key of the current acquire due diligence
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public AcquireDueDiligence[] findBygetADD_CaseId_PrevAndNext(
			long sampleId, String caseId,
			OrderByComparator<AcquireDueDiligence> orderByComparator)
		throws NoSuchAcquireDueDiligenceException {

		caseId = Objects.toString(caseId, "");

		AcquireDueDiligence acquireDueDiligence = findByPrimaryKey(sampleId);

		Session session = null;

		try {
			session = openSession();

			AcquireDueDiligence[] array = new AcquireDueDiligenceImpl[3];

			array[0] = getBygetADD_CaseId_PrevAndNext(
				session, acquireDueDiligence, caseId, orderByComparator, true);

			array[1] = acquireDueDiligence;

			array[2] = getBygetADD_CaseId_PrevAndNext(
				session, acquireDueDiligence, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcquireDueDiligence getBygetADD_CaseId_PrevAndNext(
		Session session, AcquireDueDiligence acquireDueDiligence, String caseId,
		OrderByComparator<AcquireDueDiligence> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREDUEDILIGENCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETADD_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETADD_CASEID_CASEID_2);
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
			sb.append(AcquireDueDiligenceModelImpl.ORDER_BY_JPQL);
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
						acquireDueDiligence)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireDueDiligence> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire due diligences where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetADD_CaseId(String caseId) {
		for (AcquireDueDiligence acquireDueDiligence :
				findBygetADD_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireDueDiligence);
		}
	}

	/**
	 * Returns the number of acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire due diligences
	 */
	@Override
	public int countBygetADD_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetADD_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETADD_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETADD_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETADD_CASEID_CASEID_2 =
		"acquireDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETADD_CASEID_CASEID_3 =
		"(acquireDueDiligence.caseId IS NULL OR acquireDueDiligence.caseId = '')";

	private FinderPath _finderPathFetchBygetADD_CI;
	private FinderPath _finderPathCountBygetADD_CI;

	/**
	 * Returns the acquire due diligence where caseId = &#63; or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence findBygetADD_CI(String caseId)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = fetchBygetADD_CI(caseId);

		if (acquireDueDiligence == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireDueDiligenceException(sb.toString());
		}

		return acquireDueDiligence;
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_CI(String caseId) {
		return fetchBygetADD_CI(caseId, true);
	}

	/**
	 * Returns the acquire due diligence where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire due diligence, or <code>null</code> if a matching acquire due diligence could not be found
	 */
	@Override
	public AcquireDueDiligence fetchBygetADD_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetADD_CI, finderArgs, this);
		}

		if (result instanceof AcquireDueDiligence) {
			AcquireDueDiligence acquireDueDiligence =
				(AcquireDueDiligence)result;

			if (!Objects.equals(caseId, acquireDueDiligence.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETADD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETADD_CI_CASEID_2);
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

				List<AcquireDueDiligence> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetADD_CI, finderArgs, list);
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
								"AcquireDueDiligencePersistenceImpl.fetchBygetADD_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireDueDiligence acquireDueDiligence = list.get(0);

					result = acquireDueDiligence;

					cacheResult(acquireDueDiligence);
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
			return (AcquireDueDiligence)result;
		}
	}

	/**
	 * Removes the acquire due diligence where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire due diligence that was removed
	 */
	@Override
	public AcquireDueDiligence removeBygetADD_CI(String caseId)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = findBygetADD_CI(caseId);

		return remove(acquireDueDiligence);
	}

	/**
	 * Returns the number of acquire due diligences where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire due diligences
	 */
	@Override
	public int countBygetADD_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetADD_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREDUEDILIGENCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETADD_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETADD_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETADD_CI_CASEID_2 =
		"acquireDueDiligence.caseId = ?";

	private static final String _FINDER_COLUMN_GETADD_CI_CASEID_3 =
		"(acquireDueDiligence.caseId IS NULL OR acquireDueDiligence.caseId = '')";

	public AcquireDueDiligencePersistenceImpl() {
		setModelClass(AcquireDueDiligence.class);

		setModelImplClass(AcquireDueDiligenceImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireDueDiligenceTable.INSTANCE);
	}

	/**
	 * Caches the acquire due diligence in the entity cache if it is enabled.
	 *
	 * @param acquireDueDiligence the acquire due diligence
	 */
	@Override
	public void cacheResult(AcquireDueDiligence acquireDueDiligence) {
		entityCache.putResult(
			AcquireDueDiligenceImpl.class, acquireDueDiligence.getPrimaryKey(),
			acquireDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetADD_AAI,
			new Object[] {acquireDueDiligence.getAcquireApplicationId()},
			acquireDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetADD_CaseId_AgencyName,
			new Object[] {
				acquireDueDiligence.getCaseId(),
				acquireDueDiligence.getNameOfAgency()
			},
			acquireDueDiligence);

		finderCache.putResult(
			_finderPathFetchBygetADD_CI,
			new Object[] {acquireDueDiligence.getCaseId()},
			acquireDueDiligence);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire due diligences in the entity cache if it is enabled.
	 *
	 * @param acquireDueDiligences the acquire due diligences
	 */
	@Override
	public void cacheResult(List<AcquireDueDiligence> acquireDueDiligences) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireDueDiligences.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireDueDiligence acquireDueDiligence : acquireDueDiligences) {
			if (entityCache.getResult(
					AcquireDueDiligenceImpl.class,
					acquireDueDiligence.getPrimaryKey()) == null) {

				cacheResult(acquireDueDiligence);
			}
		}
	}

	/**
	 * Clears the cache for all acquire due diligences.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireDueDiligenceImpl.class);

		finderCache.clearCache(AcquireDueDiligenceImpl.class);
	}

	/**
	 * Clears the cache for the acquire due diligence.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireDueDiligence acquireDueDiligence) {
		entityCache.removeResult(
			AcquireDueDiligenceImpl.class, acquireDueDiligence);
	}

	@Override
	public void clearCache(List<AcquireDueDiligence> acquireDueDiligences) {
		for (AcquireDueDiligence acquireDueDiligence : acquireDueDiligences) {
			entityCache.removeResult(
				AcquireDueDiligenceImpl.class, acquireDueDiligence);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireDueDiligenceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireDueDiligenceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireDueDiligenceModelImpl acquireDueDiligenceModelImpl) {

		Object[] args = new Object[] {
			acquireDueDiligenceModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetADD_AAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetADD_AAI, args, acquireDueDiligenceModelImpl);

		args = new Object[] {
			acquireDueDiligenceModelImpl.getCaseId(),
			acquireDueDiligenceModelImpl.getNameOfAgency()
		};

		finderCache.putResult(
			_finderPathCountBygetADD_CaseId_AgencyName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetADD_CaseId_AgencyName, args,
			acquireDueDiligenceModelImpl);

		args = new Object[] {acquireDueDiligenceModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetADD_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetADD_CI, args, acquireDueDiligenceModelImpl);
	}

	/**
	 * Creates a new acquire due diligence with the primary key. Does not add the acquire due diligence to the database.
	 *
	 * @param sampleId the primary key for the new acquire due diligence
	 * @return the new acquire due diligence
	 */
	@Override
	public AcquireDueDiligence create(long sampleId) {
		AcquireDueDiligence acquireDueDiligence = new AcquireDueDiligenceImpl();

		acquireDueDiligence.setNew(true);
		acquireDueDiligence.setPrimaryKey(sampleId);

		acquireDueDiligence.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireDueDiligence;
	}

	/**
	 * Removes the acquire due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence that was removed
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public AcquireDueDiligence remove(long sampleId)
		throws NoSuchAcquireDueDiligenceException {

		return remove((Serializable)sampleId);
	}

	/**
	 * Removes the acquire due diligence with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire due diligence
	 * @return the acquire due diligence that was removed
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public AcquireDueDiligence remove(Serializable primaryKey)
		throws NoSuchAcquireDueDiligenceException {

		Session session = null;

		try {
			session = openSession();

			AcquireDueDiligence acquireDueDiligence =
				(AcquireDueDiligence)session.get(
					AcquireDueDiligenceImpl.class, primaryKey);

			if (acquireDueDiligence == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireDueDiligenceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireDueDiligence);
		}
		catch (NoSuchAcquireDueDiligenceException noSuchEntityException) {
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
	protected AcquireDueDiligence removeImpl(
		AcquireDueDiligence acquireDueDiligence) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireDueDiligence)) {
				acquireDueDiligence = (AcquireDueDiligence)session.get(
					AcquireDueDiligenceImpl.class,
					acquireDueDiligence.getPrimaryKeyObj());
			}

			if (acquireDueDiligence != null) {
				session.delete(acquireDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireDueDiligence != null) {
			clearCache(acquireDueDiligence);
		}

		return acquireDueDiligence;
	}

	@Override
	public AcquireDueDiligence updateImpl(
		AcquireDueDiligence acquireDueDiligence) {

		boolean isNew = acquireDueDiligence.isNew();

		if (!(acquireDueDiligence instanceof AcquireDueDiligenceModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireDueDiligence.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireDueDiligence);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireDueDiligence proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireDueDiligence implementation " +
					acquireDueDiligence.getClass());
		}

		AcquireDueDiligenceModelImpl acquireDueDiligenceModelImpl =
			(AcquireDueDiligenceModelImpl)acquireDueDiligence;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireDueDiligence.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireDueDiligence.setCreateDate(date);
			}
			else {
				acquireDueDiligence.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireDueDiligenceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireDueDiligence.setModifiedDate(date);
			}
			else {
				acquireDueDiligence.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireDueDiligence);
			}
			else {
				acquireDueDiligence = (AcquireDueDiligence)session.merge(
					acquireDueDiligence);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireDueDiligenceImpl.class, acquireDueDiligenceModelImpl, false,
			true);

		cacheUniqueFindersCache(acquireDueDiligenceModelImpl);

		if (isNew) {
			acquireDueDiligence.setNew(false);
		}

		acquireDueDiligence.resetOriginalValues();

		return acquireDueDiligence;
	}

	/**
	 * Returns the acquire due diligence with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire due diligence
	 * @return the acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public AcquireDueDiligence findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireDueDiligenceException {

		AcquireDueDiligence acquireDueDiligence = fetchByPrimaryKey(primaryKey);

		if (acquireDueDiligence == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireDueDiligenceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireDueDiligence;
	}

	/**
	 * Returns the acquire due diligence with the primary key or throws a <code>NoSuchAcquireDueDiligenceException</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence
	 * @throws NoSuchAcquireDueDiligenceException if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public AcquireDueDiligence findByPrimaryKey(long sampleId)
		throws NoSuchAcquireDueDiligenceException {

		return findByPrimaryKey((Serializable)sampleId);
	}

	/**
	 * Returns the acquire due diligence with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sampleId the primary key of the acquire due diligence
	 * @return the acquire due diligence, or <code>null</code> if a acquire due diligence with the primary key could not be found
	 */
	@Override
	public AcquireDueDiligence fetchByPrimaryKey(long sampleId) {
		return fetchByPrimaryKey((Serializable)sampleId);
	}

	/**
	 * Returns all the acquire due diligences.
	 *
	 * @return the acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @return the range of acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findAll(
		int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire due diligences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDueDiligenceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire due diligences
	 * @param end the upper bound of the range of acquire due diligences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire due diligences
	 */
	@Override
	public List<AcquireDueDiligence> findAll(
		int start, int end,
		OrderByComparator<AcquireDueDiligence> orderByComparator,
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

		List<AcquireDueDiligence> list = null;

		if (useFinderCache) {
			list = (List<AcquireDueDiligence>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREDUEDILIGENCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREDUEDILIGENCE;

				sql = sql.concat(AcquireDueDiligenceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireDueDiligence>)QueryUtil.list(
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
	 * Removes all the acquire due diligences from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireDueDiligence acquireDueDiligence : findAll()) {
			remove(acquireDueDiligence);
		}
	}

	/**
	 * Returns the number of acquire due diligences.
	 *
	 * @return the number of acquire due diligences
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
					_SQL_COUNT_ACQUIREDUEDILIGENCE);

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
		return "sampleId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREDUEDILIGENCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireDueDiligenceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire due diligence persistence.
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

		_finderPathFetchBygetADD_AAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetADD_AAI",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetADD_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetADD_AAI",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		_finderPathFetchBygetADD_CaseId_AgencyName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetADD_CaseId_AgencyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "nameOfAgency"}, true);

		_finderPathCountBygetADD_CaseId_AgencyName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetADD_CaseId_AgencyName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "nameOfAgency"}, false);

		_finderPathWithPaginationFindBygetADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetADD_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetADD_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetADD_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetADD_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetADD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetADD_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetADD_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		AcquireDueDiligenceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireDueDiligenceUtil.setPersistence(null);

		entityCache.removeCache(AcquireDueDiligenceImpl.class.getName());
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NBP_ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREDUEDILIGENCE =
		"SELECT acquireDueDiligence FROM AcquireDueDiligence acquireDueDiligence";

	private static final String _SQL_SELECT_ACQUIREDUEDILIGENCE_WHERE =
		"SELECT acquireDueDiligence FROM AcquireDueDiligence acquireDueDiligence WHERE ";

	private static final String _SQL_COUNT_ACQUIREDUEDILIGENCE =
		"SELECT COUNT(acquireDueDiligence) FROM AcquireDueDiligence acquireDueDiligence";

	private static final String _SQL_COUNT_ACQUIREDUEDILIGENCE_WHERE =
		"SELECT COUNT(acquireDueDiligence) FROM AcquireDueDiligence acquireDueDiligence WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireDueDiligence.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireDueDiligence exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireDueDiligence exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireDueDiligencePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}