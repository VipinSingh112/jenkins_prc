/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaDocumentListException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentList;
import com.nbp.pharmaceutical.application.form.service.model.PharmaDocumentListTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDocumentListImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaDocumentListModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDocumentListPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaDocumentListUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the pharma document list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaDocumentListPersistence.class)
public class PharmaDocumentListPersistenceImpl
	extends BasePersistenceImpl<PharmaDocumentList>
	implements PharmaDocumentListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaDocumentListUtil</code> to access the pharma document list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaDocumentListImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetPharmaDocByApplicant;
	private FinderPath
		_finderPathWithoutPaginationFindBygetPharmaDocByApplicant;
	private FinderPath _finderPathCountBygetPharmaDocByApplicant;

	/**
	 * Returns all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @return the matching pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType) {

		return findBygetPharmaDocByApplicant(
			pharmaAppType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaAppType the pharma app type
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @return the range of matching pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end) {

		return findBygetPharmaDocByApplicant(pharmaAppType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaAppType the pharma app type
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return findBygetPharmaDocByApplicant(
			pharmaAppType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma document lists where pharmaAppType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param pharmaAppType the pharma app type
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findBygetPharmaDocByApplicant(
		String pharmaAppType, int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator,
		boolean useFinderCache) {

		pharmaAppType = Objects.toString(pharmaAppType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPharmaDocByApplicant;
				finderArgs = new Object[] {pharmaAppType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPharmaDocByApplicant;
			finderArgs = new Object[] {
				pharmaAppType, start, end, orderByComparator
			};
		}

		List<PharmaDocumentList> list = null;

		if (useFinderCache) {
			list = (List<PharmaDocumentList>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaDocumentList pharmaDocumentList : list) {
					if (!pharmaAppType.equals(
							pharmaDocumentList.getPharmaAppType())) {

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

			sb.append(_SQL_SELECT_PHARMADOCUMENTLIST_WHERE);

			boolean bindPharmaAppType = false;

			if (pharmaAppType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_3);
			}
			else {
				bindPharmaAppType = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaDocumentListModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPharmaAppType) {
					queryPos.add(pharmaAppType);
				}

				list = (List<PharmaDocumentList>)QueryUtil.list(
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
	 * Returns the first pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma document list
	 * @throws NoSuchPharmaDocumentListException if a matching pharma document list could not be found
	 */
	@Override
	public PharmaDocumentList findBygetPharmaDocByApplicant_First(
			String pharmaAppType,
			OrderByComparator<PharmaDocumentList> orderByComparator)
		throws NoSuchPharmaDocumentListException {

		PharmaDocumentList pharmaDocumentList =
			fetchBygetPharmaDocByApplicant_First(
				pharmaAppType, orderByComparator);

		if (pharmaDocumentList != null) {
			return pharmaDocumentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaAppType=");
		sb.append(pharmaAppType);

		sb.append("}");

		throw new NoSuchPharmaDocumentListException(sb.toString());
	}

	/**
	 * Returns the first pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma document list, or <code>null</code> if a matching pharma document list could not be found
	 */
	@Override
	public PharmaDocumentList fetchBygetPharmaDocByApplicant_First(
		String pharmaAppType,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		List<PharmaDocumentList> list = findBygetPharmaDocByApplicant(
			pharmaAppType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma document list
	 * @throws NoSuchPharmaDocumentListException if a matching pharma document list could not be found
	 */
	@Override
	public PharmaDocumentList findBygetPharmaDocByApplicant_Last(
			String pharmaAppType,
			OrderByComparator<PharmaDocumentList> orderByComparator)
		throws NoSuchPharmaDocumentListException {

		PharmaDocumentList pharmaDocumentList =
			fetchBygetPharmaDocByApplicant_Last(
				pharmaAppType, orderByComparator);

		if (pharmaDocumentList != null) {
			return pharmaDocumentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("pharmaAppType=");
		sb.append(pharmaAppType);

		sb.append("}");

		throw new NoSuchPharmaDocumentListException(sb.toString());
	}

	/**
	 * Returns the last pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma document list, or <code>null</code> if a matching pharma document list could not be found
	 */
	@Override
	public PharmaDocumentList fetchBygetPharmaDocByApplicant_Last(
		String pharmaAppType,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		int count = countBygetPharmaDocByApplicant(pharmaAppType);

		if (count == 0) {
			return null;
		}

		List<PharmaDocumentList> list = findBygetPharmaDocByApplicant(
			pharmaAppType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma document lists before and after the current pharma document list in the ordered set where pharmaAppType = &#63;.
	 *
	 * @param pharmaDocListId the primary key of the current pharma document list
	 * @param pharmaAppType the pharma app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	@Override
	public PharmaDocumentList[] findBygetPharmaDocByApplicant_PrevAndNext(
			long pharmaDocListId, String pharmaAppType,
			OrderByComparator<PharmaDocumentList> orderByComparator)
		throws NoSuchPharmaDocumentListException {

		pharmaAppType = Objects.toString(pharmaAppType, "");

		PharmaDocumentList pharmaDocumentList = findByPrimaryKey(
			pharmaDocListId);

		Session session = null;

		try {
			session = openSession();

			PharmaDocumentList[] array = new PharmaDocumentListImpl[3];

			array[0] = getBygetPharmaDocByApplicant_PrevAndNext(
				session, pharmaDocumentList, pharmaAppType, orderByComparator,
				true);

			array[1] = pharmaDocumentList;

			array[2] = getBygetPharmaDocByApplicant_PrevAndNext(
				session, pharmaDocumentList, pharmaAppType, orderByComparator,
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

	protected PharmaDocumentList getBygetPharmaDocByApplicant_PrevAndNext(
		Session session, PharmaDocumentList pharmaDocumentList,
		String pharmaAppType,
		OrderByComparator<PharmaDocumentList> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMADOCUMENTLIST_WHERE);

		boolean bindPharmaAppType = false;

		if (pharmaAppType.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_3);
		}
		else {
			bindPharmaAppType = true;

			sb.append(_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_2);
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
			sb.append(PharmaDocumentListModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindPharmaAppType) {
			queryPos.add(pharmaAppType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						pharmaDocumentList)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaDocumentList> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma document lists where pharmaAppType = &#63; from the database.
	 *
	 * @param pharmaAppType the pharma app type
	 */
	@Override
	public void removeBygetPharmaDocByApplicant(String pharmaAppType) {
		for (PharmaDocumentList pharmaDocumentList :
				findBygetPharmaDocByApplicant(
					pharmaAppType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaDocumentList);
		}
	}

	/**
	 * Returns the number of pharma document lists where pharmaAppType = &#63;.
	 *
	 * @param pharmaAppType the pharma app type
	 * @return the number of matching pharma document lists
	 */
	@Override
	public int countBygetPharmaDocByApplicant(String pharmaAppType) {
		pharmaAppType = Objects.toString(pharmaAppType, "");

		FinderPath finderPath = _finderPathCountBygetPharmaDocByApplicant;

		Object[] finderArgs = new Object[] {pharmaAppType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMADOCUMENTLIST_WHERE);

			boolean bindPharmaAppType = false;

			if (pharmaAppType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_3);
			}
			else {
				bindPharmaAppType = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPharmaAppType) {
					queryPos.add(pharmaAppType);
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
		_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_2 =
			"pharmaDocumentList.pharmaAppType = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMADOCBYAPPLICANT_PHARMAAPPTYPE_3 =
			"(pharmaDocumentList.pharmaAppType IS NULL OR pharmaDocumentList.pharmaAppType = '')";

	public PharmaDocumentListPersistenceImpl() {
		setModelClass(PharmaDocumentList.class);

		setModelImplClass(PharmaDocumentListImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaDocumentListTable.INSTANCE);
	}

	/**
	 * Caches the pharma document list in the entity cache if it is enabled.
	 *
	 * @param pharmaDocumentList the pharma document list
	 */
	@Override
	public void cacheResult(PharmaDocumentList pharmaDocumentList) {
		entityCache.putResult(
			PharmaDocumentListImpl.class, pharmaDocumentList.getPrimaryKey(),
			pharmaDocumentList);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma document lists in the entity cache if it is enabled.
	 *
	 * @param pharmaDocumentLists the pharma document lists
	 */
	@Override
	public void cacheResult(List<PharmaDocumentList> pharmaDocumentLists) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaDocumentLists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaDocumentList pharmaDocumentList : pharmaDocumentLists) {
			if (entityCache.getResult(
					PharmaDocumentListImpl.class,
					pharmaDocumentList.getPrimaryKey()) == null) {

				cacheResult(pharmaDocumentList);
			}
		}
	}

	/**
	 * Clears the cache for all pharma document lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaDocumentListImpl.class);

		finderCache.clearCache(PharmaDocumentListImpl.class);
	}

	/**
	 * Clears the cache for the pharma document list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaDocumentList pharmaDocumentList) {
		entityCache.removeResult(
			PharmaDocumentListImpl.class, pharmaDocumentList);
	}

	@Override
	public void clearCache(List<PharmaDocumentList> pharmaDocumentLists) {
		for (PharmaDocumentList pharmaDocumentList : pharmaDocumentLists) {
			entityCache.removeResult(
				PharmaDocumentListImpl.class, pharmaDocumentList);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaDocumentListImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PharmaDocumentListImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new pharma document list with the primary key. Does not add the pharma document list to the database.
	 *
	 * @param pharmaDocListId the primary key for the new pharma document list
	 * @return the new pharma document list
	 */
	@Override
	public PharmaDocumentList create(long pharmaDocListId) {
		PharmaDocumentList pharmaDocumentList = new PharmaDocumentListImpl();

		pharmaDocumentList.setNew(true);
		pharmaDocumentList.setPrimaryKey(pharmaDocListId);

		return pharmaDocumentList;
	}

	/**
	 * Removes the pharma document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list that was removed
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	@Override
	public PharmaDocumentList remove(long pharmaDocListId)
		throws NoSuchPharmaDocumentListException {

		return remove((Serializable)pharmaDocListId);
	}

	/**
	 * Removes the pharma document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma document list
	 * @return the pharma document list that was removed
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	@Override
	public PharmaDocumentList remove(Serializable primaryKey)
		throws NoSuchPharmaDocumentListException {

		Session session = null;

		try {
			session = openSession();

			PharmaDocumentList pharmaDocumentList =
				(PharmaDocumentList)session.get(
					PharmaDocumentListImpl.class, primaryKey);

			if (pharmaDocumentList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaDocumentListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaDocumentList);
		}
		catch (NoSuchPharmaDocumentListException noSuchEntityException) {
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
	protected PharmaDocumentList removeImpl(
		PharmaDocumentList pharmaDocumentList) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaDocumentList)) {
				pharmaDocumentList = (PharmaDocumentList)session.get(
					PharmaDocumentListImpl.class,
					pharmaDocumentList.getPrimaryKeyObj());
			}

			if (pharmaDocumentList != null) {
				session.delete(pharmaDocumentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaDocumentList != null) {
			clearCache(pharmaDocumentList);
		}

		return pharmaDocumentList;
	}

	@Override
	public PharmaDocumentList updateImpl(
		PharmaDocumentList pharmaDocumentList) {

		boolean isNew = pharmaDocumentList.isNew();

		if (!(pharmaDocumentList instanceof PharmaDocumentListModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaDocumentList.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaDocumentList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaDocumentList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaDocumentList implementation " +
					pharmaDocumentList.getClass());
		}

		PharmaDocumentListModelImpl pharmaDocumentListModelImpl =
			(PharmaDocumentListModelImpl)pharmaDocumentList;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaDocumentList);
			}
			else {
				pharmaDocumentList = (PharmaDocumentList)session.merge(
					pharmaDocumentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaDocumentListImpl.class, pharmaDocumentListModelImpl, false,
			true);

		if (isNew) {
			pharmaDocumentList.setNew(false);
		}

		pharmaDocumentList.resetOriginalValues();

		return pharmaDocumentList;
	}

	/**
	 * Returns the pharma document list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma document list
	 * @return the pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	@Override
	public PharmaDocumentList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaDocumentListException {

		PharmaDocumentList pharmaDocumentList = fetchByPrimaryKey(primaryKey);

		if (pharmaDocumentList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaDocumentListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaDocumentList;
	}

	/**
	 * Returns the pharma document list with the primary key or throws a <code>NoSuchPharmaDocumentListException</code> if it could not be found.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list
	 * @throws NoSuchPharmaDocumentListException if a pharma document list with the primary key could not be found
	 */
	@Override
	public PharmaDocumentList findByPrimaryKey(long pharmaDocListId)
		throws NoSuchPharmaDocumentListException {

		return findByPrimaryKey((Serializable)pharmaDocListId);
	}

	/**
	 * Returns the pharma document list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaDocListId the primary key of the pharma document list
	 * @return the pharma document list, or <code>null</code> if a pharma document list with the primary key could not be found
	 */
	@Override
	public PharmaDocumentList fetchByPrimaryKey(long pharmaDocListId) {
		return fetchByPrimaryKey((Serializable)pharmaDocListId);
	}

	/**
	 * Returns all the pharma document lists.
	 *
	 * @return the pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @return the range of pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findAll(
		int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma document lists
	 * @param end the upper bound of the range of pharma document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma document lists
	 */
	@Override
	public List<PharmaDocumentList> findAll(
		int start, int end,
		OrderByComparator<PharmaDocumentList> orderByComparator,
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

		List<PharmaDocumentList> list = null;

		if (useFinderCache) {
			list = (List<PharmaDocumentList>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMADOCUMENTLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMADOCUMENTLIST;

				sql = sql.concat(PharmaDocumentListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaDocumentList>)QueryUtil.list(
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
	 * Removes all the pharma document lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaDocumentList pharmaDocumentList : findAll()) {
			remove(pharmaDocumentList);
		}
	}

	/**
	 * Returns the number of pharma document lists.
	 *
	 * @return the number of pharma document lists
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
					_SQL_COUNT_PHARMADOCUMENTLIST);

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
		return "pharmaDocListId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMADOCUMENTLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaDocumentListModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma document list persistence.
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

		_finderPathWithPaginationFindBygetPharmaDocByApplicant = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetPharmaDocByApplicant",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"pharmaAppType"}, true);

		_finderPathWithoutPaginationFindBygetPharmaDocByApplicant =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPharmaDocByApplicant",
				new String[] {String.class.getName()},
				new String[] {"pharmaAppType"}, true);

		_finderPathCountBygetPharmaDocByApplicant = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaDocByApplicant",
			new String[] {String.class.getName()},
			new String[] {"pharmaAppType"}, false);

		PharmaDocumentListUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaDocumentListUtil.setPersistence(null);

		entityCache.removeCache(PharmaDocumentListImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMADOCUMENTLIST =
		"SELECT pharmaDocumentList FROM PharmaDocumentList pharmaDocumentList";

	private static final String _SQL_SELECT_PHARMADOCUMENTLIST_WHERE =
		"SELECT pharmaDocumentList FROM PharmaDocumentList pharmaDocumentList WHERE ";

	private static final String _SQL_COUNT_PHARMADOCUMENTLIST =
		"SELECT COUNT(pharmaDocumentList) FROM PharmaDocumentList pharmaDocumentList";

	private static final String _SQL_COUNT_PHARMADOCUMENTLIST_WHERE =
		"SELECT COUNT(pharmaDocumentList) FROM PharmaDocumentList pharmaDocumentList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pharmaDocumentList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaDocumentList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaDocumentList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaDocumentListPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}