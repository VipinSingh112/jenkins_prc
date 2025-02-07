/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireDocumentListException;
import com.nbp.acquire.application.form.service.model.AcquireDocumentList;
import com.nbp.acquire.application.form.service.model.AcquireDocumentListTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireDocumentListModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireDocumentListPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireDocumentListUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire document list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireDocumentListPersistence.class)
public class AcquireDocumentListPersistenceImpl
	extends BasePersistenceImpl<AcquireDocumentList>
	implements AcquireDocumentListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireDocumentListUtil</code> to access the acquire document list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireDocumentListImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetAcquireDocListByDocType;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquireDocListByDocType;
	private FinderPath _finderPathCountBygetAcquireDocListByDocType;

	/**
	 * Returns all the acquire document lists where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the matching acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType) {

		return findBygetAcquireDocListByDocType(
			documentType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire document lists where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @return the range of matching acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end) {

		return findBygetAcquireDocListByDocType(documentType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire document lists where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return findBygetAcquireDocListByDocType(
			documentType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire document lists where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findBygetAcquireDocListByDocType(
		String documentType, int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator,
		boolean useFinderCache) {

		documentType = Objects.toString(documentType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireDocListByDocType;
				finderArgs = new Object[] {documentType};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquireDocListByDocType;
			finderArgs = new Object[] {
				documentType, start, end, orderByComparator
			};
		}

		List<AcquireDocumentList> list = null;

		if (useFinderCache) {
			list = (List<AcquireDocumentList>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireDocumentList acquireDocumentList : list) {
					if (!documentType.equals(
							acquireDocumentList.getDocumentType())) {

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

			sb.append(_SQL_SELECT_ACQUIREDOCUMENTLIST_WHERE);

			boolean bindDocumentType = false;

			if (documentType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireDocumentListModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDocumentType) {
					queryPos.add(documentType);
				}

				list = (List<AcquireDocumentList>)QueryUtil.list(
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
	 * Returns the first acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire document list
	 * @throws NoSuchAcquireDocumentListException if a matching acquire document list could not be found
	 */
	@Override
	public AcquireDocumentList findBygetAcquireDocListByDocType_First(
			String documentType,
			OrderByComparator<AcquireDocumentList> orderByComparator)
		throws NoSuchAcquireDocumentListException {

		AcquireDocumentList acquireDocumentList =
			fetchBygetAcquireDocListByDocType_First(
				documentType, orderByComparator);

		if (acquireDocumentList != null) {
			return acquireDocumentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("documentType=");
		sb.append(documentType);

		sb.append("}");

		throw new NoSuchAcquireDocumentListException(sb.toString());
	}

	/**
	 * Returns the first acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire document list, or <code>null</code> if a matching acquire document list could not be found
	 */
	@Override
	public AcquireDocumentList fetchBygetAcquireDocListByDocType_First(
		String documentType,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		List<AcquireDocumentList> list = findBygetAcquireDocListByDocType(
			documentType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire document list
	 * @throws NoSuchAcquireDocumentListException if a matching acquire document list could not be found
	 */
	@Override
	public AcquireDocumentList findBygetAcquireDocListByDocType_Last(
			String documentType,
			OrderByComparator<AcquireDocumentList> orderByComparator)
		throws NoSuchAcquireDocumentListException {

		AcquireDocumentList acquireDocumentList =
			fetchBygetAcquireDocListByDocType_Last(
				documentType, orderByComparator);

		if (acquireDocumentList != null) {
			return acquireDocumentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("documentType=");
		sb.append(documentType);

		sb.append("}");

		throw new NoSuchAcquireDocumentListException(sb.toString());
	}

	/**
	 * Returns the last acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire document list, or <code>null</code> if a matching acquire document list could not be found
	 */
	@Override
	public AcquireDocumentList fetchBygetAcquireDocListByDocType_Last(
		String documentType,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		int count = countBygetAcquireDocListByDocType(documentType);

		if (count == 0) {
			return null;
		}

		List<AcquireDocumentList> list = findBygetAcquireDocListByDocType(
			documentType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire document lists before and after the current acquire document list in the ordered set where documentType = &#63;.
	 *
	 * @param acquireDocumentListId the primary key of the current acquire document list
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	@Override
	public AcquireDocumentList[] findBygetAcquireDocListByDocType_PrevAndNext(
			long acquireDocumentListId, String documentType,
			OrderByComparator<AcquireDocumentList> orderByComparator)
		throws NoSuchAcquireDocumentListException {

		documentType = Objects.toString(documentType, "");

		AcquireDocumentList acquireDocumentList = findByPrimaryKey(
			acquireDocumentListId);

		Session session = null;

		try {
			session = openSession();

			AcquireDocumentList[] array = new AcquireDocumentListImpl[3];

			array[0] = getBygetAcquireDocListByDocType_PrevAndNext(
				session, acquireDocumentList, documentType, orderByComparator,
				true);

			array[1] = acquireDocumentList;

			array[2] = getBygetAcquireDocListByDocType_PrevAndNext(
				session, acquireDocumentList, documentType, orderByComparator,
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

	protected AcquireDocumentList getBygetAcquireDocListByDocType_PrevAndNext(
		Session session, AcquireDocumentList acquireDocumentList,
		String documentType,
		OrderByComparator<AcquireDocumentList> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREDOCUMENTLIST_WHERE);

		boolean bindDocumentType = false;

		if (documentType.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_3);
		}
		else {
			bindDocumentType = true;

			sb.append(_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_2);
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
			sb.append(AcquireDocumentListModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindDocumentType) {
			queryPos.add(documentType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						acquireDocumentList)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireDocumentList> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire document lists where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 */
	@Override
	public void removeBygetAcquireDocListByDocType(String documentType) {
		for (AcquireDocumentList acquireDocumentList :
				findBygetAcquireDocListByDocType(
					documentType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireDocumentList);
		}
	}

	/**
	 * Returns the number of acquire document lists where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching acquire document lists
	 */
	@Override
	public int countBygetAcquireDocListByDocType(String documentType) {
		documentType = Objects.toString(documentType, "");

		FinderPath finderPath = _finderPathCountBygetAcquireDocListByDocType;

		Object[] finderArgs = new Object[] {documentType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREDOCUMENTLIST_WHERE);

			boolean bindDocumentType = false;

			if (documentType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				sb.append(
					_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindDocumentType) {
					queryPos.add(documentType);
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
		_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_2 =
			"acquireDocumentList.documentType = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREDOCLISTBYDOCTYPE_DOCUMENTTYPE_3 =
			"(acquireDocumentList.documentType IS NULL OR acquireDocumentList.documentType = '')";

	public AcquireDocumentListPersistenceImpl() {
		setModelClass(AcquireDocumentList.class);

		setModelImplClass(AcquireDocumentListImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireDocumentListTable.INSTANCE);
	}

	/**
	 * Caches the acquire document list in the entity cache if it is enabled.
	 *
	 * @param acquireDocumentList the acquire document list
	 */
	@Override
	public void cacheResult(AcquireDocumentList acquireDocumentList) {
		entityCache.putResult(
			AcquireDocumentListImpl.class, acquireDocumentList.getPrimaryKey(),
			acquireDocumentList);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire document lists in the entity cache if it is enabled.
	 *
	 * @param acquireDocumentLists the acquire document lists
	 */
	@Override
	public void cacheResult(List<AcquireDocumentList> acquireDocumentLists) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireDocumentLists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireDocumentList acquireDocumentList : acquireDocumentLists) {
			if (entityCache.getResult(
					AcquireDocumentListImpl.class,
					acquireDocumentList.getPrimaryKey()) == null) {

				cacheResult(acquireDocumentList);
			}
		}
	}

	/**
	 * Clears the cache for all acquire document lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireDocumentListImpl.class);

		finderCache.clearCache(AcquireDocumentListImpl.class);
	}

	/**
	 * Clears the cache for the acquire document list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireDocumentList acquireDocumentList) {
		entityCache.removeResult(
			AcquireDocumentListImpl.class, acquireDocumentList);
	}

	@Override
	public void clearCache(List<AcquireDocumentList> acquireDocumentLists) {
		for (AcquireDocumentList acquireDocumentList : acquireDocumentLists) {
			entityCache.removeResult(
				AcquireDocumentListImpl.class, acquireDocumentList);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireDocumentListImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireDocumentListImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new acquire document list with the primary key. Does not add the acquire document list to the database.
	 *
	 * @param acquireDocumentListId the primary key for the new acquire document list
	 * @return the new acquire document list
	 */
	@Override
	public AcquireDocumentList create(long acquireDocumentListId) {
		AcquireDocumentList acquireDocumentList = new AcquireDocumentListImpl();

		acquireDocumentList.setNew(true);
		acquireDocumentList.setPrimaryKey(acquireDocumentListId);

		return acquireDocumentList;
	}

	/**
	 * Removes the acquire document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list that was removed
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	@Override
	public AcquireDocumentList remove(long acquireDocumentListId)
		throws NoSuchAcquireDocumentListException {

		return remove((Serializable)acquireDocumentListId);
	}

	/**
	 * Removes the acquire document list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire document list
	 * @return the acquire document list that was removed
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	@Override
	public AcquireDocumentList remove(Serializable primaryKey)
		throws NoSuchAcquireDocumentListException {

		Session session = null;

		try {
			session = openSession();

			AcquireDocumentList acquireDocumentList =
				(AcquireDocumentList)session.get(
					AcquireDocumentListImpl.class, primaryKey);

			if (acquireDocumentList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireDocumentListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireDocumentList);
		}
		catch (NoSuchAcquireDocumentListException noSuchEntityException) {
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
	protected AcquireDocumentList removeImpl(
		AcquireDocumentList acquireDocumentList) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireDocumentList)) {
				acquireDocumentList = (AcquireDocumentList)session.get(
					AcquireDocumentListImpl.class,
					acquireDocumentList.getPrimaryKeyObj());
			}

			if (acquireDocumentList != null) {
				session.delete(acquireDocumentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireDocumentList != null) {
			clearCache(acquireDocumentList);
		}

		return acquireDocumentList;
	}

	@Override
	public AcquireDocumentList updateImpl(
		AcquireDocumentList acquireDocumentList) {

		boolean isNew = acquireDocumentList.isNew();

		if (!(acquireDocumentList instanceof AcquireDocumentListModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireDocumentList.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireDocumentList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireDocumentList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireDocumentList implementation " +
					acquireDocumentList.getClass());
		}

		AcquireDocumentListModelImpl acquireDocumentListModelImpl =
			(AcquireDocumentListModelImpl)acquireDocumentList;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireDocumentList);
			}
			else {
				acquireDocumentList = (AcquireDocumentList)session.merge(
					acquireDocumentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireDocumentListImpl.class, acquireDocumentListModelImpl, false,
			true);

		if (isNew) {
			acquireDocumentList.setNew(false);
		}

		acquireDocumentList.resetOriginalValues();

		return acquireDocumentList;
	}

	/**
	 * Returns the acquire document list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire document list
	 * @return the acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	@Override
	public AcquireDocumentList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireDocumentListException {

		AcquireDocumentList acquireDocumentList = fetchByPrimaryKey(primaryKey);

		if (acquireDocumentList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireDocumentListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireDocumentList;
	}

	/**
	 * Returns the acquire document list with the primary key or throws a <code>NoSuchAcquireDocumentListException</code> if it could not be found.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list
	 * @throws NoSuchAcquireDocumentListException if a acquire document list with the primary key could not be found
	 */
	@Override
	public AcquireDocumentList findByPrimaryKey(long acquireDocumentListId)
		throws NoSuchAcquireDocumentListException {

		return findByPrimaryKey((Serializable)acquireDocumentListId);
	}

	/**
	 * Returns the acquire document list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireDocumentListId the primary key of the acquire document list
	 * @return the acquire document list, or <code>null</code> if a acquire document list with the primary key could not be found
	 */
	@Override
	public AcquireDocumentList fetchByPrimaryKey(long acquireDocumentListId) {
		return fetchByPrimaryKey((Serializable)acquireDocumentListId);
	}

	/**
	 * Returns all the acquire document lists.
	 *
	 * @return the acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @return the range of acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findAll(
		int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire document lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireDocumentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire document lists
	 * @param end the upper bound of the range of acquire document lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire document lists
	 */
	@Override
	public List<AcquireDocumentList> findAll(
		int start, int end,
		OrderByComparator<AcquireDocumentList> orderByComparator,
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

		List<AcquireDocumentList> list = null;

		if (useFinderCache) {
			list = (List<AcquireDocumentList>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREDOCUMENTLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREDOCUMENTLIST;

				sql = sql.concat(AcquireDocumentListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireDocumentList>)QueryUtil.list(
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
	 * Removes all the acquire document lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireDocumentList acquireDocumentList : findAll()) {
			remove(acquireDocumentList);
		}
	}

	/**
	 * Returns the number of acquire document lists.
	 *
	 * @return the number of acquire document lists
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
					_SQL_COUNT_ACQUIREDOCUMENTLIST);

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
		return "acquireDocumentListId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREDOCUMENTLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireDocumentListModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire document list persistence.
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

		_finderPathWithPaginationFindBygetAcquireDocListByDocType =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquireDocListByDocType",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"documentType"}, true);

		_finderPathWithoutPaginationFindBygetAcquireDocListByDocType =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquireDocListByDocType",
				new String[] {String.class.getName()},
				new String[] {"documentType"}, true);

		_finderPathCountBygetAcquireDocListByDocType = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireDocListByDocType",
			new String[] {String.class.getName()},
			new String[] {"documentType"}, false);

		AcquireDocumentListUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireDocumentListUtil.setPersistence(null);

		entityCache.removeCache(AcquireDocumentListImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREDOCUMENTLIST =
		"SELECT acquireDocumentList FROM AcquireDocumentList acquireDocumentList";

	private static final String _SQL_SELECT_ACQUIREDOCUMENTLIST_WHERE =
		"SELECT acquireDocumentList FROM AcquireDocumentList acquireDocumentList WHERE ";

	private static final String _SQL_COUNT_ACQUIREDOCUMENTLIST =
		"SELECT COUNT(acquireDocumentList) FROM AcquireDocumentList acquireDocumentList";

	private static final String _SQL_COUNT_ACQUIREDOCUMENTLIST_WHERE =
		"SELECT COUNT(acquireDocumentList) FROM AcquireDocumentList acquireDocumentList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireDocumentList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireDocumentList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireDocumentList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireDocumentListPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}